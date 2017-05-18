
package org.gnucash.xml.invoice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.gnucash.xml.gnc.Currency;
import org.gnucash.xml.gnc.Guid;
import org.gnucash.xml.gnc.TimeSpec;
import org.gnucash.xml.owner.OwnerContent;
import org.gnucash.xml.slot.Slots;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.gnucash.xml.invoice package. 
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

    private final static QName _Billto_QNAME = new QName("http://www.gnucash.org/XML/invoice", "billto");
    private final static QName _Opened_QNAME = new QName("http://www.gnucash.org/XML/invoice", "opened");
    private final static QName _Posttxn_QNAME = new QName("http://www.gnucash.org/XML/invoice", "posttxn");
    private final static QName _Postacc_QNAME = new QName("http://www.gnucash.org/XML/invoice", "postacc");
    private final static QName _ChargeAmt_QNAME = new QName("http://www.gnucash.org/XML/invoice", "charge-amt");
    private final static QName _Id_QNAME = new QName("http://www.gnucash.org/XML/invoice", "id");
    private final static QName _Terms_QNAME = new QName("http://www.gnucash.org/XML/invoice", "terms");
    private final static QName _Owner_QNAME = new QName("http://www.gnucash.org/XML/invoice", "owner");
    private final static QName _BillingId_QNAME = new QName("http://www.gnucash.org/XML/invoice", "billing_id");
    private final static QName _Guid_QNAME = new QName("http://www.gnucash.org/XML/invoice", "guid");
    private final static QName _Slots_QNAME = new QName("http://www.gnucash.org/XML/invoice", "slots");
    private final static QName _Notes_QNAME = new QName("http://www.gnucash.org/XML/invoice", "notes");
    private final static QName _Posted_QNAME = new QName("http://www.gnucash.org/XML/invoice", "posted");
    private final static QName _Currency_QNAME = new QName("http://www.gnucash.org/XML/invoice", "currency");
    private final static QName _Active_QNAME = new QName("http://www.gnucash.org/XML/invoice", "active");
    private final static QName _Postlot_QNAME = new QName("http://www.gnucash.org/XML/invoice", "postlot");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.gnucash.xml.invoice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GncInvoice }
     * 
     */
    public GncInvoice createGncInvoice() {
        return new GncInvoice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnerContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/invoice", name = "billto")
    public JAXBElement<OwnerContent> createBillto(OwnerContent value) {
        return new JAXBElement<OwnerContent>(_Billto_QNAME, OwnerContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSpec }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/invoice", name = "opened")
    public JAXBElement<TimeSpec> createOpened(TimeSpec value) {
        return new JAXBElement<TimeSpec>(_Opened_QNAME, TimeSpec.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/invoice", name = "posttxn")
    public JAXBElement<Guid> createPosttxn(Guid value) {
        return new JAXBElement<Guid>(_Posttxn_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/invoice", name = "postacc")
    public JAXBElement<Guid> createPostacc(Guid value) {
        return new JAXBElement<Guid>(_Postacc_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/invoice", name = "charge-amt")
    public JAXBElement<String> createChargeAmt(String value) {
        return new JAXBElement<String>(_ChargeAmt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/invoice", name = "id")
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/invoice", name = "terms")
    public JAXBElement<Guid> createTerms(Guid value) {
        return new JAXBElement<Guid>(_Terms_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnerContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/invoice", name = "owner")
    public JAXBElement<OwnerContent> createOwner(OwnerContent value) {
        return new JAXBElement<OwnerContent>(_Owner_QNAME, OwnerContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/invoice", name = "billing_id")
    public JAXBElement<String> createBillingId(String value) {
        return new JAXBElement<String>(_BillingId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/invoice", name = "guid")
    public JAXBElement<Guid> createGuid(Guid value) {
        return new JAXBElement<Guid>(_Guid_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Slots }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/invoice", name = "slots")
    public JAXBElement<Slots> createSlots(Slots value) {
        return new JAXBElement<Slots>(_Slots_QNAME, Slots.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/invoice", name = "notes")
    public JAXBElement<String> createNotes(String value) {
        return new JAXBElement<String>(_Notes_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSpec }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/invoice", name = "posted")
    public JAXBElement<TimeSpec> createPosted(TimeSpec value) {
        return new JAXBElement<TimeSpec>(_Posted_QNAME, TimeSpec.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Currency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/invoice", name = "currency")
    public JAXBElement<Currency> createCurrency(Currency value) {
        return new JAXBElement<Currency>(_Currency_QNAME, Currency.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/invoice", name = "active")
    public JAXBElement<Boolean> createActive(Boolean value) {
        return new JAXBElement<Boolean>(_Active_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/invoice", name = "postlot")
    public JAXBElement<Guid> createPostlot(Guid value) {
        return new JAXBElement<Guid>(_Postlot_QNAME, Guid.class, null, value);
    }

}
