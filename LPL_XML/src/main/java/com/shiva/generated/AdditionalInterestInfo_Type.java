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
 * <p>Java class for AdditionalInterestInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalInterestInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}NatureInterestCd" minOccurs="0"/>
 *         &lt;element ref="{}InterestRank" minOccurs="0"/>
 *         &lt;element ref="{}AccountNumberId" minOccurs="0"/>
 *         &lt;element ref="{}InterestIdNumber" minOccurs="0"/>
 *         &lt;element ref="{}PayorInd" minOccurs="0"/>
 *         &lt;element ref="{}BillFrequencyCd" minOccurs="0"/>
 *         &lt;element ref="{}CertificateFrequencyCd" minOccurs="0"/>
 *         &lt;element ref="{}CertificateRequiredDt" minOccurs="0"/>
 *         &lt;element ref="{}CertificateIssuedDt" minOccurs="0"/>
 *         &lt;element ref="{}PolicyRequiredDt" minOccurs="0"/>
 *         &lt;element ref="{}PolicyIssuedDt" minOccurs="0"/>
 *         &lt;element ref="{}InterestEndDt" minOccurs="0"/>
 *         &lt;element ref="{}InformationalBillingInd" minOccurs="0"/>
 *         &lt;element ref="{}PolicyFrequencyCd" minOccurs="0"/>
 *         &lt;element ref="{}FinancedAmt" minOccurs="0"/>
 *         &lt;element ref="{}InterestPct" minOccurs="0"/>
 *         &lt;element ref="{}WorkCompCoverageInd" minOccurs="0"/>
 *         &lt;element ref="{}ReasonDesc" minOccurs="0"/>
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
@XmlType(name = "AdditionalInterestInfo_Type", propOrder = {
    "natureInterestCd",
    "interestRank",
    "accountNumberId",
    "interestIdNumber",
    "payorInd",
    "billFrequencyCd",
    "certificateFrequencyCd",
    "certificateRequiredDt",
    "certificateIssuedDt",
    "policyRequiredDt",
    "policyIssuedDt",
    "interestEndDt",
    "informationalBillingInd",
    "policyFrequencyCd",
    "financedAmt",
    "interestPct",
    "workCompCoverageInd",
    "reasonDesc"
})
public class AdditionalInterestInfo_Type {

    @XmlElement(name = "NatureInterestCd")
    protected Interest natureInterestCd;
    @XmlElement(name = "InterestRank")
    protected Long interestRank;
    @XmlElement(name = "AccountNumberId")
    protected AssignedIdentifier accountNumberId;
    @XmlElement(name = "InterestIdNumber")
    protected Long interestIdNumber;
    @XmlElement(name = "PayorInd")
    protected Boolean payorInd;
    @XmlElement(name = "BillFrequencyCd")
    protected Frequency billFrequencyCd;
    @XmlElement(name = "CertificateFrequencyCd")
    protected Frequency certificateFrequencyCd;
    @XmlElement(name = "CertificateRequiredDt")
    protected Date certificateRequiredDt;
    @XmlElement(name = "CertificateIssuedDt")
    protected Date certificateIssuedDt;
    @XmlElement(name = "PolicyRequiredDt")
    protected Date policyRequiredDt;
    @XmlElement(name = "PolicyIssuedDt")
    protected Date policyIssuedDt;
    @XmlElement(name = "InterestEndDt")
    protected Date interestEndDt;
    @XmlElement(name = "InformationalBillingInd")
    protected Boolean informationalBillingInd;
    @XmlElement(name = "PolicyFrequencyCd")
    protected Frequency policyFrequencyCd;
    @XmlElement(name = "FinancedAmt")
    protected CURRENCY financedAmt;
    @XmlElement(name = "InterestPct")
    protected PercentLong interestPct;
    @XmlElement(name = "WorkCompCoverageInd")
    protected Boolean workCompCoverageInd;
    @XmlElement(name = "ReasonDesc")
    protected CInfinite reasonDesc;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the natureInterestCd property.
     * 
     * @return
     *     possible object is
     *     {@link Interest }
     *     
     */
    public Interest getNatureInterestCd() {
        return natureInterestCd;
    }

    /**
     * Sets the value of the natureInterestCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interest }
     *     
     */
    public void setNatureInterestCd(Interest value) {
        this.natureInterestCd = value;
    }

