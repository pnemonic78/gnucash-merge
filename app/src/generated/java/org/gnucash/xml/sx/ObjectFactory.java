//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.17 at 11:44:24 AM IDT 
//


package org.gnucash.xml.sx;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.gnucash.xml.gnc.GDate;
import org.gnucash.xml.gnc.KvpSlots;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.gnucash.xml.sx package. 
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

    private final static QName _InstanceCount_QNAME = new QName("http://www.gnucash.org/XML/sx", "instanceCount");
    private final static QName _AutoCreate_QNAME = new QName("http://www.gnucash.org/XML/sx", "autoCreate");
    private final static QName _Enabled_QNAME = new QName("http://www.gnucash.org/XML/sx", "enabled");
    private final static QName _Name_QNAME = new QName("http://www.gnucash.org/XML/sx", "name");
    private final static QName _Slots_QNAME = new QName("http://www.gnucash.org/XML/sx", "slots");
    private final static QName _AdvanceCreateDays_QNAME = new QName("http://www.gnucash.org/XML/sx", "advanceCreateDays");
    private final static QName _Last_QNAME = new QName("http://www.gnucash.org/XML/sx", "last");
    private final static QName _RemOccur_QNAME = new QName("http://www.gnucash.org/XML/sx", "rem-occur");
    private final static QName _NumOccur_QNAME = new QName("http://www.gnucash.org/XML/sx", "num-occur");
    private final static QName _AdvanceRemindDays_QNAME = new QName("http://www.gnucash.org/XML/sx", "advanceRemindDays");
    private final static QName _Start_QNAME = new QName("http://www.gnucash.org/XML/sx", "start");
    private final static QName _End_QNAME = new QName("http://www.gnucash.org/XML/sx", "end");
    private final static QName _AutoCreateNotify_QNAME = new QName("http://www.gnucash.org/XML/sx", "autoCreateNotify");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.gnucash.xml.sx
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Id }
     * 
     */
    public Id createId() {
        return new Id();
    }

    /**
     * Create an instance of {@link TemplAcct }
     * 
     */
    public TemplAcct createTemplAcct() {
        return new TemplAcct();
    }

    /**
     * Create an instance of {@link Schedule }
     * 
     */
    public Schedule createSchedule() {
        return new Schedule();
    }

    /**
     * Create an instance of {@link DeferredInstance }
     * 
     */
    public DeferredInstance createDeferredInstance() {
        return new DeferredInstance();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/sx", name = "instanceCount")
    public JAXBElement<Integer> createInstanceCount(Integer value) {
        return new JAXBElement<Integer>(_InstanceCount_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/sx", name = "autoCreate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAutoCreate(String value) {
        return new JAXBElement<String>(_AutoCreate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/sx", name = "enabled")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEnabled(String value) {
        return new JAXBElement<String>(_Enabled_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/sx", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KvpSlots }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/sx", name = "slots")
    public JAXBElement<KvpSlots> createSlots(KvpSlots value) {
        return new JAXBElement<KvpSlots>(_Slots_QNAME, KvpSlots.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/sx", name = "advanceCreateDays")
    public JAXBElement<Integer> createAdvanceCreateDays(Integer value) {
        return new JAXBElement<Integer>(_AdvanceCreateDays_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/sx", name = "last")
    public JAXBElement<GDate> createLast(GDate value) {
        return new JAXBElement<GDate>(_Last_QNAME, GDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/sx", name = "rem-occur")
    public JAXBElement<Integer> createRemOccur(Integer value) {
        return new JAXBElement<Integer>(_RemOccur_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/sx", name = "num-occur")
    public JAXBElement<Integer> createNumOccur(Integer value) {
        return new JAXBElement<Integer>(_NumOccur_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/sx", name = "advanceRemindDays")
    public JAXBElement<Integer> createAdvanceRemindDays(Integer value) {
        return new JAXBElement<Integer>(_AdvanceRemindDays_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/sx", name = "start")
    public JAXBElement<GDate> createStart(GDate value) {
        return new JAXBElement<GDate>(_Start_QNAME, GDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/sx", name = "end")
    public JAXBElement<GDate> createEnd(GDate value) {
        return new JAXBElement<GDate>(_End_QNAME, GDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gnucash.org/XML/sx", name = "autoCreateNotify")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAutoCreateNotify(String value) {
        return new JAXBElement<String>(_AutoCreateNotify_QNAME, String.class, null, value);
    }

}