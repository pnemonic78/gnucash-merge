
package org.gnucash.xml.cd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for count-data complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="count-data">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="book"/>
 *             &lt;enumeration value="commodity"/>
 *             &lt;enumeration value="account"/>
 *             &lt;enumeration value="transaction"/>
 *             &lt;enumeration value="schedxaction"/>
 *             &lt;enumeration value="budget"/>
 *             &lt;enumeration value="price"/>
 *             &lt;enumeration value="gnc:GncBillTerm"/>
 *             &lt;enumeration value="gnc:GncCustomer"/>
 *             &lt;enumeration value="gnc:GncEmployee"/>
 *             &lt;enumeration value="gnc:GncEntry"/>
 *             &lt;enumeration value="gnc:GncInvoice"/>
 *             &lt;enumeration value="gnc:GncJob"/>
 *             &lt;enumeration value="gnc:GncOrder"/>
 *             &lt;enumeration value="gnc:GncTaxTable"/>
 *             &lt;enumeration value="gnc:GncVendor"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "count-data", propOrder = {
    "value"
})
public class CountData {

    @XmlValue
    protected int value;
    @XmlAttribute(name = "type", namespace = "http://www.gnucash.org/XML/cd", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

    /**
     * Gets the value of the value property.
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(int value) {
        this.value = value;
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

}
