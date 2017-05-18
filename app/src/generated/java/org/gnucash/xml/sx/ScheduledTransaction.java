
package org.gnucash.xml.sx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.gnucash.xml.gnc.GDate;
import org.gnucash.xml.gnc.Guid;
import org.gnucash.xml.slot.Slots;


/**
 * <p>Java class for ScheduledTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduledTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.gnucash.org/XML/sx}id"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/sx}name"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/sx}enabled"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/sx}autoCreate"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/sx}autoCreateNotify"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/sx}advanceCreateDays"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/sx}advanceRemindDays"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/sx}instanceCount"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/sx}start"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/sx}last" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element ref="{http://www.gnucash.org/XML/sx}num-occur"/>
 *             &lt;element ref="{http://www.gnucash.org/XML/sx}rem-occur"/>
 *           &lt;/sequence>
 *           &lt;element ref="{http://www.gnucash.org/XML/sx}end"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.gnucash.org/XML/sx}templ-acct"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/sx}schedule"/>
 *         &lt;element name="deferredInstance" type="{http://www.gnucash.org/XML/sx}DeferredInstance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/sx}slots" minOccurs="0"/>
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
@XmlType(name = "ScheduledTransaction", propOrder = {
    "id",
    "name",
    "enabled",
    "autoCreate",
    "autoCreateNotify",
    "advanceCreateDays",
    "advanceRemindDays",
    "instanceCount",
    "start",
    "last",
    "numOccur",
    "remOccur",
    "end",
    "templAcct",
    "schedule",
    "deferredInstance",
    "slots"
})
public class ScheduledTransaction {

    @XmlElement(required = true)
    protected Guid id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String enabled;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String autoCreate;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String autoCreateNotify;
    protected int advanceCreateDays;
    protected int advanceRemindDays;
    protected int instanceCount;
    @XmlElement(required = true)
    protected GDate start;
    protected GDate last;
    @XmlElement(name = "num-occur")
    protected Integer numOccur;
    @XmlElement(name = "rem-occur")
    protected Integer remOccur;
    protected GDate end;
    @XmlElement(name = "templ-acct", required = true)
    protected Guid templAcct;
    @XmlElement(required = true)
    protected Schedule schedule;
    protected List<DeferredInstance> deferredInstance;
    protected Slots slots;
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
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabled(String value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the autoCreate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoCreate() {
        return autoCreate;
    }

    /**
     * Sets the value of the autoCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoCreate(String value) {
        this.autoCreate = value;
    }

    /**
     * Gets the value of the autoCreateNotify property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoCreateNotify() {
        return autoCreateNotify;
    }

    /**
     * Sets the value of the autoCreateNotify property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoCreateNotify(String value) {
        this.autoCreateNotify = value;
    }

    /**
     * Gets the value of the advanceCreateDays property.
     * 
     */
    public int getAdvanceCreateDays() {
        return advanceCreateDays;
    }

    /**
     * Sets the value of the advanceCreateDays property.
     * 
     */
    public void setAdvanceCreateDays(int value) {
        this.advanceCreateDays = value;
    }

    /**
     * Gets the value of the advanceRemindDays property.
     * 
     */
    public int getAdvanceRemindDays() {
        return advanceRemindDays;
    }

    /**
     * Sets the value of the advanceRemindDays property.
     * 
     */
    public void setAdvanceRemindDays(int value) {
        this.advanceRemindDays = value;
    }

    /**
     * Gets the value of the instanceCount property.
     * 
     */
    public int getInstanceCount() {
        return instanceCount;
    }

    /**
     * Sets the value of the instanceCount property.
     * 
     */
    public void setInstanceCount(int value) {
        this.instanceCount = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link GDate }
     *     
     */
    public GDate getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link GDate }
     *     
     */
    public void setStart(GDate value) {
        this.start = value;
    }

    /**
     * Gets the value of the last property.
     * 
     * @return
     *     possible object is
     *     {@link GDate }
     *     
     */
    public GDate getLast() {
        return last;
    }

    /**
     * Sets the value of the last property.
     * 
     * @param value
     *     allowed object is
     *     {@link GDate }
     *     
     */
    public void setLast(GDate value) {
        this.last = value;
    }

    /**
     * Gets the value of the numOccur property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumOccur() {
        return numOccur;
    }

    /**
     * Sets the value of the numOccur property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumOccur(Integer value) {
        this.numOccur = value;
    }

    /**
     * Gets the value of the remOccur property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemOccur() {
        return remOccur;
    }

    /**
     * Sets the value of the remOccur property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemOccur(Integer value) {
        this.remOccur = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link GDate }
     *     
     */
    public GDate getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link GDate }
     *     
     */
    public void setEnd(GDate value) {
        this.end = value;
    }

    /**
     * Gets the value of the templAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getTemplAcct() {
        return templAcct;
    }

    /**
     * Sets the value of the templAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setTemplAcct(Guid value) {
        this.templAcct = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule }
     *     
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *     
     */
    public void setSchedule(Schedule value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the deferredInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deferredInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeferredInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeferredInstance }
     * 
     * 
     */
    public List<DeferredInstance> getDeferredInstance() {
        if (deferredInstance == null) {
            deferredInstance = new ArrayList<DeferredInstance>();
        }
        return this.deferredInstance;
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
