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
 * <p>Java class for MilitaryServiceInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MilitaryServiceInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}MilitaryBranchCd" minOccurs="0"/>
 *         &lt;element ref="{}MilitaryRankDesc" minOccurs="0"/>
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
@XmlType(name = "MilitaryServiceInfo_Type", propOrder = {
    "militaryBranchCd",
    "militaryRankDesc"
})
public class MilitaryServiceInfo_Type {

    @XmlElement(name = "MilitaryBranchCd")
    protected OpenEnum militaryBranchCd;
    @XmlElement(name = "MilitaryRankDesc")
    protected C30 militaryRankDesc;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the militaryBranchCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getMilitaryBranchCd() {
        return militaryBranchCd;
    }

    /**
     * Sets the value of the militaryBranchCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setMilitaryBranchCd(OpenEnum value) {
        this.militaryBranchCd = value;
    }

    /**
     * Gets the value of the militaryRankDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C30 }
     *     
     */
    public C30 getMilitaryRankDesc() {
        return militaryRankDesc;
    }

    /**
     * Sets the value of the militaryRankDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C30 }
     *     
     */
    public void setMilitaryRankDesc(C30 value) {
        this.militaryRankDesc = value;
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
