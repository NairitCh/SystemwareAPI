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
 * <p>Java class for CrimeLineBusiness_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrimeLineBusiness_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{}PCLINEBUSINESS">
 *       &lt;sequence>
 *         &lt;element ref="{}CurrentRetroactiveDt" minOccurs="0"/>
 *         &lt;element ref="{}ProposedRetroactiveDt" minOccurs="0"/>
 *         &lt;element ref="{}CrimeCoverageInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}EmployeeBenefitPlanInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}EmployeeClassInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ClassCd" minOccurs="0"/>
 *         &lt;element ref="{}NumRetailLocations" minOccurs="0"/>
 *         &lt;element ref="{}NumLocations" minOccurs="0"/>
 *         &lt;element ref="{}QuestionAnswer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}CrimeInfo" minOccurs="0"/>
 *         &lt;element ref="{}NumVolunteers" minOccurs="0"/>
 *         &lt;element ref="{}NumEmployeesLeasedToOthers" minOccurs="0"/>
 *         &lt;element ref="{}NumEmployeesLeasedFromOthers" minOccurs="0"/>
 *         &lt;element ref="{}EmployeeBenefitPlanTotalAssetAmt" minOccurs="0"/>
 *         &lt;element ref="{}CrimeSchedule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}CrimeMoneyAndSecurities" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}CommlCoverage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrimeLineBusiness_Type", propOrder = {
    "currentRetroactiveDt",
    "proposedRetroactiveDt",
    "crimeCoverageInfo",
    "employeeBenefitPlanInfo",
    "employeeClassInfo",
    "classCd",
    "numRetailLocations",
    "numLocations",
    "questionAnswer",
    "crimeInfo",
    "numVolunteers",
    "numEmployeesLeasedToOthers",
    "numEmployeesLeasedFromOthers",
    "employeeBenefitPlanTotalAssetAmt",
    "crimeSchedule",
    "crimeMoneyAndSecurities",
    "commlCoverage"
})
@XmlSeeAlso({
    ComHanover_CrimeLineBusiness_Type.class
})
public class CrimeLineBusiness_Type
    extends PCLINEBUSINESS
{

    @XmlElement(name = "CurrentRetroactiveDt")
    protected Date currentRetroactiveDt;
    @XmlElement(name = "ProposedRetroactiveDt")
    protected Date proposedRetroactiveDt;
    @XmlElement(name = "CrimeCoverageInfo")
    protected List<CrimeCoverageInfo_Type> crimeCoverageInfo;
    @XmlElement(name = "EmployeeBenefitPlanInfo")
    protected List<ComHanover_EmployeeBenefitPlanInfo_Type> employeeBenefitPlanInfo;
    @XmlElement(name = "EmployeeClassInfo")
    protected List<ComHanover_EmployeeClassInfo_Type> employeeClassInfo;
    @XmlElement(name = "ClassCd")
    protected OpenEnum classCd;
    @XmlElement(name = "NumRetailLocations")
    protected Long numRetailLocations;
    @XmlElement(name = "NumLocations")
    protected Long numLocations;
    @XmlElement(name = "QuestionAnswer")
    protected List<ComHanover_QuestionAnswer_Type> questionAnswer;
    @XmlElement(name = "CrimeInfo")
    protected CrimeInfo_Type crimeInfo;
    @XmlElement(name = "NumVolunteers")
    protected Long numVolunteers;
    @XmlElement(name = "NumEmployeesLeasedToOthers")
    protected Long numEmployeesLeasedToOthers;
    @XmlElement(name = "NumEmployeesLeasedFromOthers")
    protected Long numEmployeesLeasedFromOthers;
    @XmlElement(name = "EmployeeBenefitPlanTotalAssetAmt")
    protected CURRENCY employeeBenefitPlanTotalAssetAmt;
    @XmlElement(name = "CrimeSchedule")
    protected List<CrimeSchedule_Type> crimeSchedule;
    @XmlElement(name = "CrimeMoneyAndSecurities")
    protected List<ComHanover_CrimeMoneyAndSecurities_Type> crimeMoneyAndSecurities;
    @XmlElement(name = "CommlCoverage")
    protected List<ComHanover_CommlCoverage_Type> commlCoverage;

    /**
     * Gets the value of the currentRetroactiveDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getCurrentRetroactiveDt() {
        return currentRetroactiveDt;
    }

    /**
     * Sets the value of the currentRetroactiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setCurrentRetroactiveDt(Date value) {
        this.currentRetroactiveDt = value;
    }

    /**
     * Gets the value of the proposedRetroactiveDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getProposedRetroactiveDt() {
        return proposedRetroactiveDt;
    }

    /**
     * Sets the value of the proposedRetroactiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setProposedRetroactiveDt(Date value) {
        this.proposedRetroactiveDt = value;
    }

    /**
     * Gets the value of the crimeCoverageInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crimeCoverageInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrimeCoverageInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrimeCoverageInfo_Type }
     * 
     * 
     */
    public List<CrimeCoverageInfo_Type> getCrimeCoverageInfo() {
        if (crimeCoverageInfo == null) {
            crimeCoverageInfo = new ArrayList<CrimeCoverageInfo_Type>();
        }
        return this.crimeCoverageInfo;
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
     * Gets the value of the employeeClassInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeClassInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeClassInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComHanover_EmployeeClassInfo_Type }
     * 
     * 
     */
    public List<ComHanover_EmployeeClassInfo_Type> getEmployeeClassInfo() {
        if (employeeClassInfo == null) {
            employeeClassInfo = new ArrayList<ComHanover_EmployeeClassInfo_Type>();
        }
        return this.employeeClassInfo;
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
     * Gets the value of the numRetailLocations property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumRetailLocations() {
        return numRetailLocations;
    }

    /**
     * Sets the value of the numRetailLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumRetailLocations(Long value) {
        this.numRetailLocations = value;
    }

    /**
     * Gets the value of the numLocations property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumLocations() {
        return numLocations;
    }

    /**
     * Sets the value of the numLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumLocations(Long value) {
        this.numLocations = value;
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
     * Gets the value of the crimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CrimeInfo_Type }
     *     
     */
    public CrimeInfo_Type getCrimeInfo() {
        return crimeInfo;
    }

    /**
     * Sets the value of the crimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrimeInfo_Type }
     *     
     */
    public void setCrimeInfo(CrimeInfo_Type value) {
        this.crimeInfo = value;
    }

    /**
     * Gets the value of the numVolunteers property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumVolunteers() {
        return numVolunteers;
    }

    /**
     * Sets the value of the numVolunteers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumVolunteers(Long value) {
        this.numVolunteers = value;
    }

    /**
     * Gets the value of the numEmployeesLeasedToOthers property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumEmployeesLeasedToOthers() {
        return numEmployeesLeasedToOthers;
    }

    /**
     * Sets the value of the numEmployeesLeasedToOthers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumEmployeesLeasedToOthers(Long value) {
        this.numEmployeesLeasedToOthers = value;
    }

    /**
     * Gets the value of the numEmployeesLeasedFromOthers property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumEmployeesLeasedFromOthers() {
        return numEmployeesLeasedFromOthers;
    }

    /**
     * Sets the value of the numEmployeesLeasedFromOthers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumEmployeesLeasedFromOthers(Long value) {
        this.numEmployeesLeasedFromOthers = value;
    }

    /**
     * Gets the value of the employeeBenefitPlanTotalAssetAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getEmployeeBenefitPlanTotalAssetAmt() {
        return employeeBenefitPlanTotalAssetAmt;
    }

    /**
     * Sets the value of the employeeBenefitPlanTotalAssetAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setEmployeeBenefitPlanTotalAssetAmt(CURRENCY value) {
        this.employeeBenefitPlanTotalAssetAmt = value;
    }

    /**
     * Gets the value of the crimeSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crimeSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrimeSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrimeSchedule_Type }
     * 
     * 
     */
    public List<CrimeSchedule_Type> getCrimeSchedule() {
        if (crimeSchedule == null) {
            crimeSchedule = new ArrayList<CrimeSchedule_Type>();
        }
        return this.crimeSchedule;
    }

    /**
     * Gets the value of the crimeMoneyAndSecurities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crimeMoneyAndSecurities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrimeMoneyAndSecurities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComHanover_CrimeMoneyAndSecurities_Type }
     * 
     * 
     */
    public List<ComHanover_CrimeMoneyAndSecurities_Type> getCrimeMoneyAndSecurities() {
        if (crimeMoneyAndSecurities == null) {
            crimeMoneyAndSecurities = new ArrayList<ComHanover_CrimeMoneyAndSecurities_Type>();
        }
        return this.crimeMoneyAndSecurities;
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

}