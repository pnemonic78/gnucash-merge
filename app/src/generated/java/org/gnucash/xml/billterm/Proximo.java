
package org.gnucash.xml.billterm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.gnucash.org/XML/bt-prox}due-day" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/bt-prox}disc-day" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/bt-prox}discount" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/bt-prox}cutoff-day" minOccurs="0"/>
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
    "dueDay",
    "discDay",
    "discount",
    "cutoffDay"
})
@XmlRootElement(name = "proximo")
public class Proximo {

    @XmlElement(name = "due-day", namespace = "http://www.gnucash.org/XML/bt-prox")
    protected Integer dueDay;
    @XmlElement(name = "disc-day", namespace = "http://www.gnucash.org/XML/bt-prox")
    protected Integer discDay;
    @XmlElement(namespace = "http://www.gnucash.org/XML/bt-prox")
    protected String discount;
    @XmlElement(name = "cutoff-day", namespace = "http://www.gnucash.org/XML/bt-prox")
    protected Integer cutoffDay;

    /**
     * Gets the value of the dueDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDueDay() {
        return dueDay;
    }

    /**
     * Sets the value of the dueDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDueDay(Integer value) {
        this.dueDay = value;
    }

    /**
     * Gets the value of the discDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiscDay() {
        return discDay;
    }

    /**
     * Sets the value of the discDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiscDay(Integer value) {
        this.discDay = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscount(String value) {
        this.discount = value;
    }

    /**
     * Gets the value of the cutoffDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCutoffDay() {
        return cutoffDay;
    }

    /**
     * Sets the value of the cutoffDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCutoffDay(Integer value) {
        this.cutoffDay = value;
    }

}
