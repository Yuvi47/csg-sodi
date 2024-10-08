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
 * <p>Java class for offerTypeM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="offerTypeM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element ref="{}ParentServiceIdentifier"/>
 *         &lt;element ref="{}RootServiceIdentifier"/>
 *         &lt;element ref="{}ComponentIdentifier"/>
 *         &lt;element ref="{}OriginalIdentifier"/>
 *         &lt;element ref="{}PenaltyOfferIdentifier" minOccurs="0"/>
 *         &lt;element ref="{}PenaltyServiceIdentifier" minOccurs="0"/>
 *         &lt;element name="Product">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PricePlan" type="{}pricePlanTypeH"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offerTypeM", propOrder = {
    "identifier",
    "parentServiceIdentifier",
    "rootServiceIdentifier",
    "componentIdentifier",
    "originalIdentifier",
    "penaltyOfferIdentifier",
    "penaltyServiceIdentifier",
    "product",
    "pricePlan"
})
public class OfferTypeM {

    @XmlElement(name = "Identifier", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger identifier;
    @XmlElement(name = "ParentServiceIdentifier", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger parentServiceIdentifier;
    @XmlElement(name = "RootServiceIdentifier", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger rootServiceIdentifier;
    @XmlElement(name = "ComponentIdentifier", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger componentIdentifier;
    @XmlElement(name = "OriginalIdentifier", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger originalIdentifier;
    @XmlElement(name = "PenaltyOfferIdentifier")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger penaltyOfferIdentifier;
    @XmlElement(name = "PenaltyServiceIdentifier")
    protected String penaltyServiceIdentifier;
    @XmlElement(name = "Product", required = true)
    protected OfferTypeM.Product product;
    @XmlElement(name = "PricePlan", required = true)
    protected PricePlanTypeH pricePlan;

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
     * Gets the value of the penaltyOfferIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPenaltyOfferIdentifier() {
        return penaltyOfferIdentifier;
    }

    /**
     * Sets the value of the penaltyOfferIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPenaltyOfferIdentifier(BigInteger value) {
        this.penaltyOfferIdentifier = value;
    }

    /**
     * Gets the value of the penaltyServiceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyServiceIdentifier() {
        return penaltyServiceIdentifier;
    }

    /**
     * Sets the value of the penaltyServiceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyServiceIdentifier(String value) {
        this.penaltyServiceIdentifier = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link OfferTypeM.Product }
     *     
     */
    public OfferTypeM.Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferTypeM.Product }
     *     
     */
    public void setProduct(OfferTypeM.Product value) {
        this.product = value;
    }

    /**
     * Gets the value of the pricePlan property.
     * 
     * @return
     *     possible object is
     *     {@link PricePlanTypeH }
     *     
     */
    public PricePlanTypeH getPricePlan() {
        return pricePlan;
    }

    /**
     * Sets the value of the pricePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricePlanTypeH }
     *     
     */
    public void setPricePlan(PricePlanTypeH value) {
        this.pricePlan = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "identifier"
    })
    public static class Product {

        @XmlElement(name = "Identifier", required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger identifier;

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

    }

}
