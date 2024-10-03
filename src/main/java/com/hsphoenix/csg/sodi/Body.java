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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.hsphoenix.csg.sodi.provisionable.order.ProvisionableOrderCompleted;
import com.hsphoenix.csg.sodi.provisionable.order.ProvisionableOrderCompletedResponse;
import com.hsphoenix.csg.sodi.provisionable.order.ProvisionableOrderUpdated;
import com.hsphoenix.csg.sodi.provisionable.order.ProvisionableOrderUpdatedResponse;
import com.hsphoenix.csg.sodi.update.provisionable.UpdateProvisionableOrder;
import com.hsphoenix.csg.sodi.update.provisionable.UpdateProvisionableOrderResponse;
import com.hsphoenix.csg.sodi.update.voice.UpdateVoiceOrder;
import com.hsphoenix.csg.sodi.update.voice.UpdateVoiceOrderResponse;
import com.hsphoenix.csg.sodi.voice.order.VoiceOrderUpdated;
import com.hsphoenix.csg.sodi.voice.order.VoiceOrderUpdatedResponse;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{}UpdateVoiceOrder"/>
 *         &lt;element ref="{}UpdateVoiceOrderResponse"/>
 *         &lt;element ref="{}VoiceOrderUpdated"/>
 *         &lt;element ref="{}VoiceOrderUpdatedResponse"/>
 *         &lt;element ref="{}UpdateProvisionableOrder"/>
 *         &lt;element ref="{}UpdateProvisionableOrderResponse"/>
 *         &lt;element ref="{}ProvisionableOrderCompleted"/>
 *         &lt;element ref="{}ProvisionableOrderCompletedResponse"/>
 *         &lt;element ref="{}ProvisionableOrderUpdatedResponse"/>
 *         &lt;element ref="{}ProvisionableOrderUpdated"/>
 *         &lt;element ref="{}ErrorResponse"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updateVoiceOrder",
    "updateVoiceOrderResponse",
    "voiceOrderUpdated",
    "voiceOrderUpdatedResponse",
    "updateProvisionableOrder",
    "updateProvisionableOrderResponse",
    "provisionableOrderCompleted",
    "provisionableOrderCompletedResponse",
    "provisionableOrderUpdatedResponse",
    "provisionableOrderUpdated",
    "errorResponse"
})
@XmlRootElement(name = "body")
public class Body {

    @XmlElement(name = "UpdateVoiceOrder")
    protected UpdateVoiceOrder updateVoiceOrder;
    @XmlElement(name = "UpdateVoiceOrderResponse")
    protected UpdateVoiceOrderResponse updateVoiceOrderResponse;
    @XmlElement(name = "VoiceOrderUpdated")
    protected VoiceOrderUpdated voiceOrderUpdated;
    @XmlElement(name = "VoiceOrderUpdatedResponse")
    protected VoiceOrderUpdatedResponse voiceOrderUpdatedResponse;
    @XmlElement(name = "UpdateProvisionableOrder")
    protected UpdateProvisionableOrder updateProvisionableOrder;
    @XmlElement(name = "UpdateProvisionableOrderResponse")
    protected UpdateProvisionableOrderResponse updateProvisionableOrderResponse;
    @XmlElement(name = "ProvisionableOrderCompleted")
    protected ProvisionableOrderCompleted provisionableOrderCompleted;
    @XmlElement(name = "ProvisionableOrderCompletedResponse")
    protected ProvisionableOrderCompletedResponse provisionableOrderCompletedResponse;
    @XmlElement(name = "ProvisionableOrderUpdatedResponse")
    protected ProvisionableOrderUpdatedResponse provisionableOrderUpdatedResponse;
    @XmlElement(name = "ProvisionableOrderUpdated")
    protected ProvisionableOrderUpdated provisionableOrderUpdated;
    @XmlElement(name = "ErrorResponse")
    protected ErrorResponse errorResponse;

    /**
     * Gets the value of the updateVoiceOrder property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateVoiceOrder }
     *     
     */
    public UpdateVoiceOrder getUpdateVoiceOrder() {
        return updateVoiceOrder;
    }

    /**
     * Sets the value of the updateVoiceOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateVoiceOrder }
     *     
     */
    public void setUpdateVoiceOrder(UpdateVoiceOrder value) {
        this.updateVoiceOrder = value;
    }

    /**
     * Gets the value of the updateVoiceOrderResponse property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateVoiceOrderResponse }
     *     
     */
    public UpdateVoiceOrderResponse getUpdateVoiceOrderResponse() {
        return updateVoiceOrderResponse;
    }

