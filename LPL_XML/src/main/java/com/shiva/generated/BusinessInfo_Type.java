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
 * <p>Java class for BusinessInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}SICCd" minOccurs="0"/>
 *         &lt;element ref="{}NAICSCd" minOccurs="0"/>
 *         &lt;element ref="{}GeneralLiabilityCd" minOccurs="0"/>
 *         &lt;element ref="{}TaxExemptStatusInd" minOccurs="0"/>
 *         &lt;element ref="{}NatureBusinessCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}NumEmployees" minOccurs="0"/>
 *         &lt;element ref="{}NumEmployeesFullTime" minOccurs="0"/>
 *         &lt;element ref="{}NumEmployeesPartTime" minOccurs="0"/>
 *         &lt;element ref="{}NumDomesticLocations" minOccurs="0"/>
 *         &lt;element ref="{}NumForeignLocations" minOccurs="0"/>
 *         &lt;element ref="{}NCCIIDNumber" minOccurs="0"/>
 *         &lt;element ref="{}NumMembersManagers" minOccurs="0"/>
 *         &lt;element ref="{}ActiveInd" minOccurs="0"/>
 *         &lt;element ref="{}BusinessStartDt" minOccurs="0"/>
 *         &lt;element ref="{}NumYrsInBusiness" minOccurs="0"/>
 *         &lt;element ref="{}FiscalYearStartDt" minOccurs="0"/>
 *         &lt;element ref="{}OperationsDesc" minOccurs="0"/>
 *         &lt;element ref="{}OwnedPct" minOccurs="0"/>
 *         &lt;element ref="{}NumOwners" minOccurs="0"/>
 *         &lt;element ref="{}USBasedOperationsInd" minOccurs="0"/>
 *         &lt;element ref="{}CommlParentOrSubsidiaryInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}FinancialStatementInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}BusinessAcquiredCd" minOccurs="0"/>
 *         &lt;element ref="{}IncorporatedStateProvCd" minOccurs="0"/>
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
@XmlType(name = "BusinessInfo_Type", propOrder = {
    "sicCd",
    "naicsCd",
    "generalLiabilityCd",
    "taxExemptStatusInd",
    "natureBusinessCd",
    "numEmployees",
    "numEmployeesFullTime",
    "numEmployeesPartTime",
    "numDomesticLocations",
    "numForeignLocations",
    "ncciidNumber",
    "numMembersManagers",
    "activeInd",
    "businessStartDt",
    "numYrsInBusiness",
    "fiscalYearStartDt",
    "operationsDesc",
    "ownedPct",
    "numOwners",
    "usBasedOperationsInd",
    "commlParentOrSubsidiaryInfo",
    "financialStatementInfo",
    "businessAcquiredCd",
    "incorporatedStateProvCd"
})
@XmlSeeAlso({
    ComHanover_BusinessInfo_Type.class
})
public class BusinessInfo_Type {

    @XmlElement(name = "SICCd")
    protected OpenEnum sicCd;
    @XmlElement(name = "NAICSCd")
    protected OpenEnum naicsCd;
    @XmlElement(name = "GeneralLiabilityCd")
    protected OpenEnum generalLiabilityCd;
    @XmlElement(name = "TaxExemptStatusInd")
    protected Boolean taxExemptStatusInd;
    @XmlElement(name = "NatureBusinessCd")
    protected List<NatureOfBusiness> natureBusinessCd;
    @XmlElement(name = "NumEmployees")
    protected Long numEmployees;
    @XmlElement(name = "NumEmployeesFullTime")
    protected Long numEmployeesFullTime;
    @XmlElement(name = "NumEmployeesPartTime")
    protected Long numEmployeesPartTime;
    @XmlElement(name = "NumDomesticLocations")
    protected Long numDomesticLocations;
    @XmlElement(name = "NumForeignLocations")
    protected Long numForeignLocations;
    @XmlElement(name = "NCCIIDNumber")
    protected AssignedIdentifier ncciidNumber;
    @XmlElement(name = "NumMembersManagers")
    protected Long numMembersManagers;
    @XmlElement(name = "ActiveInd")
    protected Boolean activeInd;
    @XmlElement(name = "BusinessStartDt")
    protected Date businessStartDt;
    @XmlElement(name = "NumYrsInBusiness")
    protected Long numYrsInBusiness;
    @XmlElement(name = "FiscalYearStartDt")
    protected Date fiscalYearStartDt;
    @XmlElement(name = "OperationsDesc")
    protected C255 operationsDesc;
    @XmlElement(name = "OwnedPct")
    protected PercentDecimal ownedPct;
    @XmlElement(name = "NumOwners")
    protected Long numOwners;
    @XmlElement(name = "USBasedOperationsInd")
    protected Boolean usBasedOperationsInd;
    @XmlElement(name = "CommlParentOrSubsidiaryInfo")
    protected List<ComHanover_CommlParentOrSubsidiaryInfo_Type> commlParentOrSubsidiaryInfo;
    @XmlElement(name = "FinancialStatementInfo")
    protected List<ComHanover_FinancialStatementInfo_Type> financialStatementInfo;
    @XmlElement(name = "BusinessAcquiredCd")
    protected BusinessAcquired businessAcquiredCd;
    @XmlElement(name = "IncorporatedStateProvCd")
    protected OpenEnum incorporatedStateProvCd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

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
     * Gets the value of the generalLiabilityCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getGeneralLiabilityCd() {
        return generalLiabilityCd;
    }

