
package org.gnucash.xml.order;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.gnucash.xml.gnc.Guid;
import org.gnucash.xml.gnc.TimeSpec;
import org.gnucash.xml.owner.OwnerContent;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.gnucash.xml.order package. 
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

    private final static QName _Id_QNAME = new QName("http://www.gnucash.org/XML/order", "id");
    private final static QName _Opened_QNAME = new QName("http://www.gnucash.org/XML/order", "opened");
    private final static QName _Reference_QNAME = new QName("http://www.gnucash.org/XML/order", "reference");
    private final static QName _Active_QNAME = new QName("http://www.gnucash.org/XML/order", "active");
    private final static QName _Closed_QNAME = new QName("http://www.gnucash.org/XML/order", "closed");
    private final static QName _Guid_QNAME = new QName("http://www.gnucash.org/XML/order", "guid");
    private final static QName _Notes_QNAME = new QName("http://www.gnucash.org/XML/order", "notes");
    private final static QName _Owner_QNAME = new QName("http://www.gnucash.org/XML/order", "owner");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.gnucash.xml.order
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GncOrder }
     * 
     */
    public GncOrder createGncOrder() {
        return new GncOrder();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/order", name = "id")
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSpec }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/order", name = "opened")
    public JAXBElement<TimeSpec> createOpened(TimeSpec value) {
        return new JAXBElement<TimeSpec>(_Opened_QNAME, TimeSpec.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/order", name = "reference")
    public JAXBElement<String> createReference(String value) {
        return new JAXBElement<String>(_Reference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/order", name = "active")
    public JAXBElement<Boolean> createActive(Boolean value) {
        return new JAXBElement<Boolean>(_Active_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSpec }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/order", name = "closed")
    public JAXBElement<TimeSpec> createClosed(TimeSpec value) {
        return new JAXBElement<TimeSpec>(_Closed_QNAME, TimeSpec.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/order", name = "guid")
    public JAXBElement<Guid> createGuid(Guid value) {
        return new JAXBElement<Guid>(_Guid_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/order", name = "notes")
    public JAXBElement<String> createNotes(String value) {
        return new JAXBElement<String>(_Notes_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnerContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/order", name = "owner")
    public JAXBElement<OwnerContent> createOwner(OwnerContent value) {
        return new JAXBElement<OwnerContent>(_Owner_QNAME, OwnerContent.class, null, value);
    }

}
