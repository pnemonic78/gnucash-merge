
package org.gnucash.xml.billterm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.gnucash.xml.gnc.Guid;
import org.gnucash.xml.slot.Slots;


/**
 * <p>Java class for GncBillTerm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GncBillTerm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.gnucash.org/XML/billterm}guid" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/billterm}name"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/billterm}desc"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/billterm}refcount"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/billterm}invisible"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/billterm}slots" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/billterm}child" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/billterm}parent" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.gnucash.org/XML/billterm}days"/>
 *           &lt;element ref="{http://www.gnucash.org/XML/billterm}proximo"/>
 *         &lt;/choice>
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
@XmlType(name = "GncBillTerm", propOrder = {
    "guid",
    "name",
    "desc",
    "refcount",
    "invisible",
    "slots",
    "child",
    "parent",
    "days",
    "proximo"
})
public class GncBillTerm {

    protected Guid guid;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String desc;
    protected int refcount;
    protected boolean invisible;
    protected Slots slots;
    protected Guid child;
    protected Guid parent;
    protected Days days;
    protected Proximo proximo;
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
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
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
     * Gets the value of the slots property.
     * 
     * @return
     *     possible object is
     *     {@link Slots }
     *     
     */
    public Slots getSlots() {
        return slots;
    }

    /**
     * Sets the value of the slots property.
     * 
     * @param value
     *     allowed object is
     *     {@link Slots }
     *     
     */
    public void setSlots(Slots value) {
        this.slots = value;
    }

    /**
     * Gets the value of the child property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getChild() {
        return child;
    }

    /**
     * Sets the value of the child property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setChild(Guid value) {
        this.child = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setParent(Guid value) {
        this.parent = value;
    }

    /**
     * Gets the value of the days property.
     * 
     * @return
     *     possible object is
     *     {@link Days }
     *     
     */
    public Days getDays() {
        return days;
    }

    /**
     * Sets the value of the days property.
     * 
     * @param value
     *     allowed object is
     *     {@link Days }
     *     
     */
    public void setDays(Days value) {
        this.days = value;
    }

    /**
     * Gets the value of the proximo property.
     * 
     * @return
     *     possible object is
     *     {@link Proximo }
     *     
     */
    public Proximo getProximo() {
        return proximo;
    }

    /**
     * Sets the value of the proximo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proximo }
     *     
     */
    public void setProximo(Proximo value) {
        this.proximo = value;
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
