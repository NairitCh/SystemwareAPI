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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for FinancialStatementInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialStatementInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}FinancialInfoDt" minOccurs="0"/>
 *         &lt;element ref="{}DurationPeriod" minOccurs="0"/>
 *         &lt;element ref="{}FinancialTypeCd" minOccurs="0"/>
 *         &lt;element ref="{}ConsolidatedReportInd" minOccurs="0"/>
 *         &lt;element ref="{}TotalAssetsAmt" minOccurs="0"/>
 *         &lt;element ref="{}TotalLiabilitiesAmt" minOccurs="0"/>
 *         &lt;element ref="{}NetWorthAmt" minOccurs="0"/>
 *         &lt;element ref="{}CurrentAssetsAmt" minOccurs="0"/>
 *         &lt;element ref="{}CurrentLiabilitiesAmt" minOccurs="0"/>
 *         &lt;element ref="{}BudgetGrossRevenueAmt" minOccurs="0"/>
 *         &lt;element ref="{}LongTermDebtAmt" minOccurs="0"/>
 *         &lt;element ref="{}TotalRevenueAmt" minOccurs="0"/>
 *         &lt;element ref="{}TotalExpensesAmt" minOccurs="0"/>
 *         &lt;element ref="{}NetIncomeAmt" minOccurs="0"/>
 *         &lt;element ref="{}TotalExpenseAmt" minOccurs="0"/>
 *         &lt;element ref="{}InventoryAmt" minOccurs="0"/>
 *         &lt;element ref="{}CashAmt" minOccurs="0"/>
 *         &lt;element ref="{}FundBalanceAmt" minOccurs="0"/>
 *         &lt;element ref="{}FinancialTerm" minOccurs="0"/>
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
@XmlType(name = "FinancialStatementInfo_Type", propOrder = {
    "financialInfoDt",
    "durationPeriod",
    "financialTypeCd",
    "consolidatedReportInd",
    "totalAssetsAmt",
    "totalLiabilitiesAmt",
    "netWorthAmt",
    "currentAssetsAmt",
    "currentLiabilitiesAmt",
    "budgetGrossRevenueAmt",
    "longTermDebtAmt",
    "totalRevenueAmt",
    "totalExpensesAmt",
    "netIncomeAmt",
    "totalExpenseAmt",
    "inventoryAmt",
    "cashAmt",
    "fundBalanceAmt",
    "financialTerm"
})
@XmlSeeAlso({
    ComHanover_FinancialStatementInfo_Type.class
})
public class FinancialStatementInfo_Type {

    @XmlElement(name = "FinancialInfoDt")
    protected Date financialInfoDt;
    @XmlElement(name = "DurationPeriod")
    protected MEASUREMENT durationPeriod;
    @XmlElement(name = "FinancialTypeCd")
    protected FinancialType financialTypeCd;
    @XmlElement(name = "ConsolidatedReportInd")
    protected Boolean consolidatedReportInd;
    @XmlElement(name = "TotalAssetsAmt")
    protected CURRENCY totalAssetsAmt;
    @XmlElement(name = "TotalLiabilitiesAmt")
    protected CURRENCY totalLiabilitiesAmt;
    @XmlElement(name = "NetWorthAmt")
    protected CURRENCY netWorthAmt;
    @XmlElement(name = "CurrentAssetsAmt")
    protected CURRENCY currentAssetsAmt;
    @XmlElement(name = "CurrentLiabilitiesAmt")
    protected CURRENCY currentLiabilitiesAmt;
    @XmlElement(name = "BudgetGrossRevenueAmt")
    protected CURRENCY budgetGrossRevenueAmt;
    @XmlElement(name = "LongTermDebtAmt")
    protected CURRENCY longTermDebtAmt;
    @XmlElement(name = "TotalRevenueAmt")
    protected CURRENCY totalRevenueAmt;
    @XmlElement(name = "TotalExpensesAmt")
    protected CURRENCY totalExpensesAmt;
    @XmlElement(name = "NetIncomeAmt")
    protected CURRENCY netIncomeAmt;
    @XmlElement(name = "TotalExpenseAmt")
    protected CURRENCY totalExpenseAmt;
    @XmlElement(name = "InventoryAmt")
    protected CURRENCY inventoryAmt;
    @XmlElement(name = "CashAmt")
    protected CURRENCY cashAmt;
    @XmlElement(name = "FundBalanceAmt")
    protected CURRENCY fundBalanceAmt;
    @XmlElement(name = "FinancialTerm")
    protected ComHanover_DURATION_Type financialTerm;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the financialInfoDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getFinancialInfoDt() {
        return financialInfoDt;
    }

    /**
     * Sets the value of the financialInfoDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setFinancialInfoDt(Date value) {
        this.financialInfoDt = value;
    }

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
     * Gets the value of the financialTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialType }
     *     
     */
    public FinancialType getFinancialTypeCd() {
        return financialTypeCd;
    }

