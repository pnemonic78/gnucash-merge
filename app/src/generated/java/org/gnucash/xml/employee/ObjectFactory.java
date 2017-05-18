
package org.gnucash.xml.employee;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.gnucash.xml.addr.AddressContent;
import org.gnucash.xml.gnc.Currency;
import org.gnucash.xml.gnc.Guid;
import org.gnucash.xml.slot.Slots;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.gnucash.xml.employee package. 
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

    private final static QName _Id_QNAME = new QName("http://www.gnucash.org/XML/employee", "id");
    private final static QName _Addr_QNAME = new QName("http://www.gnucash.org/XML/employee", "addr");
    private final static QName _Active_QNAME = new QName("http://www.gnucash.org/XML/employee", "active");
    private final static QName _Workday_QNAME = new QName("http://www.gnucash.org/XML/employee", "workday");
    private final static QName _Currency_QNAME = new QName("http://www.gnucash.org/XML/employee", "currency");
    private final static QName _Ccard_QNAME = new QName("http://www.gnucash.org/XML/employee", "ccard");
    private final static QName _Guid_QNAME = new QName("http://www.gnucash.org/XML/employee", "guid");
    private final static QName _Slots_QNAME = new QName("http://www.gnucash.org/XML/employee", "slots");
    private final static QName _Acl_QNAME = new QName("http://www.gnucash.org/XML/employee", "acl");
    private final static QName _Language_QNAME = new QName("http://www.gnucash.org/XML/employee", "language");
    private final static QName _Username_QNAME = new QName("http://www.gnucash.org/XML/employee", "username");
    private final static QName _Rate_QNAME = new QName("http://www.gnucash.org/XML/employee", "rate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.gnucash.xml.employee
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GncEmployee }
     * 
     */
    public GncEmployee createGncEmployee() {
        return new GncEmployee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/employee", name = "id")
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/employee", name = "addr")
    public JAXBElement<AddressContent> createAddr(AddressContent value) {
        return new JAXBElement<AddressContent>(_Addr_QNAME, AddressContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/employee", name = "active")
    public JAXBElement<Boolean> createActive(Boolean value) {
        return new JAXBElement<Boolean>(_Active_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/employee", name = "workday")
    public JAXBElement<String> createWorkday(String value) {
        return new JAXBElement<String>(_Workday_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Currency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/employee", name = "currency")
    public JAXBElement<Currency> createCurrency(Currency value) {
        return new JAXBElement<Currency>(_Currency_QNAME, Currency.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/employee", name = "ccard")
    public JAXBElement<Guid> createCcard(Guid value) {
        return new JAXBElement<Guid>(_Ccard_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/employee", name = "guid")
    public JAXBElement<Guid> createGuid(Guid value) {
        return new JAXBElement<Guid>(_Guid_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Slots }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/employee", name = "slots")
    public JAXBElement<Slots> createSlots(Slots value) {
        return new JAXBElement<Slots>(_Slots_QNAME, Slots.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/employee", name = "acl")
    public JAXBElement<String> createAcl(String value) {
        return new JAXBElement<String>(_Acl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/employee", name = "language")
    public JAXBElement<String> createLanguage(String value) {
        return new JAXBElement<String>(_Language_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/employee", name = "username")
    public JAXBElement<String> createUsername(String value) {
        return new JAXBElement<String>(_Username_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/employee", name = "rate")
    public JAXBElement<String> createRate(String value) {
        return new JAXBElement<String>(_Rate_QNAME, String.class, null, value);
    }

}
