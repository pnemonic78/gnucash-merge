/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge;

import org.w3c.dom.Document;

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
}
