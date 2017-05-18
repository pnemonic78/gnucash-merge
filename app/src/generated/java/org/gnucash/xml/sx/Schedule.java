
package org.gnucash.xml.sx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.gnucash.xml.recurrence.RecurrenceContent;


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
 *         &lt;element ref="{http://www.gnucash.org/XML/recurrence}recurrence" maxOccurs="unbounded" minOccurs="0"/>
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
    "recurrence"
})
@XmlRootElement(name = "schedule")
public class Schedule {

    @XmlElement(namespace = "http://www.gnucash.org/XML/recurrence")
    protected List<RecurrenceContent> recurrence;

    /**
     * Gets the value of the recurrence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recurrence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurrence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecurrenceContent }
     * 
     * 
     */
    public List<RecurrenceContent> getRecurrence() {
        if (recurrence == null) {
            recurrence = new ArrayList<RecurrenceContent>();
        }
        return this.recurrence;
    }

}
