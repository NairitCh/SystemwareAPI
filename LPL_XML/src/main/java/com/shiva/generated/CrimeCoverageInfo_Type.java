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
 * <p>Java class for CrimeCoverageInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrimeCoverageInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}CrimePlanCd" minOccurs="0"/>
 *         &lt;element ref="{}CrimeCoverageDetails" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "CrimeCoverageInfo_Type", propOrder = {
    "crimePlanCd",
    "crimeCoverageDetails"
})
public class CrimeCoverageInfo_Type {

    @XmlElement(name = "CrimePlanCd")
    protected Coverages crimePlanCd;
    @XmlElement(name = "CrimeCoverageDetails")
    protected List<CrimeCoverageDetails_Type> crimeCoverageDetails;
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
     * Gets the value of the crimePlanCd property.
     * 
     * @return
     *     possible object is
     *     {@link Coverages }
     *     
     */
    public Coverages getCrimePlanCd() {
        return crimePlanCd;
    }

    /**
     * Sets the value of the crimePlanCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coverages }
     *     
     */
    public void setCrimePlanCd(Coverages value) {
        this.crimePlanCd = value;
    }

    /**
     * Gets the value of the crimeCoverageDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crimeCoverageDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrimeCoverageDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrimeCoverageDetails_Type }
     * 
     * 
     */
    public List<CrimeCoverageDetails_Type> getCrimeCoverageDetails() {
        if (crimeCoverageDetails == null) {
            crimeCoverageDetails = new ArrayList<CrimeCoverageDetails_Type>();
        }
        return this.crimeCoverageDetails;
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
