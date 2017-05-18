
package org.gnucash.xml.act;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.gnucash.xml.gnc.Currency;
import org.gnucash.xml.gnc.Guid;
import org.gnucash.xml.slot.Slots;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.gnucash.xml.act package. 
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

    private final static QName _Type_QNAME = new QName("http://www.gnucash.org/XML/act", "type");
    private final static QName _Id_QNAME = new QName("http://www.gnucash.org/XML/act", "id");
    private final static QName _Code_QNAME = new QName("http://www.gnucash.org/XML/act", "code");
    private final static QName _CommodityScu_QNAME = new QName("http://www.gnucash.org/XML/act", "commodity-scu");
    private final static QName _Commodity_QNAME = new QName("http://www.gnucash.org/XML/act", "commodity");
    private final static QName _Parent_QNAME = new QName("http://www.gnucash.org/XML/act", "parent");
    private final static QName _Description_QNAME = new QName("http://www.gnucash.org/XML/act", "description");
    private final static QName _Name_QNAME = new QName("http://www.gnucash.org/XML/act", "name");
    private final static QName _Slots_QNAME = new QName("http://www.gnucash.org/XML/act", "slots");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.gnucash.xml.act
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Lots }
     * 
     */
    public Lots createLots() {
        return new Lots();
    }

    /**
     * Create an instance of {@link NonStandardScu }
     * 
     */
    public NonStandardScu createNonStandardScu() {
        return new NonStandardScu();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/act", name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/act", name = "id")
    public JAXBElement<Guid> createId(Guid value) {
        return new JAXBElement<Guid>(_Id_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/act", name = "code")
    public JAXBElement<String> createCode(String value) {
        return new JAXBElement<String>(_Code_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/act", name = "commodity-scu")
    public JAXBElement<Integer> createCommodityScu(Integer value) {
        return new JAXBElement<Integer>(_CommodityScu_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Currency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/act", name = "commodity")
    public JAXBElement<Currency> createCommodity(Currency value) {
        return new JAXBElement<Currency>(_Commodity_QNAME, Currency.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/act", name = "parent")
    public JAXBElement<Guid> createParent(Guid value) {
        return new JAXBElement<Guid>(_Parent_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/act", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/act", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Slots }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/act", name = "slots")
    public JAXBElement<Slots> createSlots(Slots value) {
        return new JAXBElement<Slots>(_Slots_QNAME, Slots.class, null, value);
    }

}
