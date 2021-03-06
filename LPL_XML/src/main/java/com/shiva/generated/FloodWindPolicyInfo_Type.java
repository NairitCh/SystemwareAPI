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
 * <p>Java class for FloodWindPolicyInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloodWindPolicyInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}FloodPostFirmInd" minOccurs="0"/>
 *         &lt;element ref="{}Elevation" minOccurs="0"/>
 *         &lt;element ref="{}FloodFormCd" minOccurs="0"/>
 *         &lt;element ref="{}FloodZoneCd" minOccurs="0"/>
 *         &lt;element ref="{}WindFormCd" minOccurs="0"/>
 *         &lt;element ref="{}WindZoneCd" minOccurs="0"/>
 *         &lt;element ref="{}CommunityNumber" minOccurs="0"/>
 *         &lt;element ref="{}PanelNumber" minOccurs="0"/>
 *         &lt;element ref="{}FloodSuffix" minOccurs="0"/>
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
@XmlType(name = "FloodWindPolicyInfo_Type", propOrder = {
    "floodPostFirmInd",
    "elevation",
    "floodFormCd",
    "floodZoneCd",
    "windFormCd",
    "windZoneCd",
    "communityNumber",
    "panelNumber",
    "floodSuffix"
})
public class FloodWindPolicyInfo_Type {

    @XmlElement(name = "FloodPostFirmInd")
    protected Boolean floodPostFirmInd;
    @XmlElement(name = "Elevation")
    protected MEASUREMENT elevation;
    @XmlElement(name = "FloodFormCd")
    protected FormType floodFormCd;
    @XmlElement(name = "FloodZoneCd")
    protected OpenEnum floodZoneCd;
    @XmlElement(name = "WindFormCd")
    protected FormType windFormCd;
    @XmlElement(name = "WindZoneCd")
    protected OpenEnum windZoneCd;
    @XmlElement(name = "CommunityNumber")
    protected Long communityNumber;
    @XmlElement(name = "PanelNumber")
    protected C11 panelNumber;
    @XmlElement(name = "FloodSuffix")
    protected C2 floodSuffix;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the floodPostFirmInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFloodPostFirmInd() {
        return floodPostFirmInd;
    }

    /**
     * Sets the value of the floodPostFirmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFloodPostFirmInd(Boolean value) {
        this.floodPostFirmInd = value;
    }

    /**
     * Gets the value of the elevation property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getElevation() {
        return elevation;
    }

    /**
     * Sets the value of the elevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setElevation(MEASUREMENT value) {
        this.elevation = value;
    }

    /**
     * Gets the value of the floodFormCd property.
     * 
     * @return
     *     possible object is
     *     {@link FormType }
     *     
     */
    public FormType getFloodFormCd() {
        return floodFormCd;
    }

    /**
     * Sets the value of the floodFormCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormType }
     *     
     */
    public void setFloodFormCd(FormType value) {
        this.floodFormCd = value;
    }

    /**
     * Gets the value of the floodZoneCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getFloodZoneCd() {
        return floodZoneCd;
    }

    /**
     * Sets the value of the floodZoneCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setFloodZoneCd(OpenEnum value) {
        this.floodZoneCd = value;
    }

    /**
     * Gets the value of the windFormCd property.
     * 
     * @return
     *     possible object is
     *     {@link FormType }
     *     
     */
    public FormType getWindFormCd() {
        return windFormCd;
    }

    /**
     * Sets the value of the windFormCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormType }
     *     
     */
    public void setWindFormCd(FormType value) {
        this.windFormCd = value;
    }

    /**
     * Gets the value of the windZoneCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getWindZoneCd() {
        return windZoneCd;
    }

    /**
     * Sets the value of the windZoneCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setWindZoneCd(OpenEnum value) {
        this.windZoneCd = value;
    }

    /**
     * Gets the value of the communityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCommunityNumber() {
        return communityNumber;
    }

    /**
     * Sets the value of the communityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCommunityNumber(Long value) {
        this.communityNumber = value;
    }

    /**
     * Gets the value of the panelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link C11 }
     *     
     */
    public C11 getPanelNumber() {
        return panelNumber;
    }

    /**
     * Sets the value of the panelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link C11 }
     *     
     */
    public void setPanelNumber(C11 value) {
        this.panelNumber = value;
    }

    /**
     * Gets the value of the floodSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link C2 }
     *     
     */
    public C2 getFloodSuffix() {
        return floodSuffix;
    }

    /**
     * Sets the value of the floodSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link C2 }
     *     
     */
    public void setFloodSuffix(C2 value) {
        this.floodSuffix = value;
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
