/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Merge gnucash documents.
 *
 * @author Moshe Waisberg
 */
public interface DOMMerger {

    String NS_GNC = "http://www.gnucash.org/XML/gnc";

    /**
     * Merge gnucash data.
     *
     * @param primary   The primary data. This is also the destination with merged data.
     * @param secondary The secondary data with changes.
     * @return the merged data.
     */
    Document merge(Document primary, Document secondary);

    /**
     * Merge gnucash data.
     *
     * @param primary   The primary data. This is also the destination with merged data.
     * @param secondary The secondary data with changes.
     * @return the merged data.
     */
    Document mergeGnuCashXml(Document primary, Document secondary);

    /**
     * Merge gnucash books.
     *
     * @param primary   The primary book. This is also the destination with merged data.
     * @param secondary The secondary book with changes.
     * @return the merged book.
     */
    Element mergeBook(Element primary, Element secondary);

    /**
     * Merge accounts.
     *
     * @param primary   The primary book.
     * @param secondary The secondary book with changes.
     * @return the merged book.
     */
    Element mergeAccounts(Element primary, Element secondary);

    Element mergeBillTerms(Element primary, Element secondary);

    Element mergeBudgets(Element primary, Element secondary);

    Element mergeCommodities(Element primary, Element secondary);

    Element mergeCustomers(Element primary, Element secondary);

    Element mergeEmployees(Element primary, Element secondary);

    Element mergeEntries(Element primary, Element secondary);

    Element mergeInvoices(Element primary, Element secondary);

    Element mergeJobs(Element primary, Element secondary);

    Element mergeOrders(Element primary, Element secondary);

    Element mergePrices(Element primary, Element secondary);

    Element mergeSchedules(Element primary, Element secondary);

    Element mergeSlots(Element primary, Element secondary);

    Element mergeTaxTables(Element primary, Element secondary);

    Element mergeTemplateTransactions(Element primary, Element secondary);

    Element mergeTransactions(Element primary, Element secondary);

    Element mergeVendors(Element primary, Element secondary);

    /**
     * Re-calculates the counter data.
     */
    void updateCounters(Element book);
}