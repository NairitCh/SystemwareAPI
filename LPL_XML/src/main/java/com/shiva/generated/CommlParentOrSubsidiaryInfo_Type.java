//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.01 at 09:59:34 AM IST 
//


package com.shiva.generated;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CommlParentOrSubsidiaryInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommlParentOrSubsidiaryInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}MiscParty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}NAICSCd" minOccurs="0"/>
 *         &lt;element ref="{}NatureBusinessCd" minOccurs="0"/>
 *         &lt;element ref="{}SICCd" minOccurs="0"/>
 *         &lt;element ref="{}NumYrsInBusiness" minOccurs="0"/>
 *         &lt;element ref="{}RevenuePct" minOccurs="0"/>
 *         &lt;element ref="{}JurisdictionIncorporation" minOccurs="0"/>
 *         &lt;element ref="{}SubsidiarysAdditionalOwnership" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}OwnedPct" minOccurs="0"/>
 *         &lt;element ref="{}SubsidiaryAcquiredOrCreatedDt" minOccurs="0"/>
 *         &lt;element ref="{}BusinessStartDt" minOccurs="0"/>
 *         &lt;element ref="{}BusinessEndDt" minOccurs="0"/>
 *         &lt;element ref="{}OtherOrPriorPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}NumEmployees" minOccurs="0"/>
 *         &lt;element ref="{}OperationsDesc" minOccurs="0"/>
 *         &lt;element ref="{}TotalPayrollAmt" minOccurs="0"/>
 *         &lt;element ref="{}AnnualGrossReceiptsAmt" minOccurs="0"/>
 *         &lt;element ref="{}ForeignGrossSalesAmt" minOccurs="0"/>
 *         &lt;element ref="{}RelationshipDesc" minOccurs="0"/>
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
@XmlType(name = "CommlParentOrSubsidiaryInfo_Type", propOrder = {
    "miscParty",
    "naicsCd",
    "natureBusinessCd",
    "sicCd",
    "numYrsInBusiness",
    "revenuePct",
    "jurisdictionIncorporation",
    "subsidiarysAdditionalOwnership",
    "ownedPct",
    "subsidiaryAcquiredOrCreatedDt",
    "businessStartDt",
    "businessEndDt",
    "otherOrPriorPolicy",
    "numEmployees",
    "operationsDesc",
    "totalPayrollAmt",
    "annualGrossReceiptsAmt",
    "foreignGrossSalesAmt",
    "relationshipDesc"
})
@XmlSeeAlso({
    ComHanover_CommlParentOrSubsidiaryInfo_Type.class
})
public class CommlParentOrSubsidiaryInfo_Type {

