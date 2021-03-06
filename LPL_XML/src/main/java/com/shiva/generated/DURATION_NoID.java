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
 * <p>Java class for DURATION_NoID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DURATION_NoID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}EffectiveDt" minOccurs="0"/>
 *         &lt;element ref="{}ExpirationDt" minOccurs="0"/>
 *         &lt;element ref="{}StartTime" minOccurs="0"/>
 *         &lt;element ref="{}EndTime" minOccurs="0"/>
 *         &lt;element ref="{}LocalStandardTimeInd" minOccurs="0"/>
 *         &lt;element ref="{}DurationPeriod" minOccurs="0"/>
 *         &lt;element ref="{}ContinuousInd" minOccurs="0"/>
 *         &lt;element ref="{}Description" minOccurs="0"/>
 *         &lt;element ref="{}GB.BothDaysInclusiveInd" minOccurs="0"/>
 *         &lt;element ref="{}LapsePeriod" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DURATION_NoID", propOrder = {
    "effectiveDt",
    "expirationDt",
    "startTime",
    "endTime",
    "localStandardTimeInd",
    "durationPeriod",
    "continuousInd",
    "description",
    "gbBothDaysInclusiveInd",
    "lapsePeriod"
})
@XmlSeeAlso({
    DURATION.class
})
public class DURATION_NoID {

    @XmlElement(name = "EffectiveDt")
    protected Date effectiveDt;
    @XmlElement(name = "ExpirationDt")
    protected Date expirationDt;
    @XmlElement(name = "StartTime")
    protected Time startTime;
    @XmlElement(name = "EndTime")
    protected Time endTime;
    @XmlElement(name = "LocalStandardTimeInd")
    protected Boolean localStandardTimeInd;
    @XmlElement(name = "DurationPeriod")
    protected MEASUREMENT durationPeriod;
    @XmlElement(name = "ContinuousInd")
    protected Boolean continuousInd;
    @XmlElement(name = "Description")
    protected C255 description;
    @XmlElement(name = "GB.BothDaysInclusiveInd")
    protected Boolean gbBothDaysInclusiveInd;
    @XmlElement(name = "LapsePeriod")
    protected List<LapsePeriod_Type> lapsePeriod;

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
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setStartTime(Time value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setEndTime(Time value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the localStandardTimeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLocalStandardTimeInd() {
        return localStandardTimeInd;
    }

    /**
     * Sets the value of the localStandardTimeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalStandardTimeInd(Boolean value) {
        this.localStandardTimeInd = value;
    }

    /**
     * Gets the value of the durationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getDurationPeriod() {
        return durationPeriod;
    }

    /**
     * Sets the value of the durationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setDurationPeriod(MEASUREMENT value) {
        this.durationPeriod = value;
    }

    /**
     * Gets the value of the continuousInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getContinuousInd() {
        return continuousInd;
    }

    /**
     * Sets the value of the continuousInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContinuousInd(Boolean value) {
        this.continuousInd = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setDescription(C255 value) {
        this.description = value;
    }

    /**
     * Gets the value of the gbBothDaysInclusiveInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getGBBothDaysInclusiveInd() {
        return gbBothDaysInclusiveInd;
    }

    /**
     * Sets the value of the gbBothDaysInclusiveInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGBBothDaysInclusiveInd(Boolean value) {
        this.gbBothDaysInclusiveInd = value;
    }

    /**
     * Gets the value of the lapsePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lapsePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLapsePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LapsePeriod_Type }
     * 
     * 
     */
    public List<LapsePeriod_Type> getLapsePeriod() {
        if (lapsePeriod == null) {
            lapsePeriod = new ArrayList<LapsePeriod_Type>();
        }
        return this.lapsePeriod;
    }

}
