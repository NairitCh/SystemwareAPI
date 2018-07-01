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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for GeneralLiabilityClassification_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralLiabilityClassification_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ItemIdInfo" minOccurs="0"/>
 *         &lt;element ref="{}SublineCd" minOccurs="0"/>
 *         &lt;element ref="{}CommlCoverage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ClassCd" minOccurs="0"/>
 *         &lt;element ref="{}ClassCdDesc" minOccurs="0"/>
 *         &lt;element ref="{}Exposure" minOccurs="0"/>
 *         &lt;element ref="{}TerritoryCd" minOccurs="0"/>
 *         &lt;element ref="{}StateProvCd" minOccurs="0"/>
 *         &lt;element ref="{}InterestIdNumber" minOccurs="0"/>
 *         &lt;element ref="{}PremiumBasisCd" minOccurs="0"/>
 *         &lt;element ref="{}AlternateWordingCd" minOccurs="0"/>
 *         &lt;element ref="{}SuffixCd" minOccurs="0"/>
 *         &lt;element ref="{}PremOpRate" minOccurs="0"/>
 *         &lt;element ref="{}ProdRate" minOccurs="0"/>
 *         &lt;element ref="{}IfAnyRatingBasisInd" minOccurs="0"/>
 *         &lt;element ref="{}Deductible" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}MinPremAmt" minOccurs="0"/>
 *         &lt;element ref="{}AlternateWordingDesc" minOccurs="0"/>
 *         &lt;element ref="{}RiskAppetiteCd" minOccurs="0"/>
 *         &lt;element ref="{}PremiumAmt" minOccurs="0"/>
 *         &lt;element ref="{}PremiumBasisDesc" minOccurs="0"/>
 *         &lt;element ref="{}QuestionAnswer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LocationRef" type="{}IDREF" />
 *       &lt;attribute name="SubLocationRef" type="{}IDREF" />
 *       &lt;attribute name="id" type="{}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralLiabilityClassification_Type", propOrder = {
    "itemIdInfo",
    "sublineCd",
    "commlCoverage",
    "classCd",
    "classCdDesc",
    "exposure",
    "territoryCd",
    "stateProvCd",
    "interestIdNumber",
    "premiumBasisCd",
    "alternateWordingCd",
    "suffixCd",
    "premOpRate",
    "prodRate",
    "ifAnyRatingBasisInd",
    "deductible",
    "minPremAmt",
    "alternateWordingDesc",
    "riskAppetiteCd",
    "premiumAmt",
    "premiumBasisDesc",
    "questionAnswer"
})
public class GeneralLiabilityClassification_Type {

    @XmlElement(name = "ItemIdInfo")
    protected ItemIdInfo_Type itemIdInfo;
    @XmlElement(name = "SublineCd")
    protected OpenEnum sublineCd;
    @XmlElement(name = "CommlCoverage")
    protected List<ComHanover_CommlCoverage_Type> commlCoverage;
    @XmlElement(name = "ClassCd")
    protected OpenEnum classCd;
    @XmlElement(name = "ClassCdDesc")
    protected C255 classCdDesc;
    @XmlElement(name = "Exposure")
    protected Decimal exposure;
    @XmlElement(name = "TerritoryCd")
    protected OpenEnum territoryCd;
    @XmlElement(name = "StateProvCd")
    protected OpenEnum stateProvCd;
    @XmlElement(name = "InterestIdNumber")
    protected Long interestIdNumber;
    @XmlElement(name = "PremiumBasisCd")
    protected PremiumBase premiumBasisCd;
    @XmlElement(name = "AlternateWordingCd")
    protected OpenEnum alternateWordingCd;
    @XmlElement(name = "SuffixCd")
    protected OpenEnum suffixCd;
    @XmlElement(name = "PremOpRate")
    protected Decimal premOpRate;
    @XmlElement(name = "ProdRate")
    protected Decimal prodRate;
    @XmlElement(name = "IfAnyRatingBasisInd")
    protected Boolean ifAnyRatingBasisInd;
    @XmlElement(name = "Deductible")
    protected List<Deductible_Type> deductible;
    @XmlElement(name = "MinPremAmt")
    protected CURRENCY minPremAmt;
    @XmlElement(name = "AlternateWordingDesc")
    protected C255 alternateWordingDesc;
    @XmlElement(name = "RiskAppetiteCd")
    protected AppetiteType riskAppetiteCd;
    @XmlElement(name = "PremiumAmt")
    protected CURRENCY premiumAmt;
    @XmlElement(name = "PremiumBasisDesc")
    protected C255 premiumBasisDesc;
    @XmlElement(name = "QuestionAnswer")
    protected List<ComHanover_QuestionAnswer_Type> questionAnswer;
    @XmlAttribute(name = "LocationRef")
    @XmlIDREF
    protected Object locationRef;
    @XmlAttribute(name = "SubLocationRef")
    @XmlIDREF
    protected Object subLocationRef;
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
     * Gets the value of the sublineCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getSublineCd() {
        return sublineCd;
    }

