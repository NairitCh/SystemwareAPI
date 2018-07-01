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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Loss_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Loss_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ItemIdInfo" minOccurs="0"/>
 *         &lt;element ref="{}CatastropheLossInd" minOccurs="0"/>
 *         &lt;element ref="{}Catastrophe" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ClaimSettledInd" minOccurs="0"/>
 *         &lt;element ref="{}CoverageCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}LOBCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}LOBSubCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}LossDt" minOccurs="0"/>
 *         &lt;element ref="{}LossDesc" minOccurs="0"/>
 *         &lt;element ref="{}LossLocationCd" minOccurs="0"/>
 *         &lt;element ref="{}LossLocationDesc" minOccurs="0"/>
 *         &lt;element ref="{}ProbableIncurredAmt" minOccurs="0"/>
 *         &lt;element ref="{}ProbableExpenseIncurredAmt" minOccurs="0"/>
 *         &lt;element ref="{}TotalExpenseAmt" minOccurs="0"/>
 *         &lt;element ref="{}TotalPaidAmt" minOccurs="0"/>
 *         &lt;element ref="{}ReportedDt" minOccurs="0"/>
 *         &lt;element ref="{}ClosedDt" minOccurs="0"/>
 *         &lt;element ref="{}DefenseCostAmt" minOccurs="0"/>
 *         &lt;element ref="{}AdministrativeActionInd" minOccurs="0"/>
 *         &lt;element ref="{}LossCauseCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}InsurerLossCauseCd" minOccurs="0"/>
 *         &lt;element ref="{}ClaimStatusCd" minOccurs="0"/>
 *         &lt;element ref="{}InsurerName" minOccurs="0"/>
 *         &lt;element ref="{}PolicyNumber" minOccurs="0"/>
 *         &lt;element ref="{}ReservedAmt" minOccurs="0"/>
 *         &lt;element ref="{}LossEnteredByCd" minOccurs="0"/>
 *         &lt;element ref="{}InDisputeInd" minOccurs="0"/>
 *         &lt;element ref="{}NoticeInformationPracticesInd" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DriverRef" type="{}IDREF" />
 *       &lt;attribute name="LocationRef" type="{}IDREF" />
 *       &lt;attribute name="id" type="{}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Loss_Type", propOrder = {
    "itemIdInfo",
    "catastropheLossInd",
    "catastrophe",
    "claimSettledInd",
    "coverageCd",
    "lobCd",
    "lobSubCd",
    "lossDt",
    "lossDesc",
    "lossLocationCd",
    "lossLocationDesc",
    "probableIncurredAmt",
    "probableExpenseIncurredAmt",
    "totalExpenseAmt",
    "totalPaidAmt",
    "reportedDt",
    "closedDt",
    "defenseCostAmt",
    "administrativeActionInd",
    "lossCauseCd",
    "insurerLossCauseCd",
    "claimStatusCd",
    "insurerName",
    "policyNumber",
    "reservedAmt",
    "lossEnteredByCd",
    "inDisputeInd",
    "noticeInformationPracticesInd"
})
@XmlSeeAlso({
    ComHanover_Loss_Type.class
})
public class Loss_Type {

