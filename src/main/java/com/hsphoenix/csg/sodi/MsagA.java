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
 * <p>Java class for msagA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="msagA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}PrefixDirectional" minOccurs="0"/>
 *         &lt;element ref="{}Street" minOccurs="0"/>
 *         &lt;element ref="{}StreetSuffix" minOccurs="0"/>
 *         &lt;element ref="{}PostDirectional" minOccurs="0"/>
 *         &lt;element ref="{}MSAGCommunity" minOccurs="0"/>
 *         &lt;element ref="{}PostalCommunity" minOccurs="0"/>
 *         &lt;element ref="{}EmergencyServiceNumber" minOccurs="0"/>
 *         &lt;element ref="{}PublicSafetyAnsweringPoint" minOccurs="0"/>
 *         &lt;element ref="{}County" minOccurs="0"/>
 *         &lt;element ref="{}Exchange" minOccurs="0"/>
 *         &lt;element ref="{}TaxingAreaRateCode" minOccurs="0"/>
 *         &lt;element ref="{}E911ControlOffice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "msagA", propOrder = {
    "prefixDirectional",
    "street",
    "streetSuffix",
    "postDirectional",
    "msagCommunity",
    "postalCommunity",
    "emergencyServiceNumber",
    "publicSafetyAnsweringPoint",
    "county",
    "exchange",
    "taxingAreaRateCode",
    "e911ControlOffice"
})
public class MsagA {

    @XmlElement(name = "PrefixDirectional")
    protected String prefixDirectional;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "StreetSuffix")
    protected String streetSuffix;
    @XmlElement(name = "PostDirectional")
    protected String postDirectional;
    @XmlElement(name = "MSAGCommunity")
    protected String msagCommunity;
    @XmlElement(name = "PostalCommunity")
    protected String postalCommunity;
    @XmlElement(name = "EmergencyServiceNumber")
    protected String emergencyServiceNumber;
    @XmlElement(name = "PublicSafetyAnsweringPoint")
    protected String publicSafetyAnsweringPoint;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "Exchange")
    protected String exchange;
    @XmlElement(name = "TaxingAreaRateCode")
    protected String taxingAreaRateCode;
    @XmlElement(name = "E911ControlOffice")
    protected String e911ControlOffice;

    /**
     * Gets the value of the prefixDirectional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefixDirectional() {
        return prefixDirectional;
    }

    /**
     * Sets the value of the prefixDirectional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefixDirectional(String value) {
        this.prefixDirectional = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the streetSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetSuffix() {
        return streetSuffix;
    }

    /**
     * Sets the value of the streetSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetSuffix(String value) {
        this.streetSuffix = value;
    }

    /**
     * Gets the value of the postDirectional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostDirectional() {
        return postDirectional;
    }

    /**
     * Sets the value of the postDirectional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostDirectional(String value) {
        this.postDirectional = value;
    }

    /**
     * Gets the value of the msagCommunity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSAGCommunity() {
        return msagCommunity;
    }

    /**
     * Sets the value of the msagCommunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSAGCommunity(String value) {
        this.msagCommunity = value;
    }

    /**
     * Gets the value of the postalCommunity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCommunity() {
        return postalCommunity;
    }

    /**
     * Sets the value of the postalCommunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCommunity(String value) {
        this.postalCommunity = value;
    }

    /**
     * Gets the value of the emergencyServiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyServiceNumber() {
        return emergencyServiceNumber;
    }

    /**
     * Sets the value of the emergencyServiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyServiceNumber(String value) {
        this.emergencyServiceNumber = value;
    }

    /**
     * Gets the value of the publicSafetyAnsweringPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicSafetyAnsweringPoint() {
        return publicSafetyAnsweringPoint;
    }

    /**
     * Sets the value of the publicSafetyAnsweringPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicSafetyAnsweringPoint(String value) {
        this.publicSafetyAnsweringPoint = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the exchange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchange() {
        return exchange;
    }

    /**
     * Sets the value of the exchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchange(String value) {
        this.exchange = value;
    }

    /**
     * Gets the value of the taxingAreaRateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxingAreaRateCode() {
        return taxingAreaRateCode;
    }

    /**
     * Sets the value of the taxingAreaRateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxingAreaRateCode(String value) {
        this.taxingAreaRateCode = value;
    }

    /**
     * Gets the value of the e911ControlOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE911ControlOffice() {
        return e911ControlOffice;
    }

    /**
     * Sets the value of the e911ControlOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE911ControlOffice(String value) {
        this.e911ControlOffice = value;
    }

}
