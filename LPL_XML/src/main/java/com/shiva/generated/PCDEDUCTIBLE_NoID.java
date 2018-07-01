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
 * <p>Java class for PCDEDUCTIBLE_NoID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PCDEDUCTIBLE_NoID">
 *   &lt;complexContent>
 *     &lt;extension base="{}FORMATTEDNUMBER_NoID">
 *       &lt;sequence>
 *         &lt;element ref="{}DeductibleBasisCd" minOccurs="0"/>
 *         &lt;element ref="{}DeductibleTypeCd" minOccurs="0"/>
 *         &lt;element ref="{}DeductibleAppliesToCd" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PCDEDUCTIBLE_NoID", propOrder = {
    "deductibleBasisCd",
    "deductibleTypeCd",
    "deductibleAppliesToCd"
})
@XmlSeeAlso({
    PCDEDUCTIBLE.class
})
public class PCDEDUCTIBLE_NoID
    extends FORMATTEDNUMBER_NoID
{

    @XmlElement(name = "DeductibleBasisCd")
    protected DeductibleBasis deductibleBasisCd;
    @XmlElement(name = "DeductibleTypeCd")
    protected DeductibleType deductibleTypeCd;
    @XmlElement(name = "DeductibleAppliesToCd")
    protected List<DeductibleApplies> deductibleAppliesToCd;

    /**
     * Gets the value of the deductibleBasisCd property.
     * 
     * @return
     *     possible object is
     *     {@link DeductibleBasis }
     *     
     */
    public DeductibleBasis getDeductibleBasisCd() {
        return deductibleBasisCd;
    }

    /**
     * Sets the value of the deductibleBasisCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeductibleBasis }
     *     
     */
    public void setDeductibleBasisCd(DeductibleBasis value) {
        this.deductibleBasisCd = value;
    }

    /**
     * Gets the value of the deductibleTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link DeductibleType }
     *     
     */
    public DeductibleType getDeductibleTypeCd() {
        return deductibleTypeCd;
    }

    /**
     * Sets the value of the deductibleTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeductibleType }
     *     
     */
    public void setDeductibleTypeCd(DeductibleType value) {
        this.deductibleTypeCd = value;
    }

    /**
     * Gets the value of the deductibleAppliesToCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deductibleAppliesToCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeductibleAppliesToCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeductibleApplies }
     * 
     * 
     */
    public List<DeductibleApplies> getDeductibleAppliesToCd() {
        if (deductibleAppliesToCd == null) {
            deductibleAppliesToCd = new ArrayList<DeductibleApplies>();
        }
        return this.deductibleAppliesToCd;
    }

}
