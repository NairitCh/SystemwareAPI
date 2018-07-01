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
 * <p>Java class for BldgProtection_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BldgProtection_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}NumFireDivisions" minOccurs="0"/>
 *         &lt;element ref="{}NumUnitsInFireDivisions" minOccurs="0"/>
 *         &lt;element ref="{}FireProtectionClassCd" minOccurs="0"/>
 *         &lt;element ref="{}DistanceToFireStation" minOccurs="0"/>
 *         &lt;element ref="{}DistanceToHydrant" minOccurs="0"/>
 *         &lt;element ref="{}FireExtinguisherInd" minOccurs="0"/>
 *         &lt;element ref="{}ProtectionDeviceBurglarCd" minOccurs="0"/>
 *         &lt;element ref="{}ProtectionDeviceFireCd" minOccurs="0"/>
 *         &lt;element ref="{}ProtectionDeviceSmokeCd" minOccurs="0"/>
 *         &lt;element ref="{}ProtectionDeviceSprinklerCd" minOccurs="0"/>
 *         &lt;element ref="{}ProtectionClassGradeCd" minOccurs="0"/>
 *         &lt;element ref="{}ProtectionClassImprovedInd" minOccurs="0"/>
 *         &lt;element ref="{}DoorLockCd" minOccurs="0"/>
 *         &lt;element ref="{}SprinkleredPct" minOccurs="0"/>
 *         &lt;element ref="{}SoleUnitInFireDivisionInd" minOccurs="0"/>
 *         &lt;element ref="{}NumSmokeAlarms" minOccurs="0"/>
 *         &lt;element ref="{}ElectricalProtectionCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}OtherProtectionDesc" minOccurs="0"/>
 *         &lt;element ref="{}KitchenProtectionInfo" minOccurs="0"/>
 *         &lt;element ref="{}WaterSourceCd" minOccurs="0"/>
 *         &lt;element ref="{}WaterQuantityCd" minOccurs="0"/>
 *         &lt;element ref="{}NumFireExtinguishers" minOccurs="0"/>
 *         &lt;element ref="{}FireExtinguishersLocationDesc" minOccurs="0"/>
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
@XmlType(name = "BldgProtection_Type", propOrder = {
    "numFireDivisions",
    "numUnitsInFireDivisions",
    "fireProtectionClassCd",
    "distanceToFireStation",
    "distanceToHydrant",
    "fireExtinguisherInd",
    "protectionDeviceBurglarCd",
    "protectionDeviceFireCd",
    "protectionDeviceSmokeCd",
    "protectionDeviceSprinklerCd",
    "protectionClassGradeCd",
    "protectionClassImprovedInd",
    "doorLockCd",
    "sprinkleredPct",
    "soleUnitInFireDivisionInd",
    "numSmokeAlarms",
    "electricalProtectionCd",
    "otherProtectionDesc",
    "kitchenProtectionInfo",
    "waterSourceCd",
    "waterQuantityCd",
    "numFireExtinguishers",
    "fireExtinguishersLocationDesc"
})
public class BldgProtection_Type {

    @XmlElement(name = "NumFireDivisions")
    protected Long numFireDivisions;
    @XmlElement(name = "NumUnitsInFireDivisions")
    protected Long numUnitsInFireDivisions;
    @XmlElement(name = "FireProtectionClassCd")
    protected OpenEnum fireProtectionClassCd;
    @XmlElement(name = "DistanceToFireStation")
    protected MEASUREMENT distanceToFireStation;
    @XmlElement(name = "DistanceToHydrant")
    protected MEASUREMENT distanceToHydrant;
    @XmlElement(name = "FireExtinguisherInd")
    protected Boolean fireExtinguisherInd;
    @XmlElement(name = "ProtectionDeviceBurglarCd")
    protected ProtectionDevice protectionDeviceBurglarCd;
    @XmlElement(name = "ProtectionDeviceFireCd")
    protected ProtectionDevice protectionDeviceFireCd;
    @XmlElement(name = "ProtectionDeviceSmokeCd")
    protected ProtectionDevice protectionDeviceSmokeCd;
    @XmlElement(name = "ProtectionDeviceSprinklerCd")
    protected ProtectionDevice protectionDeviceSprinklerCd;
    @XmlElement(name = "ProtectionClassGradeCd")
    protected OpenEnum protectionClassGradeCd;
    @XmlElement(name = "ProtectionClassImprovedInd")
    protected Boolean protectionClassImprovedInd;
    @XmlElement(name = "DoorLockCd")
    protected DoorLockType doorLockCd;
    @XmlElement(name = "SprinkleredPct")
    protected PercentLong sprinkleredPct;
    @XmlElement(name = "SoleUnitInFireDivisionInd")
    protected Boolean soleUnitInFireDivisionInd;
    @XmlElement(name = "NumSmokeAlarms")
    protected Long numSmokeAlarms;
    @XmlElement(name = "ElectricalProtectionCd")
    protected List<ElectricalProtection> electricalProtectionCd;
    @XmlElement(name = "OtherProtectionDesc")
    protected C255 otherProtectionDesc;
    @XmlElement(name = "KitchenProtectionInfo")
    protected KitchenProtectionInfo_Type kitchenProtectionInfo;
    @XmlElement(name = "WaterSourceCd")
    protected WaterSource waterSourceCd;
    @XmlElement(name = "WaterQuantityCd")
    protected WaterQuantity waterQuantityCd;
    @XmlElement(name = "NumFireExtinguishers")
    protected Long numFireExtinguishers;
    @XmlElement(name = "FireExtinguishersLocationDesc")
    protected C255 fireExtinguishersLocationDesc;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the numFireDivisions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumFireDivisions() {
        return numFireDivisions;
    }

