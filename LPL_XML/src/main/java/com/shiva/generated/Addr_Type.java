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
 * <p>Java class for Addr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Addr_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}AddrTypeCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{}ADDR1_CHOICE" minOccurs="0"/>
 *         &lt;element ref="{}Addr2" minOccurs="0"/>
 *         &lt;element ref="{}Addr3" minOccurs="0"/>
 *         &lt;element ref="{}Addr4" minOccurs="0"/>
 *         &lt;element ref="{}City" minOccurs="0"/>
 *         &lt;element ref="{}StateProvCd" minOccurs="0"/>
 *         &lt;element ref="{}StateProv" minOccurs="0"/>
 *         &lt;element ref="{}PostalCode" minOccurs="0"/>
 *         &lt;element ref="{}CountryCd" minOccurs="0"/>
 *         &lt;element ref="{}Country" minOccurs="0"/>
 *         &lt;element ref="{}Latitude" minOccurs="0"/>
 *         &lt;element ref="{}Longitude" minOccurs="0"/>
 *         &lt;element ref="{}County" minOccurs="0"/>
 *         &lt;group ref="{}REGION_CHOICE" minOccurs="0"/>
 *         &lt;element ref="{}Township" minOccurs="0"/>
 *         &lt;element ref="{}LegalAddr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ItemIdInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PreferredContactRef" type="{}IDREF" />
 *       &lt;attribute name="id" type="{}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Addr_Type", propOrder = {
    "addrTypeCd",
    "addr1",
    "detailAddr",
    "addr2",
    "addr3",
    "addr4",
    "city",
    "stateProvCd",
    "stateProv",
    "postalCode",
    "countryCd",
    "country",
    "latitude",
    "longitude",
    "county",
    "region",
    "regionCd",
    "township",
    "legalAddr",
    "itemIdInfo"
})
public class Addr_Type {

    @XmlElement(name = "AddrTypeCd")
    protected List<AddressType> addrTypeCd;
    @XmlElement(name = "Addr1")
    protected C64 addr1;
    @XmlElement(name = "DetailAddr")
    protected List<DetailAddr_Type> detailAddr;
    @XmlElement(name = "Addr2")
    protected C64 addr2;
    @XmlElement(name = "Addr3")
    protected C64 addr3;
    @XmlElement(name = "Addr4")
    protected C64 addr4;
    @XmlElement(name = "City")
    protected C32 city;
    @XmlElement(name = "StateProvCd")
    protected OpenEnum stateProvCd;
    @XmlElement(name = "StateProv")
    protected C60 stateProv;
    @XmlElement(name = "PostalCode")
    protected C11 postalCode;
    @XmlElement(name = "CountryCd")
    protected OpenEnum countryCd;
    @XmlElement(name = "Country")
    protected C60 country;
    @XmlElement(name = "Latitude")
    protected C12 latitude;
    @XmlElement(name = "Longitude")
    protected C13 longitude;
    @XmlElement(name = "County")
    protected C50 county;
    @XmlElement(name = "Region")
    protected C255 region;
    @XmlElement(name = "RegionCd")
    protected OpenEnum regionCd;
    @XmlElement(name = "Township")
    protected C50 township;
    @XmlElement(name = "LegalAddr")
    protected List<LegalAddr_Type> legalAddr;
    @XmlElement(name = "ItemIdInfo")
    protected ItemIdInfo_Type itemIdInfo;
    @XmlAttribute(name = "PreferredContactRef")
    @XmlIDREF
    protected Object preferredContactRef;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the addrTypeCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addrTypeCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddrTypeCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getAddrTypeCd() {
        if (addrTypeCd == null) {
            addrTypeCd = new ArrayList<AddressType>();
        }
        return this.addrTypeCd;
    }

    /**
     * Gets the value of the addr1 property.
     * 
     * @return
     *     possible object is
     *     {@link C64 }
     *     
     */
    public C64 getAddr1() {
        return addr1;
    }

    /**
     * Sets the value of the addr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C64 }
     *     
     */
    public void setAddr1(C64 value) {
        this.addr1 = value;
    }

