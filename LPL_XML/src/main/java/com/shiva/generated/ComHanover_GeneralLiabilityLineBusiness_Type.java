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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for com.hanover_GeneralLiabilityLineBusiness_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.hanover_GeneralLiabilityLineBusiness_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{}GeneralLiabilityLineBusiness_Type">
 *       &lt;sequence>
 *         &lt;element ref="{}com.hanover_QuoteOption" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}EmployeeBenefitPlanInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_PCILevelCd" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_NumCustomerRecords" minOccurs="0"/>
 *         &lt;element ref="{}PlanAssetValueAmt" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_ProfLiabGeneralInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_FranchiseInfo" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_HomeInspectionInfo" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_RealEstateAgentInfo" minOccurs="0"/>
 *         &lt;element ref="{}RiskAppetiteCd" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_MajorPerilCd" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_RosterOfLawyers" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_ClassActionMassTortInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_PlaintiffLitigationInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_ProfLiabSupplementalInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_SecuritiesSchedule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="com.hanover_FinancialInstitutionInfo" type="{}com.hanover_FinancialInstitutionInfo_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_PlanAssetsPriorYearAmt" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_PlanAssetsCurrentYearAmt" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_PlanAssetsPctChng" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.hanover_GeneralLiabilityLineBusiness_Type", propOrder = {
    "comHanover_QuoteOption",
    "employeeBenefitPlanInfo",
    "comHanover_PCILevelCd",
    "comHanover_NumCustomerRecords",
    "planAssetValueAmt",
    "comHanover_ProfLiabGeneralInfo",
    "comHanover_FranchiseInfo",
    "comHanover_HomeInspectionInfo",
    "comHanover_RealEstateAgentInfo",
    "riskAppetiteCd",
    "comHanover_MajorPerilCd",
    "comHanover_RosterOfLawyers",
    "comHanover_ClassActionMassTortInfo",
    "comHanover_PlaintiffLitigationInfo",
    "comHanover_ProfLiabSupplementalInfo",
    "comHanover_SecuritiesSchedule",
    "comHanover_FinancialInstitutionInfo",
    "comHanover_PlanAssetsPriorYearAmt",
    "comHanover_PlanAssetsCurrentYearAmt",
    "comHanover_PlanAssetsPctChng"
})
public class ComHanover_GeneralLiabilityLineBusiness_Type
    extends GeneralLiabilityLineBusiness_Type
{

    @XmlElement(name = "com.hanover_QuoteOption")
    protected List<ComHanover_QuoteOption_Type> comHanover_QuoteOption;
    @XmlElement(name = "EmployeeBenefitPlanInfo")
    protected List<ComHanover_EmployeeBenefitPlanInfo_Type> employeeBenefitPlanInfo;
    @XmlElement(name = "com.hanover_PCILevelCd")
    protected OpenEnum comHanover_PCILevelCd;
    @XmlElement(name = "com.hanover_NumCustomerRecords")
    protected Long comHanover_NumCustomerRecords;
    @XmlElement(name = "PlanAssetValueAmt")
    protected CURRENCY planAssetValueAmt;
    @XmlElement(name = "com.hanover_ProfLiabGeneralInfo")
    protected List<ComHanover_ProfLiabGeneralInfo_Type> comHanover_ProfLiabGeneralInfo;
    @XmlElement(name = "com.hanover_FranchiseInfo")
    protected ComHanover_FranchiseInfo_Type comHanover_FranchiseInfo;
    @XmlElement(name = "com.hanover_HomeInspectionInfo")
    protected ComHanover_HomeInspectionInfo_Type comHanover_HomeInspectionInfo;
    @XmlElement(name = "com.hanover_RealEstateAgentInfo")
    protected ComHanover_RealEstateAgentInfo_Type comHanover_RealEstateAgentInfo;
    @XmlElement(name = "RiskAppetiteCd")
    protected AppetiteType riskAppetiteCd;
    @XmlElement(name = "com.hanover_MajorPerilCd")
    protected OpenEnum comHanover_MajorPerilCd;
    @XmlElement(name = "com.hanover_RosterOfLawyers")
    protected List<ComHanover_RosterOfLawyers_Type> comHanover_RosterOfLawyers;
    @XmlElement(name = "com.hanover_ClassActionMassTortInfo")
    protected List<ComHanover_ClassActionMassTortInfo> comHanover_ClassActionMassTortInfo;
    @XmlElement(name = "com.hanover_PlaintiffLitigationInfo")
    protected List<ComHanover_PlaintiffLitigationInfo_Type> comHanover_PlaintiffLitigationInfo;
    @XmlElement(name = "com.hanover_ProfLiabSupplementalInfo")
    protected List<ComHanover_ProfLiabSupplementalInfo_Type> comHanover_ProfLiabSupplementalInfo;
    @XmlElement(name = "com.hanover_SecuritiesSchedule")
    protected List<ComHanover_SecuritiesSchedule_Type> comHanover_SecuritiesSchedule;
    @XmlElement(name = "com.hanover_FinancialInstitutionInfo")
    protected List<ComHanover_FinancialInstitutionInfo_Type> comHanover_FinancialInstitutionInfo;
    @XmlElement(name = "com.hanover_PlanAssetsPriorYearAmt")
    protected CURRENCY comHanover_PlanAssetsPriorYearAmt;
    @XmlElement(name = "com.hanover_PlanAssetsCurrentYearAmt")
    protected CURRENCY comHanover_PlanAssetsCurrentYearAmt;
    @XmlElement(name = "com.hanover_PlanAssetsPctChng")
    protected PercentDecimal comHanover_PlanAssetsPctChng;

    /**
     * Gets the value of the comHanoverQuoteOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comHanoverQuoteOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComHanover_QuoteOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComHanover_QuoteOption_Type }
     * 
     * 
     */
    public List<ComHanover_QuoteOption_Type> getComHanover_QuoteOption() {
        if (comHanover_QuoteOption == null) {
            comHanover_QuoteOption = new ArrayList<ComHanover_QuoteOption_Type>();
        }
        return this.comHanover_QuoteOption;
    }

    /**
     * Gets the value of the employeeBenefitPlanInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeBenefitPlanInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeBenefitPlanInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComHanover_EmployeeBenefitPlanInfo_Type }
     * 
     * 
     */
    public List<ComHanover_EmployeeBenefitPlanInfo_Type> getEmployeeBenefitPlanInfo() {
        if (employeeBenefitPlanInfo == null) {
            employeeBenefitPlanInfo = new ArrayList<ComHanover_EmployeeBenefitPlanInfo_Type>();
        }
        return this.employeeBenefitPlanInfo;
    }

    /**
     * Gets the value of the comHanover_PCILevelCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getComHanover_PCILevelCd() {
        return comHanover_PCILevelCd;
    }

    /**
     * Sets the value of the comHanover_PCILevelCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setComHanover_PCILevelCd(OpenEnum value) {
        this.comHanover_PCILevelCd = value;
    }

    /**
     * Gets the value of the comHanover_NumCustomerRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getComHanover_NumCustomerRecords() {
        return comHanover_NumCustomerRecords;
    }

    /**
     * Sets the value of the comHanover_NumCustomerRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setComHanover_NumCustomerRecords(Long value) {
        this.comHanover_NumCustomerRecords = value;
    }

    /**
     * Gets the value of the planAssetValueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getPlanAssetValueAmt() {
        return planAssetValueAmt;
    }

    /**
     * Sets the value of the planAssetValueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setPlanAssetValueAmt(CURRENCY value) {
        this.planAssetValueAmt = value;
    }

    /**
     * Gets the value of the comHanoverProfLiabGeneralInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comHanoverProfLiabGeneralInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComHanover_ProfLiabGeneralInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComHanover_ProfLiabGeneralInfo_Type }
     * 
     * 
     */
    public List<ComHanover_ProfLiabGeneralInfo_Type> getComHanover_ProfLiabGeneralInfo() {
        if (comHanover_ProfLiabGeneralInfo == null) {
            comHanover_ProfLiabGeneralInfo = new ArrayList<ComHanover_ProfLiabGeneralInfo_Type>();
        }
        return this.comHanover_ProfLiabGeneralInfo;
    }

    /**
     * Gets the value of the comHanover_FranchiseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ComHanover_FranchiseInfo_Type }
     *     
     */
    public ComHanover_FranchiseInfo_Type getComHanover_FranchiseInfo() {
        return comHanover_FranchiseInfo;
    }

    /**
     * Sets the value of the comHanover_FranchiseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComHanover_FranchiseInfo_Type }
     *     
     */
    public void setComHanover_FranchiseInfo(ComHanover_FranchiseInfo_Type value) {
        this.comHanover_FranchiseInfo = value;
    }

    /**
     * Gets the value of the comHanover_HomeInspectionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ComHanover_HomeInspectionInfo_Type }
     *     
     */
    public ComHanover_HomeInspectionInfo_Type getComHanover_HomeInspectionInfo() {
        return comHanover_HomeInspectionInfo;
    }

    /**
     * Sets the value of the comHanover_HomeInspectionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComHanover_HomeInspectionInfo_Type }
     *     
     */
    public void setComHanover_HomeInspectionInfo(ComHanover_HomeInspectionInfo_Type value) {
        this.comHanover_HomeInspectionInfo = value;
    }

    /**
     * Gets the value of the comHanover_RealEstateAgentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ComHanover_RealEstateAgentInfo_Type }
     *     
     */
    public ComHanover_RealEstateAgentInfo_Type getComHanover_RealEstateAgentInfo() {
        return comHanover_RealEstateAgentInfo;
    }

    /**
     * Sets the value of the comHanover_RealEstateAgentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComHanover_RealEstateAgentInfo_Type }
     *     
     */
    public void setComHanover_RealEstateAgentInfo(ComHanover_RealEstateAgentInfo_Type value) {
        this.comHanover_RealEstateAgentInfo = value;
    }

    /**
     * Gets the value of the riskAppetiteCd property.
     * 
     * @return
     *     possible object is
     *     {@link AppetiteType }
     *     
     */
    public AppetiteType getRiskAppetiteCd() {
        return riskAppetiteCd;
    }

    /**
     * Sets the value of the riskAppetiteCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppetiteType }
     *     
     */
    public void setRiskAppetiteCd(AppetiteType value) {
        this.riskAppetiteCd = value;
    }

    /**
     * Gets the value of the comHanover_MajorPerilCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getComHanover_MajorPerilCd() {
        return comHanover_MajorPerilCd;
    }

    /**
     * Sets the value of the comHanover_MajorPerilCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setComHanover_MajorPerilCd(OpenEnum value) {
        this.comHanover_MajorPerilCd = value;
    }

    /**
     * Gets the value of the comHanoverRosterOfLawyers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comHanoverRosterOfLawyers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComHanover_RosterOfLawyers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComHanover_RosterOfLawyers_Type }
     * 
     * 
     */
    public List<ComHanover_RosterOfLawyers_Type> getComHanover_RosterOfLawyers() {
        if (comHanover_RosterOfLawyers == null) {
            comHanover_RosterOfLawyers = new ArrayList<ComHanover_RosterOfLawyers_Type>();
        }
        return this.comHanover_RosterOfLawyers;
    }

    /**
     * Gets the value of the comHanoverClassActionMassTortInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comHanoverClassActionMassTortInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComHanover_ClassActionMassTortInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComHanover_ClassActionMassTortInfo }
     * 
     * 
     */
    public List<ComHanover_ClassActionMassTortInfo> getComHanover_ClassActionMassTortInfo() {
        if (comHanover_ClassActionMassTortInfo == null) {
            comHanover_ClassActionMassTortInfo = new ArrayList<ComHanover_ClassActionMassTortInfo>();
        }
        return this.comHanover_ClassActionMassTortInfo;
    }

    /**
     * Gets the value of the comHanoverPlaintiffLitigationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comHanoverPlaintiffLitigationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComHanover_PlaintiffLitigationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComHanover_PlaintiffLitigationInfo_Type }
     * 
     * 
     */
    public List<ComHanover_PlaintiffLitigationInfo_Type> getComHanover_PlaintiffLitigationInfo() {
        if (comHanover_PlaintiffLitigationInfo == null) {
            comHanover_PlaintiffLitigationInfo = new ArrayList<ComHanover_PlaintiffLitigationInfo_Type>();
        }
        return this.comHanover_PlaintiffLitigationInfo;
    }

    /**
     * Gets the value of the comHanoverProfLiabSupplementalInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comHanoverProfLiabSupplementalInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComHanover_ProfLiabSupplementalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComHanover_ProfLiabSupplementalInfo_Type }
     * 
     * 
     */
    public List<ComHanover_ProfLiabSupplementalInfo_Type> getComHanover_ProfLiabSupplementalInfo() {
        if (comHanover_ProfLiabSupplementalInfo == null) {
            comHanover_ProfLiabSupplementalInfo = new ArrayList<ComHanover_ProfLiabSupplementalInfo_Type>();
        }
        return this.comHanover_ProfLiabSupplementalInfo;
    }

    /**
     * Gets the value of the comHanoverSecuritiesSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comHanoverSecuritiesSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComHanover_SecuritiesSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComHanover_SecuritiesSchedule_Type }
     * 
     * 
     */
    public List<ComHanover_SecuritiesSchedule_Type> getComHanover_SecuritiesSchedule() {
        if (comHanover_SecuritiesSchedule == null) {
            comHanover_SecuritiesSchedule = new ArrayList<ComHanover_SecuritiesSchedule_Type>();
        }
        return this.comHanover_SecuritiesSchedule;
    }

    /**
     * Gets the value of the comHanoverFinancialInstitutionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comHanoverFinancialInstitutionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComHanover_FinancialInstitutionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComHanover_FinancialInstitutionInfo_Type }
     * 
     * 
     */
    public List<ComHanover_FinancialInstitutionInfo_Type> getComHanover_FinancialInstitutionInfo() {
        if (comHanover_FinancialInstitutionInfo == null) {
            comHanover_FinancialInstitutionInfo = new ArrayList<ComHanover_FinancialInstitutionInfo_Type>();
        }
        return this.comHanover_FinancialInstitutionInfo;
    }

    /**
     * Gets the value of the comHanover_PlanAssetsPriorYearAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getComHanover_PlanAssetsPriorYearAmt() {
        return comHanover_PlanAssetsPriorYearAmt;
    }

    /**
     * Sets the value of the comHanover_PlanAssetsPriorYearAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setComHanover_PlanAssetsPriorYearAmt(CURRENCY value) {
        this.comHanover_PlanAssetsPriorYearAmt = value;
    }

    /**
     * Gets the value of the comHanover_PlanAssetsCurrentYearAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getComHanover_PlanAssetsCurrentYearAmt() {
        return comHanover_PlanAssetsCurrentYearAmt;
    }

    /**
     * Sets the value of the comHanover_PlanAssetsCurrentYearAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setComHanover_PlanAssetsCurrentYearAmt(CURRENCY value) {
        this.comHanover_PlanAssetsCurrentYearAmt = value;
    }

    /**
     * Gets the value of the comHanover_PlanAssetsPctChng property.
     * 
     * @return
     *     possible object is
     *     {@link PercentDecimal }
     *     
     */
    public PercentDecimal getComHanover_PlanAssetsPctChng() {
        return comHanover_PlanAssetsPctChng;
    }

    /**
     * Sets the value of the comHanover_PlanAssetsPctChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentDecimal }
     *     
     */
    public void setComHanover_PlanAssetsPctChng(PercentDecimal value) {
        this.comHanover_PlanAssetsPctChng = value;
    }

}