    @XmlElement(name = "ItemIdInfo")
    protected ItemIdInfo_Type itemIdInfo;
    @XmlElement(name = "CatastropheLossInd")
    protected Boolean catastropheLossInd;
    @XmlElement(name = "Catastrophe")
    protected List<Catastrophe_Type> catastrophe;
    @XmlElement(name = "ClaimSettledInd")
    protected Boolean claimSettledInd;
    @XmlElement(name = "CoverageCd")
    protected List<Coverages> coverageCd;
    @XmlElement(name = "LOBCd")
    protected List<LineOfBusiness> lobCd;
    @XmlElement(name = "LOBSubCd")
    protected List<LineOfBusinessSubCode> lobSubCd;
    @XmlElement(name = "LossDt")
    protected Date lossDt;
    @XmlElement(name = "LossDesc")
    protected C255 lossDesc;
    @XmlElement(name = "LossLocationCd")
    protected LossLocation lossLocationCd;
    @XmlElement(name = "LossLocationDesc")
    protected C255 lossLocationDesc;
    @XmlElement(name = "ProbableIncurredAmt")
    protected CURRENCY probableIncurredAmt;
    @XmlElement(name = "ProbableExpenseIncurredAmt")
    protected CURRENCY probableExpenseIncurredAmt;
    @XmlElement(name = "TotalExpenseAmt")
    protected CURRENCY totalExpenseAmt;
    @XmlElement(name = "TotalPaidAmt")
    protected CURRENCY totalPaidAmt;
    @XmlElement(name = "ReportedDt")
    protected DateTime reportedDt;
    @XmlElement(name = "ClosedDt")
    protected Date closedDt;
    @XmlElement(name = "DefenseCostAmt")
    protected CURRENCY defenseCostAmt;
    @XmlElement(name = "AdministrativeActionInd")
    protected Boolean administrativeActionInd;
    @XmlElement(name = "LossCauseCd")
    protected List<OpenEnum> lossCauseCd;
    @XmlElement(name = "InsurerLossCauseCd")
    protected OpenEnum insurerLossCauseCd;
    @XmlElement(name = "ClaimStatusCd")
    protected ClaimStatus claimStatusCd;
    @XmlElement(name = "InsurerName")
    protected C255 insurerName;
    @XmlElement(name = "PolicyNumber")
    protected C25 policyNumber;
    @XmlElement(name = "ReservedAmt")
    protected CURRENCY reservedAmt;
    @XmlElement(name = "LossEnteredByCd")
    protected LossEnteredBy lossEnteredByCd;
    @XmlElement(name = "InDisputeInd")
    protected Boolean inDisputeInd;
    @XmlElement(name = "NoticeInformationPracticesInd")
    protected Boolean noticeInformationPracticesInd;
    @XmlAttribute(name = "DriverRef")
    @XmlIDREF
    protected Object driverRef;
    @XmlAttribute(name = "LocationRef")
    @XmlIDREF
    protected Object locationRef;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the itemIdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdInfo_Type }
     *     
     */
    public ItemIdInfo_Type getItemIdInfo() {
        return itemIdInfo;
    }

    /**
     * Sets the value of the itemIdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdInfo_Type }
     *     
     */
    public void setItemIdInfo(ItemIdInfo_Type value) {
        this.itemIdInfo = value;
    }

    /**
     * Gets the value of the catastropheLossInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCatastropheLossInd() {
        return catastropheLossInd;
    }

    /**
     * Sets the value of the catastropheLossInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCatastropheLossInd(Boolean value) {
        this.catastropheLossInd = value;
    }

    /**
     * Gets the value of the catastrophe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catastrophe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatastrophe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Catastrophe_Type }
     * 
     * 
     */
    public List<Catastrophe_Type> getCatastrophe() {
        if (catastrophe == null) {
            catastrophe = new ArrayList<Catastrophe_Type>();
        }
        return this.catastrophe;
    }

    /**
     * Gets the value of the claimSettledInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getClaimSettledInd() {
        return claimSettledInd;
    }

    /**
     * Sets the value of the claimSettledInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClaimSettledInd(Boolean value) {
        this.claimSettledInd = value;
    }

    /**
     * Gets the value of the coverageCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverageCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverageCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coverages }
     * 
     * 
     */
    public List<Coverages> getCoverageCd() {
        if (coverageCd == null) {
            coverageCd = new ArrayList<Coverages>();
        }
        return this.coverageCd;
    }

    /**
     * Gets the value of the lobCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lobCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLOBCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineOfBusiness }
     * 
     * 
     */
    public List<LineOfBusiness> getLOBCd() {
        if (lobCd == null) {
            lobCd = new ArrayList<LineOfBusiness>();
        }
        return this.lobCd;
    }

    /**
     * Gets the value of the lobSubCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lobSubCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLOBSubCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineOfBusinessSubCode }
     * 
     * 
     */
    public List<LineOfBusinessSubCode> getLOBSubCd() {
        if (lobSubCd == null) {
            lobSubCd = new ArrayList<LineOfBusinessSubCode>();
        }
        return this.lobSubCd;
    }

    /**
     * Gets the value of the lossDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getLossDt() {
        return lossDt;
    }

    /**
     * Sets the value of the lossDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setLossDt(Date value) {
        this.lossDt = value;
    }

    /**
     * Gets the value of the lossDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getLossDesc() {
        return lossDesc;
    }

    /**
     * Sets the value of the lossDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setLossDesc(C255 value) {
        this.lossDesc = value;
    }

    /**
     * Gets the value of the lossLocationCd property.
     * 
     * @return
     *     possible object is
     *     {@link LossLocation }
     *     
     */
    public LossLocation getLossLocationCd() {
        return lossLocationCd;
    }

    /**
     * Sets the value of the lossLocationCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LossLocation }
     *     
     */
    public void setLossLocationCd(LossLocation value) {
        this.lossLocationCd = value;
    }

    /**
     * Gets the value of the lossLocationDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getLossLocationDesc() {
        return lossLocationDesc;
    }

    /**
     * Sets the value of the lossLocationDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setLossLocationDesc(C255 value) {
        this.lossLocationDesc = value;
    }

    /**
     * Gets the value of the probableIncurredAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getProbableIncurredAmt() {
        return probableIncurredAmt;
    }

    /**
     * Sets the value of the probableIncurredAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setProbableIncurredAmt(CURRENCY value) {
        this.probableIncurredAmt = value;
    }

    /**
     * Gets the value of the probableExpenseIncurredAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getProbableExpenseIncurredAmt() {
        return probableExpenseIncurredAmt;
    }

    /**
     * Sets the value of the probableExpenseIncurredAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setProbableExpenseIncurredAmt(CURRENCY value) {
        this.probableExpenseIncurredAmt = value;
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
     * Gets the value of the totalPaidAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getTotalPaidAmt() {
        return totalPaidAmt;
    }

    /**
     * Sets the value of the totalPaidAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setTotalPaidAmt(CURRENCY value) {
        this.totalPaidAmt = value;
    }

    /**
     * Gets the value of the reportedDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getReportedDt() {
        return reportedDt;
    }

    /**
     * Sets the value of the reportedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setReportedDt(DateTime value) {
        this.reportedDt = value;
    }

    /**
     * Gets the value of the closedDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getClosedDt() {
        return closedDt;
    }

    /**
     * Sets the value of the closedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setClosedDt(Date value) {
        this.closedDt = value;
    }

    /**
     * Gets the value of the defenseCostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getDefenseCostAmt() {
        return defenseCostAmt;
    }

    /**
     * Sets the value of the defenseCostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setDefenseCostAmt(CURRENCY value) {
        this.defenseCostAmt = value;
    }

    /**
     * Gets the value of the administrativeActionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAdministrativeActionInd() {
        return administrativeActionInd;
    }

    /**
     * Sets the value of the administrativeActionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdministrativeActionInd(Boolean value) {
        this.administrativeActionInd = value;
    }

    /**
     * Gets the value of the lossCauseCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lossCauseCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLossCauseCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenEnum }
     * 
     * 
     */
    public List<OpenEnum> getLossCauseCd() {
        if (lossCauseCd == null) {
            lossCauseCd = new ArrayList<OpenEnum>();
        }
        return this.lossCauseCd;
    }

    /**
     * Gets the value of the insurerLossCauseCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getInsurerLossCauseCd() {
        return insurerLossCauseCd;
    }

    /**
     * Sets the value of the insurerLossCauseCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setInsurerLossCauseCd(OpenEnum value) {
        this.insurerLossCauseCd = value;
    }

    /**
     * Gets the value of the claimStatusCd property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimStatus }
     *     
     */
    public ClaimStatus getClaimStatusCd() {
        return claimStatusCd;
    }

    /**
     * Sets the value of the claimStatusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimStatus }
     *     
     */
    public void setClaimStatusCd(ClaimStatus value) {
        this.claimStatusCd = value;
    }

    /**
     * Gets the value of the insurerName property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getInsurerName() {
        return insurerName;
    }

    /**
     * Sets the value of the insurerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setInsurerName(C255 value) {
        this.insurerName = value;
    }

    /**
     * Gets the value of the policyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link C25 }
     *     
     */
    public C25 getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the value of the policyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link C25 }
     *     
     */
    public void setPolicyNumber(C25 value) {
        this.policyNumber = value;
    }

    /**
     * Gets the value of the reservedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getReservedAmt() {
        return reservedAmt;
    }

    /**
     * Sets the value of the reservedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setReservedAmt(CURRENCY value) {
        this.reservedAmt = value;
    }

    /**
     * Gets the value of the lossEnteredByCd property.
     * 
     * @return
     *     possible object is
     *     {@link LossEnteredBy }
     *     
     */
    public LossEnteredBy getLossEnteredByCd() {
        return lossEnteredByCd;
    }

    /**
     * Sets the value of the lossEnteredByCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LossEnteredBy }
     *     
     */
    public void setLossEnteredByCd(LossEnteredBy value) {
        this.lossEnteredByCd = value;
    }

    /**
     * Gets the value of the inDisputeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getInDisputeInd() {
        return inDisputeInd;
    }

    /**
     * Sets the value of the inDisputeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInDisputeInd(Boolean value) {
        this.inDisputeInd = value;
    }

    /**
     * Gets the value of the noticeInformationPracticesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNoticeInformationPracticesInd() {
        return noticeInformationPracticesInd;
    }

    /**
     * Sets the value of the noticeInformationPracticesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoticeInformationPracticesInd(Boolean value) {
        this.noticeInformationPracticesInd = value;
    }

    /**
     * Gets the value of the driverRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDriverRef() {
        return driverRef;
    }

    /**
     * Sets the value of the driverRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDriverRef(Object value) {
        this.driverRef = value;
    }

    /**
     * Gets the value of the locationRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLocationRef() {
        return locationRef;
    }

    /**
     * Sets the value of the locationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLocationRef(Object value) {
        this.locationRef = value;
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
