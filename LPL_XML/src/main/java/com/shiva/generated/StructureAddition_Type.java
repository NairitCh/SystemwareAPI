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
 * <p>Java class for StructureAddition_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructureAddition_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ItemIdInfo" minOccurs="0"/>
 *         &lt;element ref="{}StructureDesc" minOccurs="0"/>
 *         &lt;element ref="{}StructureUseDesc" minOccurs="0"/>
 *         &lt;element ref="{}Length" minOccurs="0"/>
 *         &lt;element ref="{}Width" minOccurs="0"/>
 *         &lt;element ref="{}Height" minOccurs="0"/>
 *         &lt;element ref="{}StructureConditionCd" minOccurs="0"/>
 *         &lt;element ref="{}Construction" minOccurs="0"/>
 *         &lt;element ref="{}BldgExposures" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}BldgProtection" minOccurs="0"/>
 *         &lt;element ref="{}AlarmAndSecurity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}BldgImprovements" minOccurs="0"/>
 *         &lt;element ref="{}BldgFeatures" minOccurs="0"/>
 *         &lt;element ref="{}HeatingUnitInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}StorageTankInfo" minOccurs="0"/>
 *         &lt;element ref="{}InspectionInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "StructureAddition_Type", propOrder = {
    "itemIdInfo",
    "structureDesc",
    "structureUseDesc",
    "length",
    "width",
    "height",
    "structureConditionCd",
    "construction",
    "bldgExposures",
    "bldgProtection",
    "alarmAndSecurity",
    "bldgImprovements",
    "bldgFeatures",
    "heatingUnitInfo",
    "storageTankInfo",
    "inspectionInfo"
})
public class StructureAddition_Type {

