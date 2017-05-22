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
     * @param primary   The primary data. This is also the destination with merged data.
     * @param secondary The secondary data with changes.
     * @return the merged data.
     */
    Element mergeBook(Element primary, Element secondary);
}
