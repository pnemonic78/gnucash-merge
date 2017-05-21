/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge;

import org.gnucash.xml.act.Account;
import org.gnucash.xml.bgt.Budget;
import org.gnucash.xml.billterm.GncBillTerm;
import org.gnucash.xml.cd.CountData;
import org.gnucash.xml.cmdty.Commodity;
import org.gnucash.xml.cust.GncCustomer;
import org.gnucash.xml.employee.GncEmployee;
import org.gnucash.xml.entry.GncEntry;
import org.gnucash.xml.gnc.Book;
import org.gnucash.xml.gnc.GnuCashXml;
import org.gnucash.xml.invoice.GncInvoice;
import org.gnucash.xml.job.GncJob;
import org.gnucash.xml.order.GncOrder;
import org.gnucash.xml.price.Price;
import org.gnucash.xml.price.PriceDb;
import org.gnucash.xml.slot.Slots;
import org.gnucash.xml.slot.ValueFrame;
import org.gnucash.xml.sx.ScheduledTransaction;
import org.gnucash.xml.taxtable.GncTaxTable;
import org.gnucash.xml.trn.Transaction;
import org.gnucash.xml.vendor.GncVendor;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;

/**
 * Merge gnucash files.
 *
 * @author Moshe Waisberg
 */
public class Merger {
    public static void main(String[] args) throws Exception {
        System.out.println("gnucash merge.");
        if (args.length < 2) {
            System.out.println("args: primary-file secondary-file [destination-file]");
            System.exit(1);
            return;
        }

        File primaryFile = new File(args[0]);
        File secondaryFile = new File(args[1]);
        File destinationFile = (args.length > 2) ? new File(args[2]) : primaryFile;
        new Merger().merge(primaryFile, secondaryFile, destinationFile);
    }

    protected final org.gnucash.xml.ObjectFactory factory = new org.gnucash.xml.ObjectFactory();
    protected final org.gnucash.xml.gnc.ObjectFactory gncFactory = new org.gnucash.xml.gnc.ObjectFactory();
    protected final org.gnucash.xml.cd.ObjectFactory counterFactory = new org.gnucash.xml.cd.ObjectFactory();

    /**
     * Merge gnucash files.
     *
     * @param primaryFile     The primary file.
     * @param secondaryFile   The secondary file with changes.
     * @param destinationFile The destination file.
     * @throws JAXBElement if a JAXB error occurs.
     */
    @SuppressWarnings("unchecked")
    public void merge(File primaryFile, File secondaryFile, File destinationFile) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(org.gnucash.xml.ObjectFactory.class);

        // Read from files.
        Unmarshaller unmarshaller = context.createUnmarshaller();
        System.out.println("Reading primary file \"" + primaryFile + "\"...");
        JAXBElement<GnuCashXml> element = (JAXBElement<GnuCashXml>) unmarshaller.unmarshal(primaryFile);
        GnuCashXml primary = element.getValue();
        System.out.println("Reading secondary file \"" + secondaryFile + "\"...");
        element = (JAXBElement<GnuCashXml>) unmarshaller.unmarshal(secondaryFile);
        GnuCashXml secondary = element.getValue();

        // Merge.
        System.out.println("Merging data...");
        GnuCashXml result = merge(primary, secondary);
        element = factory.createGncV2(result);

        // Write back to file.
        System.out.println("Writing to file \"" + destinationFile + "\"...");
        destinationFile.getAbsoluteFile().getParentFile().mkdirs();
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(element, destinationFile);

