
package org.gnucash.xml.cust;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.gnucash.xml.addr.AddressContent;
import org.gnucash.xml.gnc.Currency;
import org.gnucash.xml.gnc.Guid;
import org.gnucash.xml.slot.Slots;


/**
 * <p>Java class for GncCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GncCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.gnucash.org/XML/cust}guid"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/cust}name"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/cust}id"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/cust}addr"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/cust}shipaddr"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/cust}notes" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/cust}terms" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/cust}taxincluded"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/cust}active"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/cust}discount"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/cust}credit"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/cust}currency"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/cust}use-tt"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/cust}taxtable" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/cust}slots" minOccurs="0"/>
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
@XmlType(name = "GncCustomer", propOrder = {
    "guid",
    "name",
    "id",
    "addr",
    "shipaddr",
    "notes",
    "terms",
    "taxincluded",
    "active",
    "discount",
    "credit",
    "currency",
    "useTt",
    "taxtable",
    "slots"
})
public class GncCustomer {

    @XmlElement(required = true)
    protected Guid guid;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected AddressContent addr;
    @XmlElement(required = true)
    protected AddressContent shipaddr;
    protected String notes;
    protected Guid terms;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String taxincluded;
    protected boolean active;
    @XmlElement(required = true)
    protected String discount;
    @XmlElement(required = true)
    protected String credit;
    @XmlElement(required = true)
    protected Currency currency;
    @XmlElement(name = "use-tt")
    protected boolean useTt;
    protected Guid taxtable;
    protected Slots slots;
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
     * Gets the value of the addr property.
     * 
     * @return
     *     possible object is
     *     {@link AddressContent }
     *     
     */
    public AddressContent getAddr() {
        return addr;
    }

    /**
     * Sets the value of the addr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressContent }
     *     
     */
    public void setAddr(AddressContent value) {
        this.addr = value;
    }

    /**
     * Gets the value of the shipaddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddressContent }
     *     
     */
    public AddressContent getShipaddr() {
        return shipaddr;
    }

    /**
     * Sets the value of the shipaddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressContent }
     *     
     */
    public void setShipaddr(AddressContent value) {
        this.shipaddr = value;
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
     * Gets the value of the terms property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getTerms() {
        return terms;
    }

    /**
     * Sets the value of the terms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setTerms(Guid value) {
        this.terms = value;
    }

    /**
     * Gets the value of the taxincluded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxincluded() {
        return taxincluded;
    }

    /**
     * Sets the value of the taxincluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxincluded(String value) {
        this.taxincluded = value;
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
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscount(String value) {
        this.discount = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredit(String value) {
        this.credit = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the useTt property.
     * 
     */
    public boolean isUseTt() {
        return useTt;
    }

    /**
     * Sets the value of the useTt property.
     * 
     */
    public void setUseTt(boolean value) {
        this.useTt = value;
    }

    /**
     * Gets the value of the taxtable property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getTaxtable() {
        return taxtable;
    }

    /**
     * Sets the value of the taxtable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setTaxtable(Guid value) {
        this.taxtable = value;
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
