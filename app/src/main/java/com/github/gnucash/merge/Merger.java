/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge;

import com.github.gnucash.merge.v2.Merger2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 * Merge gnucash files.
 *
 * @author Moshe Waisberg
 */
public class Merger {

    public static void main(String[] args) throws Exception {
        System.out.println("gnucash merge.");
        if (args.length < 2) {
            System.out.println("args: primary-file secondary-file [destination-file]");
            System.exit(1);
            return;
        }

        File primaryFile = new File(args[0]);
        File secondaryFile = new File(args[1]);
        File destinationFile = (args.length > 2) ? new File(args[2]) : primaryFile;
        new Merger(new SystemMergeListener()).merge(primaryFile, secondaryFile, destinationFile);
    }

    private final DOMMergerListener listener;

    public Merger() {
        this(null);
    }

    public Merger(DOMMergerListener listener) {
        this.listener = listener;
    }

    /**
     * Merge gnucash files.
     *
     * @param primaryFile     The primary file.
     * @param secondaryFile   The secondary file with changes.
     * @param destinationFile The destination file.
     * @throws IOException                  If an I/O error occurs.
     * @throws ParserConfigurationException If an XML error occurs.
     * @throws SAXException                 If an XML error occurs.
     * @throws TransformerException         If an XML error occurs.
     */
    public void merge(File primaryFile, File secondaryFile, File destinationFile) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        notifyMergeStart();

        // Read from files.
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        notifyReadPrimaryFileStart(primaryFile);
        Document primary = documentBuilder.parse(primaryFile);
        notifyReadPrimaryFileFinish(primaryFile);
        notifyReadingSecondaryFileStart(secondaryFile);
        Document secondary = documentBuilder.parse(secondaryFile);
        notifyReadingSecondaryFileFinish(secondaryFile);

        // Merge.
        notifyMergeDocumentStart(primary, secondary);
        DOMMerger merger = createMerger(primary);
        Document merged = merger.mergeDocument(primary, secondary);
        notifyMergeDocumentFinish(merged);

        // Write back to file.
        notifyWriteDestinationFileStart(destinationFile);
        destinationFile.getAbsoluteFile().getParentFile().mkdirs();
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(merged);
        Result result = new StreamResult(destinationFile);
        transformer.transform(source, result);
        notifyWriteDestinationFileFinish(destinationFile);

        notifyMergeFinish();
    }

    private void notifyReadPrimaryFileStart(File file) {
        if (listener != null) {
            listener.onReadPrimaryFileStart(file);
        }
    }

    private void notifyReadPrimaryFileFinish(File file) {
        if (listener != null) {
            listener.onReadPrimaryFileFinish(file);
        }
    }

    private void notifyReadingSecondaryFileStart(File file) {
        if (listener != null) {
            listener.onReadingSecondaryFileStart(file);
        }
    }

    private void notifyReadingSecondaryFileFinish(File file) {
        if (listener != null) {
            listener.onReadingSecondaryFileFinish(file);
        }
    }

    private void notifyMergeDocumentStart(Document primary, Document secondary) {
        if (listener != null) {
            listener.onMergeDocumentStart(primary, secondary);
        }

    }

    private void notifyMergeDocumentFinish(Document merged) {
        if (listener != null) {
            listener.onMergeDocumentFinish(merged);
        }
    }

    private void notifyWriteDestinationFileStart(File file) {
        if (listener != null) {
            listener.onWriteDestinationFileStart(file);
        }
    }

    private void notifyWriteDestinationFileFinish(File file) {
        if (listener != null) {
            listener.onWriteDestinationFileFinish(file);
        }
    }

    private void notifyMergeStart() {
        if (listener != null) {
            listener.onMergeStart();
        }
    }

    private void notifyMergeFinish() {
        if (listener != null) {
            listener.onMergeFinish();
        }
    }

    private DOMMerger createMerger(Document document) {
        Element root = document.getDocumentElement();
        String name = root.getTagName();
        if ("gnc-v2".equals(name)) {
            return new Merger2();
        }
        return null;
    }
}
