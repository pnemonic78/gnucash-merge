
package org.gnucash.xml.gnc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.gnucash.xml.act.Account;
import org.gnucash.xml.cmdty.Commodity;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.gnucash.xml.gnc package. 
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

    private final static QName _GnuCashXmlCommodity_QNAME = new QName("http://www.gnucash.org/XML/gnc", "commodity");
    private final static QName _GnuCashXmlBook_QNAME = new QName("http://www.gnucash.org/XML/gnc", "book");
    private final static QName _GnuCashXmlCountData_QNAME = new QName("http://www.gnucash.org/XML/gnc", "count-data");
    private final static QName _GnuCashXmlAccount_QNAME = new QName("http://www.gnucash.org/XML/gnc", "account");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.gnucash.xml.gnc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GnuCashXml }
     * 
     */
    public GnuCashXml createGnuCashXml() {
        return new GnuCashXml();
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

    /**
     * Create an instance of {@link Guid }
     * 
     */
    public Guid createGuid() {
        return new Guid();
    }

    /**
     * Create an instance of {@link TimeSpec }
     * 
     */
    public TimeSpec createTimeSpec() {
        return new TimeSpec();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link CountData }
     * 
     */
    public CountData createCountData() {
        return new CountData();
    }

    /**
     * Create an instance of {@link GDate }
     * 
     */
    public GDate createGDate() {
        return new GDate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Commodity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/gnc", name = "commodity", scope = GnuCashXml.class)
    public JAXBElement<Commodity> createGnuCashXmlCommodity(Commodity value) {
        return new JAXBElement<Commodity>(_GnuCashXmlCommodity_QNAME, Commodity.class, GnuCashXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Book }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/gnc", name = "book", scope = GnuCashXml.class)
    public JAXBElement<Book> createGnuCashXmlBook(Book value) {
        return new JAXBElement<Book>(_GnuCashXmlBook_QNAME, Book.class, GnuCashXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/gnc", name = "count-data", scope = GnuCashXml.class, defaultValue = "1")
    public JAXBElement<CountData> createGnuCashXmlCountData(CountData value) {
        return new JAXBElement<CountData>(_GnuCashXmlCountData_QNAME, CountData.class, GnuCashXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/gnc", name = "account", scope = GnuCashXml.class)
    public JAXBElement<Account> createGnuCashXmlAccount(Account value) {
        return new JAXBElement<Account>(_GnuCashXmlAccount_QNAME, Account.class, GnuCashXml.class, value);
    }

}
