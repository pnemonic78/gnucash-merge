/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge;

import org.w3c.dom.Document;

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
}
