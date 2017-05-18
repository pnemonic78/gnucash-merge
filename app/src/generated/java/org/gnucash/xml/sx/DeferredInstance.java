
package org.gnucash.xml.sx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.gnucash.xml.gnc.GDate;


/**
 * <p>Java class for DeferredInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeferredInstance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.gnucash.org/XML/sx}last" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/sx}rem-occur"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/sx}instanceCount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeferredInstance", propOrder = {
    "last",
    "remOccur",
    "instanceCount"
})
public class DeferredInstance {

    protected GDate last;
    @XmlElement(name = "rem-occur")
    protected int remOccur;
    protected int instanceCount;

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
     * Gets the value of the remOccur property.
     * 
     */
    public int getRemOccur() {
        return remOccur;
    }

    /**
     * Sets the value of the remOccur property.
     * 
     */
    public void setRemOccur(int value) {
        this.remOccur = value;
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

}
