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
 * <p>Java class for cardTypeB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cardTypeB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Number"/>
 *         &lt;element ref="{}Type"/>
 *         &lt;element ref="{}ExpirationDate"/>
 *         &lt;element ref="{}ECommerceIdentifier" minOccurs="0"/>
 *         &lt;element ref="{}DebitCardIndicator" minOccurs="0"/>
 *         &lt;element name="SecurityVerification" type="{}codeMessage" minOccurs="0"/>
 *         &lt;element name="AddressVerification" type="{}codeMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cardTypeB", propOrder = {
    "number",
    "type",
    "expirationDate",
    "eCommerceIdentifier",
    "debitCardIndicator",
    "securityVerification",
    "addressVerification"
})
public class CardTypeB {

    @XmlElement(name = "Number", required = true)
    protected String number;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "ExpirationDate", required = true)
    protected String expirationDate;
    @XmlElement(name = "ECommerceIdentifier")
    protected String eCommerceIdentifier;
    @XmlElement(name = "DebitCardIndicator")
    protected String debitCardIndicator;
    @XmlElement(name = "SecurityVerification")
    protected CodeMessage securityVerification;
    @XmlElement(name = "AddressVerification")
    protected CodeMessage addressVerification;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the eCommerceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECommerceIdentifier() {
        return eCommerceIdentifier;
    }

    /**
     * Sets the value of the eCommerceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECommerceIdentifier(String value) {
        this.eCommerceIdentifier = value;
    }

    /**
     * Gets the value of the debitCardIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitCardIndicator() {
        return debitCardIndicator;
    }

    /**
     * Sets the value of the debitCardIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitCardIndicator(String value) {
        this.debitCardIndicator = value;
    }

    /**
     * Gets the value of the securityVerification property.
     * 
     * @return
     *     possible object is
     *     {@link CodeMessage }
     *     
     */
    public CodeMessage getSecurityVerification() {
        return securityVerification;
    }

    /**
     * Sets the value of the securityVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeMessage }
     *     
     */
    public void setSecurityVerification(CodeMessage value) {
        this.securityVerification = value;
    }

    /**
     * Gets the value of the addressVerification property.
     * 
     * @return
     *     possible object is
     *     {@link CodeMessage }
     *     
     */
    public CodeMessage getAddressVerification() {
        return addressVerification;
    }

    /**
     * Sets the value of the addressVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeMessage }
     *     
     */
    public void setAddressVerification(CodeMessage value) {
        this.addressVerification = value;
    }

}
