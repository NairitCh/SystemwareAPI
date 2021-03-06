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
 * <p>Java class for CodeList_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeList_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}CodeListName" minOccurs="0"/>
 *         &lt;element ref="{}CodeListVersion" minOccurs="0"/>
 *         &lt;element ref="{}CodeListOwnerCd" minOccurs="0"/>
 *         &lt;element ref="{}Description" minOccurs="0"/>
 *         &lt;element ref="{}WebsiteURL" minOccurs="0"/>
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
@XmlType(name = "CodeList_Type", propOrder = {
    "codeListName",
    "codeListVersion",
    "codeListOwnerCd",
    "description",
    "websiteURL"
})
public class CodeList_Type {

    @XmlElement(name = "CodeListName")
    protected C255 codeListName;
    @XmlElement(name = "CodeListVersion")
    protected C50 codeListVersion;
    @XmlElement(name = "CodeListOwnerCd")
    protected CodeListOwner codeListOwnerCd;
    @XmlElement(name = "Description")
    protected C255 description;
    @XmlElement(name = "WebsiteURL")
    protected URLType websiteURL;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the codeListName property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getCodeListName() {
        return codeListName;
    }

    /**
     * Sets the value of the codeListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setCodeListName(C255 value) {
        this.codeListName = value;
    }

    /**
     * Gets the value of the codeListVersion property.
     * 
     * @return
     *     possible object is
     *     {@link C50 }
     *     
     */
    public C50 getCodeListVersion() {
        return codeListVersion;
    }

    /**
     * Sets the value of the codeListVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link C50 }
     *     
     */
    public void setCodeListVersion(C50 value) {
        this.codeListVersion = value;
    }

    /**
     * Gets the value of the codeListOwnerCd property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListOwner }
     *     
     */
    public CodeListOwner getCodeListOwnerCd() {
        return codeListOwnerCd;
    }

    /**
     * Sets the value of the codeListOwnerCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListOwner }
     *     
     */
    public void setCodeListOwnerCd(CodeListOwner value) {
        this.codeListOwnerCd = value;
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
     * Gets the value of the websiteURL property.
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getWebsiteURL() {
        return websiteURL;
    }

    /**
     * Sets the value of the websiteURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setWebsiteURL(URLType value) {
        this.websiteURL = value;
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
