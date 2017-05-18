
package org.gnucash.xml.split;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.gnucash.xml.gnc.Guid;
import org.gnucash.xml.gnc.TimeSpec;
import org.gnucash.xml.slot.Slots;


/**
 * <p>Java class for Split complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Split">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.gnucash.org/XML/split}id"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/split}memo" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/split}action" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/split}reconciled-state"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/split}reconcile-date" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/split}value"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/split}quantity"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/split}account"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/split}lot" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/split}slots" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Split", propOrder = {
    "id",
    "memo",
    "action",
    "reconciledState",
    "reconcileDate",
    "value",
    "quantity",
    "account",
    "lot",
    "slots"
})
public class Split {

    @XmlElement(required = true)
    protected Guid id;
    protected String memo;
    protected String action;
    @XmlElement(name = "reconciled-state", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String reconciledState;
    @XmlElement(name = "reconcile-date")
    protected TimeSpec reconcileDate;
    @XmlElement(required = true)
    protected String value;
    @XmlElement(required = true)
    protected String quantity;
    @XmlElement(required = true)
    protected Guid account;
    protected Guid lot;
    protected Slots slots;

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
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
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
     * Gets the value of the reconciledState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciledState() {
        return reconciledState;
    }

    /**
     * Sets the value of the reconciledState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciledState(String value) {
        this.reconciledState = value;
    }

    /**
     * Gets the value of the reconcileDate property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpec }
     *     
     */
    public TimeSpec getReconcileDate() {
        return reconcileDate;
    }

    /**
     * Sets the value of the reconcileDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpec }
     *     
     */
    public void setReconcileDate(TimeSpec value) {
        this.reconcileDate = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setAccount(Guid value) {
        this.account = value;
    }

    /**
     * Gets the value of the lot property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getLot() {
        return lot;
    }

    /**
     * Sets the value of the lot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setLot(Guid value) {
        this.lot = value;
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

}
