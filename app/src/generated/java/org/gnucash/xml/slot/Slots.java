
package org.gnucash.xml.slot;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for slots complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="slots">
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
@XmlType(name = "slots", propOrder = {
    "kvpSlot"
})
public class Slots {

    @XmlElement(name = "slot", namespace = "", required = true)
    protected List<org.gnucash.xml.slot.ValueFrame.Slot> kvpSlot;

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
     * {@link org.gnucash.xml.slot.ValueFrame.Slot }
     * 
     * 
     */
    public List<org.gnucash.xml.slot.ValueFrame.Slot> getKvpSlot() {
        if (kvpSlot == null) {
            kvpSlot = new ArrayList<org.gnucash.xml.slot.ValueFrame.Slot>();
        }
        return this.kvpSlot;
    }

}
