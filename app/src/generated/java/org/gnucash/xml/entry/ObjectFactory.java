//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.17 at 11:44:24 AM IDT 
//


package org.gnucash.xml.entry;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.gnucash.xml.gnc.OwnerContent;
import org.gnucash.xml.gnc.TimeSpec;


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
    private final static QName _Notes_QNAME = new QName("http://www.gnucash.org/XML/entry", "notes");
    private final static QName _Qty_QNAME = new QName("http://www.gnucash.org/XML/entry", "qty");
    private final static QName _IDiscHow_QNAME = new QName("http://www.gnucash.org/XML/entry", "i-disc-how");
    private final static QName _IDiscType_QNAME = new QName("http://www.gnucash.org/XML/entry", "i-disc-type");
    private final static QName _BPay_QNAME = new QName("http://www.gnucash.org/XML/entry", "b-pay");
    private final static QName _Description_QNAME = new QName("http://www.gnucash.org/XML/entry", "description");
    private final static QName _Billto_QNAME = new QName("http://www.gnucash.org/XML/entry", "billto");
    private final static QName _ITaxincluded_QNAME = new QName("http://www.gnucash.org/XML/entry", "i-taxincluded");
    private final static QName _Billable_QNAME = new QName("http://www.gnucash.org/XML/entry", "billable");
    private final static QName _Action_QNAME = new QName("http://www.gnucash.org/XML/entry", "action");
    private final static QName _BTaxincluded_QNAME = new QName("http://www.gnucash.org/XML/entry", "b-taxincluded");
    private final static QName _BPrice_QNAME = new QName("http://www.gnucash.org/XML/entry", "b-price");
    private final static QName _IDiscount_QNAME = new QName("http://www.gnucash.org/XML/entry", "i-discount");
    private final static QName _BTaxable_QNAME = new QName("http://www.gnucash.org/XML/entry", "b-taxable");
    private final static QName _IPrice_QNAME = new QName("http://www.gnucash.org/XML/entry", "i-price");
    private final static QName _ITaxable_QNAME = new QName("http://www.gnucash.org/XML/entry", "i-taxable");
    private final static QName _Entered_QNAME = new QName("http://www.gnucash.org/XML/entry", "entered");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.gnucash.xml.entry
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Guid }
     * 
     */
    public Guid createGuid() {
        return new Guid();
    }

    /**
     * Create an instance of {@link IAcct }
     * 
     */
    public IAcct createIAcct() {
        return new IAcct();
    }

    /**
     * Create an instance of {@link Invoice }
     * 
     */
    public Invoice createInvoice() {
        return new Invoice();
    }

    /**
     * Create an instance of {@link ITaxtable }
     * 
     */
    public ITaxtable createITaxtable() {
        return new ITaxtable();
    }

    /**
     * Create an instance of {@link BAcct }
     * 
     */
    public BAcct createBAcct() {
        return new BAcct();
    }

    /**
     * Create an instance of {@link Bill }
     * 
     */
    public Bill createBill() {
        return new Bill();
    }

    /**
     * Create an instance of {@link BTaxtable }
     * 
     */
    public BTaxtable createBTaxtable() {
        return new BTaxtable();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
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
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "notes")
    public JAXBElement<String> createNotes(String value) {
        return new JAXBElement<String>(_Notes_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "action")
    public JAXBElement<String> createAction(String value) {
        return new JAXBElement<String>(_Action_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "i-price")
    public JAXBElement<String> createIPrice(String value) {
        return new JAXBElement<String>(_IPrice_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSpec }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/entry", name = "entered")
    public JAXBElement<TimeSpec> createEntered(TimeSpec value) {
        return new JAXBElement<TimeSpec>(_Entered_QNAME, TimeSpec.class, null, value);
    }

}
