
package org.gnucash.xml.act;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.gnucash.xml.gnc.Currency;
import org.gnucash.xml.gnc.Guid;
import org.gnucash.xml.slot.Slots;


/**
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.gnucash.org/XML/act}name"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/act}id"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/act}type"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://www.gnucash.org/XML/act}commodity"/>
 *           &lt;element ref="{http://www.gnucash.org/XML/act}commodity-scu"/>
 *           &lt;element ref="{http://www.gnucash.org/XML/act}non-standard-scu" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.gnucash.org/XML/act}code" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/act}description" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/act}slots" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/act}parent" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/act}lots" minOccurs="0"/>
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
@XmlType(name = "Account", propOrder = {
    "name",
    "id",
    "type",
    "commodity",
    "commodityScu",
    "nonStandardScu",
    "code",
    "description",
    "slots",
    "parent",
    "lots"
})
public class Account {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected Guid id;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    protected Currency commodity;
    @XmlElement(name = "commodity-scu")
    protected Integer commodityScu;
    @XmlElement(name = "non-standard-scu")
    protected NonStandardScu nonStandardScu;
    protected String code;
    protected String description;
    protected Slots slots;
    protected Guid parent;
    protected Lots lots;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the commodity property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCommodity() {
        return commodity;
    }

    /**
     * Sets the value of the commodity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCommodity(Currency value) {
        this.commodity = value;
    }

    /**
     * Gets the value of the commodityScu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCommodityScu() {
        return commodityScu;
    }

    /**
     * Sets the value of the commodityScu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommodityScu(Integer value) {
        this.commodityScu = value;
    }

    /**
     * Gets the value of the nonStandardScu property.
     * 
     * @return
     *     possible object is
     *     {@link NonStandardScu }
     *     
     */
    public NonStandardScu getNonStandardScu() {
        return nonStandardScu;
    }

    /**
     * Sets the value of the nonStandardScu property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonStandardScu }
     *     
     */
    public void setNonStandardScu(NonStandardScu value) {
        this.nonStandardScu = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
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
     * Gets the value of the lots property.
     * 
     * @return
     *     possible object is
     *     {@link Lots }
     *     
     */
    public Lots getLots() {
        return lots;
    }

    /**
     * Sets the value of the lots property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lots }
     *     
     */
    public void setLots(Lots value) {
        this.lots = value;
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
