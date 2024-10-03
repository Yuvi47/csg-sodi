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
 * <p>Java class for offerTypeR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="offerTypeR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *           &lt;element ref="{}OriginalIdentifier"/>
 *         &lt;/choice>
 *         &lt;element ref="{}NewOriginalIdentifier"/>
 *         &lt;element name="PricePlan" type="{}pricePlanTypeJ" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offerTypeR", propOrder = {
    "identifier",
    "originalIdentifier",
    "newOriginalIdentifier",
    "pricePlan"
})
public class OfferTypeR {

    @XmlElement(name = "Identifier")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger identifier;
    @XmlElement(name = "OriginalIdentifier")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger originalIdentifier;
    @XmlElement(name = "NewOriginalIdentifier", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger newOriginalIdentifier;
    @XmlElement(name = "PricePlan")
    protected PricePlanTypeJ pricePlan;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdentifier(BigInteger value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the originalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOriginalIdentifier() {
        return originalIdentifier;
    }

    /**
     * Sets the value of the originalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOriginalIdentifier(BigInteger value) {
        this.originalIdentifier = value;
    }

    /**
     * Gets the value of the newOriginalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNewOriginalIdentifier() {
        return newOriginalIdentifier;
    }

    /**
     * Sets the value of the newOriginalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNewOriginalIdentifier(BigInteger value) {
        this.newOriginalIdentifier = value;
    }

    /**
     * Gets the value of the pricePlan property.
     * 
     * @return
     *     possible object is
     *     {@link PricePlanTypeJ }
     *     
     */
    public PricePlanTypeJ getPricePlan() {
        return pricePlan;
    }

    /**
     * Sets the value of the pricePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricePlanTypeJ }
     *     
     */
    public void setPricePlan(PricePlanTypeJ value) {
        this.pricePlan = value;
    }

}
