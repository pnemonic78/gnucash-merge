/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Listener for merging gnucash XML documents.
 *
 * @author Moshe Waisberg
 */
public interface DOMMergerListener extends GncMergerListener {

    /**
     * Notification that the documents are being merged.
     *
     * @param primary   the primary document.
     * @param secondary the secondary document.
     */
    void onMergeDocumentStart(Document primary, Document secondary);

    /**
     * Notification that the documents was merged.
     *
     * @param document the merged document.
     */
    void onMergeDocumentFinish(Document document);

    /**
     * Notification that an account was added to the primary document.
     *
     * @param element the added element.
     * @param id      the account id.
     */
    void onAccountAdded(Element element, String id);

    /**
     * Notification that a budget was added to the primary document.
     *
     * @param element the added element.
     * @param id      the budget id.
     */
    void onBudgetAdded(Element element, String id);

    /**
     * Notification that a bill term was added to the primary document.
     *
     * @param element the added element.
     * @param id      the bill term id.
     */
    void onBillTermAdded(Element element, String id);

    /**
     * Notification that a commodity was added to the primary document.
     *
     * @param element the added element.
     * @param id      the commodity id.
     */
    void onCommodityAdded(Element element, String id);

    /**
     * Notification that a customer was added to the primary document.
     *
     * @param element the added element.
     * @param id      the customer id.
     */
    void onCustomerAdded(Element element, String id);

    /**
     * Notification that an employee was added to the primary document.
     *
     * @param element the added element.
     * @param id      the employee id.
     */
    void onEmployeeAdded(Element element, String id);

    /**
     * Notification that an entry was added to the primary document.
     *
     * @param element the added element.
     * @param id      the entry id.
     */
    void onEntryAdded(Element element, String id);

    /**
     * Notification that an invoice was added to the primary document.
     *
     * @param element the added element.
     * @param id      the invoice id.
     */
    void onInvoiceAdded(Element element, String id);

    /**
     * Notification that a job was added to the primary document.
     *
     * @param element the added element.
     * @param id      the job id.
     */
    void onJobAdded(Element element, String id);

    /**
     * Notification that a lot was added to the primary document.
     *
     * @param primary   the primary element with slots.
     * @param primaryId the primary element id.
     * @param element   the added element.
     * @param id        the lot id.
     */
    void onLotAdded(Element primary, String primaryId, Element element, String id);

    /**
     * Notification that an order was added to the primary document.
     *
     * @param element the added element.
     * @param id      the order id.
     */
    void onOrderAdded(Element element, String id);

    /**
     * Notification that a price was added to the primary document.
     *
     * @param element the added element.
     * @param id      the price id.
     */
    void onPriceAdded(Element element, String id);

    /**
     * Notification that a scheduled transaction was added to the primary document.
     *
     * @param element the added element.
     * @param id      the scheduled transaction id.
     */
    void onScheduledTransactionAdded(Element element, String id);

    /**
     * Notification that a slot was added to the primary document.
     *
     * @param primary   the primary element with slots.
     * @param primaryId the primary element id.
     * @param element   the added element.
     * @param id        the slot id.
     */
    void onSlotAdded(Element primary, String primaryId, Element element, String id);

    /**
     * Notification that a tax table was added to the primary document.
     *
     * @param element the added element.
     * @param id      the tax table id.
     */
    void onTaxTableAdded(Element element, String id);

    /**
     * Notification that a transaction was added to the primary document.
     *
     * @param element the added element.
     * @param id      the transaction id.
     */
    void onTransactionAdded(Element element, String id);

    /**
     * Notification that a transaction was removed from the primary document.
     *
     * @param element the removed element.
     * @param id      the transaction id.
     */
    void onTransactionRemoved(Element element, String id);

    /**
     * Notification that a vendor was added to the primary document.
     *
     * @param element the added element.
     * @param id      the vendor id.
     */
    void onVendorAdded(Element element, String id);
}
