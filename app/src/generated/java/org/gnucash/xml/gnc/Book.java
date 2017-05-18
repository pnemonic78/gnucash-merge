
package org.gnucash.xml.gnc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.gnucash.xml.act.Account;
import org.gnucash.xml.bgt.Budget;
import org.gnucash.xml.billterm.GncBillTerm;
import org.gnucash.xml.cd.CountData;
import org.gnucash.xml.cmdty.Commodity;
import org.gnucash.xml.cust.GncCustomer;
import org.gnucash.xml.employee.GncEmployee;
import org.gnucash.xml.entry.GncEntry;
import org.gnucash.xml.invoice.GncInvoice;
import org.gnucash.xml.job.GncJob;
import org.gnucash.xml.order.GncOrder;
import org.gnucash.xml.price.PriceDb;
import org.gnucash.xml.slot.Slots;
import org.gnucash.xml.sx.ScheduledTransaction;
import org.gnucash.xml.taxtable.GncTaxTable;
import org.gnucash.xml.trn.TemplateTransactions;
import org.gnucash.xml.trn.Transaction;
import org.gnucash.xml.vendor.GncVendor;


/**
 * <p>Java class for Book complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Book">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.gnucash.org/XML/book}id"/>
 *         &lt;element ref="{http://www.gnucash.org/XML/book}slots" minOccurs="0"/>
 *         &lt;element name="count-data" type="{http://www.gnucash.org/XML/cd}count-data" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="commodity" type="{http://www.gnucash.org/XML/cmdty}Commodity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pricedb" type="{http://www.gnucash.org/XML/price}PriceDb" minOccurs="0"/>
 *         &lt;element name="account" type="{http://www.gnucash.org/XML/act}Account" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transaction" type="{http://www.gnucash.org/XML/trn}Transaction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="template-transactions" type="{http://www.gnucash.org/XML/trn}TemplateTransactions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="schedxaction" type="{http://www.gnucash.org/XML/sx}ScheduledTransaction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="budget" type="{http://www.gnucash.org/XML/bgt}Budget" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GncBillTerm" type="{http://www.gnucash.org/XML/billterm}GncBillTerm" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GncCustomer" type="{http://www.gnucash.org/XML/cust}GncCustomer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GncEmployee" type="{http://www.gnucash.org/XML/employee}GncEmployee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GncEntry" type="{http://www.gnucash.org/XML/entry}GncEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GncInvoice" type="{http://www.gnucash.org/XML/invoice}GncInvoice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GncJob" type="{http://www.gnucash.org/XML/job}GncJob" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GncOrder" type="{http://www.gnucash.org/XML/order}GncOrder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GncTaxTable" type="{http://www.gnucash.org/XML/taxtable}GncTaxTable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GncVendor" type="{http://www.gnucash.org/XML/vendor}GncVendor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="2.0.0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Book", propOrder = {
    "id",
    "slots",
    "countData",
    "commodity",
    "pricedb",
    "account",
    "transaction",
    "templateTransactions",
    "schedxaction",
    "budget",
    "gncBillTerm",
    "gncCustomer",
    "gncEmployee",
    "gncEntry",
    "gncInvoice",
    "gncJob",
    "gncOrder",
    "gncTaxTable",
    "gncVendor"
})
public class Book {

    @XmlElement(namespace = "http://www.gnucash.org/XML/book", required = true)
    protected Guid id;
    @XmlElement(namespace = "http://www.gnucash.org/XML/book")
    protected Slots slots;
    @XmlElement(name = "count-data")
    protected List<CountData> countData;
    protected List<Commodity> commodity;
    protected PriceDb pricedb;
    protected List<Account> account;
    protected List<Transaction> transaction;
    @XmlElement(name = "template-transactions")
    protected List<TemplateTransactions> templateTransactions;
    protected List<ScheduledTransaction> schedxaction;
    protected List<Budget> budget;
    @XmlElement(name = "GncBillTerm")
    protected List<GncBillTerm> gncBillTerm;
    @XmlElement(name = "GncCustomer")
    protected List<GncCustomer> gncCustomer;
    @XmlElement(name = "GncEmployee")
    protected List<GncEmployee> gncEmployee;
    @XmlElement(name = "GncEntry")
    protected List<GncEntry> gncEntry;
    @XmlElement(name = "GncInvoice")
    protected List<GncInvoice> gncInvoice;
    @XmlElement(name = "GncJob")
    protected List<GncJob> gncJob;
    @XmlElement(name = "GncOrder")
    protected List<GncOrder> gncOrder;
    @XmlElement(name = "GncTaxTable")
    protected List<GncTaxTable> gncTaxTable;
    @XmlElement(name = "GncVendor")
    protected List<GncVendor> gncVendor;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setId(Guid value) {
        this.id = value;
    }

    /**
     * Gets the value of the slots property.
     * 
     * @return
     *     possible object is
     *     {@link Slots }
     *     
     */
    public Slots getSlots() {
        return slots;
    }

    /**
     * Sets the value of the slots property.
     * 
     * @param value
     *     allowed object is
     *     {@link Slots }
     *     
     */
    public void setSlots(Slots value) {
        this.slots = value;
    }

    /**
     * Gets the value of the countData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountData }
     * 
     * 
     */
    public List<CountData> getCountData() {
        if (countData == null) {
            countData = new ArrayList<CountData>();
        }
        return this.countData;
    }

    /**
     * Gets the value of the commodity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commodity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommodity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commodity }
     * 
     * 
     */
    public List<Commodity> getCommodity() {
        if (commodity == null) {
            commodity = new ArrayList<Commodity>();
        }
        return this.commodity;
    }

    /**
     * Gets the value of the pricedb property.
     * 
     * @return
     *     possible object is
     *     {@link PriceDb }
     *     
     */
    public PriceDb getPricedb() {
        return pricedb;
    }

    /**
     * Sets the value of the pricedb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDb }
     *     
     */
    public void setPricedb(PriceDb value) {
        this.pricedb = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account }
     * 
     * 
     */
    public List<Account> getAccount() {
        if (account == null) {
            account = new ArrayList<Account>();
        }
        return this.account;
    }

    /**
     * Gets the value of the transaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transaction }
     * 
     * 
     */
    public List<Transaction> getTransaction() {
        if (transaction == null) {
            transaction = new ArrayList<Transaction>();
        }
        return this.transaction;
    }

    /**
     * Gets the value of the templateTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemplateTransactions }
     * 
     * 
     */
    public List<TemplateTransactions> getTemplateTransactions() {
        if (templateTransactions == null) {
            templateTransactions = new ArrayList<TemplateTransactions>();
        }
        return this.templateTransactions;
    }

    /**
     * Gets the value of the schedxaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedxaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchedxaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduledTransaction }
     * 
     * 
     */
    public List<ScheduledTransaction> getSchedxaction() {
        if (schedxaction == null) {
            schedxaction = new ArrayList<ScheduledTransaction>();
        }
        return this.schedxaction;
    }

    /**
     * Gets the value of the budget property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the budget property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBudget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Budget }
     * 
     * 
     */
    public List<Budget> getBudget() {
        if (budget == null) {
            budget = new ArrayList<Budget>();
        }
        return this.budget;
    }

    /**
     * Gets the value of the gncBillTerm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gncBillTerm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGncBillTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GncBillTerm }
     * 
     * 
     */
    public List<GncBillTerm> getGncBillTerm() {
        if (gncBillTerm == null) {
            gncBillTerm = new ArrayList<GncBillTerm>();
        }
        return this.gncBillTerm;
    }

    /**
     * Gets the value of the gncCustomer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gncCustomer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGncCustomer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GncCustomer }
     * 
     * 
     */
    public List<GncCustomer> getGncCustomer() {
        if (gncCustomer == null) {
            gncCustomer = new ArrayList<GncCustomer>();
        }
        return this.gncCustomer;
    }

    /**
     * Gets the value of the gncEmployee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gncEmployee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGncEmployee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GncEmployee }
     * 
     * 
     */
    public List<GncEmployee> getGncEmployee() {
        if (gncEmployee == null) {
            gncEmployee = new ArrayList<GncEmployee>();
        }
        return this.gncEmployee;
    }

    /**
     * Gets the value of the gncEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gncEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGncEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GncEntry }
     * 
     * 
     */
    public List<GncEntry> getGncEntry() {
        if (gncEntry == null) {
            gncEntry = new ArrayList<GncEntry>();
        }
        return this.gncEntry;
    }

    /**
     * Gets the value of the gncInvoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gncInvoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGncInvoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GncInvoice }
     * 
     * 
     */
    public List<GncInvoice> getGncInvoice() {
        if (gncInvoice == null) {
            gncInvoice = new ArrayList<GncInvoice>();
        }
        return this.gncInvoice;
    }

    /**
     * Gets the value of the gncJob property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gncJob property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGncJob().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GncJob }
     * 
     * 
     */
    public List<GncJob> getGncJob() {
        if (gncJob == null) {
            gncJob = new ArrayList<GncJob>();
        }
        return this.gncJob;
    }

    /**
     * Gets the value of the gncOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gncOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGncOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GncOrder }
     * 
     * 
     */
    public List<GncOrder> getGncOrder() {
        if (gncOrder == null) {
            gncOrder = new ArrayList<GncOrder>();
        }
        return this.gncOrder;
    }

    /**
     * Gets the value of the gncTaxTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gncTaxTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGncTaxTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GncTaxTable }
     * 
     * 
     */
    public List<GncTaxTable> getGncTaxTable() {
        if (gncTaxTable == null) {
            gncTaxTable = new ArrayList<GncTaxTable>();
        }
        return this.gncTaxTable;
    }

    /**
     * Gets the value of the gncVendor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gncVendor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGncVendor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GncVendor }
     * 
     * 
     */
    public List<GncVendor> getGncVendor() {
        if (gncVendor == null) {
            gncVendor = new ArrayList<GncVendor>();
        }
        return this.gncVendor;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
