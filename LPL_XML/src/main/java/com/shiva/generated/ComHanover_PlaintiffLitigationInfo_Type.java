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
 * <p>Java class for com.hanover_PlaintiffLitigationInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.hanover_PlaintiffLitigationInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}CategoryCd"/>
 *         &lt;element ref="{}com.hanover_OtherDescription" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_CasesPerCategoryPct" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_CaseAverageValAmt" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_CaseHighestValAmt" minOccurs="0"/>
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
@XmlType(name = "com.hanover_PlaintiffLitigationInfo_Type", propOrder = {
    "categoryCd",
    "comHanover_OtherDescription",
    "comHanover_CasesPerCategoryPct",
    "comHanover_CaseAverageValAmt",
    "comHanover_CaseHighestValAmt"
})
public class ComHanover_PlaintiffLitigationInfo_Type {

    @XmlElement(name = "CategoryCd", required = true)
    protected CoverageCategory categoryCd;
    @XmlElement(name = "com.hanover_OtherDescription")
    protected CInfinite comHanover_OtherDescription;
    @XmlElement(name = "com.hanover_CasesPerCategoryPct")
    protected PercentDecimal comHanover_CasesPerCategoryPct;
    @XmlElement(name = "com.hanover_CaseAverageValAmt")
    protected CURRENCY comHanover_CaseAverageValAmt;
    @XmlElement(name = "com.hanover_CaseHighestValAmt")
    protected CURRENCY comHanover_CaseHighestValAmt;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the categoryCd property.
     * 
     * @return
     *     possible object is
     *     {@link CoverageCategory }
     *     
     */
    public CoverageCategory getCategoryCd() {
        return categoryCd;
    }

    /**
     * Sets the value of the categoryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageCategory }
     *     
     */
    public void setCategoryCd(CoverageCategory value) {
        this.categoryCd = value;
    }

    /**
     * Gets the value of the comHanover_OtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CInfinite }
     *     
     */
    public CInfinite getComHanover_OtherDescription() {
        return comHanover_OtherDescription;
    }

    /**
     * Sets the value of the comHanover_OtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInfinite }
     *     
     */
    public void setComHanover_OtherDescription(CInfinite value) {
        this.comHanover_OtherDescription = value;
    }

    /**
     * Gets the value of the comHanover_CasesPerCategoryPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentDecimal }
     *     
     */
    public PercentDecimal getComHanover_CasesPerCategoryPct() {
        return comHanover_CasesPerCategoryPct;
    }

    /**
     * Sets the value of the comHanover_CasesPerCategoryPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentDecimal }
     *     
     */
    public void setComHanover_CasesPerCategoryPct(PercentDecimal value) {
        this.comHanover_CasesPerCategoryPct = value;
    }

    /**
     * Gets the value of the comHanover_CaseAverageValAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getComHanover_CaseAverageValAmt() {
        return comHanover_CaseAverageValAmt;
    }

    /**
     * Sets the value of the comHanover_CaseAverageValAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setComHanover_CaseAverageValAmt(CURRENCY value) {
        this.comHanover_CaseAverageValAmt = value;
    }

    /**
     * Gets the value of the comHanover_CaseHighestValAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getComHanover_CaseHighestValAmt() {
        return comHanover_CaseHighestValAmt;
    }

    /**
     * Sets the value of the comHanover_CaseHighestValAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setComHanover_CaseHighestValAmt(CURRENCY value) {
        this.comHanover_CaseHighestValAmt = value;
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
