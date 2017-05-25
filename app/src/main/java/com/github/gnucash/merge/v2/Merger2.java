/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge.v2;

import com.github.gnucash.merge.DOMMerger;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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
        if (secondary == null) {
            return primary;
        }
        Document primaryDocument = primary.getOwnerDocument();

        // Collect all primary elements.
        final int counterTypesLength = BookCountDataType.values().length;
        Element[] primaryCounters = new Element[counterTypesLength];

        List<Element> primaryAccounts = new ArrayList<>();
        List<Element> primaryBudgets = new ArrayList<>();
        List<Element> primaryBillTerms = new ArrayList<>();
        List<Element> primaryCommodities = new ArrayList<>();
        List<Element> primaryCustomers = new ArrayList<>();
        List<Element> primaryEmployees = new ArrayList<>();
        List<Element> primaryEntries = new ArrayList<>();
        List<Element> primaryInvoices = new ArrayList<>();
        List<Element> primaryJobs = new ArrayList<>();
        List<Element> primaryOrders = new ArrayList<>();
        List<Element> primaryTaxTables = new ArrayList<>();
        Element primaryPricesDb = null;
        List<Element> primaryPrices = new ArrayList<>();
        List<Element> primarySchedules = new ArrayList<>();
        List<Element> primaryTemplateTransactions = new ArrayList<>();
        List<Element> primaryTransactions = new ArrayList<>();
        List<Element> primaryVendors = new ArrayList<>();
        Map<String, Element> primaryAccountsById = new HashMap<>();
        Map<String, Element> primaryBudgetsById = new HashMap<>();
        Map<String, Element> primaryBillTermsById = new HashMap<>();
        Map<String, Element> primaryCommoditiesById = new HashMap<>();
        Map<String, Element> primaryCustomersById = new HashMap<>();
        Map<String, Element> primaryEmployeesById = new HashMap<>();
        Map<String, Element> primaryEntriesById = new HashMap<>();
        Map<String, Element> primaryInvoicesById = new HashMap<>();
        Map<String, Element> primaryJobsById = new HashMap<>();
        Map<String, Element> primaryOrdersById = new HashMap<>();
        Map<String, Element> primaryTaxTablesById = new HashMap<>();
        Map<String, Element> primarySchedulesById = new HashMap<>();
        Map<String, Element> primaryTransactionsById = new HashMap<>();
        Map<String, Element> primaryVendorsById = new HashMap<>();
        Element primarySlots = null;

        Element element;
        String id, type;
        BookCountDataType countDataType;
        Node firstElementAfterCounters = null;

        Node node;
        Node nodeNext = primary.getFirstChild();
        while (nodeNext != null) {
            node = nodeNext;
            nodeNext = node.getNextSibling();

            if (node.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            element = (Element) node;

            if (isElement(node, "count-data", NAMESPACE_GNC)) {
                type = element.getAttributeNS(NAMESPACE_CD, "type");
                countDataType = BookCountDataType.find(type);
                primaryCounters[countDataType.ordinal()] = element;
                firstElementAfterCounters = null;
            } else if (firstElementAfterCounters == null) {
                firstElementAfterCounters = node;
            }

            if (isElement(node, "commodity", NAMESPACE_GNC)) {
                id = getSpaceId(element, NAMESPACE_CMDTY);
                primaryCommodities.add(element);
                primaryCommoditiesById.put(id, element);
            } else if (isElement(node, "pricedb", NAMESPACE_GNC)) {
                primaryPricesDb = element;
            } else if (isElement(node, "account", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_ACT);
                primaryAccounts.add(element);
                primaryAccountsById.put(id, element);
            } else if (isElement(node, "transaction", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_TRN);
                primaryTransactions.add(element);
                primaryTransactionsById.put(id, element);
            } else if (isElement(node, "template-transactions", NAMESPACE_GNC)) {
                primaryTemplateTransactions.add(element);
            } else if (isElement(node, "schedxaction", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_SX);
                primarySchedules.add(element);
                primarySchedulesById.put(id, element);
            } else if (isElement(node, "budget", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_BGT);
                primaryBudgets.add(element);
                primaryBudgetsById.put(id, element);
            } else if (isElement(node, "GncBillTerm", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_BILLTERM);
                primaryBillTerms.add(element);
                primaryBillTermsById.put(id, element);
            } else if (isElement(node, "GncCustomer", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_CUST);
                primaryCustomers.add(element);
                primaryCustomersById.put(id, element);
            } else if (isElement(node, "GncEmployee", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_EMPLOYEE);
                primaryEmployees.add(element);
                primaryEmployeesById.put(id, element);
            } else if (isElement(node, "GncEntry", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_ENTRY);
                primaryEntries.add(element);
                primaryEntriesById.put(id, element);
            } else if (isElement(node, "GncInvoice", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_INVOICE);
                primaryInvoices.add(element);
                primaryInvoicesById.put(id, element);
            } else if (isElement(node, "GncJob", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_JOB);
                primaryJobs.add(element);
                primaryJobsById.put(id, element);
            } else if (isElement(node, "GncOrder", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_ORDER);
                primaryOrders.add(element);
                primaryOrdersById.put(id, element);
            } else if (isElement(node, "GncTaxTable", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_TAXTABLE);
                primaryTaxTables.add(element);
                primaryTaxTablesById.put(id, element);
            } else if (isElement(node, "GncVendor", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_VENDOR);
                primaryVendors.add(element);
                primaryVendorsById.put(id, element);
            } else if (isElement(node, "slots", NAMESPACE_BOOK)) {
                primarySlots = element;
            }
        }

        // What secondary elements changed?
        nodeNext = secondary.getFirstChild();
        while (nodeNext != null) {
            node = nodeNext;
            nodeNext = node.getNextSibling();

            if (node.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            element = (Element) node;

            if (isElement(node, "commodity", NAMESPACE_GNC)) {
                id = getSpaceId(element, NAMESPACE_CMDTY);
                if (!primaryCommoditiesById.containsKey(id)) {
                    addElement(primary, element, primaryCommodities);
                    System.out.println("Commodity added: " + id);
                }
            } else if (isElement(node, "pricedb", NAMESPACE_GNC)) {
                //FIXME what if no primary pricesdb but is secondary pricesdb?
                mergePrices(primaryPricesDb, element, primaryPrices);
            } else if (isElement(node, "account", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_ACT);
                if (!primaryAccountsById.containsKey(id)) {
                    addElement(primary, element, primaryAccounts);
                    System.out.println("Account added: " + id);
                }
            } else if (isElement(node, "transaction", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_TRN);
                if (!primaryTransactionsById.containsKey(id)) {
                    addElement(primary, element, primaryTransactions);
                    System.out.println("Transaction added: " + id);
                }
            } else if (isElement(node, "template-transactions", NAMESPACE_GNC)) {
                //TODO
            } else if (isElement(node, "schedxaction", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_SX);
                if (!primarySchedulesById.containsKey(id)) {
                    addElement(primary, element, primarySchedules);
                    System.out.println("Scheduled Transaction added: " + id);
                }
            } else if (isElement(node, "budget", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_BGT);
                if (!primaryBudgetsById.containsKey(id)) {
                    addElement(primary, element, primaryBudgets);
                    System.out.println("Budget added: " + id);
                }
            } else if (isElement(node, "GncBillTerm", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_BILLTERM);
                if (!primaryBillTermsById.containsKey(id)) {
                    addElement(primary, element, primaryBillTerms);
                    System.out.println("Bill Term added: " + id);
                }
            } else if (isElement(node, "GncCustomer", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_CUST);
                if (!primaryCustomersById.containsKey(id)) {
                    addElement(primary, element, primaryCustomers);
                    System.out.println("Customer added: " + id);
                }
            } else if (isElement(node, "GncEmployee", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_EMPLOYEE);
                if (!primaryEmployeesById.containsKey(id)) {
                    addElement(primary, element, primaryEmployees);
                    System.out.println("Employee added: " + id);
                }
            } else if (isElement(node, "GncEntry", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_ENTRY);
                if (!primaryEntriesById.containsKey(id)) {
                    addElement(primary, element, primaryEntries);
                    System.out.println("Entry added: " + id);
                }
            } else if (isElement(node, "GncInvoice", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_INVOICE);
                if (!primaryInvoicesById.containsKey(id)) {
                    addElement(primary, element, primaryInvoices);
                    System.out.println("Invoice added: " + id);
                }
            } else if (isElement(node, "GncJob", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_JOB);
                if (!primaryJobsById.containsKey(id)) {
                    addElement(primary, element, primaryJobs);
                    System.out.println("Job added: " + id);
                }
            } else if (isElement(node, "GncOrder", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_ORDER);
                if (!primaryOrdersById.containsKey(id)) {
                    addElement(primary, element, primaryOrders);
                    System.out.println("Order added: " + id);
                }
            } else if (isElement(node, "GncTaxTable", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_TAXTABLE);
                if (!primaryTaxTablesById.containsKey(id)) {
                    addElement(primary, element, primaryTaxTables);
                    System.out.println("Tax Table added: " + id);
                }
            } else if (isElement(node, "GncVendor", NAMESPACE_GNC)) {
                id = getId(element, NAMESPACE_VENDOR);
                if (!primaryVendorsById.containsKey(id)) {
                    addElement(primary, element, primaryVendors);
                    System.out.println("Vendor added: " + id);
                }
            } else if (isElement(node, "slots", NAMESPACE_BOOK)) {
                mergeSlots(primarySlots, element);
            }
        }

        // Update the counters.
        Element counter, counterSibling;
        int count, ordinal;
        String prefixGnc = getPrefix(primaryDocument, NAMESPACE_GNC);
        String prefixCd = getPrefix(primaryDocument, NAMESPACE_CD);

        for (BookCountDataType countType : BookCountDataType.values()) {
            ordinal = countType.ordinal();
            count = 0;
            switch (countType) {
                case ACCOUNT:
                    count = primaryAccounts.size();
                    break;
                case BILLTERM:
                    count = primaryBillTerms.size();
                    break;
                case BUDGET:
                    count = primaryBudgets.size();
                    break;
                case COMMODITY:
                    count = primaryCommodities.size();
                    break;
                case CUSTOMER:
                    count = primaryCustomers.size();
                    break;
                case EMPLOYEE:
                    count = primaryEmployees.size();
                    break;
                case ENTRY:
                    count = primaryEntries.size();
                    break;
                case INVOICE:
                    count = primaryInvoices.size();
                    break;
                case JOB:
                    count = primaryJobs.size();
                    break;
                case ORDER:
                    count = primaryOrders.size();
                    break;
                case PRICE:
                    count = primaryPrices.size();
                    break;
                case SCHED_XACTION:
                    count = primarySchedules.size();
                    break;
                case TAX_TABLE:
                    count = primaryTaxTables.size();
                    break;
                case TRANSACTION:
                    count = primaryTransactions.size();
                    break;
                case VENDOR:
                    count = primaryVendors.size();
                    break;
            }

            counter = primaryCounters[ordinal];
            if (counter != null) {
                if (count == 0) {
                    primary.removeChild(counter);
                    primaryCounters[ordinal] = null;
                } else {
                    counter.setTextContent(String.valueOf(count));
                }
            } else if (count > 0) {
                counter = primaryDocument.createElementNS(NAMESPACE_GNC, "count-data");
                counter.setPrefix(prefixGnc);
                counter.setAttributeNS(NAMESPACE_CD, prefixCd + ":type", countType.getName());
                counter.setTextContent(String.valueOf(count));

                // Insert in the correct ordering.
                for (int i = ordinal + 1; i < counterTypesLength; i++) {
                    counterSibling = primaryCounters[i];
                    if (counterSibling != null) {
                        primary.insertBefore(counter, counterSibling);
                        break;
                    }
                }
                if (counter.getParentNode() == null) {
                    for (int i = ordinal - 1; i >= 0; i--) {
                        counterSibling = primaryCounters[i];
                        if (counterSibling != null) {
                            primary.insertBefore(counter, counterSibling.getNextSibling());
                            break;
                        }
                    }
                    if ((counter.getParentNode() == null) && (firstElementAfterCounters != null)) {
                        primary.insertBefore(counter, firstElementAfterCounters.getNextSibling());
                    }
                }

                primaryCounters[ordinal] = counter;
            }
        }

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
            if (isElement(node, "book", NAMESPACE_GNC)) {
                return (Element) node;
            }
        }

        Element book = document.createElementNS("book", NAMESPACE_GNC);
        root.appendChild(book);

        for (int i = 0; i < length; i++) {
            node = content.item(0);
            if (isElement(node, "commodity", NAMESPACE_GNC)) {
                book.appendChild(root.removeChild(node));
            } else if (isElement(node, "account", NAMESPACE_GNC)) {
                book.appendChild(root.removeChild(node));
            } else if (isElement(node, "count-data", NAMESPACE_GNC)) {
                root.removeChild(node);
            }
        }

        return book;
    }

    protected void mergePrices(Element primaryPricesDb, Element secondaryPricesDb, List<Element> primaryPrices) {
        Map<String, Element> primaryPricesById = new HashMap<>();
        String id;
        Element element;
        Node node;
        Node nodeNext = primaryPricesDb.getFirstChild();
        while (nodeNext != null) {
            node = nodeNext;
            nodeNext = node.getNextSibling();

            if (node.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            element = (Element) node;

            if (isElement(node, "price", null)) {
                id = getId(element, NAMESPACE_PRICE);
                primaryPrices.add(element);
                primaryPricesById.put(id, element);
            }
        }

        if (secondaryPricesDb == null) {
            return;
        }

        nodeNext = secondaryPricesDb.getFirstChild();
        while (nodeNext != null) {
            node = nodeNext;
            nodeNext = node.getNextSibling();

            if (node.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            element = (Element) node;

            if (isElement(node, "price", null)) {
                id = getId(element, NAMESPACE_PRICE);
                if (!primaryPricesById.containsKey(id)) {
                    addElement(primaryPricesDb, element, primaryPrices);
                    System.out.println("Price added: " + id);
                }
            }
        }
    }

    private Node mergeSlots(Element primary, Element secondary) {
        Node nextSibling = secondary.getNextSibling();

//        if (secondary == null) {
//            return primary;
//        }
//        if (primary == null) {
//            primary = slotFactory.createSlots();
//        }
//
//        String id;
//        List<Slots.Slot> primaryItems = primary.getKvpSlot();
//        Map<String, Slots.Slot> primaryItemsById = new HashMap<>();
//        for (Slots.Slot item : primaryItems) {
//            for (JAXBElement keyOrValue : item.getContent()) {
//                if ("key".equals(keyOrValue.getName().getLocalPart())) {
//                    id = (String) keyOrValue.getValue();
//                    primaryItemsById.put(id, item);
//                    break;
//                }
//            }
//        }
//
//        List<Slots.Slot> secondaryItems = secondary.getKvpSlot();
//        for (Slots.Slot item : secondaryItems) {
//            for (JAXBElement keyOrValue : item.getContent()) {
//                if ("key".equals(keyOrValue.getName().getLocalPart())) {
//                    id = (String) keyOrValue.getValue();
//
//                    // What was added?
//                    if (!primaryItemsById.containsKey(id)) {
//                        primaryItems.add(item);
//                        System.out.println("Slot added: " + id);
//                    }
//                    break;
//                }
//            }
//        }

        return nextSibling;
    }

    protected Node mergeTemplateTransactions(Element primary, Element secondary) {
        Node nextSibling = secondary.getNextSibling();
        //TODO implement me!

        return nextSibling;
    }

    protected Node mergeLots(Element primary, Element secondary) {
        Node nextSibling = secondary.getNextSibling();
//        if (secondary == null) {
//            return primary;
//        }
//        if (primary == null) {
//            primary = accountFactory.createLots();
//        }
//
//        String id;
//
//        List<Lot> primaryItems = primary.getLot();
//        Map<String, Lot> primaryItemsById = new HashMap<>();
//        for (Lot item : primaryItems) {
//            id = item.getId().getValue();
//            primaryItemsById.put(id, item);
//        }
//
//        List<Lot> secondaryItems = secondary.getLot();
//        for (Lot item : secondaryItems) {
//            id = item.getId().getValue();
//
//            // What was added?
//            if (primaryItemsById.containsKey(id)) {
//                Lot primaryItem = primaryItemsById.get(id);
//                primaryItem.setSlots(mergeSlots(primaryItem.getSlots(), item.getSlots()));
//            } else {
//                primaryItems.add(item);
//                System.out.println("Lot added: " + id);
//            }
//        }

        return nextSibling;
    }

    protected boolean isElement(Node node, String name, String namespace) {
        return (node.getNodeType() == Node.ELEMENT_NODE)
                && name.equals(node.getLocalName())
                && Objects.equals(namespace, node.getNamespaceURI());
    }

    protected Map<String, Element> mapElements(Element parent, String name, String namespace, String idNamespace) {
        NodeList nodes = parent.getElementsByTagNameNS(namespace, name);
        Map<String, Element> elementsById = new HashMap<>();
        final int length = nodes.getLength();
        Element element;
        for (int i = 0; i < length; i++) {
            element = (Element) nodes.item(i);
            elementsById.put(getId(element, idNamespace), element);
        }
        return elementsById;
    }

    protected String getId(Element parent, String namespace) {
        NodeList nodes = parent.getElementsByTagNameNS(namespace, "guid");
        int length = nodes.getLength();
        if (length == 0) {
            nodes = parent.getElementsByTagNameNS(namespace, "id");
            length = nodes.getLength();
        }
        Element element;
        Attr attr;
        for (int i = 0; i < length; i++) {
            element = (Element) nodes.item(i);
            attr = element.getAttributeNode("type");
            if ((attr != null) && "guid".equals(attr.getValue())) {
                return element.getTextContent().trim();
            }
        }
        return null;
    }

    protected String getSpaceId(Element parent, String namespace) {
        Node node = parent.getFirstChild();
        String space = null;
        String id = null;
        while ((node != null) && ((space == null) || (id == null))) {
            if (isElement(node, "space", namespace)) {
                space = node.getTextContent().trim();
            } else if (isElement(node, "id", namespace)) {
                id = node.getTextContent().trim();
            }
            node = node.getNextSibling();
        }
        return space + "/" + id;
    }

    protected String getPrefix(Document document, String namespaceURI) {
        return document.lookupPrefix(namespaceURI);
    }

    protected Element addElement(Node primaryParent, Element secondary, List<Element> primaryElements) {
        final int size = primaryElements.size();
        Node primarySibling = null;
        if (size > 0) {
            Element primaryElement = primaryElements.get(size - 1);
            if (primaryParent == null) {
                primaryParent = primaryElement.getParentNode();
            }
            primarySibling = primaryElement.getNextSibling();
        } else {
            // TODO get correct sibling from primary parent to maintain schema ordering.
        }
        secondary = (Element) primaryParent.getOwnerDocument()
                .importNode(secondary.getParentNode().removeChild(secondary), true);
        if (primarySibling != null) {
            primaryParent.insertBefore(secondary, primarySibling);
        } else {
            primaryParent.appendChild(secondary);
        }
        primaryElements.add(secondary);
        return secondary;
    }
}