    /**
     * Sets the value of the numFireDivisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumFireDivisions(Long value) {
        this.numFireDivisions = value;
    }

    /**
     * Gets the value of the numUnitsInFireDivisions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumUnitsInFireDivisions() {
        return numUnitsInFireDivisions;
    }

    /**
     * Sets the value of the numUnitsInFireDivisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumUnitsInFireDivisions(Long value) {
        this.numUnitsInFireDivisions = value;
    }

    /**
     * Gets the value of the fireProtectionClassCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getFireProtectionClassCd() {
        return fireProtectionClassCd;
    }

    /**
     * Sets the value of the fireProtectionClassCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setFireProtectionClassCd(OpenEnum value) {
        this.fireProtectionClassCd = value;
    }

    /**
     * Gets the value of the distanceToFireStation property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getDistanceToFireStation() {
        return distanceToFireStation;
    }

    /**
     * Sets the value of the distanceToFireStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setDistanceToFireStation(MEASUREMENT value) {
        this.distanceToFireStation = value;
    }

    /**
     * Gets the value of the distanceToHydrant property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getDistanceToHydrant() {
        return distanceToHydrant;
    }

    /**
     * Sets the value of the distanceToHydrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setDistanceToHydrant(MEASUREMENT value) {
        this.distanceToHydrant = value;
    }

    /**
     * Gets the value of the fireExtinguisherInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFireExtinguisherInd() {
        return fireExtinguisherInd;
    }

    /**
     * Sets the value of the fireExtinguisherInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFireExtinguisherInd(Boolean value) {
        this.fireExtinguisherInd = value;
    }

    /**
     * Gets the value of the protectionDeviceBurglarCd property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionDevice }
     *     
     */
    public ProtectionDevice getProtectionDeviceBurglarCd() {
        return protectionDeviceBurglarCd;
    }

    /**
     * Sets the value of the protectionDeviceBurglarCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionDevice }
     *     
     */
    public void setProtectionDeviceBurglarCd(ProtectionDevice value) {
        this.protectionDeviceBurglarCd = value;
    }

    /**
     * Gets the value of the protectionDeviceFireCd property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionDevice }
     *     
     */
    public ProtectionDevice getProtectionDeviceFireCd() {
        return protectionDeviceFireCd;
    }

    /**
     * Sets the value of the protectionDeviceFireCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionDevice }
     *     
     */
    public void setProtectionDeviceFireCd(ProtectionDevice value) {
        this.protectionDeviceFireCd = value;
    }

    /**
     * Gets the value of the protectionDeviceSmokeCd property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionDevice }
     *     
     */
    public ProtectionDevice getProtectionDeviceSmokeCd() {
        return protectionDeviceSmokeCd;
    }

    /**
     * Sets the value of the protectionDeviceSmokeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionDevice }
     *     
     */
    public void setProtectionDeviceSmokeCd(ProtectionDevice value) {
        this.protectionDeviceSmokeCd = value;
    }

    /**
     * Gets the value of the protectionDeviceSprinklerCd property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionDevice }
     *     
     */
    public ProtectionDevice getProtectionDeviceSprinklerCd() {
        return protectionDeviceSprinklerCd;
    }

    /**
     * Sets the value of the protectionDeviceSprinklerCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionDevice }
     *     
     */
    public void setProtectionDeviceSprinklerCd(ProtectionDevice value) {
        this.protectionDeviceSprinklerCd = value;
    }

