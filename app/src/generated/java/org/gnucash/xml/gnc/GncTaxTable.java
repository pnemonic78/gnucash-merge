//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.17 at 11:44:24 AM IDT 
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
import org.gnucash.xml.taxtable.Child;
import org.gnucash.xml.taxtable.Entries;
import org.gnucash.xml.taxtable.Guid;
import org.gnucash.xml.taxtable.Parent;


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
 *         &lt;element ref="{http://www.gnucash.org/XML/taxtable}guid" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/taxtable}name"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/taxtable}refcount"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/taxtable}invisible"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/taxtable}child" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/taxtable}parent" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/taxtable}entries"/>
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
    "name",
    "refcount",
    "invisible",
    "child",
    "parent",
    "entries"
})
@XmlRootElement(name = "GncTaxTable")
public class GncTaxTable {

    @XmlElement(namespace = "http://www.gnucash.org/XML/taxtable")
    protected Guid guid;
    @XmlElement(namespace = "http://www.gnucash.org/XML/taxtable", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.gnucash.org/XML/taxtable")
    protected int refcount;
    @XmlElement(namespace = "http://www.gnucash.org/XML/taxtable")
    protected boolean invisible;
    @XmlElement(namespace = "http://www.gnucash.org/XML/taxtable")
    protected Child child;
    @XmlElement(namespace = "http://www.gnucash.org/XML/taxtable")
    protected Parent parent;
    @XmlElement(namespace = "http://www.gnucash.org/XML/taxtable", required = true)
    protected Entries entries;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the refcount property.
     * 
     */
    public int getRefcount() {
        return refcount;
    }

    /**
     * Sets the value of the refcount property.
     * 
     */
    public void setRefcount(int value) {
        this.refcount = value;
    }

    /**
     * Gets the value of the invisible property.
     * 
     */
    public boolean isInvisible() {
        return invisible;
    }

    /**
     * Sets the value of the invisible property.
     * 
     */
    public void setInvisible(boolean value) {
        this.invisible = value;
    }

    /**
     * Gets the value of the child property.
     * 
     * @return
     *     possible object is
     *     {@link Child }
     *     
     */
    public Child getChild() {
        return child;
    }

    /**
     * Sets the value of the child property.
     * 
     * @param value
     *     allowed object is
     *     {@link Child }
     *     
     */
    public void setChild(Child value) {
        this.child = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link Parent }
     *     
     */
    public Parent getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parent }
     *     
     */
    public void setParent(Parent value) {
        this.parent = value;
    }

    /**
     * Gets the value of the entries property.
     * 
     * @return
     *     possible object is
     *     {@link Entries }
     *     
     */
    public Entries getEntries() {
        return entries;
    }

    /**
     * Sets the value of the entries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entries }
     *     
     */
    public void setEntries(Entries value) {
        this.entries = value;
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
