
package org.gnucash.xml.entry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.gnucash.xml.gnc.Guid;
import org.gnucash.xml.gnc.TimeSpec;
import org.gnucash.xml.owner.OwnerContent;


/**
 * <p>Java class for GncEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GncEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.gnucash.org/XML/entry}guid"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/entry}date"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/entry}entered"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/entry}description" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/entry}action" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/entry}notes" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/entry}qty" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/entry}i-acct" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/entry}i-price" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/entry}i-discount" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://www.gnucash.org/XML/entry}invoice"/>
 *           &lt;element ref="{http://www.gnucash.org/XML/entry}i-disc-type"/>
 *           &lt;element ref="{http://www.gnucash.org/XML/entry}i-disc-how"/>
 *           &lt;element ref="{http://www.gnucash.org/XML/entry}i-taxable"/>
 *           &lt;element ref="{http://www.gnucash.org/XML/entry}i-taxincluded"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.gnucash.org/XML/entry}i-taxtable" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/entry}b-acct" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/entry}b-price" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://www.gnucash.org/XML/entry}bill"/>
 *           &lt;element ref="{http://www.gnucash.org/XML/entry}billable"/>
 *           &lt;element ref="{http://www.gnucash.org/XML/entry}billto" minOccurs="0"/>
 *           &lt;element ref="{http://www.gnucash.org/XML/entry}b-taxable"/>
 *           &lt;element ref="{http://www.gnucash.org/XML/entry}b-taxincluded"/>
 *           &lt;element ref="{http://www.gnucash.org/XML/entry}b-pay" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.gnucash.org/XML/entry}b-taxtable" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/entry}order" minOccurs="0"/>
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
@XmlType(name = "GncEntry", propOrder = {
    "guid",
    "date",
    "entered",
    "description",
    "action",
    "notes",
    "qty",
    "iAcct",
    "iPrice",
    "iDiscount",
    "invoice",
    "iDiscType",
    "iDiscHow",
    "iTaxable",
    "iTaxincluded",
    "iTaxtable",
    "bAcct",
    "bPrice",
    "bill",
    "billable",
    "billto",
    "bTaxable",
    "bTaxincluded",
    "bPay",
    "bTaxtable",
    "order"
})
public class GncEntry {

    @XmlElement(required = true)
    protected Guid guid;
    @XmlElement(required = true)
    protected TimeSpec date;
    @XmlElement(required = true)
    protected TimeSpec entered;
    protected String description;
    protected String action;
    protected String notes;
    protected String qty;
    @XmlElement(name = "i-acct")
    protected Guid iAcct;
    @XmlElement(name = "i-price")
    protected String iPrice;
    @XmlElement(name = "i-discount")
    protected String iDiscount;
    protected Guid invoice;
    @XmlElement(name = "i-disc-type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String iDiscType;
    @XmlElement(name = "i-disc-how")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String iDiscHow;
    @XmlElement(name = "i-taxable")
    protected Boolean iTaxable;
    @XmlElement(name = "i-taxincluded")
    protected Boolean iTaxincluded;
    @XmlElement(name = "i-taxtable")
    protected Guid iTaxtable;
    @XmlElement(name = "b-acct")
    protected Guid bAcct;
    @XmlElement(name = "b-price")
    protected String bPrice;
    protected Guid bill;
    protected Boolean billable;
    protected OwnerContent billto;
    @XmlElement(name = "b-taxable")
    protected Boolean bTaxable;
    @XmlElement(name = "b-taxincluded")
    protected Boolean bTaxincluded;
    @XmlElement(name = "b-pay")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bPay;
    @XmlElement(name = "b-taxtable")
    protected Guid bTaxtable;
    protected Guid order;
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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpec }
     *     
     */
    public TimeSpec getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpec }
     *     
     */
    public void setDate(TimeSpec value) {
        this.date = value;
    }

    /**
     * Gets the value of the entered property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpec }
     *     
     */
    public TimeSpec getEntered() {
        return entered;
    }

    /**
     * Sets the value of the entered property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpec }
     *     
     */
    public void setEntered(TimeSpec value) {
        this.entered = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
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
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQty(String value) {
        this.qty = value;
    }

    /**
     * Gets the value of the iAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getIAcct() {
        return iAcct;
    }

    /**
     * Sets the value of the iAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setIAcct(Guid value) {
        this.iAcct = value;
    }

    /**
     * Gets the value of the iPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPrice() {
        return iPrice;
    }

    /**
     * Sets the value of the iPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPrice(String value) {
        this.iPrice = value;
    }

    /**
     * Gets the value of the iDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDiscount() {
        return iDiscount;
    }

    /**
     * Sets the value of the iDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDiscount(String value) {
        this.iDiscount = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setInvoice(Guid value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the iDiscType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDiscType() {
        return iDiscType;
    }

    /**
     * Sets the value of the iDiscType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDiscType(String value) {
        this.iDiscType = value;
    }

    /**
     * Gets the value of the iDiscHow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDiscHow() {
        return iDiscHow;
    }

    /**
     * Sets the value of the iDiscHow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDiscHow(String value) {
        this.iDiscHow = value;
    }

    /**
     * Gets the value of the iTaxable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isITaxable() {
        return iTaxable;
    }

    /**
     * Sets the value of the iTaxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setITaxable(Boolean value) {
        this.iTaxable = value;
    }

    /**
     * Gets the value of the iTaxincluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isITaxincluded() {
        return iTaxincluded;
    }

    /**
     * Sets the value of the iTaxincluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setITaxincluded(Boolean value) {
        this.iTaxincluded = value;
    }

    /**
     * Gets the value of the iTaxtable property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getITaxtable() {
        return iTaxtable;
    }

    /**
     * Sets the value of the iTaxtable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setITaxtable(Guid value) {
        this.iTaxtable = value;
    }

    /**
     * Gets the value of the bAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getBAcct() {
        return bAcct;
    }

    /**
     * Sets the value of the bAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setBAcct(Guid value) {
        this.bAcct = value;
    }

    /**
     * Gets the value of the bPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPrice() {
        return bPrice;
    }

    /**
     * Sets the value of the bPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPrice(String value) {
        this.bPrice = value;
    }

    /**
     * Gets the value of the bill property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getBill() {
        return bill;
    }

    /**
     * Sets the value of the bill property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setBill(Guid value) {
        this.bill = value;
    }

    /**
     * Gets the value of the billable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBillable() {
        return billable;
    }

    /**
     * Sets the value of the billable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillable(Boolean value) {
        this.billable = value;
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
     * Gets the value of the bTaxable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBTaxable() {
        return bTaxable;
    }

    /**
     * Sets the value of the bTaxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBTaxable(Boolean value) {
        this.bTaxable = value;
    }

    /**
     * Gets the value of the bTaxincluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBTaxincluded() {
        return bTaxincluded;
    }

    /**
     * Sets the value of the bTaxincluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBTaxincluded(Boolean value) {
        this.bTaxincluded = value;
    }

    /**
     * Gets the value of the bPay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPay() {
        return bPay;
    }

    /**
     * Sets the value of the bPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPay(String value) {
        this.bPay = value;
    }

    /**
     * Gets the value of the bTaxtable property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getBTaxtable() {
        return bTaxtable;
    }

    /**
     * Sets the value of the bTaxtable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setBTaxtable(Guid value) {
        this.bTaxtable = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setOrder(Guid value) {
        this.order = value;
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