    /**
     * Gets the value of the detailAddr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailAddr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailAddr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailAddr_Type }
     * 
     * 
     */
    public List<DetailAddr_Type> getDetailAddr() {
        if (detailAddr == null) {
            detailAddr = new ArrayList<DetailAddr_Type>();
        }
        return this.detailAddr;
    }

    /**
     * Gets the value of the addr2 property.
     * 
     * @return
     *     possible object is
     *     {@link C64 }
     *     
     */
    public C64 getAddr2() {
        return addr2;
    }

    /**
     * Sets the value of the addr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C64 }
     *     
     */
    public void setAddr2(C64 value) {
        this.addr2 = value;
    }

    /**
     * Gets the value of the addr3 property.
     * 
     * @return
     *     possible object is
     *     {@link C64 }
     *     
     */
    public C64 getAddr3() {
        return addr3;
    }

    /**
     * Sets the value of the addr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C64 }
     *     
     */
    public void setAddr3(C64 value) {
        this.addr3 = value;
    }

    /**
     * Gets the value of the addr4 property.
     * 
     * @return
     *     possible object is
     *     {@link C64 }
     *     
     */
    public C64 getAddr4() {
        return addr4;
    }

    /**
     * Sets the value of the addr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C64 }
     *     
     */
    public void setAddr4(C64 value) {
        this.addr4 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link C32 }
     *     
     */
    public C32 getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link C32 }
     *     
     */
    public void setCity(C32 value) {
        this.city = value;
    }

    /**
     * Gets the value of the stateProvCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getStateProvCd() {
        return stateProvCd;
    }

    /**
     * Sets the value of the stateProvCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setStateProvCd(OpenEnum value) {
        this.stateProvCd = value;
    }

    /**
     * Gets the value of the stateProv property.
     * 
     * @return
     *     possible object is
     *     {@link C60 }
     *     
     */
    public C60 getStateProv() {
        return stateProv;
    }

    /**
     * Sets the value of the stateProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link C60 }
     *     
     */
    public void setStateProv(C60 value) {
        this.stateProv = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link C11 }
     *     
     */
    public C11 getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link C11 }
     *     
     */
    public void setPostalCode(C11 value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the countryCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getCountryCd() {
        return countryCd;
    }

    /**
     * Sets the value of the countryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setCountryCd(OpenEnum value) {
        this.countryCd = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link C60 }
     *     
     */
    public C60 getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link C60 }
     *     
     */
    public void setCountry(C60 value) {
        this.country = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link C12 }
     *     
     */
    public C12 getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link C12 }
     *     
     */
    public void setLatitude(C12 value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link C13 }
     *     
     */
    public C13 getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link C13 }
     *     
     */
    public void setLongitude(C13 value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link C50 }
     *     
     */
    public C50 getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link C50 }
     *     
     */
    public void setCounty(C50 value) {
        this.county = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setRegion(C255 value) {
        this.region = value;
    }

    /**
     * Gets the value of the regionCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getRegionCd() {
        return regionCd;
    }

    /**
     * Sets the value of the regionCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setRegionCd(OpenEnum value) {
        this.regionCd = value;
    }

    /**
     * Gets the value of the township property.
     * 
     * @return
     *     possible object is
     *     {@link C50 }
     *     
     */
    public C50 getTownship() {
        return township;
    }

    /**
     * Sets the value of the township property.
     * 
     * @param value
     *     allowed object is
     *     {@link C50 }
     *     
     */
    public void setTownship(C50 value) {
        this.township = value;
    }

    /**
     * Gets the value of the legalAddr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legalAddr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegalAddr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalAddr_Type }
     * 
     * 
     */
    public List<LegalAddr_Type> getLegalAddr() {
        if (legalAddr == null) {
            legalAddr = new ArrayList<LegalAddr_Type>();
        }
        return this.legalAddr;
    }

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
     * Gets the value of the preferredContactRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPreferredContactRef() {
        return preferredContactRef;
    }

    /**
     * Sets the value of the preferredContactRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPreferredContactRef(Object value) {
        this.preferredContactRef = value;
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
