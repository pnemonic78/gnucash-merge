
package org.gnucash.xml.cmdty;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.gnucash.xml.slot.Slots;


/**
 * <p>Java class for Commodity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Commodity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;group ref="{http://www.gnucash.org/XML/cmdty}space"/>
 *             &lt;element ref="{http://www.gnucash.org/XML/cmdty}id"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;group ref="{http://www.gnucash.org/XML/cmdty}space1"/>
 *             &lt;element ref="{http://www.gnucash.org/XML/cmdty}id"/>
 *             &lt;element ref="{http://www.gnucash.org/XML/cmdty}name" minOccurs="0"/>
 *             &lt;element ref="{http://www.gnucash.org/XML/cmdty}xcode" minOccurs="0"/>
 *             &lt;element ref="{http://www.gnucash.org/XML/cmdty}fraction"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://www.gnucash.org/XML/cmdty}get_quotes"/>
 *           &lt;element ref="{http://www.gnucash.org/XML/cmdty}quote_source" minOccurs="0"/>
 *           &lt;element ref="{http://www.gnucash.org/XML/cmdty}quote_tz" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.gnucash.org/XML/cmdty}slots" minOccurs="0"/>
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
@XmlType(name = "Commodity", propOrder = {
    "content"
})
public class Commodity {

    @XmlElementRefs({
        @XmlElementRef(name = "get_quotes", namespace = "http://www.gnucash.org/XML/cmdty", type = GetQuotes.class, required = false),
        @XmlElementRef(name = "quote_source", namespace = "http://www.gnucash.org/XML/cmdty", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "slots", namespace = "http://www.gnucash.org/XML/cmdty", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "xcode", namespace = "http://www.gnucash.org/XML/cmdty", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fraction", namespace = "http://www.gnucash.org/XML/cmdty", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "name", namespace = "http://www.gnucash.org/XML/cmdty", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "quote_tz", namespace = "http://www.gnucash.org/XML/cmdty", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "space", namespace = "http://www.gnucash.org/XML/cmdty", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "id", namespace = "http://www.gnucash.org/XML/cmdty", type = JAXBElement.class, required = false)
    })
    protected List<Object> content;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Space" is used by two different parts of a schema. See: 
     * line 44 of file:/Users/moshe/GitHub/pnemonic78/gnucash-merge/app/src/main/xsd/cmdty.xsd
     * line 32 of file:/Users/moshe/GitHub/pnemonic78/gnucash-merge/app/src/main/xsd/cmdty.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetQuotes }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Slots }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
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
