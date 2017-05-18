
package org.gnucash.xml.gnc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import org.gnucash.xml.act.Account;
import org.gnucash.xml.cmdty.Commodity;


/**
 * <p>Java class for GnuCashXml complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GnuCashXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="count-data" type="{http://www.gnucash.org/XML/gnc}count-data"/>
 *           &lt;element name="book" type="{http://www.gnucash.org/XML/gnc}Book"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="count-data" type="{http://www.gnucash.org/XML/gnc}count-data" maxOccurs="2" minOccurs="0"/>
 *           &lt;element name="commodity" type="{http://www.gnucash.org/XML/cmdty}Commodity" minOccurs="0"/>
 *           &lt;element name="account" type="{http://www.gnucash.org/XML/act}Account" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GnuCashXml", propOrder = {
    "content"
})
public class GnuCashXml {

    @XmlElementRefs({
        @XmlElementRef(name = "book", namespace = "http://www.gnucash.org/XML/gnc", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "account", namespace = "http://www.gnucash.org/XML/gnc", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "commodity", namespace = "http://www.gnucash.org/XML/gnc", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "count-data", namespace = "http://www.gnucash.org/XML/gnc", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "CountData" is used by two different parts of a schema. See: 
     * line 68 of file:/Users/moshe/GitHub/pnemonic78/gnucash-merge/app/src/main/xsd/gnc.xsd
     * line 64 of file:/Users/moshe/GitHub/pnemonic78/gnucash-merge/app/src/main/xsd/gnc.xsd
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
     * {@link JAXBElement }{@code <}{@link Account }{@code >}
     * {@link JAXBElement }{@code <}{@link Commodity }{@code >}
     * {@link JAXBElement }{@code <}{@link CountData }{@code >}
     * {@link JAXBElement }{@code <}{@link Book }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
