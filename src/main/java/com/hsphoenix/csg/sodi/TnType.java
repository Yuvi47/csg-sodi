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
 * <p>Java class for tnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tnType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}TelephoneNumberId"/>
 *         &lt;element name="Exception" type="{}exceptionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tnType", propOrder = {
    "telephoneNumberId",
    "exception"
})
public class TnType {

    @XmlElement(name = "TelephoneNumberId", required = true)
    protected String telephoneNumberId;
    @XmlElement(name = "Exception")
    protected ExceptionType exception;

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
     * Gets the value of the exception property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionType }
     *     
     */
    public ExceptionType getException() {
        return exception;
    }

    /**
     * Sets the value of the exception property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionType }
     *     
     */
    public void setException(ExceptionType value) {
        this.exception = value;
    }

}
