package eu.europa.esig.dss.xades.validation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import eu.europa.esig.dss.DSSDocument;
import eu.europa.esig.dss.DSSException;
import eu.europa.esig.dss.DSSUtils;
import eu.europa.esig.dss.DigestAlgorithm;
import eu.europa.esig.dss.FileDocument;
import eu.europa.esig.dss.SignatureLevel;
import eu.europa.esig.dss.SignaturePackaging;
import eu.europa.esig.dss.SignatureValue;
import eu.europa.esig.dss.ToBeSigned;
import eu.europa.esig.dss.client.http.IgnoreDataLoader;
import eu.europa.esig.dss.signature.PKIFactoryAccess;
import eu.europa.esig.dss.validation.CommonCertificateVerifier;
import eu.europa.esig.dss.validation.SignedDocumentValidator;
import eu.europa.esig.dss.validation.reports.Reports;
import eu.europa.esig.dss.validation.reports.wrapper.DiagnosticData;
import eu.europa.esig.dss.validation.reports.wrapper.SignatureWrapper;
import eu.europa.esig.dss.xades.XAdESSignatureParameters;
import eu.europa.esig.dss.xades.signature.XAdESService;

public class DSS1334Test extends PKIFactoryAccess {

	private static final String ORIGINAL_FILE = "src/test/resources/validation/dss1334/simple-test.xml";

	@BeforeClass
	public static void encodingTest() {
		// be careful about carriage returns windows/linux
		DSSDocument doc = new FileDocument("src/test/resources/validation/dss1334/simple-test.xml");
		assertEquals("tl08+/KLCeJN8RRCEDzF8aJ12Ew=", doc.getDigest(DigestAlgorithm.SHA1));
		// Hex content :
		// 3c3f786d6c2076657273696f6e3d22312e302220656e636f64696e673d225554462d38223f3e0d0a3c746573743e0d0a093c74657374456c656d656e743e746573743c2f74657374456c656d656e743e0d0a3c2f746573743e0d0a
	}

	@Test
	public void test1() {
		DSSDocument doc = new FileDocument(
				"src/test/resources/validation/dss1334/document-signed-xades-baseline-b--null-for-filename.xml");
		SignedDocumentValidator validator = SignedDocumentValidator.fromDocument(doc);
		validator.setDetachedContents(Arrays.<DSSDocument>asList(new FileDocument(ORIGINAL_FILE)));

		CommonCertificateVerifier certificateVerifier = new CommonCertificateVerifier();
		certificateVerifier.setDataLoader(new IgnoreDataLoader());
		validator.setCertificateVerifier(certificateVerifier);

		Reports reports = validator.validateDocument();
		DiagnosticData diagnosticData = reports.getDiagnosticData();
		SignatureWrapper signature = diagnosticData.getSignatureById(diagnosticData.getFirstSignatureId());
		// not valid : reference with empty URI -> not detached signature
		assertFalse(signature.isBLevelTechnicallyValid());
	}

	@Test(expected = DSSException.class)
	public void extendInvalidFile() {
		DSSDocument doc = new FileDocument(
				"src/test/resources/validation/dss1334/document-signed-xades-baseline-b--null-for-filename.xml");

		XAdESService service = new XAdESService(new CommonCertificateVerifier());
		service.setTspSource(getGoodTsa());

		XAdESSignatureParameters parameters = new XAdESSignatureParameters();
		parameters.setSignatureLevel(SignatureLevel.XAdES_BASELINE_T);
		parameters.setDetachedContents(Arrays.<DSSDocument>asList(new FileDocument(ORIGINAL_FILE)));
		service.extendDocument(doc, parameters);
	}