    @XmlElement(name = "MiscParty")
    protected List<MiscParty_Type> miscParty;
    @XmlElement(name = "NAICSCd")
    protected OpenEnum naicsCd;
    @XmlElement(name = "NatureBusinessCd")
    protected NatureOfBusiness natureBusinessCd;
    @XmlElement(name = "SICCd")
    protected OpenEnum sicCd;
    @XmlElement(name = "NumYrsInBusiness")
    protected Long numYrsInBusiness;
    @XmlElement(name = "RevenuePct")
    protected PercentLong revenuePct;
    @XmlElement(name = "JurisdictionIncorporation")
    protected C60 jurisdictionIncorporation;
    @XmlElement(name = "SubsidiarysAdditionalOwnership")
    protected List<C60> subsidiarysAdditionalOwnership;
    @XmlElement(name = "OwnedPct")
    protected PercentDecimal ownedPct;
    @XmlElement(name = "SubsidiaryAcquiredOrCreatedDt")
    protected Date subsidiaryAcquiredOrCreatedDt;
    @XmlElement(name = "BusinessStartDt")
    protected Date businessStartDt;
    @XmlElement(name = "BusinessEndDt")
    protected Date businessEndDt;
    @XmlElement(name = "OtherOrPriorPolicy")
    protected List<ComHanover_OtherOrPriorPolicy_Type> otherOrPriorPolicy;
    @XmlElement(name = "NumEmployees")
    protected Long numEmployees;
    @XmlElement(name = "OperationsDesc")
    protected C255 operationsDesc;
    @XmlElement(name = "TotalPayrollAmt")
    protected CURRENCY totalPayrollAmt;
    @XmlElement(name = "AnnualGrossReceiptsAmt")
    protected CURRENCY annualGrossReceiptsAmt;
    @XmlElement(name = "ForeignGrossSalesAmt")
    protected CURRENCY foreignGrossSalesAmt;
    @XmlElement(name = "RelationshipDesc")
    protected C255 relationshipDesc;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the miscParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the miscParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiscParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiscParty_Type }
     * 
     * 
     */
    public List<MiscParty_Type> getMiscParty() {
        if (miscParty == null) {
            miscParty = new ArrayList<MiscParty_Type>();
        }
        return this.miscParty;
    }

    /**
     * Gets the value of the naicsCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getNAICSCd() {
        return naicsCd;
    }

    /**
     * Sets the value of the naicsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setNAICSCd(OpenEnum value) {
        this.naicsCd = value;
    }

    /**
     * Gets the value of the natureBusinessCd property.
     * 
     * @return
     *     possible object is
     *     {@link NatureOfBusiness }
     *     
     */
    public NatureOfBusiness getNatureBusinessCd() {
        return natureBusinessCd;
    }

    /**
     * Sets the value of the natureBusinessCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NatureOfBusiness }
     *     
     */
    public void setNatureBusinessCd(NatureOfBusiness value) {
        this.natureBusinessCd = value;
    }

    /**
     * Gets the value of the sicCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getSICCd() {
        return sicCd;
    }

    /**
     * Sets the value of the sicCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setSICCd(OpenEnum value) {
        this.sicCd = value;
    }

    /**
     * Gets the value of the numYrsInBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumYrsInBusiness() {
        return numYrsInBusiness;
    }

    /**
     * Sets the value of the numYrsInBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumYrsInBusiness(Long value) {
        this.numYrsInBusiness = value;
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
     * Gets the value of the jurisdictionIncorporation property.
     * 
     * @return
     *     possible object is
     *     {@link C60 }
     *     
     */
    public C60 getJurisdictionIncorporation() {
        return jurisdictionIncorporation;
    }

    /**
     * Sets the value of the jurisdictionIncorporation property.
     * 
     * @param value
     *     allowed object is
     *     {@link C60 }
     *     
     */
    public void setJurisdictionIncorporation(C60 value) {
        this.jurisdictionIncorporation = value;
    }

    /**
     * Gets the value of the subsidiarysAdditionalOwnership property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsidiarysAdditionalOwnership property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsidiarysAdditionalOwnership().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link C60 }
     * 
     * 
     */
    public List<C60> getSubsidiarysAdditionalOwnership() {
        if (subsidiarysAdditionalOwnership == null) {
            subsidiarysAdditionalOwnership = new ArrayList<C60>();
        }
        return this.subsidiarysAdditionalOwnership;
    }

    /**
     * Gets the value of the ownedPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentDecimal }
     *     
     */
    public PercentDecimal getOwnedPct() {
        return ownedPct;
    }

    /**
     * Sets the value of the ownedPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentDecimal }
     *     
     */
    public void setOwnedPct(PercentDecimal value) {
        this.ownedPct = value;
    }

    /**
     * Gets the value of the subsidiaryAcquiredOrCreatedDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getSubsidiaryAcquiredOrCreatedDt() {
        return subsidiaryAcquiredOrCreatedDt;
    }

    /**
     * Sets the value of the subsidiaryAcquiredOrCreatedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setSubsidiaryAcquiredOrCreatedDt(Date value) {
        this.subsidiaryAcquiredOrCreatedDt = value;
    }

    /**
     * Gets the value of the businessStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getBusinessStartDt() {
        return businessStartDt;
    }

    /**
     * Sets the value of the businessStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setBusinessStartDt(Date value) {
        this.businessStartDt = value;
    }

    /**
     * Gets the value of the businessEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getBusinessEndDt() {
        return businessEndDt;
    }

    /**
     * Sets the value of the businessEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setBusinessEndDt(Date value) {
        this.businessEndDt = value;
    }

    /**
     * Gets the value of the otherOrPriorPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherOrPriorPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherOrPriorPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComHanover_OtherOrPriorPolicy_Type }
     * 
     * 
     */
    public List<ComHanover_OtherOrPriorPolicy_Type> getOtherOrPriorPolicy() {
        if (otherOrPriorPolicy == null) {
            otherOrPriorPolicy = new ArrayList<ComHanover_OtherOrPriorPolicy_Type>();
        }
        return this.otherOrPriorPolicy;
    }

    /**
     * Gets the value of the numEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumEmployees() {
        return numEmployees;
    }

    /**
     * Sets the value of the numEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumEmployees(Long value) {
        this.numEmployees = value;
    }

    /**
     * Gets the value of the operationsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getOperationsDesc() {
        return operationsDesc;
    }

    /**
     * Sets the value of the operationsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setOperationsDesc(C255 value) {
        this.operationsDesc = value;
    }

    /**
     * Gets the value of the totalPayrollAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getTotalPayrollAmt() {
        return totalPayrollAmt;
    }

    /**
     * Sets the value of the totalPayrollAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setTotalPayrollAmt(CURRENCY value) {
        this.totalPayrollAmt = value;
    }

    /**
     * Gets the value of the annualGrossReceiptsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getAnnualGrossReceiptsAmt() {
        return annualGrossReceiptsAmt;
    }

    /**
     * Sets the value of the annualGrossReceiptsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setAnnualGrossReceiptsAmt(CURRENCY value) {
        this.annualGrossReceiptsAmt = value;
    }

    /**
     * Gets the value of the foreignGrossSalesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getForeignGrossSalesAmt() {
        return foreignGrossSalesAmt;
    }

    /**
     * Sets the value of the foreignGrossSalesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setForeignGrossSalesAmt(CURRENCY value) {
        this.foreignGrossSalesAmt = value;
    }

    /**
     * Gets the value of the relationshipDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getRelationshipDesc() {
        return relationshipDesc;
    }

    /**
     * Sets the value of the relationshipDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setRelationshipDesc(C255 value) {
        this.relationshipDesc = value;
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
