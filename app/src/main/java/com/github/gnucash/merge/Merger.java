/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge;

import org.gnucash.xml.act.Account;
import org.gnucash.xml.cd.CountData;
import org.gnucash.xml.cmdty.Commodity;
import org.gnucash.xml.gnc.Book;
import org.gnucash.xml.gnc.GnuCashXml;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

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
//        mergeAccounts(primary.getAccount(), secondary.getAccount());
//        mergeBudgets(primary.getBudget(), secondary.getBudget());
//        mergeCommodities(primary.getCommodity(), secondary.getCommodity());
//        mergeBillTerms(primary.getGncBillTerm(), secondary.getGncBillTerm());
//        mergeCustomers(primary.getGncCustomer(), secondary.getGncCustomer());
//        mergeEmployees(primary.getGncEmployee(), secondary.getGncEmployee());
//        mergeEntries(primary.getGncEntry(), secondary.getGncEntry());
//        mergeInvoices(primary.getGncInvoice(), secondary.getGncInvoice());
//        mergeJobs(primary.getGncJob(), secondary.getGncJob());
//        mergeOrders(primary.getGncOrder(), secondary.getGncOrder());
//        mergeTaxTables(primary.getGncTaxTable(), secondary.getGncTaxTable());
//        mergeVendors(primary.getGncVendor(), secondary.getGncVendor());
//        mergePrices(primary.getPricedb(), secondary.getPricedb());
//        mergeSchedules(primary.getSchedxaction(), secondary.getSchedxaction());
//        mergeSlots(primary.getSlots(), secondary.getSlots());
//        mergeTemplateTransactions(primary.getTemplateTransactions(), secondary.getTemplateTransactions());
//        mergeTransactions(primary.getTransaction(), secondary.getTransaction());

        updateCounters(primary);
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
