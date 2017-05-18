
package org.gnucash.xml.cust;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.gnucash.xml.addr.AddressContent;
import org.gnucash.xml.gnc.Currency;
import org.gnucash.xml.gnc.Guid;
import org.gnucash.xml.slot.Slots;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.gnucash.xml.cust package. 
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

    private final static QName _Active_QNAME = new QName("http://www.gnucash.org/XML/cust", "active");
    private final static QName _Currency_QNAME = new QName("http://www.gnucash.org/XML/cust", "currency");
    private final static QName _UseTt_QNAME = new QName("http://www.gnucash.org/XML/cust", "use-tt");
    private final static QName _Slots_QNAME = new QName("http://www.gnucash.org/XML/cust", "slots");
    private final static QName _Name_QNAME = new QName("http://www.gnucash.org/XML/cust", "name");
    private final static QName _Guid_QNAME = new QName("http://www.gnucash.org/XML/cust", "guid");
    private final static QName _Notes_QNAME = new QName("http://www.gnucash.org/XML/cust", "notes");
    private final static QName _Discount_QNAME = new QName("http://www.gnucash.org/XML/cust", "discount");
    private final static QName _Terms_QNAME = new QName("http://www.gnucash.org/XML/cust", "terms");
    private final static QName _Shipaddr_QNAME = new QName("http://www.gnucash.org/XML/cust", "shipaddr");
    private final static QName _Id_QNAME = new QName("http://www.gnucash.org/XML/cust", "id");
    private final static QName _Taxincluded_QNAME = new QName("http://www.gnucash.org/XML/cust", "taxincluded");
    private final static QName _Credit_QNAME = new QName("http://www.gnucash.org/XML/cust", "credit");
    private final static QName _Taxtable_QNAME = new QName("http://www.gnucash.org/XML/cust", "taxtable");
    private final static QName _Addr_QNAME = new QName("http://www.gnucash.org/XML/cust", "addr");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.gnucash.xml.cust
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GncCustomer }
     * 
     */
    public GncCustomer createGncCustomer() {
        return new GncCustomer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cust", name = "active")
    public JAXBElement<Boolean> createActive(Boolean value) {
        return new JAXBElement<Boolean>(_Active_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Currency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cust", name = "currency")
    public JAXBElement<Currency> createCurrency(Currency value) {
        return new JAXBElement<Currency>(_Currency_QNAME, Currency.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cust", name = "use-tt")
    public JAXBElement<Boolean> createUseTt(Boolean value) {
        return new JAXBElement<Boolean>(_UseTt_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Slots }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cust", name = "slots")
    public JAXBElement<Slots> createSlots(Slots value) {
        return new JAXBElement<Slots>(_Slots_QNAME, Slots.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cust", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cust", name = "guid")
    public JAXBElement<Guid> createGuid(Guid value) {
        return new JAXBElement<Guid>(_Guid_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cust", name = "notes")
    public JAXBElement<String> createNotes(String value) {
        return new JAXBElement<String>(_Notes_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cust", name = "discount")
    public JAXBElement<String> createDiscount(String value) {
        return new JAXBElement<String>(_Discount_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cust", name = "terms")
    public JAXBElement<Guid> createTerms(Guid value) {
        return new JAXBElement<Guid>(_Terms_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cust", name = "shipaddr")
    public JAXBElement<AddressContent> createShipaddr(AddressContent value) {
        return new JAXBElement<AddressContent>(_Shipaddr_QNAME, AddressContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cust", name = "id")
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cust", name = "taxincluded")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTaxincluded(String value) {
        return new JAXBElement<String>(_Taxincluded_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cust", name = "credit")
    public JAXBElement<String> createCredit(String value) {
        return new JAXBElement<String>(_Credit_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cust", name = "taxtable")
    public JAXBElement<Guid> createTaxtable(Guid value) {
        return new JAXBElement<Guid>(_Taxtable_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/cust", name = "addr")
    public JAXBElement<AddressContent> createAddr(AddressContent value) {
        return new JAXBElement<AddressContent>(_Addr_QNAME, AddressContent.class, null, value);
    }

}
