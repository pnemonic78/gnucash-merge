/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge;

import org.w3c.dom.Document;

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
}
