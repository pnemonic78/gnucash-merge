
package org.gnucash.xml.bt_days;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.gnucash.xml.bt_days package. 
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

    private final static QName _Discount_QNAME = new QName("http://www.gnucash.org/XML/bt-days", "discount");
    private final static QName _DueDays_QNAME = new QName("http://www.gnucash.org/XML/bt-days", "due-days");
    private final static QName _DiscDays_QNAME = new QName("http://www.gnucash.org/XML/bt-days", "disc-days");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.gnucash.xml.bt_days
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/bt-days", name = "discount")
    public JAXBElement<String> createDiscount(String value) {
        return new JAXBElement<String>(_Discount_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/bt-days", name = "due-days")
    public JAXBElement<Integer> createDueDays(Integer value) {
        return new JAXBElement<Integer>(_DueDays_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/bt-days", name = "disc-days")
    public JAXBElement<Integer> createDiscDays(Integer value) {
        return new JAXBElement<Integer>(_DiscDays_QNAME, Integer.class, null, value);
    }

}
