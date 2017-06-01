/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Merge gnucash XML documents.
 *
 * @author Moshe Waisberg
 */
public interface DOMMerger<L extends DOMMergerListener> extends GncMerger<L> {

    String NAMESPACE_XMLNS = "http://www.w3.org/2000/xmlns/";

    String NAMESPACE_GNC = "http://www.gnucash.org/XML/gnc";
    String NAMESPACE_ACT = "http://www.gnucash.org/XML/act";
    String NAMESPACE_BOOK = "http://www.gnucash.org/XML/book";
    String NAMESPACE_CD = "http://www.gnucash.org/XML/cd";
    String NAMESPACE_CMDTY = "http://www.gnucash.org/XML/cmdty";
    String NAMESPACE_PRICE = "http://www.gnucash.org/XML/price";
    String NAMESPACE_SLOT = "http://www.gnucash.org/XML/slot";
    String NAMESPACE_SPLIT = "http://www.gnucash.org/XML/split";
    String NAMESPACE_SX = "http://www.gnucash.org/XML/sx";
    String NAMESPACE_TRN = "http://www.gnucash.org/XML/trn";
    String NAMESPACE_TS = "http://www.gnucash.org/XML/ts";
    String NAMESPACE_FS = "http://www.gnucash.org/XML/fs";
    String NAMESPACE_BGT = "http://www.gnucash.org/XML/bgt";
    String NAMESPACE_RECURRENCE = "http://www.gnucash.org/XML/recurrence";
    String NAMESPACE_LOT = "http://www.gnucash.org/XML/lot";
    String NAMESPACE_ADDR = "http://www.gnucash.org/XML/addr";
    String NAMESPACE_OWNER = "http://www.gnucash.org/XML/owner";
    String NAMESPACE_BILLTERM = "http://www.gnucash.org/XML/billterm";
    String NAMESPACE_BT_DAYS = "http://www.gnucash.org/XML/bt-days";
    String NAMESPACE_BT_PROX = "http://www.gnucash.org/XML/bt-prox";
    String NAMESPACE_CUST = "http://www.gnucash.org/XML/cust";
    String NAMESPACE_EMPLOYEE = "http://www.gnucash.org/XML/employee";
    String NAMESPACE_ENTRY = "http://www.gnucash.org/XML/entry";
    String NAMESPACE_INVOICE = "http://www.gnucash.org/XML/invoice";
    String NAMESPACE_JOB = "http://www.gnucash.org/XML/job";
    String NAMESPACE_ORDER = "http://www.gnucash.org/XML/order";
    String NAMESPACE_TAXTABLE = "http://www.gnucash.org/XML/taxtable";
    String NAMESPACE_TTE = "http://www.gnucash.org/XML/tte";
    String NAMESPACE_VENDOR = "http://www.gnucash.org/XML/vendor";

    /**
     * Merge gnucash data.
     *
     * @param primary   The primary data. This is also the destination with merged data.
     * @param secondary The secondary data with changes.
     * @return the merged data.
     */
    Document mergeDocument(Document primary, Document secondary);

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
}