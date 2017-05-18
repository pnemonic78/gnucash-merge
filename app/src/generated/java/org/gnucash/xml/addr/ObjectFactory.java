
package org.gnucash.xml.addr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.gnucash.xml.addr package. 
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

    private final static QName _Email_QNAME = new QName("http://www.gnucash.org/XML/addr", "email");
    private final static QName _Name_QNAME = new QName("http://www.gnucash.org/XML/addr", "name");
    private final static QName _Fax_QNAME = new QName("http://www.gnucash.org/XML/addr", "fax");
    private final static QName _Phone_QNAME = new QName("http://www.gnucash.org/XML/addr", "phone");
    private final static QName _Addr1_QNAME = new QName("http://www.gnucash.org/XML/addr", "addr1");
    private final static QName _Addr2_QNAME = new QName("http://www.gnucash.org/XML/addr", "addr2");
    private final static QName _Addr3_QNAME = new QName("http://www.gnucash.org/XML/addr", "addr3");
    private final static QName _Addr4_QNAME = new QName("http://www.gnucash.org/XML/addr", "addr4");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.gnucash.xml.addr
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddressContent }
     * 
     */
    public AddressContent createAddressContent() {
        return new AddressContent();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/addr", name = "email")
    public JAXBElement<String> createEmail(String value) {
        return new JAXBElement<String>(_Email_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/addr", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/addr", name = "fax")
    public JAXBElement<String> createFax(String value) {
        return new JAXBElement<String>(_Fax_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/addr", name = "phone")
    public JAXBElement<String> createPhone(String value) {
        return new JAXBElement<String>(_Phone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/addr", name = "addr1")
    public JAXBElement<String> createAddr1(String value) {
        return new JAXBElement<String>(_Addr1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/addr", name = "addr2")
    public JAXBElement<String> createAddr2(String value) {
        return new JAXBElement<String>(_Addr2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/addr", name = "addr3")
    public JAXBElement<String> createAddr3(String value) {
        return new JAXBElement<String>(_Addr3_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/addr", name = "addr4")
    public JAXBElement<String> createAddr4(String value) {
        return new JAXBElement<String>(_Addr4_QNAME, String.class, null, value);
    }

}
