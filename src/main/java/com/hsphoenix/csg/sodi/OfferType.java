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
 * <p>Java class for offerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="offerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element ref="{}ComponentPricePlanIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offerType", propOrder = {
    "identifier",
    "componentPricePlanIdentifier"
})
public class OfferType {

    @XmlElement(name = "Identifier", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger identifier;
    @XmlElement(name = "ComponentPricePlanIdentifier", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger componentPricePlanIdentifier;

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
     * Gets the value of the componentPricePlanIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getComponentPricePlanIdentifier() {
        return componentPricePlanIdentifier;
    }

    /**
     * Sets the value of the componentPricePlanIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setComponentPricePlanIdentifier(BigInteger value) {
        this.componentPricePlanIdentifier = value;
    }

}
