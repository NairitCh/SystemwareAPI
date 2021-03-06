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
 * <p>Java class for AdditionalInterest_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalInterest_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ItemIdInfo" minOccurs="0"/>
 *         &lt;element ref="{}GeneralPartyInfo" minOccurs="0"/>
 *         &lt;element ref="{}AdditionalInterestInfo" minOccurs="0"/>
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
@XmlType(name = "AdditionalInterest_Type", propOrder = {
    "itemIdInfo",
    "generalPartyInfo",
    "additionalInterestInfo"
})
public class AdditionalInterest_Type {

    @XmlElement(name = "ItemIdInfo")
    protected ItemIdInfo_Type itemIdInfo;
    @XmlElement(name = "GeneralPartyInfo")
    protected GeneralPartyInfo_Type generalPartyInfo;
    @XmlElement(name = "AdditionalInterestInfo")
    protected AdditionalInterestInfo_Type additionalInterestInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the itemIdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdInfo_Type }
     *     
     */
    public ItemIdInfo_Type getItemIdInfo() {
        return itemIdInfo;
    }

    /**
     * Sets the value of the itemIdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdInfo_Type }
     *     
     */
    public void setItemIdInfo(ItemIdInfo_Type value) {
        this.itemIdInfo = value;
    }

    /**
     * Gets the value of the generalPartyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralPartyInfo_Type }
     *     
     */
    public GeneralPartyInfo_Type getGeneralPartyInfo() {
        return generalPartyInfo;
    }

    /**
     * Sets the value of the generalPartyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralPartyInfo_Type }
     *     
     */
    public void setGeneralPartyInfo(GeneralPartyInfo_Type value) {
        this.generalPartyInfo = value;
    }

    /**
     * Gets the value of the additionalInterestInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInterestInfo_Type }
     *     
     */
    public AdditionalInterestInfo_Type getAdditionalInterestInfo() {
        return additionalInterestInfo;
    }

    /**
     * Sets the value of the additionalInterestInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInterestInfo_Type }
     *     
     */
    public void setAdditionalInterestInfo(AdditionalInterestInfo_Type value) {
        this.additionalInterestInfo = value;
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
