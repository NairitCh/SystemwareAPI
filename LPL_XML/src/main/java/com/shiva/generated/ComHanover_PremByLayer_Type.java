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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for com.hanover_PremByLayer_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.hanover_PremByLayer_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}com.hanover_LayerCd"/>
 *         &lt;element ref="{}com.hanover_CalcPremAmt" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_EnteredPremAmt" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.hanover_PremByLayer_Type", propOrder = {
    "comHanover_LayerCd",
    "comHanover_CalcPremAmt",
    "comHanover_EnteredPremAmt"
})
public class ComHanover_PremByLayer_Type {

    @XmlElement(name = "com.hanover_LayerCd", required = true)
    protected String comHanover_LayerCd;
    @XmlElement(name = "com.hanover_CalcPremAmt")
    protected CURRENCY comHanover_CalcPremAmt;
    @XmlElement(name = "com.hanover_EnteredPremAmt")
    protected CURRENCY comHanover_EnteredPremAmt;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anySimpleType")
    protected String id;

    /**
     * Gets the value of the comHanover_LayerCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComHanover_LayerCd() {
        return comHanover_LayerCd;
    }

    /**
     * Sets the value of the comHanover_LayerCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComHanover_LayerCd(String value) {
        this.comHanover_LayerCd = value;
    }

    /**
     * Gets the value of the comHanover_CalcPremAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getComHanover_CalcPremAmt() {
        return comHanover_CalcPremAmt;
    }

    /**
     * Sets the value of the comHanover_CalcPremAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setComHanover_CalcPremAmt(CURRENCY value) {
        this.comHanover_CalcPremAmt = value;
    }

    /**
     * Gets the value of the comHanover_EnteredPremAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getComHanover_EnteredPremAmt() {
        return comHanover_EnteredPremAmt;
    }

    /**
     * Sets the value of the comHanover_EnteredPremAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setComHanover_EnteredPremAmt(CURRENCY value) {
        this.comHanover_EnteredPremAmt = value;
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
