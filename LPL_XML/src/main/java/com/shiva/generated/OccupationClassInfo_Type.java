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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for OccupationClassInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OccupationClassInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}OccupationClassCd" minOccurs="0"/>
 *         &lt;element ref="{}NumEmployees" minOccurs="0"/>
 *         &lt;element ref="{}BlanketInd" minOccurs="0"/>
 *         &lt;element ref="{}CommlCoverage" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "OccupationClassInfo_Type", propOrder = {
    "occupationClassCd",
    "numEmployees",
    "blanketInd",
    "commlCoverage"
})
public class OccupationClassInfo_Type {

    @XmlElement(name = "OccupationClassCd")
    protected OccupationClass occupationClassCd;
    @XmlElement(name = "NumEmployees")
    protected Long numEmployees;
    @XmlElement(name = "BlanketInd")
    protected Boolean blanketInd;
    @XmlElement(name = "CommlCoverage")
    protected List<ComHanover_CommlCoverage_Type> commlCoverage;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the occupationClassCd property.
     * 
     * @return
     *     possible object is
     *     {@link OccupationClass }
     *     
     */
    public OccupationClass getOccupationClassCd() {
        return occupationClassCd;
    }

    /**
     * Sets the value of the occupationClassCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupationClass }
     *     
     */
    public void setOccupationClassCd(OccupationClass value) {
        this.occupationClassCd = value;
    }

    /**
     * Gets the value of the numEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumEmployees() {
        return numEmployees;
    }

    /**
     * Sets the value of the numEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumEmployees(Long value) {
        this.numEmployees = value;
    }

    /**
     * Gets the value of the blanketInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getBlanketInd() {
        return blanketInd;
    }

    /**
     * Sets the value of the blanketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlanketInd(Boolean value) {
        this.blanketInd = value;
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
