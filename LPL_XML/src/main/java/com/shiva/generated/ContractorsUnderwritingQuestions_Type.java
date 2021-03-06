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
 * <p>Java class for ContractorsUnderwritingQuestions_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractorsUnderwritingQuestions_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}NumEmployeesFullTime" minOccurs="0"/>
 *         &lt;element ref="{}NumEmployeesPartTime" minOccurs="0"/>
 *         &lt;element ref="{}SubcontractedWorkPct" minOccurs="0"/>
 *         &lt;element ref="{}WorkContractedShortDesc" minOccurs="0"/>
 *         &lt;element ref="{}PaidToSubcontractorsAmt" minOccurs="0"/>
 *         &lt;element ref="{}QuestionAnswer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}AgreementDesc" minOccurs="0"/>
 *         &lt;element ref="{}WorkContractedCd" minOccurs="0"/>
 *         &lt;element ref="{}OperationsRoleCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}OperationsDesc" minOccurs="0"/>
 *         &lt;element ref="{}CommlExperience" minOccurs="0"/>
 *         &lt;element ref="{}MaximumExcavationDepth" minOccurs="0"/>
 *         &lt;element ref="{}PaintingInsidePct" minOccurs="0"/>
 *         &lt;element ref="{}PaintingOutsidePct" minOccurs="0"/>
 *         &lt;element ref="{}RoofingPct" minOccurs="0"/>
 *         &lt;element ref="{}RenovationPct" minOccurs="0"/>
 *         &lt;element ref="{}GradingPct" minOccurs="0"/>
 *         &lt;element ref="{}TreeTrimmingPct" minOccurs="0"/>
 *         &lt;element ref="{}SnowPlowingPct" minOccurs="0"/>
 *         &lt;element ref="{}EmployeeOversightRadius" minOccurs="0"/>
 *         &lt;element ref="{}ScaffoldingHeight" minOccurs="0"/>
 *         &lt;element ref="{}ExteriorSprayPct" minOccurs="0"/>
 *         &lt;element ref="{}CommlRoofingPct" minOccurs="0"/>
 *         &lt;element ref="{}ResidentialRoofingPct" minOccurs="0"/>
 *         &lt;element ref="{}ResidentialPct" minOccurs="0"/>
 *         &lt;element ref="{}CommlPct" minOccurs="0"/>
 *         &lt;element ref="{}NewConstructionPct" minOccurs="0"/>
 *         &lt;element ref="{}RemodelingPct" minOccurs="0"/>
 *         &lt;element ref="{}SubContractorMinimumOccurenceLimit" minOccurs="0"/>
 *         &lt;element ref="{}SubContractorMinimumAggregateLimit" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OtherOrPriorPolicyRef" type="{}IDREF" />
 *       &lt;attribute name="id" type="{}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractorsUnderwritingQuestions_Type", propOrder = {
    "numEmployeesFullTime",
    "numEmployeesPartTime",
    "subcontractedWorkPct",
    "workContractedShortDesc",
    "paidToSubcontractorsAmt",
    "questionAnswer",
    "agreementDesc",
    "workContractedCd",
    "operationsRoleCd",
    "operationsDesc",
    "commlExperience",
    "maximumExcavationDepth",
    "paintingInsidePct",
    "paintingOutsidePct",
    "roofingPct",
    "renovationPct",
    "gradingPct",
    "treeTrimmingPct",
    "snowPlowingPct",
    "employeeOversightRadius",
    "scaffoldingHeight",
    "exteriorSprayPct",
    "commlRoofingPct",
    "residentialRoofingPct",
    "residentialPct",
    "commlPct",
    "newConstructionPct",
    "remodelingPct",
    "subContractorMinimumOccurenceLimit",
    "subContractorMinimumAggregateLimit"
})
public class ContractorsUnderwritingQuestions_Type {

