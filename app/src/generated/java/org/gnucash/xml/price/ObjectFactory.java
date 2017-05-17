//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.17 at 11:44:24 AM IDT 
//


package org.gnucash.xml.price;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.gnucash.xml.gnc.TimeSpec;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.gnucash.xml.price package. 
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

    private final static QName _Value_QNAME = new QName("http://www.gnucash.org/XML/price", "value");
    private final static QName _Time_QNAME = new QName("http://www.gnucash.org/XML/price", "time");
    private final static QName _Source_QNAME = new QName("http://www.gnucash.org/XML/price", "source");
    private final static QName _Type_QNAME = new QName("http://www.gnucash.org/XML/price", "type");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.gnucash.xml.price
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Commodity }
     * 
     */
    public Commodity createCommodity() {
        return new Commodity();
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

    /**
     * Create an instance of {@link Id }
     * 
     */
    public Id createId() {
        return new Id();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/price", name = "value")
    public JAXBElement<String> createValue(String value) {
        return new JAXBElement<String>(_Value_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSpec }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/price", name = "time")
    public JAXBElement<TimeSpec> createTime(TimeSpec value) {
        return new JAXBElement<TimeSpec>(_Time_QNAME, TimeSpec.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/price", name = "source")
    public JAXBElement<String> createSource(String value) {
        return new JAXBElement<String>(_Source_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/price", name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

}