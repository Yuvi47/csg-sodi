//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.10.02 at 05:47:07 PM MST 
//


package com.hsphoenix.csg.sodi;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tnBlock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tnBlock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}StartTelephoneNumberId"/>
 *         &lt;element ref="{}EndTelephoneNumberId"/>
 *         &lt;element ref="{}AccountId"/>
 *         &lt;element ref="{}Native"/>
 *         &lt;element ref="{}PortedType"/>
 *         &lt;element ref="{}TelephoneNumberCount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tnBlock", propOrder = {
    "startTelephoneNumberId",
    "endTelephoneNumberId",
    "accountId",
    "_native",
    "portedType",
    "telephoneNumberCount"
})
public class TnBlock {

    @XmlElement(name = "StartTelephoneNumberId", required = true)
    protected String startTelephoneNumberId;
    @XmlElement(name = "EndTelephoneNumberId", required = true)
    protected String endTelephoneNumberId;
    @XmlElement(name = "AccountId", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger accountId;
    @XmlElement(name = "Native", required = true)
    protected String _native;
    @XmlElement(name = "PortedType", required = true)
    protected String portedType;
    @XmlElement(name = "TelephoneNumberCount", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger telephoneNumberCount;

    /**
     * Gets the value of the startTelephoneNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTelephoneNumberId() {
        return startTelephoneNumberId;
    }

    /**
     * Sets the value of the startTelephoneNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTelephoneNumberId(String value) {
        this.startTelephoneNumberId = value;
    }

    /**
     * Gets the value of the endTelephoneNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTelephoneNumberId() {
        return endTelephoneNumberId;
    }

    /**
     * Sets the value of the endTelephoneNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTelephoneNumberId(String value) {
        this.endTelephoneNumberId = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccountId(BigInteger value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the native property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNative() {
        return _native;
    }

    /**
     * Sets the value of the native property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNative(String value) {
        this._native = value;
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
     * Gets the value of the telephoneNumberCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTelephoneNumberCount() {
        return telephoneNumberCount;
    }

    /**
     * Sets the value of the telephoneNumberCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTelephoneNumberCount(BigInteger value) {
        this.telephoneNumberCount = value;
    }

}
