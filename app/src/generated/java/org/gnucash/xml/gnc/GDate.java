//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.17 at 02:00:12 PM IDT 
//


package org.gnucash.xml.gnc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.gnucash.xml.slot.ValueGDate;


/**
 * <p>Java class for GDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gdate" form="unqualified">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9]{4}-[0-9]{2}-[0-9]{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GDate", propOrder = {
    "gdate"
})
@XmlSeeAlso({
    ValueGDate.class
})
public class GDate {

    @XmlElement(namespace = "", required = true)
    protected String gdate;

    /**
     * Gets the value of the gdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGdate() {
        return gdate;
    }

    /**
     * Sets the value of the gdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGdate(String value) {
        this.gdate = value;
    }

}
