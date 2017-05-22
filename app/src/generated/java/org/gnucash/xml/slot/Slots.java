
package org.gnucash.xml.slot;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Slots complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Slots">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.gnucash.org/XML/slot}KvpSlot" maxOccurs="unbounded"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Slots", propOrder = {
    "kvpSlot"
})
@XmlSeeAlso({
    ValueFrame.class
})
public class Slots {

    @XmlElement(name = "slot", namespace = "", required = true)
    protected List<Slots.Slot> kvpSlot;

    /**
     * Gets the value of the kvpSlot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kvpSlot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKvpSlot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Slots.Slot }
     * 
     * 
     */
    public List<Slots.Slot> getKvpSlot() {
        if (kvpSlot == null) {
            kvpSlot = new ArrayList<Slots.Slot>();
        }
        return this.kvpSlot;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.gnucash.org/XML/slot}key"/>
     *         &lt;group ref="{http://www.gnucash.org/XML/slot}KvpValue"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class Slot {

        @XmlElementRefs({
            @XmlElementRef(name = "key", namespace = "http://www.gnucash.org/XML/slot", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "value", namespace = "http://www.gnucash.org/XML/slot", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<?>> content;

        /**
         * Gets the rest of the content model. 
         * 
         * <p>
         * You are getting this "catch-all" property because of the following reason: 
         * The field name "Value" is used by two different parts of a schema. See: 
         * line 140 of file:/Users/moshe/GitHub/pnemonic78/gnucash-merge/app/src/main/xsd/slot.xsd
         * line 139 of file:/Users/moshe/GitHub/pnemonic78/gnucash-merge/app/src/main/xsd/slot.xsd
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
         * {@link JAXBElement }{@code <}{@link Value }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
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

}
