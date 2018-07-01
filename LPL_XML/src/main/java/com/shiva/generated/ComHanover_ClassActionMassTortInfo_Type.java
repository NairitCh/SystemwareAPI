//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.01 at 09:59:34 AM IST 
//


package com.shiva.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for com.hanover_ClassActionMassTortInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.hanover_ClassActionMassTortInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}CaseTitle"/>
 *         &lt;element ref="{}com.hanover_FirmRoleCd" minOccurs="0"/>
 *         &lt;element ref="{}FirmDesc" minOccurs="0"/>
 *         &lt;element ref="{}StatusCd" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_ValueOfDamagesAmt" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_NumClassMembers" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_CaseDesc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.hanover_ClassActionMassTortInfo_Type", propOrder = {
    "caseTitle",
    "comHanover_FirmRoleCd",
    "firmDesc",
    "statusCd",
    "comHanover_ValueOfDamagesAmt",
    "comHanover_NumClassMembers",
    "comHanover_CaseDesc"
})
@XmlSeeAlso({
    ComHanover_ClassActionMassTortInfo.class
})
public class ComHanover_ClassActionMassTortInfo_Type {

    @XmlElement(name = "CaseTitle", required = true)
    protected C100 caseTitle;
    @XmlElement(name = "com.hanover_FirmRoleCd")
    protected OpenEnum comHanover_FirmRoleCd;
    @XmlElement(name = "FirmDesc")
    protected C255 firmDesc;
    @XmlElement(name = "StatusCd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String statusCd;
    @XmlElement(name = "com.hanover_ValueOfDamagesAmt")
    protected CURRENCY comHanover_ValueOfDamagesAmt;
    @XmlElement(name = "com.hanover_NumClassMembers")
    protected Long comHanover_NumClassMembers;
    @XmlElement(name = "com.hanover_CaseDesc")
    protected CInfinite comHanover_CaseDesc;

    /**
     * Gets the value of the caseTitle property.
     * 
     * @return
     *     possible object is
     *     {@link C100 }
     *     
     */
    public C100 getCaseTitle() {
        return caseTitle;
    }

    /**
     * Sets the value of the caseTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link C100 }
     *     
     */
    public void setCaseTitle(C100 value) {
        this.caseTitle = value;
    }

    /**
     * Gets the value of the comHanover_FirmRoleCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getComHanover_FirmRoleCd() {
        return comHanover_FirmRoleCd;
    }

    /**
     * Sets the value of the comHanover_FirmRoleCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setComHanover_FirmRoleCd(OpenEnum value) {
        this.comHanover_FirmRoleCd = value;
    }

    /**
     * Gets the value of the firmDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getFirmDesc() {
        return firmDesc;
    }

    /**
     * Sets the value of the firmDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setFirmDesc(C255 value) {
        this.firmDesc = value;
    }

    /**
     * Gets the value of the statusCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCd() {
        return statusCd;
    }

    /**
     * Sets the value of the statusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCd(String value) {
        this.statusCd = value;
    }

    /**
     * Gets the value of the comHanover_ValueOfDamagesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getComHanover_ValueOfDamagesAmt() {
        return comHanover_ValueOfDamagesAmt;
    }

    /**
     * Sets the value of the comHanover_ValueOfDamagesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setComHanover_ValueOfDamagesAmt(CURRENCY value) {
        this.comHanover_ValueOfDamagesAmt = value;
    }

    /**
     * Gets the value of the comHanover_NumClassMembers property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getComHanover_NumClassMembers() {
        return comHanover_NumClassMembers;
    }

    /**
     * Sets the value of the comHanover_NumClassMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setComHanover_NumClassMembers(Long value) {
        this.comHanover_NumClassMembers = value;
    }

    /**
     * Gets the value of the comHanover_CaseDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CInfinite }
     *     
     */
    public CInfinite getComHanover_CaseDesc() {
        return comHanover_CaseDesc;
    }

    /**
     * Sets the value of the comHanover_CaseDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInfinite }
     *     
     */
    public void setComHanover_CaseDesc(CInfinite value) {
        this.comHanover_CaseDesc = value;
    }

}
