/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.File;

/**
 * Default listener that does nothing.
 *
 * @author Moshe Waisberg
 */
public class DefaultMergeListener implements DOMMergerListener {
    @Override
    public void onReadPrimaryFileStart(File file) {
    }

    @Override
    public void onReadPrimaryFileFinish(File file) {
    }

    @Override
    public void onReadingSecondaryFileStart(File file) {
    }

    @Override
    public void onReadingSecondaryFileFinish(File file) {
    }

    @Override
    public void onWriteDestinationFileStart(File file) {
    }

    @Override
    public void onWriteDestinationFileFinish(File file) {
    }

    @Override
    public void onMergeStart() {
    }

    @Override
    public void onMergeFinish() {
    }

    @Override
    public void onMergeDocumentStart(Document primary, Document secondary) {
    }

    @Override
    public void onMergeDocumentFinish(Document document) {
    }

    @Override
    public void onAccountAdded(Element element, String id) {
    }

    @Override
    public void onBudgetAdded(Element element, String id) {
    }

    @Override
    public void onBillTermAdded(Element element, String id) {
    }

    @Override
    public void onCommodityAdded(Element element, String id) {
    }

    @Override
    public void onCustomerAdded(Element element, String id) {
    }

    @Override
    public void onEmployeeAdded(Element element, String id) {
    }

    @Override
    public void onEntryAdded(Element element, String id) {
    }

    @Override
    public void onInvoiceAdded(Element element, String id) {
    }

    @Override
    public void onJobAdded(Element element, String id) {
    }

    @Override
    public void onLotAdded(Element primary, String primaryId, Element element, String id) {
    }

    @Override
    public void onOrderAdded(Element element, String id) {
    }

    @Override
    public void onPriceAdded(Element element, String id) {
    }

    @Override
    public void onScheduledTransactionAdded(Element element, String id) {
    }

    @Override
    public void onSlotAdded(Element primary, String primaryId, Element element, String id) {
    }

    @Override
    public void onTaxTableAdded(Element element, String id) {
    }

    @Override
    public void onTransactionAdded(Element element, String id) {
    }

    @Override
    public void onTransactionRemoved(Element element, String id) {
    }

    @Override
    public void onVendorAdded(Element element, String id) {
    }
}
