
package org.gnucash.xml.invoice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.gnucash.xml.gnc.Currency;
import org.gnucash.xml.gnc.Guid;
import org.gnucash.xml.gnc.TimeSpec;
import org.gnucash.xml.owner.OwnerContent;
import org.gnucash.xml.slot.Slots;


/**
 * <p>Java class for GncInvoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GncInvoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.gnucash.org/XML/invoice}guid"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/invoice}id"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/invoice}owner"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/invoice}opened"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/invoice}posted" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/invoice}terms" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/invoice}billing_id" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/invoice}notes" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/invoice}active"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/invoice}posttxn" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/invoice}postlot" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/invoice}postacc" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/invoice}currency"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/invoice}billto" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/invoice}charge-amt" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/invoice}slots" minOccurs="0"/>
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
@XmlType(name = "GncInvoice", propOrder = {
    "guid",
    "id",
    "owner",
    "opened",
    "posted",
    "terms",
    "billingId",
    "notes",
    "active",
    "posttxn",
    "postlot",
    "postacc",
    "currency",
    "billto",
    "chargeAmt",
    "slots"
})
public class GncInvoice {

    @XmlElement(required = true)
    protected Guid guid;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected OwnerContent owner;
    @XmlElement(required = true)
    protected TimeSpec opened;
    protected TimeSpec posted;
    protected Guid terms;
    @XmlElement(name = "billing_id")
    protected String billingId;
    protected String notes;
    protected boolean active;
    protected Guid posttxn;
    protected Guid postlot;
    protected Guid postacc;
    @XmlElement(required = true)
    protected Currency currency;
    protected OwnerContent billto;
    @XmlElement(name = "charge-amt")
    protected String chargeAmt;
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
     * Gets the value of the posted property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpec }
     *     
     */
    public TimeSpec getPosted() {
        return posted;
    }

    /**
     * Sets the value of the posted property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpec }
     *     
     */
    public void setPosted(TimeSpec value) {
        this.posted = value;
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
     * Gets the value of the billingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingId() {
        return billingId;
    }

    /**
     * Sets the value of the billingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingId(String value) {
        this.billingId = value;
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
     * Gets the value of the posttxn property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getPosttxn() {
        return posttxn;
    }

    /**
     * Sets the value of the posttxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setPosttxn(Guid value) {
        this.posttxn = value;
    }

    /**
     * Gets the value of the postlot property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getPostlot() {
        return postlot;
    }

    /**
     * Sets the value of the postlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setPostlot(Guid value) {
        this.postlot = value;
    }

    /**
     * Gets the value of the postacc property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getPostacc() {
        return postacc;
    }

    /**
     * Sets the value of the postacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setPostacc(Guid value) {
        this.postacc = value;
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
     * Gets the value of the billto property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerContent }
     *     
     */
    public OwnerContent getBillto() {
        return billto;
    }

    /**
     * Sets the value of the billto property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerContent }
     *     
     */
    public void setBillto(OwnerContent value) {
        this.billto = value;
    }

    /**
     * Gets the value of the chargeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeAmt() {
        return chargeAmt;
    }

    /**
     * Sets the value of the chargeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeAmt(String value) {
        this.chargeAmt = value;
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
