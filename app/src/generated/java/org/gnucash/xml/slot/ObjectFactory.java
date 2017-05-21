
package org.gnucash.xml.slot;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.gnucash.xml.slot package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Key_QNAME = new QName("http://www.gnucash.org/XML/slot", "key");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.gnucash.xml.slot
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Slots }
     * 
     */
    public Slots createSlots() {
        return new Slots();
    }

    /**
     * Create an instance of {@link ValueNumeric }
     * 
     */
    public ValueNumeric createValueNumeric() {
        return new ValueNumeric();
    }

    /**
     * Create an instance of {@link KvpSlot }
     * 
     */
    public KvpSlot createKvpSlot() {
        return new KvpSlot();
    }

    /**
     * Create an instance of {@link ValueBinary }
     * 
     */
    public ValueBinary createValueBinary() {
        return new ValueBinary();
    }

    /**
     * Create an instance of {@link ValueGDate }
     * 
     */
    public ValueGDate createValueGDate() {
        return new ValueGDate();
    }

    /**
     * Create an instance of {@link ValueGUID }
     * 
     */
    public ValueGUID createValueGUID() {
        return new ValueGUID();
    }

    /**
     * Create an instance of {@link ValueTimeSpec }
     * 
     */
    public ValueTimeSpec createValueTimeSpec() {
        return new ValueTimeSpec();
    }

    /**
     * Create an instance of {@link ValueString }
     * 
     */
    public ValueString createValueString() {
        return new ValueString();
    }

    /**
     * Create an instance of {@link ValueFrame }
     * 
     */
    public ValueFrame createValueFrame() {
        return new ValueFrame();
    }

    /**
     * Create an instance of {@link ValueList }
     * 
     */
    public ValueList createValueList() {
        return new ValueList();
    }

    /**
     * Create an instance of {@link ValueDouble }
     * 
     */
    public ValueDouble createValueDouble() {
        return new ValueDouble();
    }

    /**
     * Create an instance of {@link ValueInteger }
     * 
     */
    public ValueInteger createValueInteger() {
        return new ValueInteger();
    }

    /**
     * Create an instance of {@link Value }
     * 
     */
    public Value createValue() {
        return new Value();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/slot", name = "key")
    public JAXBElement<String> createKey(String value) {
        return new JAXBElement<String>(_Key_QNAME, String.class, null, value);
    }

}
