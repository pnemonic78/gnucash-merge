/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge.v2;

import com.github.gnucash.merge.DOMMerger;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Merge version 2.0.0 gnucash files.
 *
 * @author Moshe Waisberg
 */
public class Merger2 implements DOMMerger {

    @Override
    public Document merge(Document primary, Document secondary) {
        return mergeGnuCashXml(primary, secondary);
    }

    @Override
    public Document mergeGnuCashXml(Document primary, Document secondary) {
        Element primaryBook = pipeBook(primary);
        Element secondaryBook = pipeBook(secondary);

        mergeBook(primaryBook, secondaryBook);

        return primary;
    }

    @Override
    public Element mergeBook(Element primary, Element secondary) {
        return primary;
    }

    /**
     * Get the book element, or create one if it does not exist.
     *
     * @param document The document.
     * @return the book.
     */
    protected Element pipeBook(Document document) {
        Element root = document.getDocumentElement();
        NodeList content = root.getChildNodes();
        int length = content.getLength();
        Node node;

        for (int i = 0; i < length; i++) {
            node = content.item(i);
            if (isElement(node, "book", NS_GNC)) {
                return (Element) node;
            }
        }

        Element book = document.createElementNS("book", NS_GNC);
        root.appendChild(book);

        for (int i = 0; i < length; i++) {
            node = content.item(0);
            if (isElement(node, "commodity", NS_GNC)) {
                book.appendChild(root.removeChild(node));
            } else if (isElement(node, "account", NS_GNC)) {
                book.appendChild(root.removeChild(node));
            } else if (isElement(node, "count-data", NS_GNC)) {
                root.removeChild(node);
            }
        }

        return book;
    }

    protected boolean isElement(Node node, String name, String namespace) {
        return (node.getNodeType() == Node.ELEMENT_NODE) && name.equals(node.getLocalName()) && namespace.equals(node.getNamespaceURI());
    }
}
