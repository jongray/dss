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
package eu.europa.ec.markt.tsl.jaxb.tsl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *
 * 
 *
 * 
 * <pre>
 * &lt;complexType name="ServiceHistoryInstanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}ServiceTypeIdentifier"/>
 *         &lt;element name="ServiceName" type="{http://uri.etsi.org/02231/v2#}InternationalNamesType"/>
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}ServiceDigitalIdentity"/>
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}ServiceStatus"/>
 *         &lt;element name="StatusStartingTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ServiceInformationExtensions" type="{http://uri.etsi.org/02231/v2#}ExtensionsListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceHistoryInstanceType", propOrder = {
    "serviceTypeIdentifier",
    "serviceName",
    "serviceDigitalIdentity",
    "serviceStatus",
    "statusStartingTime",
    "serviceInformationExtensions"
})
public class ServiceHistoryInstanceType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ServiceTypeIdentifier", required = true)
    protected String serviceTypeIdentifier;
    @XmlElement(name = "ServiceName", required = true)
    protected InternationalNamesType serviceName;
    @XmlElement(name = "ServiceDigitalIdentity", required = true)
    protected DigitalIdentityListType serviceDigitalIdentity;
    @XmlElement(name = "ServiceStatus", required = true)
    protected String serviceStatus;
    @XmlElement(name = "StatusStartingTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusStartingTime;
    @XmlElement(name = "ServiceInformationExtensions")
    protected ExtensionsListType serviceInformationExtensions;

    /**
     * Gets the value of the serviceTypeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceTypeIdentifier() {
        return serviceTypeIdentifier;
    }

    /**
     * Sets the value of the serviceTypeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTypeIdentifier(String value) {
        this.serviceTypeIdentifier = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalNamesType }
     *     
     */
    public InternationalNamesType getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalNamesType }
     *     
     */
    public void setServiceName(InternationalNamesType value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the serviceDigitalIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalIdentityListType }
     *     
     */
    public DigitalIdentityListType getServiceDigitalIdentity() {
        return serviceDigitalIdentity;
    }

    /**
     * Sets the value of the serviceDigitalIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalIdentityListType }
     *     
     */
    public void setServiceDigitalIdentity(DigitalIdentityListType value) {
        this.serviceDigitalIdentity = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceStatus(String value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the statusStartingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusStartingTime() {
        return statusStartingTime;
    }

    /**
     * Sets the value of the statusStartingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusStartingTime(XMLGregorianCalendar value) {
        this.statusStartingTime = value;
    }

    /**
     * Gets the value of the serviceInformationExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsListType }
     *     
     */
    public ExtensionsListType getServiceInformationExtensions() {
        return serviceInformationExtensions;
    }

    /**
     * Sets the value of the serviceInformationExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsListType }
     *     
     */
    public void setServiceInformationExtensions(ExtensionsListType value) {
        this.serviceInformationExtensions = value;
    }

}