    @XmlElement(name = "NumEmployeesFullTime")
    protected Long numEmployeesFullTime;
    @XmlElement(name = "NumEmployeesPartTime")
    protected Long numEmployeesPartTime;
    @XmlElement(name = "SubcontractedWorkPct")
    protected PercentLong subcontractedWorkPct;
    @XmlElement(name = "WorkContractedShortDesc")
    protected C255 workContractedShortDesc;
    @XmlElement(name = "PaidToSubcontractorsAmt")
    protected CURRENCY paidToSubcontractorsAmt;
    @XmlElement(name = "QuestionAnswer")
    protected List<ComHanover_QuestionAnswer_Type> questionAnswer;
    @XmlElement(name = "AgreementDesc")
    protected CInfinite agreementDesc;
    @XmlElement(name = "WorkContractedCd")
    protected WorkContracted workContractedCd;
    @XmlElement(name = "OperationsRoleCd")
    protected List<NatureOperations> operationsRoleCd;
    @XmlElement(name = "OperationsDesc")
    protected C255 operationsDesc;
    @XmlElement(name = "CommlExperience")
    protected MEASUREMENT commlExperience;
    @XmlElement(name = "MaximumExcavationDepth")
    protected MEASUREMENT maximumExcavationDepth;
    @XmlElement(name = "PaintingInsidePct")
    protected PercentLong paintingInsidePct;
    @XmlElement(name = "PaintingOutsidePct")
    protected PercentLong paintingOutsidePct;
    @XmlElement(name = "RoofingPct")
    protected PercentLong roofingPct;
    @XmlElement(name = "RenovationPct")
    protected PercentLong renovationPct;
    @XmlElement(name = "GradingPct")
    protected PercentLong gradingPct;
    @XmlElement(name = "TreeTrimmingPct")
    protected PercentLong treeTrimmingPct;
    @XmlElement(name = "SnowPlowingPct")
    protected PercentLong snowPlowingPct;
    @XmlElement(name = "EmployeeOversightRadius")
    protected MEASUREMENT employeeOversightRadius;
    @XmlElement(name = "ScaffoldingHeight")
    protected MEASUREMENT scaffoldingHeight;
    @XmlElement(name = "ExteriorSprayPct")
    protected PercentLong exteriorSprayPct;
    @XmlElement(name = "CommlRoofingPct")
    protected PercentLong commlRoofingPct;
    @XmlElement(name = "ResidentialRoofingPct")
    protected PercentLong residentialRoofingPct;
    @XmlElement(name = "ResidentialPct")
    protected PercentLong residentialPct;
    @XmlElement(name = "CommlPct")
    protected PercentLong commlPct;
    @XmlElement(name = "NewConstructionPct")
    protected PercentLong newConstructionPct;
    @XmlElement(name = "RemodelingPct")
    protected PercentLong remodelingPct;
    @XmlElement(name = "SubContractorMinimumOccurenceLimit")
    protected FORMATTEDNUMBER subContractorMinimumOccurenceLimit;
    @XmlElement(name = "SubContractorMinimumAggregateLimit")
    protected FORMATTEDNUMBER subContractorMinimumAggregateLimit;
    @XmlAttribute(name = "OtherOrPriorPolicyRef")
    @XmlIDREF
    protected Object otherOrPriorPolicyRef;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

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
     * Gets the value of the subcontractedWorkPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getSubcontractedWorkPct() {
        return subcontractedWorkPct;
    }

    /**
     * Sets the value of the subcontractedWorkPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setSubcontractedWorkPct(PercentLong value) {
        this.subcontractedWorkPct = value;
    }

    /**
     * Gets the value of the workContractedShortDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getWorkContractedShortDesc() {
        return workContractedShortDesc;
    }

    /**
     * Sets the value of the workContractedShortDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setWorkContractedShortDesc(C255 value) {
        this.workContractedShortDesc = value;
    }

    /**
     * Gets the value of the paidToSubcontractorsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getPaidToSubcontractorsAmt() {
        return paidToSubcontractorsAmt;
    }

    /**
     * Sets the value of the paidToSubcontractorsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setPaidToSubcontractorsAmt(CURRENCY value) {
        this.paidToSubcontractorsAmt = value;
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
     * Gets the value of the agreementDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CInfinite }
     *     
     */
    public CInfinite getAgreementDesc() {
        return agreementDesc;
    }

    /**
     * Sets the value of the agreementDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInfinite }
     *     
     */
    public void setAgreementDesc(CInfinite value) {
        this.agreementDesc = value;
    }

    /**
     * Gets the value of the workContractedCd property.
     * 
     * @return
     *     possible object is
     *     {@link WorkContracted }
     *     
     */
    public WorkContracted getWorkContractedCd() {
        return workContractedCd;
    }

    /**
     * Sets the value of the workContractedCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkContracted }
     *     
     */
    public void setWorkContractedCd(WorkContracted value) {
        this.workContractedCd = value;
    }

