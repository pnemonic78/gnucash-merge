
package org.gnucash.xml.entry;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.gnucash.xml.gnc.Guid;
import org.gnucash.xml.gnc.TimeSpec;
import org.gnucash.xml.owner.OwnerContent;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.gnucash.xml.entry package. 
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

    private final static QName _Date_QNAME = new QName("http://www.gnucash.org/XML/entry", "date");
    private final static QName _IDiscType_QNAME = new QName("http://www.gnucash.org/XML/entry", "i-disc-type");
    private final static QName _BPay_QNAME = new QName("http://www.gnucash.org/XML/entry", "b-pay");
    private final static QName _Billto_QNAME = new QName("http://www.gnucash.org/XML/entry", "billto");
    private final static QName _Invoice_QNAME = new QName("http://www.gnucash.org/XML/entry", "invoice");
    private final static QName _Action_QNAME = new QName("http://www.gnucash.org/XML/entry", "action");
    private final static QName _Order_QNAME = new QName("http://www.gnucash.org/XML/entry", "order");
    private final static QName _BTaxincluded_QNAME = new QName("http://www.gnucash.org/XML/entry", "b-taxincluded");
    private final static QName _IAcct_QNAME = new QName("http://www.gnucash.org/XML/entry", "i-acct");
    private final static QName _ITaxtable_QNAME = new QName("http://www.gnucash.org/XML/entry", "i-taxtable");
    private final static QName _BPrice_QNAME = new QName("http://www.gnucash.org/XML/entry", "b-price");
    private final static QName _IPrice_QNAME = new QName("http://www.gnucash.org/XML/entry", "i-price");
    private final static QName _BAcct_QNAME = new QName("http://www.gnucash.org/XML/entry", "b-acct");
    private final static QName _ITaxable_QNAME = new QName("http://www.gnucash.org/XML/entry", "i-taxable");
    private final static QName _Notes_QNAME = new QName("http://www.gnucash.org/XML/entry", "notes");
    private final static QName _BTaxtable_QNAME = new QName("http://www.gnucash.org/XML/entry", "b-taxtable");
    private final static QName _Qty_QNAME = new QName("http://www.gnucash.org/XML/entry", "qty");
    private final static QName _Guid_QNAME = new QName("http://www.gnucash.org/XML/entry", "guid");
    private final static QName _IDiscHow_QNAME = new QName("http://www.gnucash.org/XML/entry", "i-disc-how");
    private final static QName _Description_QNAME = new QName("http://www.gnucash.org/XML/entry", "description");
    private final static QName _ITaxincluded_QNAME = new QName("http://www.gnucash.org/XML/entry", "i-taxincluded");
    private final static QName _Billable_QNAME = new QName("http://www.gnucash.org/XML/entry", "billable");
    private final static QName _Bill_QNAME = new QName("http://www.gnucash.org/XML/entry", "bill");
    private final static QName _IDiscount_QNAME = new QName("http://www.gnucash.org/XML/entry", "i-discount");
    private final static QName _BTaxable_QNAME = new QName("http://www.gnucash.org/XML/entry", "b-taxable");
    private final static QName _Entered_QNAME = new QName("http://www.gnucash.org/XML/entry", "entered");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.gnucash.xml.entry
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GncEntry }
     * 
     */
    public GncEntry createGncEntry() {
        return new GncEntry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSpec }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "date")
    public JAXBElement<TimeSpec> createDate(TimeSpec value) {
        return new JAXBElement<TimeSpec>(_Date_QNAME, TimeSpec.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "i-disc-type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIDiscType(String value) {
        return new JAXBElement<String>(_IDiscType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "b-pay")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBPay(String value) {
        return new JAXBElement<String>(_BPay_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnerContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "billto")
    public JAXBElement<OwnerContent> createBillto(OwnerContent value) {
        return new JAXBElement<OwnerContent>(_Billto_QNAME, OwnerContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "invoice")
    public JAXBElement<Guid> createInvoice(Guid value) {
        return new JAXBElement<Guid>(_Invoice_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "action")
    public JAXBElement<String> createAction(String value) {
        return new JAXBElement<String>(_Action_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "order")
    public JAXBElement<Guid> createOrder(Guid value) {
        return new JAXBElement<Guid>(_Order_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "b-taxincluded")
    public JAXBElement<Boolean> createBTaxincluded(Boolean value) {
        return new JAXBElement<Boolean>(_BTaxincluded_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "i-acct")
    public JAXBElement<Guid> createIAcct(Guid value) {
        return new JAXBElement<Guid>(_IAcct_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "i-taxtable")
    public JAXBElement<Guid> createITaxtable(Guid value) {
        return new JAXBElement<Guid>(_ITaxtable_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "b-price")
    public JAXBElement<String> createBPrice(String value) {
        return new JAXBElement<String>(_BPrice_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "i-price")
    public JAXBElement<String> createIPrice(String value) {
        return new JAXBElement<String>(_IPrice_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "b-acct")
    public JAXBElement<Guid> createBAcct(Guid value) {
        return new JAXBElement<Guid>(_BAcct_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "i-taxable")
    public JAXBElement<Boolean> createITaxable(Boolean value) {
        return new JAXBElement<Boolean>(_ITaxable_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "notes")
    public JAXBElement<String> createNotes(String value) {
        return new JAXBElement<String>(_Notes_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "b-taxtable")
    public JAXBElement<Guid> createBTaxtable(Guid value) {
        return new JAXBElement<Guid>(_BTaxtable_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "qty")
    public JAXBElement<String> createQty(String value) {
        return new JAXBElement<String>(_Qty_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "guid")
    public JAXBElement<Guid> createGuid(Guid value) {
        return new JAXBElement<Guid>(_Guid_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "i-disc-how")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIDiscHow(String value) {
        return new JAXBElement<String>(_IDiscHow_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "i-taxincluded")
    public JAXBElement<Boolean> createITaxincluded(Boolean value) {
        return new JAXBElement<Boolean>(_ITaxincluded_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "billable")
    public JAXBElement<Boolean> createBillable(Boolean value) {
        return new JAXBElement<Boolean>(_Billable_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "bill")
    public JAXBElement<Guid> createBill(Guid value) {
        return new JAXBElement<Guid>(_Bill_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "i-discount")
    public JAXBElement<String> createIDiscount(String value) {
        return new JAXBElement<String>(_IDiscount_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "b-taxable")
    public JAXBElement<Boolean> createBTaxable(Boolean value) {
        return new JAXBElement<Boolean>(_BTaxable_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSpec }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "entered")
    public JAXBElement<TimeSpec> createEntered(TimeSpec value) {
        return new JAXBElement<TimeSpec>(_Entered_QNAME, TimeSpec.class, null, value);
    }

}
