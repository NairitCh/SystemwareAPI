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
 * <p>Java class for com.hanover_AgentReferralInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.hanover_AgentReferralInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}com.hanover_ReferralTypeCd"/>
 *         &lt;element ref="{}com.hanover_SentToUWDt" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_RepliedByUWDt" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_AgentLanID" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_AgentNotesTxt" minOccurs="0"/>
 *         &lt;element ref="{}UnderwriterId" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_UWCommentsTxt" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_ReferredStatusCd" minOccurs="0"/>
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
@XmlType(name = "com.hanover_AgentReferralInfo_Type", propOrder = {
    "comHanover_ReferralTypeCd",
    "comHanover_SentToUWDt",
    "comHanover_RepliedByUWDt",
    "comHanover_AgentLanID",
    "comHanover_AgentNotesTxt",
    "underwriterId",
    "comHanover_UWCommentsTxt",
    "comHanover_ReferredStatusCd"
})
public class ComHanover_AgentReferralInfo_Type {

    @XmlElement(name = "com.hanover_ReferralTypeCd", required = true)
    protected OpenEnum comHanover_ReferralTypeCd;
    @XmlElement(name = "com.hanover_SentToUWDt")
    protected Date comHanover_SentToUWDt;
    @XmlElement(name = "com.hanover_RepliedByUWDt")
    protected Date comHanover_RepliedByUWDt;
    @XmlElement(name = "com.hanover_AgentLanID")
    protected C20 comHanover_AgentLanID;
    @XmlElement(name = "com.hanover_AgentNotesTxt")
    protected CInfinite comHanover_AgentNotesTxt;
    @XmlElement(name = "UnderwriterId")
    protected AssignedIdentifier underwriterId;
    @XmlElement(name = "com.hanover_UWCommentsTxt")
    protected CInfinite comHanover_UWCommentsTxt;
    @XmlElement(name = "com.hanover_ReferredStatusCd")
    protected OpenEnum comHanover_ReferredStatusCd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the comHanover_ReferralTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getComHanover_ReferralTypeCd() {
        return comHanover_ReferralTypeCd;
    }

    /**
     * Sets the value of the comHanover_ReferralTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setComHanover_ReferralTypeCd(OpenEnum value) {
        this.comHanover_ReferralTypeCd = value;
    }

    /**
     * Gets the value of the comHanover_SentToUWDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getComHanover_SentToUWDt() {
        return comHanover_SentToUWDt;
    }

    /**
     * Sets the value of the comHanover_SentToUWDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setComHanover_SentToUWDt(Date value) {
        this.comHanover_SentToUWDt = value;
    }

    /**
     * Gets the value of the comHanover_RepliedByUWDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getComHanover_RepliedByUWDt() {
        return comHanover_RepliedByUWDt;
    }

    /**
     * Sets the value of the comHanover_RepliedByUWDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setComHanover_RepliedByUWDt(Date value) {
        this.comHanover_RepliedByUWDt = value;
    }

    /**
     * Gets the value of the comHanover_AgentLanID property.
     * 
     * @return
     *     possible object is
     *     {@link C20 }
     *     
     */
    public C20 getComHanover_AgentLanID() {
        return comHanover_AgentLanID;
    }

    /**
     * Sets the value of the comHanover_AgentLanID property.
     * 
     * @param value
     *     allowed object is
     *     {@link C20 }
     *     
     */
    public void setComHanover_AgentLanID(C20 value) {
        this.comHanover_AgentLanID = value;
    }

    /**
     * Gets the value of the comHanover_AgentNotesTxt property.
     * 
     * @return
     *     possible object is
     *     {@link CInfinite }
     *     
     */
    public CInfinite getComHanover_AgentNotesTxt() {
        return comHanover_AgentNotesTxt;
    }

    /**
     * Sets the value of the comHanover_AgentNotesTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInfinite }
     *     
     */
    public void setComHanover_AgentNotesTxt(CInfinite value) {
        this.comHanover_AgentNotesTxt = value;
    }

    /**
     * Gets the value of the underwriterId property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedIdentifier }
     *     
     */
    public AssignedIdentifier getUnderwriterId() {
        return underwriterId;
    }

    /**
     * Sets the value of the underwriterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedIdentifier }
     *     
     */
    public void setUnderwriterId(AssignedIdentifier value) {
        this.underwriterId = value;
    }

    /**
     * Gets the value of the comHanover_UWCommentsTxt property.
     * 
     * @return
     *     possible object is
     *     {@link CInfinite }
     *     
     */
    public CInfinite getComHanover_UWCommentsTxt() {
        return comHanover_UWCommentsTxt;
    }

    /**
     * Sets the value of the comHanover_UWCommentsTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInfinite }
     *     
     */
    public void setComHanover_UWCommentsTxt(CInfinite value) {
        this.comHanover_UWCommentsTxt = value;
    }

    /**
     * Gets the value of the comHanover_ReferredStatusCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getComHanover_ReferredStatusCd() {
        return comHanover_ReferredStatusCd;
    }

    /**
     * Sets the value of the comHanover_ReferredStatusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setComHanover_ReferredStatusCd(OpenEnum value) {
        this.comHanover_ReferredStatusCd = value;
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