    /**
     * Gets the value of the operationsRoleCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsRoleCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsRoleCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NatureOperations }
     * 
     * 
     */
    public List<NatureOperations> getOperationsRoleCd() {
        if (operationsRoleCd == null) {
            operationsRoleCd = new ArrayList<NatureOperations>();
        }
        return this.operationsRoleCd;
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
     * Gets the value of the commlExperience property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getCommlExperience() {
        return commlExperience;
    }

    /**
     * Sets the value of the commlExperience property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setCommlExperience(MEASUREMENT value) {
        this.commlExperience = value;
    }

    /**
     * Gets the value of the maximumExcavationDepth property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getMaximumExcavationDepth() {
        return maximumExcavationDepth;
    }

    /**
     * Sets the value of the maximumExcavationDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setMaximumExcavationDepth(MEASUREMENT value) {
        this.maximumExcavationDepth = value;
    }

    /**
     * Gets the value of the paintingInsidePct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getPaintingInsidePct() {
        return paintingInsidePct;
    }

    /**
     * Sets the value of the paintingInsidePct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setPaintingInsidePct(PercentLong value) {
        this.paintingInsidePct = value;
    }

    /**
     * Gets the value of the paintingOutsidePct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getPaintingOutsidePct() {
        return paintingOutsidePct;
    }

    /**
     * Sets the value of the paintingOutsidePct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setPaintingOutsidePct(PercentLong value) {
        this.paintingOutsidePct = value;
    }

    /**
     * Gets the value of the roofingPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getRoofingPct() {
        return roofingPct;
    }

    /**
     * Sets the value of the roofingPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setRoofingPct(PercentLong value) {
        this.roofingPct = value;
    }

    /**
     * Gets the value of the renovationPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getRenovationPct() {
        return renovationPct;
    }

    /**
     * Sets the value of the renovationPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setRenovationPct(PercentLong value) {
        this.renovationPct = value;
    }

    /**
     * Gets the value of the gradingPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getGradingPct() {
        return gradingPct;
    }

    /**
     * Sets the value of the gradingPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setGradingPct(PercentLong value) {
        this.gradingPct = value;
    }

    /**
     * Gets the value of the treeTrimmingPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getTreeTrimmingPct() {
        return treeTrimmingPct;
    }

    /**
     * Sets the value of the treeTrimmingPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setTreeTrimmingPct(PercentLong value) {
        this.treeTrimmingPct = value;
    }

    /**
     * Gets the value of the snowPlowingPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getSnowPlowingPct() {
        return snowPlowingPct;
    }

    /**
     * Sets the value of the snowPlowingPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setSnowPlowingPct(PercentLong value) {
        this.snowPlowingPct = value;
    }

    /**
     * Gets the value of the employeeOversightRadius property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getEmployeeOversightRadius() {
        return employeeOversightRadius;
    }

    /**
     * Sets the value of the employeeOversightRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setEmployeeOversightRadius(MEASUREMENT value) {
        this.employeeOversightRadius = value;
    }

    /**
     * Gets the value of the scaffoldingHeight property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getScaffoldingHeight() {
        return scaffoldingHeight;
    }

    /**
     * Sets the value of the scaffoldingHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setScaffoldingHeight(MEASUREMENT value) {
        this.scaffoldingHeight = value;
    }

    /**
     * Gets the value of the exteriorSprayPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getExteriorSprayPct() {
        return exteriorSprayPct;
    }

    /**
     * Sets the value of the exteriorSprayPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setExteriorSprayPct(PercentLong value) {
        this.exteriorSprayPct = value;
    }

    /**
     * Gets the value of the commlRoofingPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getCommlRoofingPct() {
        return commlRoofingPct;
    }

    /**
     * Sets the value of the commlRoofingPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setCommlRoofingPct(PercentLong value) {
        this.commlRoofingPct = value;
    }

    /**
     * Gets the value of the residentialRoofingPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getResidentialRoofingPct() {
        return residentialRoofingPct;
    }

    /**
     * Sets the value of the residentialRoofingPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setResidentialRoofingPct(PercentLong value) {
        this.residentialRoofingPct = value;
    }

    /**
     * Gets the value of the residentialPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getResidentialPct() {
        return residentialPct;
    }

    /**
     * Sets the value of the residentialPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setResidentialPct(PercentLong value) {
        this.residentialPct = value;
    }

    /**
     * Gets the value of the commlPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getCommlPct() {
        return commlPct;
    }

    /**
     * Sets the value of the commlPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setCommlPct(PercentLong value) {
        this.commlPct = value;
    }

    /**
     * Gets the value of the newConstructionPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getNewConstructionPct() {
        return newConstructionPct;
    }

    /**
     * Sets the value of the newConstructionPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setNewConstructionPct(PercentLong value) {
        this.newConstructionPct = value;
    }

    /**
     * Gets the value of the remodelingPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getRemodelingPct() {
        return remodelingPct;
    }

    /**
     * Sets the value of the remodelingPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setRemodelingPct(PercentLong value) {
        this.remodelingPct = value;
    }

    /**
     * Gets the value of the subContractorMinimumOccurenceLimit property.
     * 
     * @return
     *     possible object is
     *     {@link FORMATTEDNUMBER }
     *     
     */
    public FORMATTEDNUMBER getSubContractorMinimumOccurenceLimit() {
        return subContractorMinimumOccurenceLimit;
    }

    /**
     * Sets the value of the subContractorMinimumOccurenceLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link FORMATTEDNUMBER }
     *     
     */
    public void setSubContractorMinimumOccurenceLimit(FORMATTEDNUMBER value) {
        this.subContractorMinimumOccurenceLimit = value;
    }

    /**
     * Gets the value of the subContractorMinimumAggregateLimit property.
     * 
     * @return
     *     possible object is
     *     {@link FORMATTEDNUMBER }
     *     
     */
    public FORMATTEDNUMBER getSubContractorMinimumAggregateLimit() {
        return subContractorMinimumAggregateLimit;
    }

    /**
     * Sets the value of the subContractorMinimumAggregateLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link FORMATTEDNUMBER }
     *     
     */
    public void setSubContractorMinimumAggregateLimit(FORMATTEDNUMBER value) {
        this.subContractorMinimumAggregateLimit = value;
    }

    /**
     * Gets the value of the otherOrPriorPolicyRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOtherOrPriorPolicyRef() {
        return otherOrPriorPolicyRef;
    }

    /**
     * Sets the value of the otherOrPriorPolicyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOtherOrPriorPolicyRef(Object value) {
        this.otherOrPriorPolicyRef = value;
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
