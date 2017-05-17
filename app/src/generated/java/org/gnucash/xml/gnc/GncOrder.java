//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.17 at 02:00:12 PM IDT 
//


package org.gnucash.xml.gnc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://www.gnucash.org/XML/order}guid"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/order}id"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/order}owner"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/order}opened"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/order}closed" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/order}notes" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/order}reference" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/order}active"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="2.0.0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "guid",
    "id",
    "owner",
    "opened",
    "closed",
    "notes",
    "reference",
    "active"
})
@XmlRootElement(name = "GncOrder")
public class GncOrder {

    @XmlElement(namespace = "http://www.gnucash.org/XML/order", required = true)
    protected Guid guid;
    @XmlElement(namespace = "http://www.gnucash.org/XML/order", required = true)
    protected String id;
    @XmlElement(namespace = "http://www.gnucash.org/XML/order", required = true)
    protected OwnerContent owner;
    @XmlElement(namespace = "http://www.gnucash.org/XML/order", required = true)
    protected TimeSpec opened;
    @XmlElement(namespace = "http://www.gnucash.org/XML/order")
    protected TimeSpec closed;
    @XmlElement(namespace = "http://www.gnucash.org/XML/order")
    protected String notes;
    @XmlElement(namespace = "http://www.gnucash.org/XML/order")
    protected String reference;
    @XmlElement(namespace = "http://www.gnucash.org/XML/order")
    protected boolean active;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setGuid(Guid value) {
        this.guid = value;
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

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerContent }
     *     
     */
    public OwnerContent getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerContent }
     *     
     */
    public void setOwner(OwnerContent value) {
        this.owner = value;
    }

    /**
     * Gets the value of the opened property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpec }
     *     
     */
    public TimeSpec getOpened() {
        return opened;
    }

    /**
     * Sets the value of the opened property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpec }
     *     
     */
    public void setOpened(TimeSpec value) {
        this.opened = value;
    }

    /**
     * Gets the value of the closed property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpec }
     *     
     */
    public TimeSpec getClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpec }
     *     
     */
    public void setClosed(TimeSpec value) {
        this.closed = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
