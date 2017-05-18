
package org.gnucash.xml.trn;

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
import org.gnucash.xml.slot.Slots;


/**
 * <p>Java class for Transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.gnucash.org/XML/trn}id"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/trn}currency"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/trn}num" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/trn}date-posted"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/trn}date-entered"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/trn}description" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/trn}slots" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/trn}splits"/>
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
@XmlType(name = "Transaction", propOrder = {
    "id",
    "currency",
    "num",
    "datePosted",
    "dateEntered",
    "description",
    "slots",
    "splits"
})
public class Transaction {

    @XmlElement(required = true)
    protected Guid id;
    @XmlElement(required = true)
    protected Currency currency;
    protected String num;
    @XmlElement(name = "date-posted", required = true)
    protected TimeSpec datePosted;
    @XmlElement(name = "date-entered", required = true)
    protected TimeSpec dateEntered;
    protected String description;
    protected Slots slots;
    @XmlElement(required = true)
    protected Splits splits;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setId(Guid value) {
        this.id = value;
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
     * Gets the value of the num property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNum() {
        return num;
    }

    /**
     * Sets the value of the num property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNum(String value) {
        this.num = value;
    }

    /**
     * Gets the value of the datePosted property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpec }
     *     
     */
    public TimeSpec getDatePosted() {
        return datePosted;
    }

    /**
     * Sets the value of the datePosted property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpec }
     *     
     */
    public void setDatePosted(TimeSpec value) {
        this.datePosted = value;
    }

    /**
     * Gets the value of the dateEntered property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpec }
     *     
     */
    public TimeSpec getDateEntered() {
        return dateEntered;
    }

    /**
     * Sets the value of the dateEntered property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpec }
     *     
     */
    public void setDateEntered(TimeSpec value) {
        this.dateEntered = value;
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
     * Gets the value of the splits property.
     * 
     * @return
     *     possible object is
     *     {@link Splits }
     *     
     */
    public Splits getSplits() {
        return splits;
    }

    /**
     * Sets the value of the splits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Splits }
     *     
     */
    public void setSplits(Splits value) {
        this.splits = value;
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
