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
 * <p>Java class for billingA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billingA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Discount" minOccurs="0"/>
 *         &lt;element ref="{}DiscountDescription" minOccurs="0"/>
 *         &lt;element ref="{}DiscountErrorIndicator" minOccurs="0"/>
 *         &lt;element ref="{}ChargeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billingA", propOrder = {
    "discount",
    "discountDescription",
    "discountErrorIndicator",
    "chargeType"
})
public class BillingA {

    @XmlElement(name = "Discount")
    protected String discount;
    @XmlElement(name = "DiscountDescription")
    protected String discountDescription;
    @XmlElement(name = "DiscountErrorIndicator")
    protected String discountErrorIndicator;
    @XmlElement(name = "ChargeType")
    protected String chargeType;

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscount(String value) {
        this.discount = value;
    }

    /**
     * Gets the value of the discountDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountDescription() {
        return discountDescription;
    }

    /**
     * Sets the value of the discountDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountDescription(String value) {
        this.discountDescription = value;
    }

    /**
     * Gets the value of the discountErrorIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountErrorIndicator() {
        return discountErrorIndicator;
    }

    /**
     * Sets the value of the discountErrorIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountErrorIndicator(String value) {
        this.discountErrorIndicator = value;
    }

    /**
     * Gets the value of the chargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * Sets the value of the chargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeType(String value) {
        this.chargeType = value;
    }

}
