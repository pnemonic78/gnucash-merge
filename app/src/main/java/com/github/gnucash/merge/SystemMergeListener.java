/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.File;

/**
 * Listener that prints to the standard system output.
 *
 * @author Moshe Waisberg
 */
public class SystemMergeListener extends DefaultMergeListener {
    @Override
    public void onReadPrimaryFileStart(File file) {
        System.out.println("Reading primary file \"" + file + "\"...");
    }

    @Override
    public void onReadingSecondaryFileStart(File file) {
        System.out.println("Reading secondary file \"" + file + "\"...");
    }

    @Override
    public void onWriteDestinationFileStart(File file) {
        System.out.println("Writing to file \"" + file + "\"...");
    }

    @Override
    public void onMergeFinish() {
        System.out.println("Finished merge.");
    }

    @Override
    public void onMergeDocumentStart(Document primary, Document secondary) {
        System.out.println("Merging documents...");
    }

    @Override
    public void onAccountAdded(Element element, String id) {
        System.out.println("Account added: " + id);
    }

    @Override
    public void onBudgetAdded(Element element, String id) {
        System.out.println("Budget added: " + id);
    }

    @Override
    public void onBillTermAdded(Element element, String id) {
        System.out.println("Bill Term added: " + id);
    }

    @Override
    public void onCommodityAdded(Element element, String id) {
        System.out.println("Commodity added: " + id);
    }

    @Override
    public void onCustomerAdded(Element element, String id) {
        System.out.println("Customer added: " + id);
    }

    @Override
    public void onEmployeeAdded(Element element, String id) {
        System.out.println("Employee added: " + id);
    }

    @Override
    public void onEntryAdded(Element element, String id) {
        System.out.println("Entry added: " + id);
    }

    @Override
    public void onInvoiceAdded(Element element, String id) {
        System.out.println("Invoice added: " + id);
    }

    @Override
    public void onJobAdded(Element element, String id) {
        System.out.println("Job added: " + id);
    }

    @Override
    public void onLotAdded(Element primary, String primaryId, Element element, String id) {
        System.out.println("Lot added: " + id + " to " + primary.getNodeName() + " " + primaryId);
    }

    @Override
    public void onOrderAdded(Element element, String id) {
        System.out.println("Order added: " + id);
    }

    @Override
    public void onPriceAdded(Element element, String id) {
        System.out.println("Price added: " + id);
    }

    @Override
    public void onScheduledTransactionAdded(Element element, String id) {
        System.out.println("Scheduled Transaction added: " + id);
    }

    @Override
    public void onSlotAdded(Element primary, String primaryId, Element element, String id) {
        System.out.println("Slot added: " + id + " to " + primary.getNodeName() + " " + primaryId);
    }

    @Override
    public void onTaxTableAdded(Element element, String id) {
        System.out.println("Tax Table added: " + id);
    }

    @Override
    public void onTransactionAdded(Element element, String id) {
        System.out.println("Transaction added: " + id);
    }

    @Override
    public void onTransactionRemoved(Element element, String id) {
        System.out.println("Duplicate transaction removed: " + id);
    }

    @Override
    public void onVendorAdded(Element element, String id) {
        System.out.println("Vendor added: " + id);
    }
}
