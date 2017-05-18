
package org.gnucash.xml.employee;

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
 * <p>Java class for GncEmployee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GncEmployee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.gnucash.org/XML/employee}guid"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/employee}username"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/employee}id"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/employee}addr"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/employee}language" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/employee}acl" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/employee}active"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/employee}workday"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/employee}rate"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/employee}currency"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/employee}ccard" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/employee}slots" minOccurs="0"/>
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
@XmlType(name = "GncEmployee", propOrder = {
    "guid",
    "username",
    "id",
    "addr",
    "language",
    "acl",
    "active",
    "workday",
    "rate",
    "currency",
    "ccard",
    "slots"
})
public class GncEmployee {

    @XmlElement(required = true)
    protected Guid guid;
    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected AddressContent addr;
    protected String language;
    protected String acl;
    protected boolean active;
    @XmlElement(required = true)
    protected String workday;
    @XmlElement(required = true)
    protected String rate;
    @XmlElement(required = true)
    protected Currency currency;
    protected Guid ccard;
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
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
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
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the acl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcl() {
        return acl;
    }

    /**
     * Sets the value of the acl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcl(String value) {
        this.acl = value;
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
     * Gets the value of the workday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkday() {
        return workday;
    }

    /**
     * Sets the value of the workday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkday(String value) {
        this.workday = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRate(String value) {
        this.rate = value;
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
     * Gets the value of the ccard property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getCcard() {
        return ccard;
    }

    /**
     * Sets the value of the ccard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setCcard(Guid value) {
        this.ccard = value;
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
