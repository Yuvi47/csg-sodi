//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.10.02 at 05:47:07 PM MST 
//


package com.hsphoenix.csg.sodi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for telephoneNumberC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="telephoneNumberC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}TelephoneNumberId"/>
 *         &lt;element ref="{}PortedType" minOccurs="0"/>
 *         &lt;element ref="{}PortOut" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telephoneNumberC", propOrder = {
    "telephoneNumberId",
    "portedType",
    "portOut"
})
public class TelephoneNumberC {

    @XmlElement(name = "TelephoneNumberId", required = true)
    protected String telephoneNumberId;
    @XmlElement(name = "PortedType")
    protected String portedType;
    @XmlElement(name = "PortOut")
    protected String portOut;

    /**
     * Gets the value of the telephoneNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneNumberId() {
        return telephoneNumberId;
    }

    /**
     * Sets the value of the telephoneNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNumberId(String value) {
        this.telephoneNumberId = value;
    }

    /**
     * Gets the value of the portedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortedType() {
        return portedType;
    }

    /**
     * Sets the value of the portedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortedType(String value) {
        this.portedType = value;
    }

    /**
     * Gets the value of the portOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortOut() {
        return portOut;
    }

    /**
     * Sets the value of the portOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortOut(String value) {
        this.portOut = value;
    }

}
