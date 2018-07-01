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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for com.hanover_OtherOrPriorPolicy_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.hanover_OtherOrPriorPolicy_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{}OtherOrPriorPolicy_Type">
 *       &lt;sequence>
 *         &lt;element ref="{}PolicyVersion" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_PolicySymbol" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_OtherInsurerName" minOccurs="0"/>
 *         &lt;element ref="{}QuestionAnswer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.hanover_OtherOrPriorPolicy_Type", propOrder = {
    "policyVersion",
    "comHanover_PolicySymbol",
    "comHanover_OtherInsurerName",
    "questionAnswer"
})
public class ComHanover_OtherOrPriorPolicy_Type
    extends OtherOrPriorPolicy_Type
{

    @XmlElement(name = "PolicyVersion")
    protected C4 policyVersion;
    @XmlElement(name = "com.hanover_PolicySymbol")
    protected C4 comHanover_PolicySymbol;
    @XmlElement(name = "com.hanover_OtherInsurerName")
    protected C255 comHanover_OtherInsurerName;
    @XmlElement(name = "QuestionAnswer")
    protected List<ComHanover_QuestionAnswer_Type> questionAnswer;

    /**
     * Gets the value of the policyVersion property.
     * 
     * @return
     *     possible object is
     *     {@link C4 }
     *     
     */
    public C4 getPolicyVersion() {
        return policyVersion;
    }

    /**
     * Sets the value of the policyVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link C4 }
     *     
     */
    public void setPolicyVersion(C4 value) {
        this.policyVersion = value;
    }

    /**
     * Gets the value of the comHanover_PolicySymbol property.
     * 
     * @return
     *     possible object is
     *     {@link C4 }
     *     
     */
    public C4 getComHanover_PolicySymbol() {
        return comHanover_PolicySymbol;
    }

    /**
     * Sets the value of the comHanover_PolicySymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link C4 }
     *     
     */
    public void setComHanover_PolicySymbol(C4 value) {
        this.comHanover_PolicySymbol = value;
    }

    /**
     * Gets the value of the comHanover_OtherInsurerName property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getComHanover_OtherInsurerName() {
        return comHanover_OtherInsurerName;
    }

    /**
     * Sets the value of the comHanover_OtherInsurerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setComHanover_OtherInsurerName(C255 value) {
        this.comHanover_OtherInsurerName = value;
    }

    /**
     * Gets the value of the questionAnswer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionAnswer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionAnswer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComHanover_QuestionAnswer_Type }
     * 
     * 
     */
    public List<ComHanover_QuestionAnswer_Type> getQuestionAnswer() {
        if (questionAnswer == null) {
            questionAnswer = new ArrayList<ComHanover_QuestionAnswer_Type>();
        }
        return this.questionAnswer;
    }

}
