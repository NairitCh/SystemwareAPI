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
 * <p>Java class for LapsePeriod_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LapsePeriod_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}EffectiveDt" minOccurs="0"/>
 *         &lt;element ref="{}ExpirationDt" minOccurs="0"/>
 *         &lt;element ref="{}NumDaysLapse" minOccurs="0"/>
 *         &lt;element ref="{}LapseTypeCd" minOccurs="0"/>
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
@XmlType(name = "LapsePeriod_Type", propOrder = {
    "effectiveDt",
    "expirationDt",
    "numDaysLapse",
    "lapseTypeCd"
})
public class LapsePeriod_Type {

    @XmlElement(name = "EffectiveDt")
    protected Date effectiveDt;
    @XmlElement(name = "ExpirationDt")
    protected Date expirationDt;
    @XmlElement(name = "NumDaysLapse")
    protected Long numDaysLapse;
    @XmlElement(name = "LapseTypeCd")
    protected OpenEnum lapseTypeCd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the effectiveDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getEffectiveDt() {
        return effectiveDt;
    }

    /**
     * Sets the value of the effectiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setEffectiveDt(Date value) {
        this.effectiveDt = value;
    }

    /**
     * Gets the value of the expirationDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getExpirationDt() {
        return expirationDt;
    }

    /**
     * Sets the value of the expirationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setExpirationDt(Date value) {
        this.expirationDt = value;
    }

    /**
     * Gets the value of the numDaysLapse property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumDaysLapse() {
        return numDaysLapse;
    }

    /**
     * Sets the value of the numDaysLapse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumDaysLapse(Long value) {
        this.numDaysLapse = value;
    }

    /**
     * Gets the value of the lapseTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getLapseTypeCd() {
        return lapseTypeCd;
    }

    /**
     * Sets the value of the lapseTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setLapseTypeCd(OpenEnum value) {
        this.lapseTypeCd = value;
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