    /**
     * Sets the value of the updateVoiceOrderResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateVoiceOrderResponse }
     *     
     */
    public void setUpdateVoiceOrderResponse(UpdateVoiceOrderResponse value) {
        this.updateVoiceOrderResponse = value;
    }

    /**
     * Gets the value of the voiceOrderUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link VoiceOrderUpdated }
     *     
     */
    public VoiceOrderUpdated getVoiceOrderUpdated() {
        return voiceOrderUpdated;
    }

    /**
     * Sets the value of the voiceOrderUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceOrderUpdated }
     *     
     */
    public void setVoiceOrderUpdated(VoiceOrderUpdated value) {
        this.voiceOrderUpdated = value;
    }

    /**
     * Gets the value of the voiceOrderUpdatedResponse property.
     * 
     * @return
     *     possible object is
     *     {@link VoiceOrderUpdatedResponse }
     *     
     */
    public VoiceOrderUpdatedResponse getVoiceOrderUpdatedResponse() {
        return voiceOrderUpdatedResponse;
    }

    /**
     * Sets the value of the voiceOrderUpdatedResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceOrderUpdatedResponse }
     *     
     */
    public void setVoiceOrderUpdatedResponse(VoiceOrderUpdatedResponse value) {
        this.voiceOrderUpdatedResponse = value;
    }

    /**
     * Gets the value of the updateProvisionableOrder property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateProvisionableOrder }
     *     
     */
    public UpdateProvisionableOrder getUpdateProvisionableOrder() {
        return updateProvisionableOrder;
    }

    /**
     * Sets the value of the updateProvisionableOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateProvisionableOrder }
     *     
     */
    public void setUpdateProvisionableOrder(UpdateProvisionableOrder value) {
        this.updateProvisionableOrder = value;
    }

    /**
     * Gets the value of the updateProvisionableOrderResponse property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateProvisionableOrderResponse }
     *     
     */
    public UpdateProvisionableOrderResponse getUpdateProvisionableOrderResponse() {
        return updateProvisionableOrderResponse;
    }

    /**
     * Sets the value of the updateProvisionableOrderResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateProvisionableOrderResponse }
     *     
     */
    public void setUpdateProvisionableOrderResponse(UpdateProvisionableOrderResponse value) {
        this.updateProvisionableOrderResponse = value;
    }

    /**
     * Gets the value of the provisionableOrderCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link ProvisionableOrderCompleted }
     *     
     */
    public ProvisionableOrderCompleted getProvisionableOrderCompleted() {
        return provisionableOrderCompleted;
    }

    /**
     * Sets the value of the provisionableOrderCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvisionableOrderCompleted }
     *     
     */
    public void setProvisionableOrderCompleted(ProvisionableOrderCompleted value) {
        this.provisionableOrderCompleted = value;
    }

    /**
     * Gets the value of the provisionableOrderCompletedResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ProvisionableOrderCompletedResponse }
     *     
     */
    public ProvisionableOrderCompletedResponse getProvisionableOrderCompletedResponse() {
        return provisionableOrderCompletedResponse;
    }

    /**
     * Sets the value of the provisionableOrderCompletedResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvisionableOrderCompletedResponse }
     *     
     */
    public void setProvisionableOrderCompletedResponse(ProvisionableOrderCompletedResponse value) {
        this.provisionableOrderCompletedResponse = value;
    }

    /**
     * Gets the value of the provisionableOrderUpdatedResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ProvisionableOrderUpdatedResponse }
     *     
     */
    public ProvisionableOrderUpdatedResponse getProvisionableOrderUpdatedResponse() {
        return provisionableOrderUpdatedResponse;
    }

    /**
     * Sets the value of the provisionableOrderUpdatedResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvisionableOrderUpdatedResponse }
     *     
     */
    public void setProvisionableOrderUpdatedResponse(ProvisionableOrderUpdatedResponse value) {
        this.provisionableOrderUpdatedResponse = value;
    }

    /**
     * Gets the value of the provisionableOrderUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link ProvisionableOrderUpdated }
     *     
     */
    public ProvisionableOrderUpdated getProvisionableOrderUpdated() {
        return provisionableOrderUpdated;
    }

    /**
     * Sets the value of the provisionableOrderUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvisionableOrderUpdated }
     *     
     */
    public void setProvisionableOrderUpdated(ProvisionableOrderUpdated value) {
        this.provisionableOrderUpdated = value;
    }

    /**
     * Gets the value of the errorResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorResponse }
     *     
     */
    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    /**
     * Sets the value of the errorResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorResponse }
     *     
     */
    public void setErrorResponse(ErrorResponse value) {
        this.errorResponse = value;
    }

}
