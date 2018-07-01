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
 * <p>Java class for AntiTheftDeviceInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AntiTheftDeviceInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}AntiTheftDeviceCd" minOccurs="0"/>
 *         &lt;element ref="{}AntiTheftProductCd" minOccurs="0"/>
 *         &lt;element ref="{}AntiTheftEngravingDevMfrCd" minOccurs="0"/>
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
@XmlType(name = "AntiTheftDeviceInfo_Type", propOrder = {
    "antiTheftDeviceCd",
    "antiTheftProductCd",
    "antiTheftEngravingDevMfrCd"
})
public class AntiTheftDeviceInfo_Type {

    @XmlElement(name = "AntiTheftDeviceCd")
    protected AutoAntiTheftDevice antiTheftDeviceCd;
    @XmlElement(name = "AntiTheftProductCd")
    protected AntiTheftProduct antiTheftProductCd;
    @XmlElement(name = "AntiTheftEngravingDevMfrCd")
    protected VehAntiTheftEngravingDevMfr antiTheftEngravingDevMfrCd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the antiTheftDeviceCd property.
     * 
     * @return
     *     possible object is
     *     {@link AutoAntiTheftDevice }
     *     
     */
    public AutoAntiTheftDevice getAntiTheftDeviceCd() {
        return antiTheftDeviceCd;
    }

    /**
     * Sets the value of the antiTheftDeviceCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoAntiTheftDevice }
     *     
     */
    public void setAntiTheftDeviceCd(AutoAntiTheftDevice value) {
        this.antiTheftDeviceCd = value;
    }

    /**
     * Gets the value of the antiTheftProductCd property.
     * 
     * @return
     *     possible object is
     *     {@link AntiTheftProduct }
     *     
     */
    public AntiTheftProduct getAntiTheftProductCd() {
        return antiTheftProductCd;
    }

    /**
     * Sets the value of the antiTheftProductCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AntiTheftProduct }
     *     
     */
    public void setAntiTheftProductCd(AntiTheftProduct value) {
        this.antiTheftProductCd = value;
    }

    /**
     * Gets the value of the antiTheftEngravingDevMfrCd property.
     * 
     * @return
     *     possible object is
     *     {@link VehAntiTheftEngravingDevMfr }
     *     
     */
    public VehAntiTheftEngravingDevMfr getAntiTheftEngravingDevMfrCd() {
        return antiTheftEngravingDevMfrCd;
    }

    /**
     * Sets the value of the antiTheftEngravingDevMfrCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehAntiTheftEngravingDevMfr }
     *     
     */
    public void setAntiTheftEngravingDevMfrCd(VehAntiTheftEngravingDevMfr value) {
        this.antiTheftEngravingDevMfrCd = value;
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
