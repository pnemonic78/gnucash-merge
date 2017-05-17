/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge;

import org.gnucash.xml.gnc.GnuCashXml;

import java.io.File;

import javax.xml.bind.JAXBContext;
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
    public void merge(File primaryFile, File secondaryFile) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(
                org.gnucash.xml.ObjectFactory.class,
                org.gnucash.xml.act.ObjectFactory.class,
                org.gnucash.xml.addr.ObjectFactory.class,
                org.gnucash.xml.bgt.ObjectFactory.class,
                org.gnucash.xml.billterm.ObjectFactory.class,
                org.gnucash.xml.book.ObjectFactory.class,
                org.gnucash.xml.bt_days.ObjectFactory.class,
                org.gnucash.xml.bt_prox.ObjectFactory.class,
                org.gnucash.xml.cmdty.ObjectFactory.class,
                org.gnucash.xml.cmdty.ObjectFactory.class,
                org.gnucash.xml.cust.ObjectFactory.class,
                org.gnucash.xml.employee.ObjectFactory.class,
                org.gnucash.xml.entry.ObjectFactory.class,
                org.gnucash.xml.gnc.ObjectFactory.class,
                org.gnucash.xml.invoice.ObjectFactory.class,
                org.gnucash.xml.job.ObjectFactory.class,
                org.gnucash.xml.lot.ObjectFactory.class,
                org.gnucash.xml.price.ObjectFactory.class,
                org.gnucash.xml.recurrence.ObjectFactory.class,
                org.gnucash.xml.slot.ObjectFactory.class,
                org.gnucash.xml.split.ObjectFactory.class,
                org.gnucash.xml.sx.ObjectFactory.class,
                org.gnucash.xml.taxtable.ObjectFactory.class,
                org.gnucash.xml.trn.ObjectFactory.class,
                org.gnucash.xml.ts.ObjectFactory.class,
                org.gnucash.xml.tte.ObjectFactory.class,
                org.gnucash.xml.vendor.ObjectFactory.class);

        // Read from files.
        Unmarshaller unmarshaller = context.createUnmarshaller();
        GnuCashXml primary = (GnuCashXml) unmarshaller.unmarshal(primaryFile);
        GnuCashXml secondary = (GnuCashXml) unmarshaller.unmarshal(secondaryFile);

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
    }
}
