//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.01 at 09:59:34 AM IST 
//


package com.shiva.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PreferredContact_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreferredContact_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}PreferencePriority" minOccurs="0"/>
 *         &lt;element ref="{}ContactDuration" minOccurs="0"/>
 *         &lt;element ref="{}BlackoutDuration" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreferredContact_Type", propOrder = {
    "preferencePriority",
    "contactDuration",
    "blackoutDuration"
})
public class PreferredContact_Type {

    @XmlElement(name = "PreferencePriority")
    protected Long preferencePriority;
    @XmlElement(name = "ContactDuration")
    protected DURATION contactDuration;
    @XmlElement(name = "BlackoutDuration")
    protected DURATION blackoutDuration;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the preferencePriority property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPreferencePriority() {
        return preferencePriority;
    }

    /**
     * Sets the value of the preferencePriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPreferencePriority(Long value) {
        this.preferencePriority = value;
    }

    /**
     * Gets the value of the contactDuration property.
     * 
     * @return
     *     possible object is
     *     {@link DURATION }
     *     
     */
    public DURATION getContactDuration() {
        return contactDuration;
    }

    /**
     * Sets the value of the contactDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURATION }
     *     
     */
    public void setContactDuration(DURATION value) {
        this.contactDuration = value;
    }

    /**
     * Gets the value of the blackoutDuration property.
     * 
     * @return
     *     possible object is
     *     {@link DURATION }
     *     
     */
    public DURATION getBlackoutDuration() {
        return blackoutDuration;
    }

    /**
     * Sets the value of the blackoutDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURATION }
     *     
     */
    public void setBlackoutDuration(DURATION value) {
        this.blackoutDuration = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
