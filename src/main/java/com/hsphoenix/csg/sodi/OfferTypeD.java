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
 * <p>Java class for offerTypeD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="offerTypeD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element ref="{}ParentServiceIdentifier" minOccurs="0"/>
 *         &lt;element ref="{}RootServiceIdentifier" minOccurs="0"/>
 *         &lt;element ref="{}ComponentIdentifier" minOccurs="0"/>
 *         &lt;element name="PricePlan" type="{}pricePlanTypeC" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offerTypeD", propOrder = {
    "identifier",
    "parentServiceIdentifier",
    "rootServiceIdentifier",
    "componentIdentifier",
    "pricePlan"
})
public class OfferTypeD {

    @XmlElement(name = "Identifier")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger identifier;
    @XmlElement(name = "ParentServiceIdentifier")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger parentServiceIdentifier;
    @XmlElement(name = "RootServiceIdentifier")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger rootServiceIdentifier;
    @XmlElement(name = "ComponentIdentifier")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger componentIdentifier;
    @XmlElement(name = "PricePlan")
    protected PricePlanTypeC pricePlan;

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
     * Gets the value of the parentServiceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentServiceIdentifier() {
        return parentServiceIdentifier;
    }

    /**
     * Sets the value of the parentServiceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParentServiceIdentifier(BigInteger value) {
        this.parentServiceIdentifier = value;
    }

    /**
     * Gets the value of the rootServiceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRootServiceIdentifier() {
        return rootServiceIdentifier;
    }

    /**
     * Sets the value of the rootServiceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRootServiceIdentifier(BigInteger value) {
        this.rootServiceIdentifier = value;
    }

    /**
     * Gets the value of the componentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getComponentIdentifier() {
        return componentIdentifier;
    }

    /**
     * Sets the value of the componentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setComponentIdentifier(BigInteger value) {
        this.componentIdentifier = value;
    }

    /**
     * Gets the value of the pricePlan property.
     * 
     * @return
     *     possible object is
     *     {@link PricePlanTypeC }
     *     
     */
    public PricePlanTypeC getPricePlan() {
        return pricePlan;
    }

    /**
     * Sets the value of the pricePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricePlanTypeC }
     *     
     */
    public void setPricePlan(PricePlanTypeC value) {
        this.pricePlan = value;
    }

}
