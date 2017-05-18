/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge;

import org.gnucash.xml.gnc.Book;
import org.gnucash.xml.gnc.GnuCashXml;

import java.io.File;

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
        System.out.println("±!@ " + primary + " " + secondary);
        Book primaryBook = ((JAXBElement<Book>) primary.getContent().get(1)).getValue();
        System.out.println("±!@ ver=" + primaryBook.getVersion());
        System.out.println("±!@ act=" + primaryBook.getAccount());
        System.out.println("±!@ cmd=" + primaryBook.getCommodity());
        System.out.println("±!@ c-d=" + primaryBook.getCountData());
        System.out.println("±!@ prc=" + primaryBook.getPricedb());
        System.out.println("±!@ slt=" + primaryBook.getSlots());
        System.out.println("±!@ trn=" + primaryBook.getTransaction());
        //TODO implement me!

        return primary;
    }
}
