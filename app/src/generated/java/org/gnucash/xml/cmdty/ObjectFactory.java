//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.17 at 11:44:24 AM IDT 
//


package org.gnucash.xml.cmdty;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.gnucash.xml.gnc.KvpSlots;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.gnucash.xml.cmdty package. 
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

    private final static QName _QuoteSource_QNAME = new QName("http://www.gnucash.org/XML/cmdty", "quote_source");
    private final static QName _Xcode_QNAME = new QName("http://www.gnucash.org/XML/cmdty", "xcode");
    private final static QName _Name_QNAME = new QName("http://www.gnucash.org/XML/cmdty", "name");
    private final static QName _QuoteTz_QNAME = new QName("http://www.gnucash.org/XML/cmdty", "quote_tz");
    private final static QName _Slots_QNAME = new QName("http://www.gnucash.org/XML/cmdty", "slots");
    private final static QName _Id_QNAME = new QName("http://www.gnucash.org/XML/cmdty", "id");
    private final static QName _Fraction_QNAME = new QName("http://www.gnucash.org/XML/cmdty", "fraction");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.gnucash.xml.cmdty
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetQuotes }
     * 
     */
    public GetQuotes createGetQuotes() {
        return new GetQuotes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cmdty", name = "quote_source")
    public JAXBElement<String> createQuoteSource(String value) {
        return new JAXBElement<String>(_QuoteSource_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cmdty", name = "xcode")
    public JAXBElement<String> createXcode(String value) {
        return new JAXBElement<String>(_Xcode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cmdty", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cmdty", name = "quote_tz")
    public JAXBElement<String> createQuoteTz(String value) {
        return new JAXBElement<String>(_QuoteTz_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KvpSlots }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cmdty", name = "slots")
    public JAXBElement<KvpSlots> createSlots(KvpSlots value) {
        return new JAXBElement<KvpSlots>(_Slots_QNAME, KvpSlots.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cmdty", name = "id")
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cmdty", name = "fraction")
    public JAXBElement<String> createFraction(String value) {
        return new JAXBElement<String>(_Fraction_QNAME, String.class, null, value);
    }

}