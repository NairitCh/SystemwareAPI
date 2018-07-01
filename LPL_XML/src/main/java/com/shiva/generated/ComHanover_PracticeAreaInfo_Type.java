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
 * <p>Java class for com.hanover_PracticeAreaInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.hanover_PracticeAreaInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}com.hanover_PracticeAreaCd"/>
 *         &lt;element ref="{}Description" minOccurs="0"/>
 *         &lt;element ref="{}RevenuePct" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_LargestRecentJobRevenueAmt" minOccurs="0"/>
 *         &lt;element ref="{}ClassCd" minOccurs="0"/>
 *         &lt;element ref="{}RemarkText" minOccurs="0"/>
 *         &lt;element ref="{}RatingFactor" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_RevenuePct" minOccurs="0"/>
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
@XmlType(name = "com.hanover_PracticeAreaInfo_Type", propOrder = {
    "comHanover_PracticeAreaCd",
    "description",
    "revenuePct",
    "comHanover_LargestRecentJobRevenueAmt",
    "classCd",
    "remarkText",
    "ratingFactor",
    "comHanover_RevenuePct"
})
public class ComHanover_PracticeAreaInfo_Type {

    @XmlElement(name = "com.hanover_PracticeAreaCd", required = true)
    protected OpenEnum comHanover_PracticeAreaCd;
    @XmlElement(name = "Description")
    protected C255 description;
    @XmlElement(name = "RevenuePct")
    protected PercentLong revenuePct;
    @XmlElement(name = "com.hanover_LargestRecentJobRevenueAmt")
    protected CURRENCY comHanover_LargestRecentJobRevenueAmt;
    @XmlElement(name = "ClassCd")
    protected OpenEnum classCd;
    @XmlElement(name = "RemarkText")
    protected RemarkText remarkText;
    @XmlElement(name = "RatingFactor")
    protected Decimal ratingFactor;
    @XmlElement(name = "com.hanover_RevenuePct")
    protected PercentDecimal comHanover_RevenuePct;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the comHanover_PracticeAreaCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getComHanover_PracticeAreaCd() {
        return comHanover_PracticeAreaCd;
    }

    /**
     * Sets the value of the comHanover_PracticeAreaCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setComHanover_PracticeAreaCd(OpenEnum value) {
        this.comHanover_PracticeAreaCd = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setDescription(C255 value) {
        this.description = value;
    }

    /**
     * Gets the value of the revenuePct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getRevenuePct() {
        return revenuePct;
    }

    /**
     * Sets the value of the revenuePct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setRevenuePct(PercentLong value) {
        this.revenuePct = value;
    }

    /**
     * Gets the value of the comHanover_LargestRecentJobRevenueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getComHanover_LargestRecentJobRevenueAmt() {
        return comHanover_LargestRecentJobRevenueAmt;
    }

    /**
     * Sets the value of the comHanover_LargestRecentJobRevenueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setComHanover_LargestRecentJobRevenueAmt(CURRENCY value) {
        this.comHanover_LargestRecentJobRevenueAmt = value;
    }

    /**
     * Gets the value of the classCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getClassCd() {
        return classCd;
    }

    /**
     * Sets the value of the classCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setClassCd(OpenEnum value) {
        this.classCd = value;
    }

    /**
     * Gets the value of the remarkText property.
     * 
     * @return
     *     possible object is
     *     {@link RemarkText }
     *     
     */
    public RemarkText getRemarkText() {
        return remarkText;
    }

    /**
     * Sets the value of the remarkText property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarkText }
     *     
     */
    public void setRemarkText(RemarkText value) {
        this.remarkText = value;
    }

    /**
     * Gets the value of the ratingFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getRatingFactor() {
        return ratingFactor;
    }

    /**
     * Sets the value of the ratingFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setRatingFactor(Decimal value) {
        this.ratingFactor = value;
    }

    /**
     * Gets the value of the comHanover_RevenuePct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentDecimal }
     *     
     */
    public PercentDecimal getComHanover_RevenuePct() {
        return comHanover_RevenuePct;
    }

    /**
     * Sets the value of the comHanover_RevenuePct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentDecimal }
     *     
     */
    public void setComHanover_RevenuePct(PercentDecimal value) {
        this.comHanover_RevenuePct = value;
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
