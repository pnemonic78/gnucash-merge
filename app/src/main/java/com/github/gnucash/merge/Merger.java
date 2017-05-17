/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge;

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
            System.out.println("args: primary-file secondary-file");
            System.exit(1);
            return;
        }

        File primaryFile = new File(args[0]);
        File secondaryFile = new File(args[1]);
        new Merger().merge(primaryFile, secondaryFile);
    }

    /**
     * Merge gnucash files.
     *
     * @param primaryFile   The primary file. It is also the destination file.
     * @param secondaryFile The secondary file with changes.
     */
    @SuppressWarnings("unchecked")
    public void merge(File primaryFile, File secondaryFile) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(org.gnucash.xml.ObjectFactory.class);

        // Read from files.
        Unmarshaller unmarshaller = context.createUnmarshaller();
        JAXBElement<GnuCashXml> element = (JAXBElement<GnuCashXml>) unmarshaller.unmarshal(primaryFile);
        GnuCashXml primary = element.getValue();
        element = (JAXBElement<GnuCashXml>) unmarshaller.unmarshal(secondaryFile);
        GnuCashXml secondary = element.getValue();

        // Merge.
        merge(primary, secondary);

        // Write back to file.
        Marshaller marshaller = context.createMarshaller();
        //TODO marshaller.marshal(primary, primaryFile);
    }

    /**
     * Merge gnucash files.
     *
     * @param primary   The primary data. It is also the destination file.
     * @param secondary The secondary data with changes.
     */
    public void merge(GnuCashXml primary, GnuCashXml secondary) {
        //TODO implement me!
        System.out.println("±!@ " + primary + " " + secondary);
    }
}