    /**
     * Sets the value of the generalLiabilityCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setGeneralLiabilityCd(OpenEnum value) {
        this.generalLiabilityCd = value;
    }

    /**
     * Gets the value of the taxExemptStatusInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTaxExemptStatusInd() {
        return taxExemptStatusInd;
    }

    /**
     * Sets the value of the taxExemptStatusInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxExemptStatusInd(Boolean value) {
        this.taxExemptStatusInd = value;
    }

    /**
     * Gets the value of the natureBusinessCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the natureBusinessCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNatureBusinessCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NatureOfBusiness }
     * 
     * 
     */
    public List<NatureOfBusiness> getNatureBusinessCd() {
        if (natureBusinessCd == null) {
            natureBusinessCd = new ArrayList<NatureOfBusiness>();
        }
        return this.natureBusinessCd;
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
     * Gets the value of the numEmployeesFullTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumEmployeesFullTime() {
        return numEmployeesFullTime;
    }

    /**
     * Sets the value of the numEmployeesFullTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumEmployeesFullTime(Long value) {
        this.numEmployeesFullTime = value;
    }

    /**
     * Gets the value of the numEmployeesPartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumEmployeesPartTime() {
        return numEmployeesPartTime;
    }

    /**
     * Sets the value of the numEmployeesPartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumEmployeesPartTime(Long value) {
        this.numEmployeesPartTime = value;
    }

    /**
     * Gets the value of the numDomesticLocations property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumDomesticLocations() {
        return numDomesticLocations;
    }

    /**
     * Sets the value of the numDomesticLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumDomesticLocations(Long value) {
        this.numDomesticLocations = value;
    }

    /**
     * Gets the value of the numForeignLocations property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumForeignLocations() {
        return numForeignLocations;
    }

    /**
     * Sets the value of the numForeignLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumForeignLocations(Long value) {
        this.numForeignLocations = value;
    }

    /**
     * Gets the value of the ncciidNumber property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedIdentifier }
     *     
     */
    public AssignedIdentifier getNCCIIDNumber() {
        return ncciidNumber;
    }

    /**
     * Sets the value of the ncciidNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedIdentifier }
     *     
     */
    public void setNCCIIDNumber(AssignedIdentifier value) {
        this.ncciidNumber = value;
    }

    /**
     * Gets the value of the numMembersManagers property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumMembersManagers() {
        return numMembersManagers;
    }

    /**
     * Sets the value of the numMembersManagers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumMembersManagers(Long value) {
        this.numMembersManagers = value;
    }

    /**
     * Gets the value of the activeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getActiveInd() {
        return activeInd;
    }

    /**
     * Sets the value of the activeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveInd(Boolean value) {
        this.activeInd = value;
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
     * Gets the value of the fiscalYearStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getFiscalYearStartDt() {
        return fiscalYearStartDt;
    }

    /**
     * Sets the value of the fiscalYearStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setFiscalYearStartDt(Date value) {
        this.fiscalYearStartDt = value;
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
     * Gets the value of the numOwners property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumOwners() {
        return numOwners;
    }

    /**
     * Sets the value of the numOwners property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumOwners(Long value) {
        this.numOwners = value;
    }

    /**
     * Gets the value of the usBasedOperationsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUSBasedOperationsInd() {
        return usBasedOperationsInd;
    }

    /**
     * Sets the value of the usBasedOperationsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUSBasedOperationsInd(Boolean value) {
        this.usBasedOperationsInd = value;
    }

    /**
     * Gets the value of the commlParentOrSubsidiaryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commlParentOrSubsidiaryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommlParentOrSubsidiaryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComHanover_CommlParentOrSubsidiaryInfo_Type }
     * 
     * 
     */
    public List<ComHanover_CommlParentOrSubsidiaryInfo_Type> getCommlParentOrSubsidiaryInfo() {
        if (commlParentOrSubsidiaryInfo == null) {
            commlParentOrSubsidiaryInfo = new ArrayList<ComHanover_CommlParentOrSubsidiaryInfo_Type>();
        }
        return this.commlParentOrSubsidiaryInfo;
    }

    /**
     * Gets the value of the financialStatementInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialStatementInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialStatementInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComHanover_FinancialStatementInfo_Type }
     * 
     * 
     */
    public List<ComHanover_FinancialStatementInfo_Type> getFinancialStatementInfo() {
        if (financialStatementInfo == null) {
            financialStatementInfo = new ArrayList<ComHanover_FinancialStatementInfo_Type>();
        }
        return this.financialStatementInfo;
    }

    /**
     * Gets the value of the businessAcquiredCd property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessAcquired }
     *     
     */
    public BusinessAcquired getBusinessAcquiredCd() {
        return businessAcquiredCd;
    }

    /**
     * Sets the value of the businessAcquiredCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessAcquired }
     *     
     */
    public void setBusinessAcquiredCd(BusinessAcquired value) {
        this.businessAcquiredCd = value;
    }

    /**
     * Gets the value of the incorporatedStateProvCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getIncorporatedStateProvCd() {
        return incorporatedStateProvCd;
    }

    /**
     * Sets the value of the incorporatedStateProvCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setIncorporatedStateProvCd(OpenEnum value) {
        this.incorporatedStateProvCd = value;
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
