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
package eu.europa.ec.markt.tsl.jaxb.tslx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.europa.ec.markt.tsl.jaxb.tsl.AnyType;
import eu.europa.ec.markt.tsl.jaxb.tsl.InternationalNamesType;
import eu.europa.ec.markt.tsl.jaxb.tsl.NonEmptyMultiLangURIType;


/**
 *
 * 
 *
 * 
 * <pre>
 * &lt;complexType name="TakenOverByType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="URI" type="{http://uri.etsi.org/02231/v2#}NonEmptyMultiLangURIType"/>
 *         &lt;element name="TSPName" type="{http://uri.etsi.org/02231/v2#}InternationalNamesType"/>
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}SchemeOperatorName"/>
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}SchemeTerritory"/>
 *         &lt;element name="OtherQualifier" type="{http://uri.etsi.org/02231/v2#}AnyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TakenOverByType", propOrder = {
    "uri",
    "tspName",
    "schemeOperatorName",
    "schemeTerritory",
    "otherQualifier"
})
public class TakenOverByType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "URI", required = true)
    protected NonEmptyMultiLangURIType uri;
    @XmlElement(name = "TSPName", required = true)
    protected InternationalNamesType tspName;
    @XmlElement(name = "SchemeOperatorName", namespace = "http://uri.etsi.org/02231/v2#", required = true)
    protected InternationalNamesType schemeOperatorName;
    @XmlElement(name = "SchemeTerritory", namespace = "http://uri.etsi.org/02231/v2#", required = true)
    protected String schemeTerritory;
    @XmlElement(name = "OtherQualifier")
    protected List<AnyType> otherQualifier;

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyMultiLangURIType }
     *     
     */
    public NonEmptyMultiLangURIType getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyMultiLangURIType }
     *     
     */
    public void setURI(NonEmptyMultiLangURIType value) {
        this.uri = value;
    }

    /**
     * Gets the value of the tspName property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalNamesType }
     *     
     */
    public InternationalNamesType getTSPName() {
        return tspName;
    }

    /**
     * Sets the value of the tspName property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalNamesType }
     *     
     */
    public void setTSPName(InternationalNamesType value) {
        this.tspName = value;
    }

    /**
     * Gets the value of the schemeOperatorName property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalNamesType }
     *     
     */
    public InternationalNamesType getSchemeOperatorName() {
        return schemeOperatorName;
    }

    /**
     * Sets the value of the schemeOperatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalNamesType }
     *     
     */
    public void setSchemeOperatorName(InternationalNamesType value) {
        this.schemeOperatorName = value;
    }

    /**
     * Gets the value of the schemeTerritory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeTerritory() {
        return schemeTerritory;
    }

    /**
     * Sets the value of the schemeTerritory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeTerritory(String value) {
        this.schemeTerritory = value;
    }

    /**
     * Gets the value of the otherQualifier property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherQualifier property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherQualifier().add(newItem);
     * </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link AnyType }
     * 
     * 
     */
    public List<AnyType> getOtherQualifier() {
        if (otherQualifier == null) {
            otherQualifier = new ArrayList<AnyType>();
        }
        return this.otherQualifier;
    }

}