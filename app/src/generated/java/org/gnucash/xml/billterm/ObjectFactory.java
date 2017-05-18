
package org.gnucash.xml.billterm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.gnucash.xml.gnc.Guid;
import org.gnucash.xml.slot.Slots;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.gnucash.xml.billterm package. 
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

    private final static QName _Invisible_QNAME = new QName("http://www.gnucash.org/XML/billterm", "invisible");
    private final static QName _Desc_QNAME = new QName("http://www.gnucash.org/XML/billterm", "desc");
    private final static QName _Child_QNAME = new QName("http://www.gnucash.org/XML/billterm", "child");
    private final static QName _Name_QNAME = new QName("http://www.gnucash.org/XML/billterm", "name");
    private final static QName _Guid_QNAME = new QName("http://www.gnucash.org/XML/billterm", "guid");
    private final static QName _Slots_QNAME = new QName("http://www.gnucash.org/XML/billterm", "slots");
    private final static QName _Refcount_QNAME = new QName("http://www.gnucash.org/XML/billterm", "refcount");
    private final static QName _Parent_QNAME = new QName("http://www.gnucash.org/XML/billterm", "parent");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.gnucash.xml.billterm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Proximo }
     * 
     */
    public Proximo createProximo() {
        return new Proximo();
    }

    /**
     * Create an instance of {@link Days }
     * 
     */
    public Days createDays() {
        return new Days();
    }

    /**
     * Create an instance of {@link GncBillTerm }
     * 
     */
    public GncBillTerm createGncBillTerm() {
        return new GncBillTerm();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/billterm", name = "invisible")
    public JAXBElement<Boolean> createInvisible(Boolean value) {
        return new JAXBElement<Boolean>(_Invisible_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/billterm", name = "desc")
    public JAXBElement<String> createDesc(String value) {
        return new JAXBElement<String>(_Desc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/billterm", name = "child")
    public JAXBElement<Guid> createChild(Guid value) {
        return new JAXBElement<Guid>(_Child_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/billterm", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/billterm", name = "guid")
    public JAXBElement<Guid> createGuid(Guid value) {
        return new JAXBElement<Guid>(_Guid_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Slots }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/billterm", name = "slots")
    public JAXBElement<Slots> createSlots(Slots value) {
        return new JAXBElement<Slots>(_Slots_QNAME, Slots.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/billterm", name = "refcount")
    public JAXBElement<Integer> createRefcount(Integer value) {
        return new JAXBElement<Integer>(_Refcount_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/billterm", name = "parent")
    public JAXBElement<Guid> createParent(Guid value) {
        return new JAXBElement<Guid>(_Parent_QNAME, Guid.class, null, value);
    }

}