        System.out.println("Finished merge.");
    }

    /**
     * Merge gnucash data.
     *
     * @param primary   The primary data. This is also the destination with merged data.
     * @param secondary The secondary data with changes.
     * @return the merged data.
     */
    public GnuCashXml merge(GnuCashXml primary, GnuCashXml secondary) {
        Book primaryBook = pipeBook(primary);
        Book secondaryBook = pipeBook(secondary);

        mergeBooks(primaryBook, secondaryBook);

        return primary;
    }

    @SuppressWarnings("unchecked")
    private Book pipeBook(GnuCashXml gnc) {
        List<JAXBElement<?>> content = gnc.getContent();
        JAXBElement<Book> bookElement;
        if (content.size() == 3) {
            Commodity commodity = ((JAXBElement<Commodity>) content.remove(1)).getValue();
            Account account = ((JAXBElement<Account>) content.remove(2)).getValue();
            Book book = gncFactory.createBook();
            book.getCommodity().add(commodity);
            book.getAccount().add(account);
            bookElement = gncFactory.createGnuCashXmlBook(book);
            content.add(1, bookElement);
        } else {
            bookElement = (JAXBElement<Book>) content.get(1);
        }
        return bookElement.getValue();
    }

    protected void mergeBooks(Book primary, Book secondary) {
        mergeAccounts(primary, secondary);
        mergeBudgets(primary, secondary);
        mergeCommodities(primary, secondary);
        mergeBillTerms(primary, secondary);
        mergeCustomers(primary, secondary);
        mergeEmployees(primary, secondary);
        mergeEntries(primary, secondary);
        mergeInvoices(primary, secondary);
        mergeJobs(primary, secondary);
        mergeOrders(primary, secondary);
        mergeTaxTables(primary, secondary);
        mergeVendors(primary, secondary);
        mergePrices(primary, secondary);
        mergeSchedules(primary, secondary);
        mergeSlots(primary, secondary);
        mergeTemplateTransactions(primary, secondary);
        mergeTransactions(primary, secondary);

        updateCounters(primary);
    }

    protected void mergeAccounts(Book primary, Book secondary) {
        String id;

        List<Account> primaryItems = primary.getAccount();
        Map<String, Account> primaryItemsById = new HashMap<>();
        for (Account item : primaryItems) {
            id = item.getId().getValue();
            primaryItemsById.put(id, item);
        }

        List<Account> secondaryItems = secondary.getAccount();
        for (Account item : secondaryItems) {
            id = item.getId().getValue();

            // What was added?
            if (!primaryItemsById.containsKey(id)) {
                primaryItems.add(item);
                System.out.println("Account added: " + id);
            }
        }
    }

    protected void mergeBudgets(Book primary, Book secondary) {
        String id;

        List<Budget> primaryItems = primary.getBudget();
        Map<String, Budget> primaryItemsById = new HashMap<>();
        for (Budget item : primaryItems) {
            id = item.getId().getValue();
            primaryItemsById.put(id, item);
        }

        List<Budget> secondaryItems = secondary.getBudget();
        for (Budget item : secondaryItems) {
            id = item.getId().getValue();

            // What was added?
            if (!primaryItemsById.containsKey(id)) {
                primaryItems.add(item);
                System.out.println("Budget added: " + id);
            }
        }
    }

    protected void mergeCommodities(Book primary, Book secondary) {

    }

    protected void mergeBillTerms(Book primary, Book secondary) {
        String id;

        List<GncBillTerm> primaryItems = primary.getGncBillTerm();
        Map<String, GncBillTerm> primaryItemsById = new HashMap<>();
        for (GncBillTerm item : primaryItems) {
            id = item.getGuid().getValue();
            primaryItemsById.put(id, item);
        }

        List<GncBillTerm> secondaryItems = secondary.getGncBillTerm();
        for (GncBillTerm item : secondaryItems) {
            id = item.getGuid().getValue();

            // What was added?
            if (!primaryItemsById.containsKey(id)) {
                primaryItems.add(item);
                System.out.println("Bill Term added: " + id);
            }
        }
    }

    protected void mergeCustomers(Book primary, Book secondary) {
        String id;

        List<GncCustomer> primaryItems = primary.getGncCustomer();
        Map<String, GncCustomer> primaryItemsById = new HashMap<>();
        for (GncCustomer item : primaryItems) {
            id = item.getGuid().getValue();
            primaryItemsById.put(id, item);
        }

        List<GncCustomer> secondaryItems = secondary.getGncCustomer();
        for (GncCustomer item : secondaryItems) {
            id = item.getGuid().getValue();

            // What was added?
            if (!primaryItemsById.containsKey(id)) {
                primaryItems.add(item);
                System.out.println("Customer added: " + id);
            }
        }
    }

    protected void mergeEmployees(Book primary, Book secondary) {
        String id;

        List<GncEmployee> primaryItems = primary.getGncEmployee();
        Map<String, GncEmployee> primaryItemsById = new HashMap<>();
        for (GncEmployee item : primaryItems) {
            id = item.getGuid().getValue();
            primaryItemsById.put(id, item);
        }

        List<GncEmployee> secondaryItems = secondary.getGncEmployee();
        for (GncEmployee item : secondaryItems) {
            id = item.getGuid().getValue();

            // What was added?
            if (!primaryItemsById.containsKey(id)) {
                primaryItems.add(item);
                System.out.println("Employee added: " + id);
            }
        }
    }

    protected void mergeEntries(Book primary, Book secondary) {
        String id;

        List<GncEntry> primaryItems = primary.getGncEntry();
        Map<String, GncEntry> primaryItemsById = new HashMap<>();
        for (GncEntry item : primaryItems) {
            id = item.getGuid().getValue();
            primaryItemsById.put(id, item);
        }

        List<GncEntry> secondaryItems = secondary.getGncEntry();
        for (GncEntry item : secondaryItems) {
            id = item.getGuid().getValue();

            // What was added?
            if (!primaryItemsById.containsKey(id)) {
                primaryItems.add(item);
                System.out.println("Entry added: " + id);
            }
        }
    }

    protected void mergeInvoices(Book primary, Book secondary) {
        String id;

        List<GncInvoice> primaryItems = primary.getGncInvoice();
        Map<String, GncInvoice> primaryItemsById = new HashMap<>();
        for (GncInvoice item : primaryItems) {
            id = item.getGuid().getValue();
            primaryItemsById.put(id, item);
        }

        List<GncInvoice> secondaryItems = secondary.getGncInvoice();
        for (GncInvoice item : secondaryItems) {
            id = item.getGuid().getValue();

            // What was added?
            if (!primaryItemsById.containsKey(id)) {
                primaryItems.add(item);
                System.out.println("Budget added: " + id);
            }
        }
    }

    protected void mergeJobs(Book primary, Book secondary) {
        String id;

        List<GncJob> primaryItems = primary.getGncJob();
        Map<String, GncJob> primaryItemsById = new HashMap<>();
        for (GncJob item : primaryItems) {
            id = item.getGuid().getValue();
            primaryItemsById.put(id, item);
        }

        List<GncJob> secondaryItems = secondary.getGncJob();
        for (GncJob item : secondaryItems) {
            id = item.getGuid().getValue();

            // What was added?
            if (!primaryItemsById.containsKey(id)) {
                primaryItems.add(item);
                System.out.println("Job added: " + id);
            }
        }
    }

    protected void mergeOrders(Book primary, Book secondary) {
        String id;

        List<GncOrder> primaryItems = primary.getGncOrder();
        Map<String, GncOrder> primaryItemsById = new HashMap<>();
        for (GncOrder item : primaryItems) {
            id = item.getGuid().getValue();
            primaryItemsById.put(id, item);
        }

        List<GncOrder> secondaryItems = secondary.getGncOrder();
        for (GncOrder item : secondaryItems) {
            id = item.getGuid().getValue();

            // What was added?
            if (!primaryItemsById.containsKey(id)) {
                primaryItems.add(item);
                System.out.println("Order added: " + id);
            }
        }
    }

    protected void mergeTaxTables(Book primary, Book secondary) {
        String id;

        List<GncTaxTable> primaryItems = primary.getGncTaxTable();
        Map<String, GncTaxTable> primaryItemsById = new HashMap<>();
        for (GncTaxTable item : primaryItems) {
            id = item.getGuid().getValue();
            primaryItemsById.put(id, item);
        }

        List<GncTaxTable> secondaryItems = secondary.getGncTaxTable();
        for (GncTaxTable item : secondaryItems) {
            id = item.getGuid().getValue();

            // What was added?
            if (!primaryItemsById.containsKey(id)) {
                primaryItems.add(item);
                System.out.println("Tax Table added: " + id);
            }
        }
    }

    protected void mergeVendors(Book primary, Book secondary) {
        String id;

        List<GncVendor> primaryItems = primary.getGncVendor();
        Map<String, GncVendor> primaryItemsById = new HashMap<>();
        for (GncVendor item : primaryItems) {
            id = item.getGuid().getValue();
            primaryItemsById.put(id, item);
        }

        List<GncVendor> secondaryItems = secondary.getGncVendor();
        for (GncVendor item : secondaryItems) {
            id = item.getGuid().getValue();

            // What was added?
            if (!primaryItemsById.containsKey(id)) {
                primaryItems.add(item);
                System.out.println("Vendor added: " + id);
            }
        }
    }

    protected void mergePrices(Book primary, Book secondary) {
        PriceDb secondaryPrices = secondary.getPricedb();
        if (secondaryPrices == null) {
            return;
        }

        PriceDb primaryPrices = primary.getPricedb();
        if (primaryPrices == null) {
            primaryPrices = new org.gnucash.xml.price.ObjectFactory().createPriceDb();
            primary.setPricedb(primaryPrices);
        }

        String id;
        List<Price> primaryItems = primaryPrices.getPrice();
        Map<String, Price> primaryItemsById = new HashMap<>();
        for (Price item : primaryItems) {
            id = item.getId().getValue();
            primaryItemsById.put(id, item);
        }

        List<Price> secondaryItems = secondaryPrices.getPrice();
        for (Price item : secondaryItems) {
            id = item.getId().getValue();

            // What was added?
            if (!primaryItemsById.containsKey(id)) {
                primaryItems.add(item);
                System.out.println("Price added: " + id);
            }
        }
    }

    protected void mergeSchedules(Book primary, Book secondary) {
        String id;

        List<ScheduledTransaction> primaryItems = primary.getSchedxaction();
        Map<String, ScheduledTransaction> primaryItemsById = new HashMap<>();
        for (ScheduledTransaction item : primaryItems) {
            id = item.getId().getValue();
            primaryItemsById.put(id, item);
        }

        List<ScheduledTransaction> secondaryItems = secondary.getSchedxaction();
        for (ScheduledTransaction item : secondaryItems) {
            id = item.getId().getValue();

            // What was added?
            if (!primaryItemsById.containsKey(id)) {
                primaryItems.add(item);
                System.out.println("Scheduled Transaction added: " + id);
            }
        }
    }

    protected void mergeSlots(Book primary, Book secondary) {
        primary.setSlots(mergeSlots(primary.getSlots(), secondary.getSlots()));
    }

    protected Slots mergeSlots(Slots primary, Slots secondary) {
        if (secondary == null) {
            return primary;
        }
        if (primary == null) {
            primary = new org.gnucash.xml.slot.ObjectFactory().createSlots();
        }

        QName qName;
        String id;
        List<ValueFrame.Slot> primaryItems = primary.getKvpSlot();
        Map<String, ValueFrame.Slot> primaryItemsById = new HashMap<>();
        for (ValueFrame.Slot item : primaryItems) {
            for (JAXBElement content : item.getContent()) {
                qName = content.getName();
                if ("key".equals(qName.getLocalPart())) {
                    id = (String) content.getValue();
                    primaryItemsById.put(id, item);
                    break;
                }
            }
        }

        List<ValueFrame.Slot> secondaryItems = secondary.getKvpSlot();
        for (ValueFrame.Slot item : secondaryItems) {
            for (JAXBElement content : item.getContent()) {
                qName = content.getName();
                if ("key".equals(qName.getLocalPart())) {
                    id = (String) content.getValue();

                    // What was added?
                    if (!primaryItemsById.containsKey(id)) {
                        primaryItems.add(item);
                        System.out.println("Slot added: " + id);
                    }
                    break;
                }
            }
        }

        return primary;
    }

    protected void mergeTemplateTransactions(Book primary, Book secondary) {
        //TODO implement me!
    }

    protected void mergeTransactions(Book primary, Book secondary) {
        String id;

        List<Transaction> primaryItems = primary.getTransaction();
        Map<String, Transaction> primaryItemsById = new HashMap<>();
        for (Transaction item : primaryItems) {
            id = item.getId().getValue();
            primaryItemsById.put(id, item);
        }

        List<Transaction> secondaryItems = secondary.getTransaction();
        for (Transaction item : secondaryItems) {
            id = item.getId().getValue();

            // What was added?
            if (!primaryItemsById.containsKey(id)) {
                primaryItems.add(item);
                System.out.println("Transaction added: " + id);
            }
        }
    }

    /**
     * Update the counters. Re-calculates the counter data.
     */
    private void updateCounters(Book book) {
        List<CountData> counters = book.getCountData();
        counters.clear();

        addCount(counters, "commodity", book.getCommodity().size());
        addCount(counters, "account", book.getAccount().size());
        addCount(counters, "transaction", book.getTransaction().size());
        addCount(counters, "schedxaction", book.getSchedxaction().size());
        addCount(counters, "budget", book.getBudget().size());
        if (book.getPricedb() != null) {
            addCount(counters, "price", book.getPricedb().getPrice().size());
        }
        addCount(counters, "gnc:GncBillTerm", book.getGncBillTerm().size());
        addCount(counters, "gnc:GncCustomer", book.getGncCustomer().size());
        addCount(counters, "gnc:GncEmployee", book.getGncEmployee().size());
        addCount(counters, "gnc:GncEntry", book.getGncEntry().size());
        addCount(counters, "gnc:GncInvoice", book.getGncInvoice().size());
        addCount(counters, "gnc:GncJob", book.getGncJob().size());
        addCount(counters, "gnc:GncOrder", book.getGncOrder().size());
        addCount(counters, "gnc:GncTaxTable", book.getGncTaxTable().size());
        addCount(counters, "gnc:GncVendor", book.getGncVendor().size());
    }

    protected void addCount(List<CountData> counters, String type, int count) {
        if (count > 0) {
            CountData counter = counterFactory.createCountData();
            counter.setType(type);
            counter.setValue(count);
            counters.add(counter);
        }
    }
}
