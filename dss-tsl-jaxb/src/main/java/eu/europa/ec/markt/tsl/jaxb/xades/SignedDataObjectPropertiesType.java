//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.16 at 10:07:03 PM CET 
//


/**
 * DSS - Digital Signature Services
 * Copyright (C) 2015 European Commission, provided under the CEF programme
 *
 * This file is part of the "DSS - Digital Signature Services" project.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package eu.europa.ec.markt.tsl.jaxb.xades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 *
 * 
 *
 * 
 * <pre>
 * &lt;complexType name="SignedDataObjectPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataObjectFormat" type="{http://uri.etsi.org/01903/v1.3.2#}DataObjectFormatType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CommitmentTypeIndication" type="{http://uri.etsi.org/01903/v1.3.2#}CommitmentTypeIndicationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AllDataObjectsTimeStamp" type="{http://uri.etsi.org/01903/v1.3.2#}XAdESTimeStampType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IndividualDataObjectsTimeStamp" type="{http://uri.etsi.org/01903/v1.3.2#}XAdESTimeStampType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignedDataObjectPropertiesType", propOrder = {
    "dataObjectFormat",
    "commitmentTypeIndication",
    "allDataObjectsTimeStamp",
    "individualDataObjectsTimeStamp"
})
public class SignedDataObjectPropertiesType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DataObjectFormat")
    protected List<DataObjectFormatType> dataObjectFormat;
    @XmlElement(name = "CommitmentTypeIndication")
    protected List<CommitmentTypeIndicationType> commitmentTypeIndication;
    @XmlElement(name = "AllDataObjectsTimeStamp")
    protected List<XAdESTimeStampType> allDataObjectsTimeStamp;
    @XmlElement(name = "IndividualDataObjectsTimeStamp")
    protected List<XAdESTimeStampType> individualDataObjectsTimeStamp;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the dataObjectFormat property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataObjectFormat property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataObjectFormat().add(newItem);
     * </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link DataObjectFormatType }
     * 
     * 
     */
    public List<DataObjectFormatType> getDataObjectFormat() {
        if (dataObjectFormat == null) {
            dataObjectFormat = new ArrayList<DataObjectFormatType>();
        }
        return this.dataObjectFormat;
    }

    /**
     * Gets the value of the commitmentTypeIndication property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commitmentTypeIndication property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitmentTypeIndication().add(newItem);
     * </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CommitmentTypeIndicationType }
     * 
     * 
     */
    public List<CommitmentTypeIndicationType> getCommitmentTypeIndication() {
        if (commitmentTypeIndication == null) {
            commitmentTypeIndication = new ArrayList<CommitmentTypeIndicationType>();
        }
        return this.commitmentTypeIndication;
    }

    /**
     * Gets the value of the allDataObjectsTimeStamp property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allDataObjectsTimeStamp property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllDataObjectsTimeStamp().add(newItem);
     * </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link XAdESTimeStampType }
     * 
     * 
     */
    public List<XAdESTimeStampType> getAllDataObjectsTimeStamp() {
        if (allDataObjectsTimeStamp == null) {
            allDataObjectsTimeStamp = new ArrayList<XAdESTimeStampType>();
        }
        return this.allDataObjectsTimeStamp;
    }

    /**
     * Gets the value of the individualDataObjectsTimeStamp property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualDataObjectsTimeStamp property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualDataObjectsTimeStamp().add(newItem);
     * </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link XAdESTimeStampType }
     * 
     * 
     */
    public List<XAdESTimeStampType> getIndividualDataObjectsTimeStamp() {
        if (individualDataObjectsTimeStamp == null) {
            individualDataObjectsTimeStamp = new ArrayList<XAdESTimeStampType>();
        }
        return this.individualDataObjectsTimeStamp;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}