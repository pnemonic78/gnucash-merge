
package org.gnucash.xml.slot;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.gnucash.xml.gnc.TimeSpec;


/**
 * <p>Java class for valueTimeSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="valueTimeSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.gnucash.org/XML/gnc}TimeSpec">
 *       &lt;attribute name="type" use="required" type="{http://www.gnucash.org/XML/slot}ValueType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valueTimeSpec")
public class ValueTimeSpec
    extends TimeSpec
{

    @XmlAttribute(name = "type", required = true)
    protected ValueType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setType(ValueType value) {
        this.type = value;
    }

}
