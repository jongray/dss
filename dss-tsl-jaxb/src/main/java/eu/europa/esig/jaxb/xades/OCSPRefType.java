//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 02:35:27 PM CEST 
//


package eu.europa.esig.jaxb.xades;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCSPRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCSPRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OCSPIdentifier" type="{http://uri.etsi.org/01903/v1.3.2#}OCSPIdentifierType"/>
 *         &lt;element name="DigestAlgAndValue" type="{http://uri.etsi.org/01903/v1.3.2#}DigestAlgAndValueType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCSPRefType", propOrder = {
    "ocspIdentifier",
    "digestAlgAndValue"
})
public class OCSPRefType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OCSPIdentifier", required = true)
    protected OCSPIdentifierType ocspIdentifier;
    @XmlElement(name = "DigestAlgAndValue")
    protected DigestAlgAndValueType digestAlgAndValue;

    /**
     * Gets the value of the ocspIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link OCSPIdentifierType }
     *     
     */
    public OCSPIdentifierType getOCSPIdentifier() {
        return ocspIdentifier;
    }

    /**
     * Sets the value of the ocspIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link OCSPIdentifierType }
     *     
     */
    public void setOCSPIdentifier(OCSPIdentifierType value) {
        this.ocspIdentifier = value;
    }

    /**
     * Gets the value of the digestAlgAndValue property.
     * 
     * @return
     *     possible object is
     *     {@link DigestAlgAndValueType }
     *     
     */
    public DigestAlgAndValueType getDigestAlgAndValue() {
        return digestAlgAndValue;
    }

    /**
     * Sets the value of the digestAlgAndValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestAlgAndValueType }
     *     
     */
    public void setDigestAlgAndValue(DigestAlgAndValueType value) {
        this.digestAlgAndValue = value;
    }

}