    /**
     * Sets the value of the financialTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialType }
     *     
     */
    public void setFinancialTypeCd(FinancialType value) {
        this.financialTypeCd = value;
    }

    /**
     * Gets the value of the consolidatedReportInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getConsolidatedReportInd() {
        return consolidatedReportInd;
    }

    /**
     * Sets the value of the consolidatedReportInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsolidatedReportInd(Boolean value) {
        this.consolidatedReportInd = value;
    }

    /**
     * Gets the value of the totalAssetsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getTotalAssetsAmt() {
        return totalAssetsAmt;
    }

    /**
     * Sets the value of the totalAssetsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setTotalAssetsAmt(CURRENCY value) {
        this.totalAssetsAmt = value;
    }

    /**
     * Gets the value of the totalLiabilitiesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getTotalLiabilitiesAmt() {
        return totalLiabilitiesAmt;
    }

    /**
     * Sets the value of the totalLiabilitiesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setTotalLiabilitiesAmt(CURRENCY value) {
        this.totalLiabilitiesAmt = value;
    }

    /**
     * Gets the value of the netWorthAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getNetWorthAmt() {
        return netWorthAmt;
    }

    /**
     * Sets the value of the netWorthAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setNetWorthAmt(CURRENCY value) {
        this.netWorthAmt = value;
    }

    /**
     * Gets the value of the currentAssetsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getCurrentAssetsAmt() {
        return currentAssetsAmt;
    }

    /**
     * Sets the value of the currentAssetsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setCurrentAssetsAmt(CURRENCY value) {
        this.currentAssetsAmt = value;
    }

    /**
     * Gets the value of the currentLiabilitiesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getCurrentLiabilitiesAmt() {
        return currentLiabilitiesAmt;
    }

    /**
     * Sets the value of the currentLiabilitiesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setCurrentLiabilitiesAmt(CURRENCY value) {
        this.currentLiabilitiesAmt = value;
    }

    /**
     * Gets the value of the budgetGrossRevenueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getBudgetGrossRevenueAmt() {
        return budgetGrossRevenueAmt;
    }

    /**
     * Sets the value of the budgetGrossRevenueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setBudgetGrossRevenueAmt(CURRENCY value) {
        this.budgetGrossRevenueAmt = value;
    }

    /**
     * Gets the value of the longTermDebtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getLongTermDebtAmt() {
        return longTermDebtAmt;
    }

    /**
     * Sets the value of the longTermDebtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setLongTermDebtAmt(CURRENCY value) {
        this.longTermDebtAmt = value;
    }

    /**
     * Gets the value of the totalRevenueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getTotalRevenueAmt() {
        return totalRevenueAmt;
    }

    /**
     * Sets the value of the totalRevenueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setTotalRevenueAmt(CURRENCY value) {
        this.totalRevenueAmt = value;
    }

    /**
     * Gets the value of the totalExpensesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getTotalExpensesAmt() {
        return totalExpensesAmt;
    }

    /**
     * Sets the value of the totalExpensesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setTotalExpensesAmt(CURRENCY value) {
        this.totalExpensesAmt = value;
    }

    /**
     * Gets the value of the netIncomeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getNetIncomeAmt() {
        return netIncomeAmt;
    }

    /**
     * Sets the value of the netIncomeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setNetIncomeAmt(CURRENCY value) {
        this.netIncomeAmt = value;
    }

    /**
     * Gets the value of the totalExpenseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getTotalExpenseAmt() {
        return totalExpenseAmt;
    }

    /**
     * Sets the value of the totalExpenseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setTotalExpenseAmt(CURRENCY value) {
        this.totalExpenseAmt = value;
    }

    /**
     * Gets the value of the inventoryAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getInventoryAmt() {
        return inventoryAmt;
    }

    /**
     * Sets the value of the inventoryAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setInventoryAmt(CURRENCY value) {
        this.inventoryAmt = value;
    }

    /**
     * Gets the value of the cashAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getCashAmt() {
        return cashAmt;
    }

    /**
     * Sets the value of the cashAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setCashAmt(CURRENCY value) {
        this.cashAmt = value;
    }

    /**
     * Gets the value of the fundBalanceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getFundBalanceAmt() {
        return fundBalanceAmt;
    }

    /**
     * Sets the value of the fundBalanceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setFundBalanceAmt(CURRENCY value) {
        this.fundBalanceAmt = value;
    }

    /**
     * Gets the value of the financialTerm property.
     * 
     * @return
     *     possible object is
     *     {@link ComHanover_DURATION_Type }
     *     
     */
    public ComHanover_DURATION_Type getFinancialTerm() {
        return financialTerm;
    }

    /**
     * Sets the value of the financialTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComHanover_DURATION_Type }
     *     
     */
    public void setFinancialTerm(ComHanover_DURATION_Type value) {
        this.financialTerm = value;
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
