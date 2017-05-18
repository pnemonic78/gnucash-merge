/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge;

import org.gnucash.xml.act.Account;
import org.gnucash.xml.cmdty.Commodity;
import org.gnucash.xml.gnc.Book;
import org.gnucash.xml.gnc.GnuCashXml;
import org.gnucash.xml.gnc.ObjectFactory;

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

    protected final ObjectFactory factory = new ObjectFactory();

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
        JAXBContext context = JAXBContext.newInstance(ObjectFactory.class);

        // Read from files.
        Unmarshaller unmarshaller = context.createUnmarshaller();
        JAXBElement<GnuCashXml> element = (JAXBElement<GnuCashXml>) unmarshaller.unmarshal(primaryFile);
        GnuCashXml primary = element.getValue();
        element = (JAXBElement<GnuCashXml>) unmarshaller.unmarshal(secondaryFile);
        GnuCashXml secondary = element.getValue();

        // Merge.
        GnuCashXml result = merge(primary, secondary);

        // Write back to file.
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(result, destinationFile);
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
            Book book = factory.createBook();
            book.getCommodity().add(commodity);
            book.getAccount().add(account);
            bookElement = factory.createGnuCashXmlBook(book);
            content.add(1, bookElement);
        } else {
            bookElement = (JAXBElement<Book>) content.get(1);
        }
        return bookElement.getValue();
    }

    protected void mergeBooks(Book primary, Book secondary) {
        //TODO implement me!
    }
}
