//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.10.02 at 05:47:07 PM MST 
//


package com.hsphoenix.csg.sodi;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cardTypeN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cardTypeN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Number"/>
 *         &lt;element ref="{}Type"/>
 *         &lt;element ref="{}ExpirationDate"/>
 *         &lt;element ref="{}Amount"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}SecurityCode"/>
 *           &lt;element ref="{}SecurityCodeOverride"/>
 *         &lt;/choice>
 *         &lt;element ref="{}ECommerceIdentifier" minOccurs="0"/>
 *         &lt;element ref="{}RequestedProcessingNetwork" minOccurs="0"/>
 *         &lt;element ref="{}Source" minOccurs="0"/>
 *         &lt;element name="Retail" type="{}retailUpdate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cardTypeN", propOrder = {
    "number",
    "type",
    "expirationDate",
    "amount",
    "securityCode",
    "securityCodeOverride",
    "eCommerceIdentifier",
    "requestedProcessingNetwork",
    "source",
    "retail"
})
public class CardTypeN {

    @XmlElement(name = "Number", required = true)
    protected String number;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "ExpirationDate", required = true)
    protected String expirationDate;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "SecurityCode")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger securityCode;
    @XmlElement(name = "SecurityCodeOverride")
    protected String securityCodeOverride;
    @XmlElement(name = "ECommerceIdentifier")
    protected String eCommerceIdentifier;
    @XmlElement(name = "RequestedProcessingNetwork")
    protected String requestedProcessingNetwork;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "Retail")
    protected RetailUpdate retail;

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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the securityCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSecurityCode() {
        return securityCode;
    }

    /**
     * Sets the value of the securityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSecurityCode(BigInteger value) {
        this.securityCode = value;
    }

    /**
     * Gets the value of the securityCodeOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityCodeOverride() {
        return securityCodeOverride;
    }

    /**
     * Sets the value of the securityCodeOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityCodeOverride(String value) {
        this.securityCodeOverride = value;
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
     * Gets the value of the requestedProcessingNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedProcessingNetwork() {
        return requestedProcessingNetwork;
    }

    /**
     * Sets the value of the requestedProcessingNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedProcessingNetwork(String value) {
        this.requestedProcessingNetwork = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the retail property.
     * 
     * @return
     *     possible object is
     *     {@link RetailUpdate }
     *     
     */
    public RetailUpdate getRetail() {
        return retail;
    }

    /**
     * Sets the value of the retail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailUpdate }
     *     
     */
    public void setRetail(RetailUpdate value) {
        this.retail = value;
    }

}
