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
 * <p>Java class for ReceiptsInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiptsInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}DurationPeriod" minOccurs="0"/>
 *         &lt;element ref="{}ReceiptsTypeCd" minOccurs="0"/>
 *         &lt;element ref="{}AnnualReceipts" minOccurs="0"/>
 *         &lt;element ref="{}ReceiptsTypeDesc" minOccurs="0"/>
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
@XmlType(name = "ReceiptsInfo_Type", propOrder = {
    "durationPeriod",
    "receiptsTypeCd",
    "annualReceipts",
    "receiptsTypeDesc"
})
public class ReceiptsInfo_Type {

    @XmlElement(name = "DurationPeriod")
    protected MEASUREMENT durationPeriod;
    @XmlElement(name = "ReceiptsTypeCd")
    protected ReceiptsType receiptsTypeCd;
    @XmlElement(name = "AnnualReceipts")
    protected CURRENCY annualReceipts;
    @XmlElement(name = "ReceiptsTypeDesc")
    protected C50 receiptsTypeDesc;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the durationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getDurationPeriod() {
        return durationPeriod;
    }

    /**
     * Sets the value of the durationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setDurationPeriod(MEASUREMENT value) {
        this.durationPeriod = value;
    }

    /**
     * Gets the value of the receiptsTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptsType }
     *     
     */
    public ReceiptsType getReceiptsTypeCd() {
        return receiptsTypeCd;
    }

    /**
     * Sets the value of the receiptsTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptsType }
     *     
     */
    public void setReceiptsTypeCd(ReceiptsType value) {
        this.receiptsTypeCd = value;
    }

    /**
     * Gets the value of the annualReceipts property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getAnnualReceipts() {
        return annualReceipts;
    }

    /**
     * Sets the value of the annualReceipts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setAnnualReceipts(CURRENCY value) {
        this.annualReceipts = value;
    }

    /**
     * Gets the value of the receiptsTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C50 }
     *     
     */
    public C50 getReceiptsTypeDesc() {
        return receiptsTypeDesc;
    }

    /**
     * Sets the value of the receiptsTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C50 }
     *     
     */
    public void setReceiptsTypeDesc(C50 value) {
        this.receiptsTypeDesc = value;
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
