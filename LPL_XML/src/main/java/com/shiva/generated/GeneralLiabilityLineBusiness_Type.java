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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralLiabilityLineBusiness_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralLiabilityLineBusiness_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{}PCLINEBUSINESS">
 *       &lt;sequence>
 *         &lt;element ref="{}Deductible" minOccurs="0"/>
 *         &lt;element ref="{}LiabilityInfo"/>
 *         &lt;element ref="{}ProductCompletedOpsInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}StateSupplementInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}QuestionAnswer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}EquipmentInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}SponsorUnderwritingInfo" minOccurs="0"/>
 *         &lt;element ref="{}MedicalProfessionalInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralLiabilityLineBusiness_Type", propOrder = {
    "deductible",
    "liabilityInfo",
    "productCompletedOpsInfo",
    "stateSupplementInfo",
    "questionAnswer",
    "equipmentInfo",
    "sponsorUnderwritingInfo",
    "medicalProfessionalInfo"
})
@XmlSeeAlso({
    ComHanover_GeneralLiabilityLineBusiness_Type.class
})
public class GeneralLiabilityLineBusiness_Type
    extends PCLINEBUSINESS
{

    @XmlElement(name = "Deductible")
    protected Deductible_Type deductible;
    @XmlElement(name = "LiabilityInfo", required = true)
    protected ComHanover_LiabilityInfo_Type liabilityInfo;
    @XmlElement(name = "ProductCompletedOpsInfo")
    protected List<ProductCompletedOpsInfo_Type> productCompletedOpsInfo;
    @XmlElement(name = "StateSupplementInfo")
    protected List<StateSupplementInfo_Type> stateSupplementInfo;
    @XmlElement(name = "QuestionAnswer")
    protected List<ComHanover_QuestionAnswer_Type> questionAnswer;
    @XmlElement(name = "EquipmentInfo")
    protected List<EquipmentInfo_Type> equipmentInfo;
    @XmlElement(name = "SponsorUnderwritingInfo")
    protected SponsorUnderwritingInfo_Type sponsorUnderwritingInfo;
    @XmlElement(name = "MedicalProfessionalInfo")
    protected MedicalProfessionalInfo_Type medicalProfessionalInfo;

    /**
     * Gets the value of the deductible property.
     * 
     * @return
     *     possible object is
     *     {@link Deductible_Type }
     *     
     */
    public Deductible_Type getDeductible() {
        return deductible;
    }

    /**
     * Sets the value of the deductible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Deductible_Type }
     *     
     */
    public void setDeductible(Deductible_Type value) {
        this.deductible = value;
    }

    /**
     * Gets the value of the liabilityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ComHanover_LiabilityInfo_Type }
     *     
     */
    public ComHanover_LiabilityInfo_Type getLiabilityInfo() {
        return liabilityInfo;
    }

    /**
     * Sets the value of the liabilityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComHanover_LiabilityInfo_Type }
     *     
     */
    public void setLiabilityInfo(ComHanover_LiabilityInfo_Type value) {
        this.liabilityInfo = value;
    }

    /**
     * Gets the value of the productCompletedOpsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCompletedOpsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCompletedOpsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCompletedOpsInfo_Type }
     * 
     * 
     */
    public List<ProductCompletedOpsInfo_Type> getProductCompletedOpsInfo() {
        if (productCompletedOpsInfo == null) {
            productCompletedOpsInfo = new ArrayList<ProductCompletedOpsInfo_Type>();
        }
        return this.productCompletedOpsInfo;
    }

    /**
     * Gets the value of the stateSupplementInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateSupplementInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStateSupplementInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StateSupplementInfo_Type }
     * 
     * 
     */
    public List<StateSupplementInfo_Type> getStateSupplementInfo() {
        if (stateSupplementInfo == null) {
            stateSupplementInfo = new ArrayList<StateSupplementInfo_Type>();
        }
        return this.stateSupplementInfo;
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
     * Gets the value of the equipmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentInfo_Type }
     * 
     * 
     */
    public List<EquipmentInfo_Type> getEquipmentInfo() {
        if (equipmentInfo == null) {
            equipmentInfo = new ArrayList<EquipmentInfo_Type>();
        }
        return this.equipmentInfo;
    }

    /**
     * Gets the value of the sponsorUnderwritingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SponsorUnderwritingInfo_Type }
     *     
     */
    public SponsorUnderwritingInfo_Type getSponsorUnderwritingInfo() {
        return sponsorUnderwritingInfo;
    }

    /**
     * Sets the value of the sponsorUnderwritingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SponsorUnderwritingInfo_Type }
     *     
     */
    public void setSponsorUnderwritingInfo(SponsorUnderwritingInfo_Type value) {
        this.sponsorUnderwritingInfo = value;
    }

    /**
     * Gets the value of the medicalProfessionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MedicalProfessionalInfo_Type }
     *     
     */
    public MedicalProfessionalInfo_Type getMedicalProfessionalInfo() {
        return medicalProfessionalInfo;
    }

    /**
     * Sets the value of the medicalProfessionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalProfessionalInfo_Type }
     *     
     */
    public void setMedicalProfessionalInfo(MedicalProfessionalInfo_Type value) {
        this.medicalProfessionalInfo = value;
    }

}
