//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.01 at 09:59:34 AM IST 
//


package com.shiva.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for com.hanover_EmployeeCountInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.hanover_EmployeeCountInfo_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{}EmployeeCountInfo_Type">
 *       &lt;sequence>
 *         &lt;element ref="{}com.hanover_EmployeeTurnoverPct" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_NumEmployees" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_NumEmpFullTimeNonProfessional" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_NumEmpPartTimeNonProfessional" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_NumNonAttorneyEmployees" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_NumEmployeesPrior" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_NumEmployeesPctChg" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.hanover_EmployeeCountInfo_Type", propOrder = {
    "comHanover_EmployeeTurnoverPct",
    "comHanover_NumEmployees",
    "comHanover_NumEmpFullTimeNonProfessional",
    "comHanover_NumEmpPartTimeNonProfessional",
    "comHanover_NumNonAttorneyEmployees",
    "comHanover_NumEmployeesPrior",
    "comHanover_NumEmployeesPctChg"
})
public class ComHanover_EmployeeCountInfo_Type
    extends EmployeeCountInfo_Type
{

    @XmlElement(name = "com.hanover_EmployeeTurnoverPct")
    protected PercentLong comHanover_EmployeeTurnoverPct;
    @XmlElement(name = "com.hanover_NumEmployees")
    protected Decimal comHanover_NumEmployees;
    @XmlElement(name = "com.hanover_NumEmpFullTimeNonProfessional")
    protected Long comHanover_NumEmpFullTimeNonProfessional;
    @XmlElement(name = "com.hanover_NumEmpPartTimeNonProfessional")
    protected Long comHanover_NumEmpPartTimeNonProfessional;
    @XmlElement(name = "com.hanover_NumNonAttorneyEmployees")
    protected Long comHanover_NumNonAttorneyEmployees;
    @XmlElement(name = "com.hanover_NumEmployeesPrior")
    protected Decimal comHanover_NumEmployeesPrior;
    @XmlElement(name = "com.hanover_NumEmployeesPctChg")
    protected PercentDecimal comHanover_NumEmployeesPctChg;

    /**
     * Gets the value of the comHanover_EmployeeTurnoverPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getComHanover_EmployeeTurnoverPct() {
        return comHanover_EmployeeTurnoverPct;
    }

    /**
     * Sets the value of the comHanover_EmployeeTurnoverPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setComHanover_EmployeeTurnoverPct(PercentLong value) {
        this.comHanover_EmployeeTurnoverPct = value;
    }

    /**
     * Gets the value of the comHanover_NumEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getComHanover_NumEmployees() {
        return comHanover_NumEmployees;
    }

    /**
     * Sets the value of the comHanover_NumEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setComHanover_NumEmployees(Decimal value) {
        this.comHanover_NumEmployees = value;
    }

    /**
     * Gets the value of the comHanover_NumEmpFullTimeNonProfessional property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getComHanover_NumEmpFullTimeNonProfessional() {
        return comHanover_NumEmpFullTimeNonProfessional;
    }

    /**
     * Sets the value of the comHanover_NumEmpFullTimeNonProfessional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setComHanover_NumEmpFullTimeNonProfessional(Long value) {
        this.comHanover_NumEmpFullTimeNonProfessional = value;
    }

    /**
     * Gets the value of the comHanover_NumEmpPartTimeNonProfessional property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getComHanover_NumEmpPartTimeNonProfessional() {
        return comHanover_NumEmpPartTimeNonProfessional;
    }

    /**
     * Sets the value of the comHanover_NumEmpPartTimeNonProfessional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setComHanover_NumEmpPartTimeNonProfessional(Long value) {
        this.comHanover_NumEmpPartTimeNonProfessional = value;
    }

    /**
     * Gets the value of the comHanover_NumNonAttorneyEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getComHanover_NumNonAttorneyEmployees() {
        return comHanover_NumNonAttorneyEmployees;
    }

    /**
     * Sets the value of the comHanover_NumNonAttorneyEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setComHanover_NumNonAttorneyEmployees(Long value) {
        this.comHanover_NumNonAttorneyEmployees = value;
    }

    /**
     * Gets the value of the comHanover_NumEmployeesPrior property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getComHanover_NumEmployeesPrior() {
        return comHanover_NumEmployeesPrior;
    }

    /**
     * Sets the value of the comHanover_NumEmployeesPrior property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setComHanover_NumEmployeesPrior(Decimal value) {
        this.comHanover_NumEmployeesPrior = value;
    }

    /**
     * Gets the value of the comHanover_NumEmployeesPctChg property.
     * 
     * @return
     *     possible object is
     *     {@link PercentDecimal }
     *     
     */
    public PercentDecimal getComHanover_NumEmployeesPctChg() {
        return comHanover_NumEmployeesPctChg;
    }

    /**
     * Sets the value of the comHanover_NumEmployeesPctChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentDecimal }
     *     
     */
    public void setComHanover_NumEmployeesPctChg(PercentDecimal value) {
        this.comHanover_NumEmployeesPctChg = value;
    }

}