    /**
     * Sets the value of the sublineCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setSublineCd(OpenEnum value) {
        this.sublineCd = value;
    }

    /**
     * Gets the value of the commlCoverage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commlCoverage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommlCoverage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComHanover_CommlCoverage_Type }
     * 
     * 
     */
    public List<ComHanover_CommlCoverage_Type> getCommlCoverage() {
        if (commlCoverage == null) {
            commlCoverage = new ArrayList<ComHanover_CommlCoverage_Type>();
        }
        return this.commlCoverage;
    }

    /**
     * Gets the value of the classCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getClassCd() {
        return classCd;
    }

    /**
     * Sets the value of the classCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setClassCd(OpenEnum value) {
        this.classCd = value;
    }

    /**
     * Gets the value of the classCdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getClassCdDesc() {
        return classCdDesc;
    }

    /**
     * Sets the value of the classCdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setClassCdDesc(C255 value) {
        this.classCdDesc = value;
    }

    /**
     * Gets the value of the exposure property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getExposure() {
        return exposure;
    }

    /**
     * Sets the value of the exposure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setExposure(Decimal value) {
        this.exposure = value;
    }

    /**
     * Gets the value of the territoryCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getTerritoryCd() {
        return territoryCd;
    }

    /**
     * Sets the value of the territoryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setTerritoryCd(OpenEnum value) {
        this.territoryCd = value;
    }

    /**
     * Gets the value of the stateProvCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getStateProvCd() {
        return stateProvCd;
    }

    /**
     * Sets the value of the stateProvCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setStateProvCd(OpenEnum value) {
        this.stateProvCd = value;
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
     * Gets the value of the premiumBasisCd property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumBase }
     *     
     */
    public PremiumBase getPremiumBasisCd() {
        return premiumBasisCd;
    }

    /**
     * Sets the value of the premiumBasisCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumBase }
     *     
     */
    public void setPremiumBasisCd(PremiumBase value) {
        this.premiumBasisCd = value;
    }

    /**
     * Gets the value of the alternateWordingCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getAlternateWordingCd() {
        return alternateWordingCd;
    }

    /**
     * Sets the value of the alternateWordingCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setAlternateWordingCd(OpenEnum value) {
        this.alternateWordingCd = value;
    }

    /**
     * Gets the value of the suffixCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getSuffixCd() {
        return suffixCd;
    }

    /**
     * Sets the value of the suffixCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setSuffixCd(OpenEnum value) {
        this.suffixCd = value;
    }

    /**
     * Gets the value of the premOpRate property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getPremOpRate() {
        return premOpRate;
    }

    /**
     * Sets the value of the premOpRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setPremOpRate(Decimal value) {
        this.premOpRate = value;
    }

    /**
     * Gets the value of the prodRate property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getProdRate() {
        return prodRate;
    }

    /**
     * Sets the value of the prodRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setProdRate(Decimal value) {
        this.prodRate = value;
    }

    /**
     * Gets the value of the ifAnyRatingBasisInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIfAnyRatingBasisInd() {
        return ifAnyRatingBasisInd;
    }

    /**
     * Sets the value of the ifAnyRatingBasisInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIfAnyRatingBasisInd(Boolean value) {
        this.ifAnyRatingBasisInd = value;
    }

    /**
     * Gets the value of the deductible property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deductible property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeductible().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Deductible_Type }
     * 
     * 
     */
    public List<Deductible_Type> getDeductible() {
        if (deductible == null) {
            deductible = new ArrayList<Deductible_Type>();
        }
        return this.deductible;
    }

    /**
     * Gets the value of the minPremAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getMinPremAmt() {
        return minPremAmt;
    }

    /**
     * Sets the value of the minPremAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setMinPremAmt(CURRENCY value) {
        this.minPremAmt = value;
    }

    /**
     * Gets the value of the alternateWordingDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getAlternateWordingDesc() {
        return alternateWordingDesc;
    }

    /**
     * Sets the value of the alternateWordingDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setAlternateWordingDesc(C255 value) {
        this.alternateWordingDesc = value;
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
     * Gets the value of the premiumAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getPremiumAmt() {
        return premiumAmt;
    }

    /**
     * Sets the value of the premiumAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setPremiumAmt(CURRENCY value) {
        this.premiumAmt = value;
    }

    /**
     * Gets the value of the premiumBasisDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getPremiumBasisDesc() {
        return premiumBasisDesc;
    }

    /**
     * Sets the value of the premiumBasisDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setPremiumBasisDesc(C255 value) {
        this.premiumBasisDesc = value;
    }

    /**
     * Gets the value of the questionAnswer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionAnswer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionAnswer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComHanover_QuestionAnswer_Type }
     * 
     * 
     */
    public List<ComHanover_QuestionAnswer_Type> getQuestionAnswer() {
        if (questionAnswer == null) {
            questionAnswer = new ArrayList<ComHanover_QuestionAnswer_Type>();
        }
        return this.questionAnswer;
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
     * Gets the value of the subLocationRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSubLocationRef() {
        return subLocationRef;
    }

    /**
     * Sets the value of the subLocationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSubLocationRef(Object value) {
        this.subLocationRef = value;
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
