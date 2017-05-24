/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge.v2;

import com.github.gnucash.merge.DOMMerger;

import org.gnucash.xml.cd.CountData;
import org.gnucash.xml.slot.Slots;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        Map<String, Element> primaryPricesById = new HashMap<>();
        Map<String, Element> primarySchedulesById = new HashMap<>();
        Map<String, Element> primaryTransactionsById = new HashMap<>();
        Map<String, Element> primaryVendorsById = new HashMap<>();
        Element primarySlots = null;

        Element element;
        String id, type;
        BookCountDataType countDataType;
        Node firstElementAfterCounters = null;

        Node node = primary.getFirstChild();
        while (node != null) {
            if (node.getNodeType() == Node.ELEMENT_NODE) {
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
                    Node price = node.getFirstChild();
                    while (price != null) {
                        if (price.getNodeType() == Node.ELEMENT_NODE) {
                            if (isElement(price, "price", null)) {
                                element = (Element) price;
                                id = getId(element, NAMESPACE_PRICE);
                                primaryPrices.add(element);
                                primaryPricesById.put(id, element);
                            }
                        }
                        price = price.getNextSibling();
                    }
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
            node = node.getNextSibling();
        }

        // What secondary elements changed?
        node = secondary.getFirstChild();
        while (node != null) {
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                element = (Element) node;

                if (isElement(node, "commodity", NAMESPACE_GNC)) {
                    id = getSpaceId(element, NAMESPACE_CMDTY);
                    if (!primaryCommoditiesById.containsKey(id)) {
                        addElement(element, primaryCommodities);
                        System.out.println("Commodity added: " + id);
                    }
                } else if (isElement(node, "pricedb", NAMESPACE_GNC)) {
                    //TODO
//                    Node price = node.getFirstChild();
//                    while (price != null) {
//                        if (price.getNodeType() == Node.ELEMENT_NODE) {
//                            if (isElement(price, "price", null)) {
//                                element = (Element) price;
//                                primaryPrices.add(element);
//                                primaryPricesById.put(getId(element, NAMESPACE_PRICE), element);
//                            }
//                        }
//                        price = price.getNextSibling();
//                    }
                } else if (isElement(node, "account", NAMESPACE_GNC)) {
                    id = getId(element, NAMESPACE_ACT);
                    if (!primaryAccountsById.containsKey(id)) {
                        addElement(element, primaryAccounts);
                        System.out.println("Account added: " + id);
                    }
                } else if (isElement(node, "transaction", NAMESPACE_GNC)) {
                    id = getId(element, NAMESPACE_TRN);
                    if (!primaryTransactionsById.containsKey(id)) {
                        addElement(element, primaryTransactions);
                        System.out.println("Transaction added: " + id);
                    }
                } else if (isElement(node, "template-transactions", NAMESPACE_GNC)) {
                    //TODO
                } else if (isElement(node, "schedxaction", NAMESPACE_GNC)) {
                    id = getId(element, NAMESPACE_SX);
                    if (!primarySchedulesById.containsKey(id)) {
                        addElement(element, primarySchedules);
                        System.out.println("Scheduled Transaction added: " + id);
                    }
                } else if (isElement(node, "budget", NAMESPACE_GNC)) {
                    id = getId(element, NAMESPACE_BGT);
                    if (!primaryBudgetsById.containsKey(id)) {
                        addElement(element, primaryBudgets);
                        System.out.println("Budget added: " + id);
                    }
                } else if (isElement(node, "GncBillTerm", NAMESPACE_GNC)) {
                    id = getId(element, NAMESPACE_BILLTERM);
                    if (!primaryBillTermsById.containsKey(id)) {
                        addElement(element, primaryBillTerms);
                        System.out.println("Bill Term added: " + id);
                    }
                } else if (isElement(node, "GncCustomer", NAMESPACE_GNC)) {
                    id = getId(element, NAMESPACE_CUST);
                    if (!primaryCustomersById.containsKey(id)) {
                        addElement(element, primaryCustomers);
                        System.out.println("Customer added: " + id);
                    }
                } else if (isElement(node, "GncEmployee", NAMESPACE_GNC)) {
                    id = getId(element, NAMESPACE_EMPLOYEE);
                    if (!primaryEmployeesById.containsKey(id)) {
                        addElement(element, primaryEmployees);
                        System.out.println("Employee added: " + id);
                    }
                } else if (isElement(node, "GncEntry", NAMESPACE_GNC)) {
                    id = getId(element, NAMESPACE_ENTRY);
                    if (!primaryEntriesById.containsKey(id)) {
                        addElement(element, primaryEntries);
                        System.out.println("Entry added: " + id);
                    }
                } else if (isElement(node, "GncInvoice", NAMESPACE_GNC)) {
                    id = getId(element, NAMESPACE_INVOICE);
                    if (!primaryInvoicesById.containsKey(id)) {
                        addElement(element, primaryInvoices);
                        System.out.println("Invoice added: " + id);
                    }
                } else if (isElement(node, "GncJob", NAMESPACE_GNC)) {
                    id = getId(element, NAMESPACE_JOB);
                    if (!primaryJobsById.containsKey(id)) {
                        addElement(element, primaryJobs);
                        System.out.println("Job added: " + id);
                    }
                } else if (isElement(node, "GncOrder", NAMESPACE_GNC)) {
                    id = getId(element, NAMESPACE_ORDER);
                    if (!primaryOrdersById.containsKey(id)) {
                        addElement(element, primaryOrders);
                        System.out.println("Order added: " + id);
                    }
                } else if (isElement(node, "GncTaxTable", NAMESPACE_GNC)) {
                    id = getId(element, NAMESPACE_TAXTABLE);
                    if (!primaryTaxTablesById.containsKey(id)) {
                        addElement(element, primaryTaxTables);
                        System.out.println("Tax Table added: " + id);
                    }
                } else if (isElement(node, "GncVendor", NAMESPACE_GNC)) {
                    id = getId(element, NAMESPACE_VENDOR);
                    if (!primaryVendorsById.containsKey(id)) {
                        addElement(element, primaryVendors);
                        System.out.println("Vendor added: " + id);
                    }
                } else if (isElement(node, "slots", NAMESPACE_BOOK)) {
                    mergeSlots(primarySlots, element);
                }
            }
            node = node.getNextSibling();
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

    protected boolean isElement(Node node, String name, String namespace) {
        return (node.getNodeType() == Node.ELEMENT_NODE)
                && name.equals(node.getLocalName())
                && ((namespace == node.getNamespaceURI()) || namespace.equals(node.getNamespaceURI()));
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

    @Override
    public Element mergeAccounts(Element primary, Element secondary) {
        Map<String, Element> primaryItemsById = mapElements(primary, "account", NAMESPACE_GNC, NAMESPACE_ACT);

        NodeList secondaryItems = secondary.getElementsByTagNameNS(NAMESPACE_GNC, "account");
        final int length = secondaryItems.getLength();
        Element item;
        String id;
        for (int i = 0; i < length; i++) {
            item = (Element) secondaryItems.item(i);
            id = getId(item, NAMESPACE_ACT);

            // What was changed or added?
            if (primaryItemsById.containsKey(id)) {
                Element primaryItem = primaryItemsById.get(id);
                //TODO primary.setSlots(mergeSlots(primaryItem.getSlots(), item.getSlots()));
                //TODO primaryItem.setLots(mergeLots(primaryItem.getLots(), item.getLots()));
            } else {
                // FIXME must append in correct section of "account" elements to maintain schema consistent.
                primary.appendChild(secondary.removeChild(item));
                System.out.println("Account added: " + id);
            }
        }

        return primary;
    }

    @Override
    public Element mergeBudgets(Element primary, Element secondary) {
//        String id;
//
//        List<Budget> primaryItems = primary.getBudget();
//        Map<String, Budget> primaryItemsById = new HashMap<>();
//        for (Budget item : primaryItems) {
//            id = item.getId().getValue();
//            primaryItemsById.put(id, item);
//        }
//
//        List<Budget> secondaryItems = secondary.getBudget();
//        for (Budget item : secondaryItems) {
//            id = item.getId().getValue();
//
//            // What was added?
//            if (primaryItemsById.containsKey(id)) {
//                Budget primaryItem = primaryItemsById.get(id);
//                primary.setSlots(mergeSlots(primaryItem.getSlots(), item.getSlots()));
//            } else {
//                primaryItems.add(item);
//                System.out.println("Budget added: " + id);
//            }
//        }

        return primary;
    }

    @Override
    public Element mergeCommodities(Element primary, Element secondary) {
        //TODO implement me!

        return primary;
    }

    @Override
    public Element mergeBillTerms(Element primary, Element secondary) {
//        String id;
//
//        List<GncBillTerm> primaryItems = primary.getGncBillTerm();
//        Map<String, GncBillTerm> primaryItemsById = new HashMap<>();
//        for (GncBillTerm item : primaryItems) {
//            id = item.getGuid().getValue();
//            primaryItemsById.put(id, item);
//        }
//
//        List<GncBillTerm> secondaryItems = secondary.getGncBillTerm();
//        for (GncBillTerm item : secondaryItems) {
//            id = item.getGuid().getValue();
//
//            // What was added?
//            if (primaryItemsById.containsKey(id)) {
//                GncBillTerm primaryItem = primaryItemsById.get(id);
//                primary.setSlots(mergeSlots(primaryItem.getSlots(), item.getSlots()));
//            } else {
//                primaryItems.add(item);
//                System.out.println("Bill Term added: " + id);
//            }
//        }

        return primary;
    }

    @Override
    public Element mergeCustomers(Element primary, Element secondary) {
//        String id;
//
//        List<GncCustomer> primaryItems = primary.getGncCustomer();
//        Map<String, GncCustomer> primaryItemsById = new HashMap<>();
//        for (GncCustomer item : primaryItems) {
//            id = item.getGuid().getValue();
//            primaryItemsById.put(id, item);
//        }
//
//        List<GncCustomer> secondaryItems = secondary.getGncCustomer();
//        for (GncCustomer item : secondaryItems) {
//            id = item.getGuid().getValue();
//
//            // What was added?
//            if (primaryItemsById.containsKey(id)) {
//                GncCustomer primaryItem = primaryItemsById.get(id);
//                primary.setSlots(mergeSlots(primaryItem.getSlots(), item.getSlots()));
//            } else {
//                primaryItems.add(item);
//                System.out.println("Customer added: " + id);
//            }
//        }

        return primary;
    }

    @Override
    public Element mergeEmployees(Element primary, Element secondary) {
//        String id;
//
//        List<GncEmployee> primaryItems = primary.getGncEmployee();
//        Map<String, GncEmployee> primaryItemsById = new HashMap<>();
//        for (GncEmployee item : primaryItems) {
//            id = item.getGuid().getValue();
//            primaryItemsById.put(id, item);
//        }
//
//        List<GncEmployee> secondaryItems = secondary.getGncEmployee();
//        for (GncEmployee item : secondaryItems) {
//            id = item.getGuid().getValue();
//
//            // What was added?
//            if (primaryItemsById.containsKey(id)) {
//                GncEmployee primaryItem = primaryItemsById.get(id);
//                primary.setSlots(mergeSlots(primaryItem.getSlots(), item.getSlots()));
//            } else {
//                primaryItems.add(item);
//                System.out.println("Employee added: " + id);
//            }
//        }

        return primary;
    }

    @Override
    public Element mergeEntries(Element primary, Element secondary) {
//        String id;
//
//        List<GncEntry> primaryItems = primary.getGncEntry();
//        Map<String, GncEntry> primaryItemsById = new HashMap<>();
//        for (GncEntry item : primaryItems) {
//            id = item.getGuid().getValue();
//            primaryItemsById.put(id, item);
//        }
//
//        List<GncEntry> secondaryItems = secondary.getGncEntry();
//        for (GncEntry item : secondaryItems) {
//            id = item.getGuid().getValue();
//
//            // What was added?
//            if (!primaryItemsById.containsKey(id)) {
//                primaryItems.add(item);
//                System.out.println("Entry added: " + id);
//            }
//        }

        return primary;
    }

    @Override
    public Element mergeInvoices(Element primary, Element secondary) {
//        String id;
//
//        List<GncInvoice> primaryItems = primary.getGncInvoice();
//        Map<String, GncInvoice> primaryItemsById = new HashMap<>();
//        for (GncInvoice item : primaryItems) {
//            id = item.getGuid().getValue();
//            primaryItemsById.put(id, item);
//        }
//
//        List<GncInvoice> secondaryItems = secondary.getGncInvoice();
//        for (GncInvoice item : secondaryItems) {
//            id = item.getGuid().getValue();
//
//            // What was added?
//            if (primaryItemsById.containsKey(id)) {
//                GncInvoice primaryItem = primaryItemsById.get(id);
//                primary.setSlots(mergeSlots(primaryItem.getSlots(), item.getSlots()));
//            } else {
//                primaryItems.add(item);
//                System.out.println("Budget added: " + id);
//            }
//        }

        return primary;
    }

    @Override
    public Element mergeJobs(Element primary, Element secondary) {
//        String id;
//
//        List<GncJob> primaryItems = primary.getGncJob();
//        Map<String, GncJob> primaryItemsById = new HashMap<>();
//        for (GncJob item : primaryItems) {
//            id = item.getGuid().getValue();
//            primaryItemsById.put(id, item);
//        }
//
//        List<GncJob> secondaryItems = secondary.getGncJob();
//        for (GncJob item : secondaryItems) {
//            id = item.getGuid().getValue();
//
//            // What was added?
//            if (!primaryItemsById.containsKey(id)) {
//                primaryItems.add(item);
//                System.out.println("Job added: " + id);
//            }
//        }

        return primary;
    }

    @Override
    public Element mergeOrders(Element primary, Element secondary) {
//        String id;
//
//        List<GncOrder> primaryItems = primary.getGncOrder();
//        Map<String, GncOrder> primaryItemsById = new HashMap<>();
//        for (GncOrder item : primaryItems) {
//            id = item.getGuid().getValue();
//            primaryItemsById.put(id, item);
//        }
//
//        List<GncOrder> secondaryItems = secondary.getGncOrder();
//        for (GncOrder item : secondaryItems) {
//            id = item.getGuid().getValue();
//
//            // What was added?
//            if (!primaryItemsById.containsKey(id)) {
//                primaryItems.add(item);
//                System.out.println("Order added: " + id);
//            }
//        }

        return primary;
    }

    @Override
    public Element mergeTaxTables(Element primary, Element secondary) {
//        String id;
//
//        List<GncTaxTable> primaryItems = primary.getGncTaxTable();
//        Map<String, GncTaxTable> primaryItemsById = new HashMap<>();
//        for (GncTaxTable item : primaryItems) {
//            id = item.getGuid().getValue();
//            primaryItemsById.put(id, item);
//        }
//
//        List<GncTaxTable> secondaryItems = secondary.getGncTaxTable();
//        for (GncTaxTable item : secondaryItems) {
//            id = item.getGuid().getValue();
//
//            // What was added?
//            if (!primaryItemsById.containsKey(id)) {
//                primaryItems.add(item);
//                System.out.println("Tax Table added: " + id);
//            }
//        }

        return primary;
    }

    @Override
    public Element mergeVendors(Element primary, Element secondary) {
//        String id;
//
//        List<GncVendor> primaryItems = primary.getGncVendor();
//        Map<String, GncVendor> primaryItemsById = new HashMap<>();
//        for (GncVendor item : primaryItems) {
//            id = item.getGuid().getValue();
//            primaryItemsById.put(id, item);
//        }
//
//        List<GncVendor> secondaryItems = secondary.getGncVendor();
//        for (GncVendor item : secondaryItems) {
//            id = item.getGuid().getValue();
//
//            // What was added?
//            if (primaryItemsById.containsKey(id)) {
//                GncVendor primaryItem = primaryItemsById.get(id);
//                primary.setSlots(mergeSlots(primaryItem.getSlots(), item.getSlots()));
//            } else {
//                primaryItems.add(item);
//                System.out.println("Vendor added: " + id);
//            }
//        }

        return primary;
    }

    @Override
    public Element mergePrices(Element primary, Element secondary) {
//        PriceDb secondaryPrices = secondary.getPricedb();
//        if (secondaryPrices == null) {
//            return;
//        }
//
//        PriceDb primaryPrices = primary.getPricedb();
//        if (primaryPrices == null) {
//            primaryPrices = new org.gnucash.xml.price.ObjectFactory().createPriceDb();
//            primary.setPricedb(primaryPrices);
//        }
//
//        String id;
//        List<Price> primaryItems = primaryPrices.getPrice();
//        Map<String, Price> primaryItemsById = new HashMap<>();
//        for (Price item : primaryItems) {
//            id = item.getId().getValue();
//            primaryItemsById.put(id, item);
//        }
//
//        List<Price> secondaryItems = secondaryPrices.getPrice();
//        for (Price item : secondaryItems) {
//            id = item.getId().getValue();
//
//            // What was added?
//            if (!primaryItemsById.containsKey(id)) {
//                primaryItems.add(item);
//                System.out.println("Price added: " + id);
//            }
//        }

        return primary;
    }

    @Override
    public Element mergeSchedules(Element primary, Element secondary) {
//        String id;
//
//        List<ScheduledTransaction> primaryItems = primary.getSchedxaction();
//        Map<String, ScheduledTransaction> primaryItemsById = new HashMap<>();
//        for (ScheduledTransaction item : primaryItems) {
//            id = item.getId().getValue();
//            primaryItemsById.put(id, item);
//        }
//
//        List<ScheduledTransaction> secondaryItems = secondary.getSchedxaction();
//        for (ScheduledTransaction item : secondaryItems) {
//            id = item.getId().getValue();
//
//            // What was added?
//            if (primaryItemsById.containsKey(id)) {
//                ScheduledTransaction primaryItem = primaryItemsById.get(id);
//                primary.setSlots(mergeSlots(primaryItem.getSlots(), item.getSlots()));
//            } else {
//                primaryItems.add(item);
//                System.out.println("Scheduled Transaction added: " + id);
//            }
//        }

        return primary;
    }

    @Override
    public Element mergeSlots(Element primary, Element secondary) {
//        primary.setSlots(mergeSlots(primary.getSlots(), secondary.getSlots()));

        return primary;
    }

    protected Slots mergeSlots(Slots primary, Slots secondary) {
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

        return primary;
    }

    @Override
    public Element mergeTemplateTransactions(Element primary, Element secondary) {
        //TODO implement me!

        return primary;
    }

    @Override
    public Element mergeTransactions(Element primary, Element secondary) {
//        String id;
//
//        List<Transaction> primaryItems = primary.getTransaction();
//        Map<String, Transaction> primaryItemsById = new HashMap<>();
//        for (Transaction item : primaryItems) {
//            id = item.getId().getValue();
//            primaryItemsById.put(id, item);
//        }
//
//        List<Transaction> secondaryItems = secondary.getTransaction();
//        for (Transaction item : secondaryItems) {
//            id = item.getId().getValue();
//
//            // What was added?
//            if (primaryItemsById.containsKey(id)) {
//                Transaction primaryItem = primaryItemsById.get(id);
//                primary.setSlots(mergeSlots(primaryItem.getSlots(), item.getSlots()));
//            } else {
//                primaryItems.add(item);
//                System.out.println("Transaction added: " + id);
//            }
//        }

        return primary;
    }

//    protected Lots mergeLots(Lots primary, Lots secondary) {
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
//
//        return primary;
//    }

    @Override
    public void updateCounters(Element book) {
//        List<CountData> counters = book.getCountData();
//        counters.clear();
//
//        addCount(counters, "commodity", book.getCommodity().size());
//        addCount(counters, "account", book.getAccount().size());
//        addCount(counters, "transaction", book.getTransaction().size());
//        addCount(counters, "schedxaction", book.getSchedxaction().size());
//        addCount(counters, "budget", book.getBudget().size());
//        if (book.getPricedb() != null) {
//            addCount(counters, "price", book.getPricedb().getPrice().size());
//        }
//        addCount(counters, "gnc:GncBillTerm", book.getGncBillTerm().size());
//        addCount(counters, "gnc:GncCustomer", book.getGncCustomer().size());
//        addCount(counters, "gnc:GncEmployee", book.getGncEmployee().size());
//        addCount(counters, "gnc:GncEntry", book.getGncEntry().size());
//        addCount(counters, "gnc:GncInvoice", book.getGncInvoice().size());
//        addCount(counters, "gnc:GncJob", book.getGncJob().size());
//        addCount(counters, "gnc:GncOrder", book.getGncOrder().size());
//        addCount(counters, "gnc:GncTaxTable", book.getGncTaxTable().size());
//        addCount(counters, "gnc:GncVendor", book.getGncVendor().size());
    }

    protected void addCount(List<CountData> counters, String type, int count) {
        if (count > 0) {
//            CountData counter = counterFactory.createCountData();
//            counter.setType(type);
//            counter.setValue(count);
//            counters.add(counter);
        }
    }

    protected String getPrefix(Document document, String namespaceURI) {
        return document.lookupPrefix(namespaceURI);
    }

    protected void addElement(Element secondary, List<Element> primaryElements) {
        Element primaryElement = primaryElements.get(primaryElements.size() - 1);
        secondary = (Element) primaryElement.getOwnerDocument()
                .importNode(secondary.getParentNode().removeChild(secondary), true);
        primaryElement.getParentNode()
                .insertBefore(secondary, primaryElement.getNextSibling());
        primaryElements.add(secondary);
    }
}