    /**
     * Gets the value of the protectionClassGradeCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getProtectionClassGradeCd() {
        return protectionClassGradeCd;
    }

    /**
     * Sets the value of the protectionClassGradeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setProtectionClassGradeCd(OpenEnum value) {
        this.protectionClassGradeCd = value;
    }

    /**
     * Gets the value of the protectionClassImprovedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getProtectionClassImprovedInd() {
        return protectionClassImprovedInd;
    }

    /**
     * Sets the value of the protectionClassImprovedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProtectionClassImprovedInd(Boolean value) {
        this.protectionClassImprovedInd = value;
    }

    /**
     * Gets the value of the doorLockCd property.
     * 
     * @return
     *     possible object is
     *     {@link DoorLockType }
     *     
     */
    public DoorLockType getDoorLockCd() {
        return doorLockCd;
    }

    /**
     * Sets the value of the doorLockCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoorLockType }
     *     
     */
    public void setDoorLockCd(DoorLockType value) {
        this.doorLockCd = value;
    }

    /**
     * Gets the value of the sprinkleredPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getSprinkleredPct() {
        return sprinkleredPct;
    }

    /**
     * Sets the value of the sprinkleredPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setSprinkleredPct(PercentLong value) {
        this.sprinkleredPct = value;
    }

    /**
     * Gets the value of the soleUnitInFireDivisionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSoleUnitInFireDivisionInd() {
        return soleUnitInFireDivisionInd;
    }

    /**
     * Sets the value of the soleUnitInFireDivisionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoleUnitInFireDivisionInd(Boolean value) {
        this.soleUnitInFireDivisionInd = value;
    }

    /**
     * Gets the value of the numSmokeAlarms property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumSmokeAlarms() {
        return numSmokeAlarms;
    }

    /**
     * Sets the value of the numSmokeAlarms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumSmokeAlarms(Long value) {
        this.numSmokeAlarms = value;
    }

    /**
     * Gets the value of the electricalProtectionCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electricalProtectionCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectricalProtectionCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectricalProtection }
     * 
     * 
     */
    public List<ElectricalProtection> getElectricalProtectionCd() {
        if (electricalProtectionCd == null) {
            electricalProtectionCd = new ArrayList<ElectricalProtection>();
        }
        return this.electricalProtectionCd;
    }

    /**
     * Gets the value of the otherProtectionDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getOtherProtectionDesc() {
        return otherProtectionDesc;
    }

    /**
     * Sets the value of the otherProtectionDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setOtherProtectionDesc(C255 value) {
        this.otherProtectionDesc = value;
    }

    /**
     * Gets the value of the kitchenProtectionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link KitchenProtectionInfo_Type }
     *     
     */
    public KitchenProtectionInfo_Type getKitchenProtectionInfo() {
        return kitchenProtectionInfo;
    }

    /**
     * Sets the value of the kitchenProtectionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link KitchenProtectionInfo_Type }
     *     
     */
    public void setKitchenProtectionInfo(KitchenProtectionInfo_Type value) {
        this.kitchenProtectionInfo = value;
    }

    /**
     * Gets the value of the waterSourceCd property.
     * 
     * @return
     *     possible object is
     *     {@link WaterSource }
     *     
     */
    public WaterSource getWaterSourceCd() {
        return waterSourceCd;
    }

    /**
     * Sets the value of the waterSourceCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterSource }
     *     
     */
    public void setWaterSourceCd(WaterSource value) {
        this.waterSourceCd = value;
    }

    /**
     * Gets the value of the waterQuantityCd property.
     * 
     * @return
     *     possible object is
     *     {@link WaterQuantity }
     *     
     */
    public WaterQuantity getWaterQuantityCd() {
        return waterQuantityCd;
    }

    /**
     * Sets the value of the waterQuantityCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterQuantity }
     *     
     */
    public void setWaterQuantityCd(WaterQuantity value) {
        this.waterQuantityCd = value;
    }

    /**
     * Gets the value of the numFireExtinguishers property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumFireExtinguishers() {
        return numFireExtinguishers;
    }

    /**
     * Sets the value of the numFireExtinguishers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumFireExtinguishers(Long value) {
        this.numFireExtinguishers = value;
    }

    /**
     * Gets the value of the fireExtinguishersLocationDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getFireExtinguishersLocationDesc() {
        return fireExtinguishersLocationDesc;
    }

    /**
     * Sets the value of the fireExtinguishersLocationDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setFireExtinguishersLocationDesc(C255 value) {
        this.fireExtinguishersLocationDesc = value;
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
