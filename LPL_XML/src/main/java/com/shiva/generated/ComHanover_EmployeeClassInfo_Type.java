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
 * <p>Java class for com.hanover_EmployeeClassInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.hanover_EmployeeClassInfo_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{}EmployeeClassInfo_Type">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{}com.hanover_NumEmployees" minOccurs="0"/>
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
@XmlType(name = "com.hanover_EmployeeClassInfo_Type", propOrder = {
    "comHanover_NumEmployees",
    "comHanover_NumEmployeesPrior",
    "comHanover_NumEmployeesPctChg"
})
public class ComHanover_EmployeeClassInfo_Type
    extends EmployeeClassInfo_Type
{

    @XmlElement(name = "com.hanover_NumEmployees")
    protected Decimal comHanover_NumEmployees;
    @XmlElement(name = "com.hanover_NumEmployeesPrior")
    protected Decimal comHanover_NumEmployeesPrior;
    @XmlElement(name = "com.hanover_NumEmployeesPctChg")
    protected PercentDecimal comHanover_NumEmployeesPctChg;

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
