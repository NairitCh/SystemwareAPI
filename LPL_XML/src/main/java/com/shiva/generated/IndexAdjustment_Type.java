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
 * <p>Java class for IndexAdjustment_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndexAdjustment_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}IndexAdjustmentAmt" minOccurs="0"/>
 *         &lt;element ref="{}Rate" minOccurs="0"/>
 *         &lt;element ref="{}EffectiveDt" minOccurs="0"/>
 *         &lt;element ref="{}IndexAdjustmentFrequencyCd" minOccurs="0"/>
 *         &lt;element ref="{}IndexAdjustmentDesc" minOccurs="0"/>
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
@XmlType(name = "IndexAdjustment_Type", propOrder = {
    "indexAdjustmentAmt",
    "rate",
    "effectiveDt",
    "indexAdjustmentFrequencyCd",
    "indexAdjustmentDesc"
})
public class IndexAdjustment_Type {

    @XmlElement(name = "IndexAdjustmentAmt")
    protected CURRENCY indexAdjustmentAmt;
    @XmlElement(name = "Rate")
    protected Decimal rate;
    @XmlElement(name = "EffectiveDt")
    protected Date effectiveDt;
    @XmlElement(name = "IndexAdjustmentFrequencyCd")
    protected Frequency indexAdjustmentFrequencyCd;
    @XmlElement(name = "IndexAdjustmentDesc")
    protected CInfinite indexAdjustmentDesc;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the indexAdjustmentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getIndexAdjustmentAmt() {
        return indexAdjustmentAmt;
    }

    /**
     * Sets the value of the indexAdjustmentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setIndexAdjustmentAmt(CURRENCY value) {
        this.indexAdjustmentAmt = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setRate(Decimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the effectiveDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getEffectiveDt() {
        return effectiveDt;
    }

    /**
     * Sets the value of the effectiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setEffectiveDt(Date value) {
        this.effectiveDt = value;
    }

    /**
     * Gets the value of the indexAdjustmentFrequencyCd property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency }
     *     
     */
    public Frequency getIndexAdjustmentFrequencyCd() {
        return indexAdjustmentFrequencyCd;
    }

    /**
     * Sets the value of the indexAdjustmentFrequencyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency }
     *     
     */
    public void setIndexAdjustmentFrequencyCd(Frequency value) {
        this.indexAdjustmentFrequencyCd = value;
    }

    /**
     * Gets the value of the indexAdjustmentDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CInfinite }
     *     
     */
    public CInfinite getIndexAdjustmentDesc() {
        return indexAdjustmentDesc;
    }

    /**
     * Sets the value of the indexAdjustmentDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInfinite }
     *     
     */
    public void setIndexAdjustmentDesc(CInfinite value) {
        this.indexAdjustmentDesc = value;
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