    /**
     * Gets the value of the interestRank property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterestRank() {
        return interestRank;
    }

    /**
     * Sets the value of the interestRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterestRank(Long value) {
        this.interestRank = value;
    }

    /**
     * Gets the value of the accountNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedIdentifier }
     *     
     */
    public AssignedIdentifier getAccountNumberId() {
        return accountNumberId;
    }

    /**
     * Sets the value of the accountNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedIdentifier }
     *     
     */
    public void setAccountNumberId(AssignedIdentifier value) {
        this.accountNumberId = value;
    }

    /**
     * Gets the value of the interestIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterestIdNumber() {
        return interestIdNumber;
    }

    /**
     * Sets the value of the interestIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterestIdNumber(Long value) {
        this.interestIdNumber = value;
    }

    /**
     * Gets the value of the payorInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPayorInd() {
        return payorInd;
    }

    /**
     * Sets the value of the payorInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayorInd(Boolean value) {
        this.payorInd = value;
    }

    /**
     * Gets the value of the billFrequencyCd property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency }
     *     
     */
    public Frequency getBillFrequencyCd() {
        return billFrequencyCd;
    }

    /**
     * Sets the value of the billFrequencyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency }
     *     
     */
    public void setBillFrequencyCd(Frequency value) {
        this.billFrequencyCd = value;
    }

    /**
     * Gets the value of the certificateFrequencyCd property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency }
     *     
     */
    public Frequency getCertificateFrequencyCd() {
        return certificateFrequencyCd;
    }

    /**
     * Sets the value of the certificateFrequencyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency }
     *     
     */
    public void setCertificateFrequencyCd(Frequency value) {
        this.certificateFrequencyCd = value;
    }

    /**
     * Gets the value of the certificateRequiredDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getCertificateRequiredDt() {
        return certificateRequiredDt;
    }

    /**
     * Sets the value of the certificateRequiredDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setCertificateRequiredDt(Date value) {
        this.certificateRequiredDt = value;
    }

    /**
     * Gets the value of the certificateIssuedDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getCertificateIssuedDt() {
        return certificateIssuedDt;
    }

    /**
     * Sets the value of the certificateIssuedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setCertificateIssuedDt(Date value) {
        this.certificateIssuedDt = value;
    }

    /**
     * Gets the value of the policyRequiredDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getPolicyRequiredDt() {
        return policyRequiredDt;
    }

    /**
     * Sets the value of the policyRequiredDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setPolicyRequiredDt(Date value) {
        this.policyRequiredDt = value;
    }

    /**
     * Gets the value of the policyIssuedDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getPolicyIssuedDt() {
        return policyIssuedDt;
    }

    /**
     * Sets the value of the policyIssuedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setPolicyIssuedDt(Date value) {
        this.policyIssuedDt = value;
    }

    /**
     * Gets the value of the interestEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getInterestEndDt() {
        return interestEndDt;
    }

    /**
     * Sets the value of the interestEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setInterestEndDt(Date value) {
        this.interestEndDt = value;
    }

    /**
     * Gets the value of the informationalBillingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getInformationalBillingInd() {
        return informationalBillingInd;
    }

    /**
     * Sets the value of the informationalBillingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInformationalBillingInd(Boolean value) {
        this.informationalBillingInd = value;
    }

    /**
     * Gets the value of the policyFrequencyCd property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency }
     *     
     */
    public Frequency getPolicyFrequencyCd() {
        return policyFrequencyCd;
    }

    /**
     * Sets the value of the policyFrequencyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency }
     *     
     */
    public void setPolicyFrequencyCd(Frequency value) {
        this.policyFrequencyCd = value;
    }

    /**
     * Gets the value of the financedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getFinancedAmt() {
        return financedAmt;
    }

    /**
     * Sets the value of the financedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setFinancedAmt(CURRENCY value) {
        this.financedAmt = value;
    }

    /**
     * Gets the value of the interestPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getInterestPct() {
        return interestPct;
    }

    /**
     * Sets the value of the interestPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setInterestPct(PercentLong value) {
        this.interestPct = value;
    }

    /**
     * Gets the value of the workCompCoverageInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getWorkCompCoverageInd() {
        return workCompCoverageInd;
    }

    /**
     * Sets the value of the workCompCoverageInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkCompCoverageInd(Boolean value) {
        this.workCompCoverageInd = value;
    }

    /**
     * Gets the value of the reasonDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CInfinite }
     *     
     */
    public CInfinite getReasonDesc() {
        return reasonDesc;
    }

    /**
     * Sets the value of the reasonDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInfinite }
     *     
     */
    public void setReasonDesc(CInfinite value) {
        this.reasonDesc = value;
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
