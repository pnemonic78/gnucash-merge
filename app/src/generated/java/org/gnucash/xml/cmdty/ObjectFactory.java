
package org.gnucash.xml.cmdty;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.gnucash.xml.slot.Slots;


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

    private final static QName _Xcode_QNAME = new QName("http://www.gnucash.org/XML/cmdty", "xcode");
    private final static QName _Name_QNAME = new QName("http://www.gnucash.org/XML/cmdty", "name");
    private final static QName _QuoteTz_QNAME = new QName("http://www.gnucash.org/XML/cmdty", "quote_tz");
    private final static QName _Slots_QNAME = new QName("http://www.gnucash.org/XML/cmdty", "slots");
    private final static QName _QuoteSource_QNAME = new QName("http://www.gnucash.org/XML/cmdty", "quote_source");
    private final static QName _Id_QNAME = new QName("http://www.gnucash.org/XML/cmdty", "id");
    private final static QName _Fraction_QNAME = new QName("http://www.gnucash.org/XML/cmdty", "fraction");
    private final static QName _CommoditySpace_QNAME = new QName("http://www.gnucash.org/XML/cmdty", "space");

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
     * Create an instance of {@link Commodity }
     * 
     */
    public Commodity createCommodity() {
        return new Commodity();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Slots }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cmdty", name = "slots")
    public JAXBElement<Slots> createSlots(Slots value) {
        return new JAXBElement<Slots>(_Slots_QNAME, Slots.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cmdty", name = "space", scope = Commodity.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCommoditySpace(String value) {
        return new JAXBElement<String>(_CommoditySpace_QNAME, String.class, Commodity.class, value);
    }

}
