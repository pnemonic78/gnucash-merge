
package org.gnucash.xml.taxtable;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.gnucash.xml.tte.GncTaxTableEntry;


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
 *         &lt;element name="GncTaxTableEntry" type="{http://www.gnucash.org/XML/tte}GncTaxTableEntry" maxOccurs="unbounded" minOccurs="0"/>
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
    "gncTaxTableEntry"
})
@XmlRootElement(name = "entries")
public class Entries {

    @XmlElement(name = "GncTaxTableEntry")
    protected List<GncTaxTableEntry> gncTaxTableEntry;

    /**
     * Gets the value of the gncTaxTableEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gncTaxTableEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGncTaxTableEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GncTaxTableEntry }
     * 
     * 
     */
    public List<GncTaxTableEntry> getGncTaxTableEntry() {
        if (gncTaxTableEntry == null) {
            gncTaxTableEntry = new ArrayList<GncTaxTableEntry>();
        }
        return this.gncTaxTableEntry;
    }

}
