
package org.gnucash.xml.slot;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="integer"/>
 *     &lt;enumeration value="double"/>
 *     &lt;enumeration value="numeric"/>
 *     &lt;enumeration value="string"/>
 *     &lt;enumeration value="guid"/>
 *     &lt;enumeration value="timespec"/>
 *     &lt;enumeration value="gdate"/>
 *     &lt;enumeration value="binary"/>
 *     &lt;enumeration value="list"/>
 *     &lt;enumeration value="frame"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValueType")
@XmlEnum
public enum ValueType {

    @XmlEnumValue("integer")
    INTEGER("integer"),
    @XmlEnumValue("double")
    DOUBLE("double"),
    @XmlEnumValue("numeric")
    NUMERIC("numeric"),
    @XmlEnumValue("string")
    STRING("string"),
    @XmlEnumValue("guid")
    GUID("guid"),
    @XmlEnumValue("timespec")
    TIMESPEC("timespec"),
    @XmlEnumValue("gdate")
    GDATE("gdate"),
    @XmlEnumValue("binary")
    BINARY("binary"),
    @XmlEnumValue("list")
    LIST("list"),
    @XmlEnumValue("frame")
    FRAME("frame");
    private final String value;

    ValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValueType fromValue(String v) {
        for (ValueType c: ValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
