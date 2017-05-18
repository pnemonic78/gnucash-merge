
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
 *         &lt;element ref="{http://www.gnucash.org/XML/bt-days}due-days" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/bt-days}disc-days" minOccurs="0"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/bt-days}discount" minOccurs="0"/>
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
    "dueDays",
    "discDays",
    "discount"
})
@XmlRootElement(name = "days")
public class Days {

    @XmlElement(name = "due-days", namespace = "http://www.gnucash.org/XML/bt-days")
    protected Integer dueDays;
    @XmlElement(name = "disc-days", namespace = "http://www.gnucash.org/XML/bt-days")
    protected Integer discDays;
    @XmlElement(namespace = "http://www.gnucash.org/XML/bt-days")
    protected String discount;

    /**
     * Gets the value of the dueDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDueDays() {
        return dueDays;
    }

    /**
     * Sets the value of the dueDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDueDays(Integer value) {
        this.dueDays = value;
    }

    /**
     * Gets the value of the discDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiscDays() {
        return discDays;
    }

    /**
     * Sets the value of the discDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiscDays(Integer value) {
        this.discDays = value;
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

}