    @XmlElement(name = "ItemIdInfo")
    protected ItemIdInfo_Type itemIdInfo;
    @XmlElement(name = "StructureDesc")
    protected C255 structureDesc;
    @XmlElement(name = "StructureUseDesc")
    protected C255 structureUseDesc;
    @XmlElement(name = "Length")
    protected MEASUREMENT length;
    @XmlElement(name = "Width")
    protected MEASUREMENT width;
    @XmlElement(name = "Height")
    protected MEASUREMENT height;
    @XmlElement(name = "StructureConditionCd")
    protected StructureCondition structureConditionCd;
    @XmlElement(name = "Construction")
    protected Construction_Type construction;
    @XmlElement(name = "BldgExposures")
    protected List<PROXIMITY> bldgExposures;
    @XmlElement(name = "BldgProtection")
    protected BldgProtection_Type bldgProtection;
    @XmlElement(name = "AlarmAndSecurity")
    protected List<AlarmAndSecurity_Type> alarmAndSecurity;
    @XmlElement(name = "BldgImprovements")
    protected BldgImprovements_Type bldgImprovements;
    @XmlElement(name = "BldgFeatures")
    protected BldgFeatures_Type bldgFeatures;
    @XmlElement(name = "HeatingUnitInfo")
    protected List<HeatingUnitInfo_Type> heatingUnitInfo;
    @XmlElement(name = "StorageTankInfo")
    protected StorageTankInfo_Type storageTankInfo;
    @XmlElement(name = "InspectionInfo")
    protected List<InspectionInfo_Type> inspectionInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the itemIdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdInfo_Type }
     *     
     */
    public ItemIdInfo_Type getItemIdInfo() {
        return itemIdInfo;
    }

    /**
     * Sets the value of the itemIdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdInfo_Type }
     *     
     */
    public void setItemIdInfo(ItemIdInfo_Type value) {
        this.itemIdInfo = value;
    }

    /**
     * Gets the value of the structureDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getStructureDesc() {
        return structureDesc;
    }

    /**
     * Sets the value of the structureDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setStructureDesc(C255 value) {
        this.structureDesc = value;
    }

    /**
     * Gets the value of the structureUseDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getStructureUseDesc() {
        return structureUseDesc;
    }

    /**
     * Sets the value of the structureUseDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setStructureUseDesc(C255 value) {
        this.structureUseDesc = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setLength(MEASUREMENT value) {
        this.length = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setWidth(MEASUREMENT value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setHeight(MEASUREMENT value) {
        this.height = value;
    }

    /**
     * Gets the value of the structureConditionCd property.
     * 
     * @return
     *     possible object is
     *     {@link StructureCondition }
     *     
     */
    public StructureCondition getStructureConditionCd() {
        return structureConditionCd;
    }

    /**
     * Sets the value of the structureConditionCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructureCondition }
     *     
     */
    public void setStructureConditionCd(StructureCondition value) {
        this.structureConditionCd = value;
    }

    /**
     * Gets the value of the construction property.
     * 
     * @return
     *     possible object is
     *     {@link Construction_Type }
     *     
     */
    public Construction_Type getConstruction() {
        return construction;
    }

    /**
     * Sets the value of the construction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Construction_Type }
     *     
     */
    public void setConstruction(Construction_Type value) {
        this.construction = value;
    }

    /**
     * Gets the value of the bldgExposures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bldgExposures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBldgExposures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PROXIMITY }
     * 
     * 
     */
    public List<PROXIMITY> getBldgExposures() {
        if (bldgExposures == null) {
            bldgExposures = new ArrayList<PROXIMITY>();
        }
        return this.bldgExposures;
    }

    /**
     * Gets the value of the bldgProtection property.
     * 
     * @return
     *     possible object is
     *     {@link BldgProtection_Type }
     *     
     */
    public BldgProtection_Type getBldgProtection() {
        return bldgProtection;
    }

    /**
     * Sets the value of the bldgProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link BldgProtection_Type }
     *     
     */
    public void setBldgProtection(BldgProtection_Type value) {
        this.bldgProtection = value;
    }

    /**
     * Gets the value of the alarmAndSecurity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alarmAndSecurity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlarmAndSecurity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlarmAndSecurity_Type }
     * 
     * 
     */
    public List<AlarmAndSecurity_Type> getAlarmAndSecurity() {
        if (alarmAndSecurity == null) {
            alarmAndSecurity = new ArrayList<AlarmAndSecurity_Type>();
        }
        return this.alarmAndSecurity;
    }

    /**
     * Gets the value of the bldgImprovements property.
     * 
     * @return
     *     possible object is
     *     {@link BldgImprovements_Type }
     *     
     */
    public BldgImprovements_Type getBldgImprovements() {
        return bldgImprovements;
    }

    /**
     * Sets the value of the bldgImprovements property.
     * 
     * @param value
     *     allowed object is
     *     {@link BldgImprovements_Type }
     *     
     */
    public void setBldgImprovements(BldgImprovements_Type value) {
        this.bldgImprovements = value;
    }

    /**
     * Gets the value of the bldgFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link BldgFeatures_Type }
     *     
     */
    public BldgFeatures_Type getBldgFeatures() {
        return bldgFeatures;
    }

    /**
     * Sets the value of the bldgFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link BldgFeatures_Type }
     *     
     */
    public void setBldgFeatures(BldgFeatures_Type value) {
        this.bldgFeatures = value;
    }

    /**
     * Gets the value of the heatingUnitInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the heatingUnitInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeatingUnitInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeatingUnitInfo_Type }
     * 
     * 
     */
    public List<HeatingUnitInfo_Type> getHeatingUnitInfo() {
        if (heatingUnitInfo == null) {
            heatingUnitInfo = new ArrayList<HeatingUnitInfo_Type>();
        }
        return this.heatingUnitInfo;
    }

    /**
     * Gets the value of the storageTankInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StorageTankInfo_Type }
     *     
     */
    public StorageTankInfo_Type getStorageTankInfo() {
        return storageTankInfo;
    }

    /**
     * Sets the value of the storageTankInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageTankInfo_Type }
     *     
     */
    public void setStorageTankInfo(StorageTankInfo_Type value) {
        this.storageTankInfo = value;
    }

    /**
     * Gets the value of the inspectionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inspectionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInspectionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InspectionInfo_Type }
     * 
     * 
     */
    public List<InspectionInfo_Type> getInspectionInfo() {
        if (inspectionInfo == null) {
            inspectionInfo = new ArrayList<InspectionInfo_Type>();
        }
        return this.inspectionInfo;
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
