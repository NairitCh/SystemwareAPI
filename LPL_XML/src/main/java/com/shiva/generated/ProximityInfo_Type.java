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
 * <p>Java class for ProximityInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProximityInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ClearanceFromCd" minOccurs="0"/>
 *         &lt;element ref="{}ClearanceToCd" minOccurs="0"/>
 *         &lt;element ref="{}Clearance" minOccurs="0"/>
 *         &lt;element ref="{}ProtectiveMaterialInfo" minOccurs="0"/>
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
@XmlType(name = "ProximityInfo_Type", propOrder = {
    "clearanceFromCd",
    "clearanceToCd",
    "clearance",
    "protectiveMaterialInfo"
})
public class ProximityInfo_Type {

    @XmlElement(name = "ClearanceFromCd")
    protected ClearanceFrom clearanceFromCd;
    @XmlElement(name = "ClearanceToCd")
    protected ClearanceTo clearanceToCd;
    @XmlElement(name = "Clearance")
    protected PROXIMITY clearance;
    @XmlElement(name = "ProtectiveMaterialInfo")
    protected ProtectiveMaterialInfo_Type protectiveMaterialInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the clearanceFromCd property.
     * 
     * @return
     *     possible object is
     *     {@link ClearanceFrom }
     *     
     */
    public ClearanceFrom getClearanceFromCd() {
        return clearanceFromCd;
    }

    /**
     * Sets the value of the clearanceFromCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearanceFrom }
     *     
     */
    public void setClearanceFromCd(ClearanceFrom value) {
        this.clearanceFromCd = value;
    }

    /**
     * Gets the value of the clearanceToCd property.
     * 
     * @return
     *     possible object is
     *     {@link ClearanceTo }
     *     
     */
    public ClearanceTo getClearanceToCd() {
        return clearanceToCd;
    }

    /**
     * Sets the value of the clearanceToCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearanceTo }
     *     
     */
    public void setClearanceToCd(ClearanceTo value) {
        this.clearanceToCd = value;
    }

    /**
     * Gets the value of the clearance property.
     * 
     * @return
     *     possible object is
     *     {@link PROXIMITY }
     *     
     */
    public PROXIMITY getClearance() {
        return clearance;
    }

    /**
     * Sets the value of the clearance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROXIMITY }
     *     
     */
    public void setClearance(PROXIMITY value) {
        this.clearance = value;
    }

    /**
     * Gets the value of the protectiveMaterialInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectiveMaterialInfo_Type }
     *     
     */
    public ProtectiveMaterialInfo_Type getProtectiveMaterialInfo() {
        return protectiveMaterialInfo;
    }

    /**
     * Sets the value of the protectiveMaterialInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectiveMaterialInfo_Type }
     *     
     */
    public void setProtectiveMaterialInfo(ProtectiveMaterialInfo_Type value) {
        this.protectiveMaterialInfo = value;
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
