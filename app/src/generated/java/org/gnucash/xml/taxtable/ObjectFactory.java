
package org.gnucash.xml.taxtable;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.gnucash.xml.gnc.Guid;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.gnucash.xml.taxtable package. 
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

    private final static QName _Parent_QNAME = new QName("http://www.gnucash.org/XML/taxtable", "parent");
    private final static QName _Guid_QNAME = new QName("http://www.gnucash.org/XML/taxtable", "guid");
    private final static QName _Name_QNAME = new QName("http://www.gnucash.org/XML/taxtable", "name");
    private final static QName _Child_QNAME = new QName("http://www.gnucash.org/XML/taxtable", "child");
    private final static QName _Refcount_QNAME = new QName("http://www.gnucash.org/XML/taxtable", "refcount");
    private final static QName _Invisible_QNAME = new QName("http://www.gnucash.org/XML/taxtable", "invisible");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.gnucash.xml.taxtable
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Entries }
     * 
     */
    public Entries createEntries() {
        return new Entries();
    }

    /**
     * Create an instance of {@link GncTaxTable }
     * 
     */
    public GncTaxTable createGncTaxTable() {
        return new GncTaxTable();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/taxtable", name = "parent")
    public JAXBElement<Guid> createParent(Guid value) {
        return new JAXBElement<Guid>(_Parent_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/taxtable", name = "guid")
    public JAXBElement<Guid> createGuid(Guid value) {
        return new JAXBElement<Guid>(_Guid_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/taxtable", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/taxtable", name = "child")
    public JAXBElement<Guid> createChild(Guid value) {
        return new JAXBElement<Guid>(_Child_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/taxtable", name = "refcount")
    public JAXBElement<Integer> createRefcount(Integer value) {
        return new JAXBElement<Integer>(_Refcount_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/taxtable", name = "invisible")
    public JAXBElement<Boolean> createInvisible(Boolean value) {
        return new JAXBElement<Boolean>(_Invisible_QNAME, Boolean.class, null, value);
    }

}
