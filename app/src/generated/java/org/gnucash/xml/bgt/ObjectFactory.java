
package org.gnucash.xml.bgt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.gnucash.xml.gnc.Guid;
import org.gnucash.xml.recurrence.RecurrenceContent;
import org.gnucash.xml.slot.Slots;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.gnucash.xml.bgt package. 
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

    private final static QName _Id_QNAME = new QName("http://www.gnucash.org/XML/bgt", "id");
    private final static QName _Recurrence_QNAME = new QName("http://www.gnucash.org/XML/bgt", "recurrence");
    private final static QName _NumPeriods_QNAME = new QName("http://www.gnucash.org/XML/bgt", "num-periods");
    private final static QName _Slots_QNAME = new QName("http://www.gnucash.org/XML/bgt", "slots");
    private final static QName _Name_QNAME = new QName("http://www.gnucash.org/XML/bgt", "name");
    private final static QName _Description_QNAME = new QName("http://www.gnucash.org/XML/bgt", "description");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.gnucash.xml.bgt
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Budget }
     * 
     */
    public Budget createBudget() {
        return new Budget();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/bgt", name = "id")
    public JAXBElement<Guid> createId(Guid value) {
        return new JAXBElement<Guid>(_Id_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecurrenceContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/bgt", name = "recurrence")
    public JAXBElement<RecurrenceContent> createRecurrence(RecurrenceContent value) {
        return new JAXBElement<RecurrenceContent>(_Recurrence_QNAME, RecurrenceContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/bgt", name = "num-periods")
    public JAXBElement<Integer> createNumPeriods(Integer value) {
        return new JAXBElement<Integer>(_NumPeriods_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Slots }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/bgt", name = "slots")
    public JAXBElement<Slots> createSlots(Slots value) {
        return new JAXBElement<Slots>(_Slots_QNAME, Slots.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/bgt", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/bgt", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

}