	@Test
	public void test2() {
		DSSDocument doc = new FileDocument(
				"src/test/resources/validation/dss1334/simple-test-signed-xades-baseline-b.xml");
		SignedDocumentValidator validator = SignedDocumentValidator.fromDocument(doc);
		validator.setDetachedContents(Arrays.<DSSDocument>asList(new FileDocument(ORIGINAL_FILE)));

		CommonCertificateVerifier certificateVerifier = new CommonCertificateVerifier();
		certificateVerifier.setDataLoader(new IgnoreDataLoader());
		validator.setCertificateVerifier(certificateVerifier);

		Reports reports = validator.validateDocument();
		DiagnosticData diagnosticData = reports.getDiagnosticData();
		SignatureWrapper signature = diagnosticData.getSignatureById(diagnosticData.getFirstSignatureId());
		assertTrue(signature.isBLevelTechnicallyValid());
	}

	@Test
	public void extendValidFile() {
		DSSDocument doc = new FileDocument(
				"src/test/resources/validation/dss1334/simple-test-signed-xades-baseline-b.xml");

		XAdESService service = new XAdESService(new CommonCertificateVerifier());
		service.setTspSource(getGoodTsa());

		XAdESSignatureParameters parameters = new XAdESSignatureParameters();
		parameters.setSignatureLevel(SignatureLevel.XAdES_BASELINE_T);
		parameters.setDetachedContents(Arrays.<DSSDocument>asList(new FileDocument(ORIGINAL_FILE)));
		assertNotNull(service.extendDocument(doc, parameters));
	}

	@Test
	public void test3() {
		DSSDocument doc = new FileDocument(
				"src/test/resources/validation/dss1334/simple-test.signed-only-detached-LuxTrustCA3.xml");
		SignedDocumentValidator validator = SignedDocumentValidator.fromDocument(doc);
		validator.setDetachedContents(Arrays.<DSSDocument>asList(new FileDocument(ORIGINAL_FILE)));

		CommonCertificateVerifier certificateVerifier = new CommonCertificateVerifier();
		certificateVerifier.setDataLoader(new IgnoreDataLoader());
		validator.setCertificateVerifier(certificateVerifier);

		Reports reports = validator.validateDocument();
		DiagnosticData diagnosticData = reports.getDiagnosticData();
		SignatureWrapper signature = diagnosticData.getSignatureById(diagnosticData.getFirstSignatureId());
		assertTrue(signature.isBLevelTechnicallyValid());
	}

	@Test
	public void signWithDSS() throws IOException {
		FileDocument fileDocument = new FileDocument(ORIGINAL_FILE);
		fileDocument.setName(null);

		XAdESService service = new XAdESService(getCompleteCertificateVerifier());
		service.setTspSource(getGoodTsa());

		XAdESSignatureParameters parameters = new XAdESSignatureParameters();
		parameters.setSignatureLevel(SignatureLevel.XAdES_BASELINE_B);
		parameters.setSignaturePackaging(SignaturePackaging.DETACHED);
		parameters.setSigningCertificate(getSigningCert());
		parameters.setCertificateChain(getCertificateChain());
		
		ToBeSigned dataToSign = service.getDataToSign(fileDocument, parameters);
		SignatureValue signatureValue = getToken().sign(dataToSign, parameters.getDigestAlgorithm(),
				getPrivateKeyEntry());
		DSSDocument signDocument = service.signDocument(fileDocument, parameters, signatureValue);

		String stringContent = new String(DSSUtils.toByteArray(signDocument), "UTF-8");
		assertTrue(stringContent.contains("<ds:Reference Id=\"r-id-1\">")); // no empty URI

		SignedDocumentValidator validator = SignedDocumentValidator.fromDocument(signDocument);
		validator.setDetachedContents(Arrays.<DSSDocument>asList(new FileDocument(ORIGINAL_FILE)));
		validator.setCertificateVerifier(getCompleteCertificateVerifier());
		Reports reports = validator.validateDocument();
		DiagnosticData diagnosticData = reports.getDiagnosticData();
		SignatureWrapper signature = diagnosticData.getSignatureById(diagnosticData.getFirstSignatureId());
		assertTrue(signature.isBLevelTechnicallyValid());
	}

	@Override
	protected String getSigningAlias() {
		return GOOD_USER;
	}

}
