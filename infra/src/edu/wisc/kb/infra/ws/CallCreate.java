//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.12 at 03:22:10 PM CDT 
//


package edu.wisc.kb.infra.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="src" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customer_netid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="call_service" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="call_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="call_ref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="call_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "src",
    "customerNetid",
    "callService",
    "callType",
    "callRef",
    "callDescription"
})
@XmlRootElement(name = "CallCreate")
public class CallCreate {

    @XmlElement(required = true)
    protected String src;
    @XmlElement(name = "customer_netid", required = true)
    protected String customerNetid;
    @XmlElement(name = "call_service", required = true)
    protected String callService;
    @XmlElement(name = "call_type", required = true)
    protected String callType;
    @XmlElement(name = "call_ref", required = true)
    protected String callRef;
    @XmlElement(name = "call_description", required = true)
    protected String callDescription;

    /**
     * Gets the value of the src property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrc() {
        return src;
    }

    /**
     * Sets the value of the src property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrc(String value) {
        this.src = value;
    }

    /**
     * Gets the value of the customerNetid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNetid() {
        return customerNetid;
    }

    /**
     * Sets the value of the customerNetid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNetid(String value) {
        this.customerNetid = value;
    }

    /**
     * Gets the value of the callService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallService() {
        return callService;
    }

    /**
     * Sets the value of the callService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallService(String value) {
        this.callService = value;
    }

    /**
     * Gets the value of the callType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallType() {
        return callType;
    }

    /**
     * Sets the value of the callType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallType(String value) {
        this.callType = value;
    }

    /**
     * Gets the value of the callRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallRef() {
        return callRef;
    }

    /**
     * Sets the value of the callRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallRef(String value) {
        this.callRef = value;
    }

    /**
     * Gets the value of the callDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallDescription() {
        return callDescription;
    }

    /**
     * Sets the value of the callDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallDescription(String value) {
        this.callDescription = value;
    }

}
