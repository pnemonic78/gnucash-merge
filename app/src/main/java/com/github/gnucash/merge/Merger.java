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
        new Merger().merge(primaryFile, secondaryFile, destinationFile);
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
        // Read from files.
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        System.out.println("Reading primary file \"" + primaryFile + "\"...");
        Document primary = documentBuilder.parse(primaryFile);
        System.out.println("Reading secondary file \"" + secondaryFile + "\"...");
        Document secondary = documentBuilder.parse(secondaryFile);

        // Merge.
        System.out.println("Merging data...");
        DOMMerger merger = createMerger(primary);

        Document merged = merger.mergeDocument(primary, secondary);

        // Write back to file.
        System.out.println("Writing to file \"" + destinationFile + "\"...");
        destinationFile.getAbsoluteFile().getParentFile().mkdirs();
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(merged);
        Result result = new StreamResult(destinationFile);
        transformer.transform(source, result);

        System.out.println("Finished merge.");
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
