/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge.v2;

import com.github.gnucash.merge.DOMMerger;
import com.github.gnucash.merge.DOMMergerListener;
import com.github.gnucash.merge.GncMergerListener;

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

    protected final DOMMergerListener listener;

    public Merger2(DOMMergerListener listener) {
        this.listener = listener;
    }

    @Override
    public GncMergerListener getListener() {
        return listener;
    }

    @Override
    public Document mergeDocument(Document primary, Document secondary) {
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
        String id, type, namespaceURI;
        BookCountDataType countDataType;
        Node firstElementAfterCounters = null;
        Map<String, Element> primaryElementsById;
        Element primaryElement;
        int compare;

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
                if (primaryTransactionsById.containsKey(id)) {
                    // Keep only the latest.
                    primaryElement = primaryTransactionsById.get(id);
                    compare = compareTransaction(primaryElement, element);
                    if (compare < 0) {
                        primaryTransactions.remove(primaryElement);
                        primaryTransactions.add(element);
                        primaryTransactionsById.put(id, element);
                    } else {
                        primary.removeChild(element);
                        notifyTransactionRemoved(element, id);
                    }
                } else {
                    primaryTransactions.add(element);
                    primaryTransactionsById.put(id, element);
                }
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
                namespaceURI = NAMESPACE_CMDTY;
                id = getSpaceId(element, namespaceURI);
                primaryElementsById = primaryCommoditiesById;
                if (primaryElementsById.containsKey(id)) {
                    primaryElement = primaryElementsById.get(id);
                    mergeSlots(primaryElement, element, namespaceURI);
                } else {
                    element = addElement(primary, element, primaryCommodities);
                    notifyCommodityAdded(element, id);
                }
            } else if (isElement(node, "pricedb", NAMESPACE_GNC)) {
                //FIXME what if no primary pricesdb but is secondary pricesdb?
                mergePrices(primaryPricesDb, element, primaryPrices);
            } else if (isElement(node, "account", NAMESPACE_GNC)) {
                namespaceURI = NAMESPACE_ACT;
                id = getId(element, namespaceURI);
                primaryElementsById = primaryAccountsById;
                if (primaryElementsById.containsKey(id)) {
                    primaryElement = primaryElementsById.get(id);
                    mergeSlots(primaryElement, element, namespaceURI);
                    mergeLots(primaryElement, element, namespaceURI);
                } else {
                    element = addElement(primary, element, primaryAccounts);
                    notifyAccountAdded(element, id);
                }
            } else if (isElement(node, "transaction", NAMESPACE_GNC)) {
                namespaceURI = NAMESPACE_TRN;
                id = getId(element, namespaceURI);
                primaryElementsById = primaryTransactionsById;
                if (primaryElementsById.containsKey(id)) {
                    primaryElement = primaryElementsById.get(id);
                    mergeSlots(primaryElement, element, namespaceURI);
                } else {
                    element = addElement(primary, element, primaryTransactions);
                    notifyTransactionAdded(element, id);
                }
            } else if (isElement(node, "template-transactions", NAMESPACE_GNC)) {
                //TODO
            } else if (isElement(node, "schedxaction", NAMESPACE_GNC)) {
                namespaceURI = NAMESPACE_SX;
                id = getId(element, namespaceURI);
                primaryElementsById = primarySchedulesById;
                if (primaryElementsById.containsKey(id)) {
                    primaryElement = primaryElementsById.get(id);
                    mergeSlots(primaryElement, element, namespaceURI);
                } else {
                    element = addElement(primary, element, primarySchedules);
                    notifyScheduledTransactionAdded(element, id);
                }
            } else if (isElement(node, "budget", NAMESPACE_GNC)) {
                namespaceURI = NAMESPACE_BGT;
                id = getId(element, namespaceURI);
                primaryElementsById = primaryBudgetsById;
                if (primaryElementsById.containsKey(id)) {
                    primaryElement = primaryElementsById.get(id);
                    mergeSlots(primaryElement, element, namespaceURI);
                } else {
                    element = addElement(primary, element, primaryBudgets);
                    notifyBudgetAdded(element, id);
                }
            } else if (isElement(node, "GncBillTerm", NAMESPACE_GNC)) {
                namespaceURI = NAMESPACE_BILLTERM;
                id = getId(element, namespaceURI);
                primaryElementsById = primaryBillTermsById;
                if (primaryElementsById.containsKey(id)) {
                    primaryElement = primaryElementsById.get(id);
                    mergeSlots(primaryElement, element, namespaceURI);
                } else {
                    element = addElement(primary, element, primaryBillTerms);
                    notifyBillTermAdded(element, id);
                }
            } else if (isElement(node, "GncCustomer", NAMESPACE_GNC)) {
                namespaceURI = NAMESPACE_CUST;
                id = getId(element, namespaceURI);
                primaryElementsById = primaryCustomersById;
                if (primaryElementsById.containsKey(id)) {
                    primaryElement = primaryElementsById.get(id);
                    mergeSlots(primaryElement, element, namespaceURI);
                } else {
                    element = addElement(primary, element, primaryCustomers);
                    notifyCustomerAdded(element, id);
                }
            } else if (isElement(node, "GncEmployee", NAMESPACE_GNC)) {
                namespaceURI = NAMESPACE_EMPLOYEE;
                id = getId(element, namespaceURI);
                primaryElementsById = primaryEmployeesById;
                if (primaryElementsById.containsKey(id)) {
                    primaryElement = primaryElementsById.get(id);
                    mergeSlots(primaryElement, element, namespaceURI);
                } else {
                    element = addElement(primary, element, primaryEmployees);
                    notifyEmployeeAdded(element, id);
                }
            } else if (isElement(node, "GncEntry", NAMESPACE_GNC)) {
                namespaceURI = NAMESPACE_ENTRY;
                id = getId(element, namespaceURI);
                primaryElementsById = primaryEntriesById;
                if (primaryElementsById.containsKey(id)) {
                    primaryElement = primaryElementsById.get(id);
                    mergeSlots(primaryElement, element, namespaceURI);
                } else {
                    element = addElement(primary, element, primaryEntries);
                    notifyEntryAdded(element, id);
                }
            } else if (isElement(node, "GncInvoice", NAMESPACE_GNC)) {
                namespaceURI = NAMESPACE_INVOICE;
                id = getId(element, namespaceURI);
                primaryElementsById = primaryInvoicesById;
                if (primaryElementsById.containsKey(id)) {
                    primaryElement = primaryElementsById.get(id);
                    mergeSlots(primaryElement, element, namespaceURI);
                } else {
                    element = addElement(primary, element, primaryInvoices);
                    notifyInvoiceAdded(element, id);
                }
            } else if (isElement(node, "GncJob", NAMESPACE_GNC)) {
                namespaceURI = NAMESPACE_JOB;
                id = getId(element, namespaceURI);
                primaryElementsById = primaryJobsById;
                if (primaryElementsById.containsKey(id)) {
                    primaryElement = primaryElementsById.get(id);
                    mergeSlots(primaryElement, element, namespaceURI);
                } else {
                    element = addElement(primary, element, primaryJobs);
                    notifyJobAdded(element, id);
                }
            } else if (isElement(node, "GncOrder", NAMESPACE_GNC)) {
                namespaceURI = NAMESPACE_ORDER;
                id = getId(element, namespaceURI);
                primaryElementsById = primaryOrdersById;
                if (primaryElementsById.containsKey(id)) {
                    primaryElement = primaryElementsById.get(id);
                    mergeSlots(primaryElement, element, namespaceURI);
                } else {
                    element = addElement(primary, element, primaryOrders);
                    notifyOrderAdded(element, id);
                }
            } else if (isElement(node, "GncTaxTable", NAMESPACE_GNC)) {
                namespaceURI = NAMESPACE_TAXTABLE;
                id = getId(element, namespaceURI);
                primaryElementsById = primaryTaxTablesById;
                if (primaryElementsById.containsKey(id)) {
                    primaryElement = primaryElementsById.get(id);
                    mergeSlots(primaryElement, element, namespaceURI);
                } else {
                    element = addElement(primary, element, primaryTaxTables);
                    notifyTaxTableAdded(element, id);
                }
            } else if (isElement(node, "GncVendor", NAMESPACE_GNC)) {
                namespaceURI = NAMESPACE_VENDOR;
                id = getId(element, namespaceURI);
                primaryElementsById = primaryVendorsById;
                if (primaryElementsById.containsKey(id)) {
                    primaryElement = primaryElementsById.get(id);
                    mergeSlots(primaryElement, element, namespaceURI);
                } else {
                    element = addElement(primary, element, primaryVendors);
                    notifyVendorAdded(element, id);
                }
            } else if (isElement(node, "slots", NAMESPACE_BOOK)) {
                //FIXME what if no primary pricesdb but is secondary pricesdb?
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

        Element book = document.createElementNS(NAMESPACE_GNC, "book");
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

    protected void mergePrices(Element primary, Element secondary, List<Element> primaryPrices) {
        Map<String, Element> primaryPricesById = new HashMap<>();
        String id;
        Element element;
        Node node;
        Node nodeNext = primary.getFirstChild();
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

        if (secondary == null) {
            return;
        }

        nodeNext = secondary.getFirstChild();
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
                    element = addElement(primary, element, primaryPrices);
                    notifyPriceAdded(element, id);
                }
            }
        }
    }

    protected void mergeSlots(Element primary, Element secondary, String namespaceURI) {
        if (secondary == null) {
            return;
        }

        Element primarySlots = null;
        Element secondarySlots = null;
        Element element;
        Node node;
        Node nodeNext = primary.getFirstChild();
        while (nodeNext != null) {
            node = nodeNext;
            nodeNext = node.getNextSibling();

            if (node.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            element = (Element) node;

            if (isElement(node, "slots", namespaceURI)) {
                primarySlots = element;
                break;
            }
        }

        nodeNext = secondary.getFirstChild();
        while (nodeNext != null) {
            node = nodeNext;
            nodeNext = node.getNextSibling();

            if (node.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            element = (Element) node;

            if (isElement(node, "slots", namespaceURI)) {
                secondarySlots = element;
                break;
            }
        }

        if (primarySlots == null) {
            if (secondarySlots == null) {
                return;
            }
            Document document = primary.getOwnerDocument();
            primarySlots = document.createElementNS(namespaceURI, getPrefix(document, namespaceURI) + ":" + "slots");
            //FIXME "slots" almost always the last element, unless before "child" or "parent".
            primary.appendChild(primarySlots);
        }
        mergeSlots(primarySlots, secondarySlots);
    }

    protected void mergeSlots(Element primary, Element secondary) {
        if (secondary == null) {
            return;
        }
        final String primaryId = getId((Element) primary.getParentNode(), primary.getNamespaceURI());

        List<Element> primarySlots = new ArrayList<>();
        Map<String, Element> primarySlotsById = new HashMap<>();
        String id;
        Element element;
        Node node;
        Node nodeNext = primary.getFirstChild();
        while (nodeNext != null) {
            node = nodeNext;
            nodeNext = node.getNextSibling();

            if (node.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            element = (Element) node;

            if (isElement(node, "slot", null)) {
                id = getSlotId(element);
                primarySlots.add(element);
                primarySlotsById.put(id, element);
            }
        }

        nodeNext = secondary.getFirstChild();
        while (nodeNext != null) {
            node = nodeNext;
            nodeNext = node.getNextSibling();

            if (node.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            element = (Element) node;

            if (isElement(node, "slot", null)) {
                id = getSlotId(element);
                if (!primarySlotsById.containsKey(id)) {
                    element = addElement(primary, element, primarySlots);
                    notifySlotAdded(primary, primaryId, element, id);
                }
            }
        }
    }

    protected void mergeTemplateTransactions(Element primary, Element secondary) {
        //TODO implement me!
    }

    protected void mergeLots(Element primary, Element secondary, String namespaceURI) {
        if (secondary == null) {
            return;
        }

        Element primarySlots = null;
        Element secondarySlots = null;
        Element element;
        Node node;
        Node nodeNext = primary.getFirstChild();
        while (nodeNext != null) {
            node = nodeNext;
            nodeNext = node.getNextSibling();

            if (node.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            element = (Element) node;

            if (isElement(node, "lots", namespaceURI)) {
                primarySlots = element;
                break;
            }
        }

        nodeNext = secondary.getFirstChild();
        while (nodeNext != null) {
            node = nodeNext;
            nodeNext = node.getNextSibling();

            if (node.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            element = (Element) node;

            if (isElement(node, "lots", namespaceURI)) {
                secondarySlots = element;
                break;
            }
        }

        if (primarySlots == null) {
            if (secondarySlots == null) {
                return;
            }
            Document document = primary.getOwnerDocument();
            primarySlots = document.createElementNS(namespaceURI, getPrefix(document, namespaceURI) + ":" + "lots");
            // "slots" almost the last element.
            primary.appendChild(primarySlots);
        }
        mergeLots(primarySlots, secondarySlots);
    }

    protected void mergeLots(Element primary, Element secondary) {
        if (secondary == null) {
            return;
        }
        final String primaryId = getId((Element) primary.getParentNode(), primary.getNamespaceURI());

        List<Element> primaryLots = new ArrayList<>();
        Map<String, Element> primaryLotsById = new HashMap<>();
        String id;
        Element element;
        Node node;
        Node nodeNext = primary.getFirstChild();
        while (nodeNext != null) {
            node = nodeNext;
            nodeNext = node.getNextSibling();

            if (node.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            element = (Element) node;

            if (isElement(node, "lot", null)) {
                id = getSlotId(element);
                primaryLots.add(element);
                primaryLotsById.put(id, element);
            }
        }

        nodeNext = secondary.getFirstChild();
        while (nodeNext != null) {
            node = nodeNext;
            nodeNext = node.getNextSibling();

            if (node.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            element = (Element) node;

            if (isElement(node, "lot", null)) {
                id = getSlotId(element);
                if (!primaryLotsById.containsKey(id)) {
                    element = addElement(primary, element, primaryLots);
                    notifyLotAdded(primary, primaryId, element, id);
                }
            }
        }
    }

    protected boolean isElement(Node node, String name, String namespaceURI) {
        return (node.getNodeType() == Node.ELEMENT_NODE)
                && name.equals(node.getLocalName())
                && Objects.equals(namespaceURI, node.getNamespaceURI());
    }

    protected String getId(Element parent, String namespaceURI) {
        Element element = getElement(parent, "guid", namespaceURI);
        if (element == null) {
            element = getElement(parent, "id", namespaceURI);
        }
        if (element != null) {
            Attr attr = element.getAttributeNode("type");
            if ((attr != null) && "guid".equals(attr.getValue())) {
                return element.getTextContent().trim();
            }
        }
        return null;
    }

    protected String getSpaceId(Element element, String namespaceURI) {
        Node node = element.getFirstChild();
        String space = null;
        String id = null;
        while ((node != null) && ((space == null) || (id == null))) {
            if (isElement(node, "space", namespaceURI)) {
                space = node.getTextContent().trim();
            } else if (isElement(node, "id", namespaceURI)) {
                id = node.getTextContent().trim();
            }
            node = node.getNextSibling();
        }
        return space + "/" + id;
    }

    protected String getSlotId(Element element) {
        Node node = element.getFirstChild();
        while (node != null) {
            if (isElement(node, "key", NAMESPACE_SLOT)) {
                return node.getTextContent().trim();
            }
            node = node.getNextSibling();
        }
        return null;
    }

    protected String getPrefix(Document document, String namespaceURI) {
        return document.lookupPrefix(namespaceURI);
    }

    protected String getPrefix(Element element, String namespaceURI) {
        return getPrefix(element.getOwnerDocument(), namespaceURI);
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

    protected int compareTransaction(Element element1, Element element2) {
        Element dateEntered1 = getElement(element1, "date-entered", NAMESPACE_TRN);
        Element dateEntered2 = getElement(element2, "date-entered", NAMESPACE_TRN);
        int c = compareTimeSpec(dateEntered1, dateEntered2);
        if (c != 0) {
            return c;
        }
        Element datePosted1 = getElement(element1, "date-posted", NAMESPACE_TRN);
        Element datePosted2 = getElement(element2, "date-posted", NAMESPACE_TRN);
        return compareTimeSpec(datePosted1, datePosted2);
    }

    protected int compareTimeSpec(Element element1, Element element2) {
        if (element1 == null) {
            if (element2 == null) {
                return 0;
            }
            return -1;
        }
        if (element2 == null) {
            return 1;
        }
        Element date1 = getElement(element1, "date", NAMESPACE_TS);
        Element date2 = getElement(element2, "date", NAMESPACE_TS);
        return compareTimeSpec(date1.getTextContent(), date2.getTextContent());
    }

    protected int compareTimeSpec(String time1, String time2) {
        if (time1 == null) {
            if (time2 == null) {
                return 0;
            }
            return -1;
        }
        if (time2 == null) {
            return 1;
        }
        return time1.trim().compareTo(time2.trim());
    }

    protected Element getElement(Element parent, String name, String namespaceURI) {
        Node node = parent.getFirstChild();
        while (node != null) {
            if (isElement(node, name, namespaceURI)) {
                return (Element) node;
            }
            node = node.getNextSibling();
        }
        return null;
    }

    private void notifyAccountAdded(Element element, String id) {
        if (listener != null) {
            listener.onAccountAdded(element, id);
        }
    }

    private void notifyBudgetAdded(Element element, String id) {
        if (listener != null) {
            listener.onBudgetAdded(element, id);
        }
    }

    private void notifyBillTermAdded(Element element, String id) {
        if (listener != null) {
            listener.onBillTermAdded(element, id);
        }
    }

    private void notifyCommodityAdded(Element element, String id) {
        if (listener != null) {
            listener.onCommodityAdded(element, id);
        }
    }

    private void notifyCustomerAdded(Element element, String id) {
        if (listener != null) {
            listener.onCustomerAdded(element, id);
        }
    }

    private void notifyEmployeeAdded(Element element, String id) {
        if (listener != null) {
            listener.onEmployeeAdded(element, id);
        }
    }

    private void notifyEntryAdded(Element element, String id) {
        if (listener != null) {
            listener.onEntryAdded(element, id);
        }
    }

    private void notifyInvoiceAdded(Element element, String id) {
        if (listener != null) {
            listener.onInvoiceAdded(element, id);
        }
    }

    private void notifyJobAdded(Element element, String id) {
        if (listener != null) {
            listener.onJobAdded(element, id);
        }
    }

    private void notifyLotAdded(Element primary, String primaryId, Element element, String id) {
        if (listener != null) {
            listener.onLotAdded(primary, primaryId, element, id);
        }
    }

    private void notifyOrderAdded(Element element, String id) {
        if (listener != null) {
            listener.onOrderAdded(element, id);
        }
    }

    private void notifyPriceAdded(Element element, String id) {
        if (listener != null) {
            listener.onPriceAdded(element, id);
        }
    }

    private void notifyScheduledTransactionAdded(Element element, String id) {
        if (listener != null) {
            listener.onScheduledTransactionAdded(element, id);
        }
    }

    private void notifySlotAdded(Element primary, String primaryId, Element element, String id) {
        if (listener != null) {
            listener.onSlotAdded(primary, primaryId, element, id);
        }
    }

    private void notifyTaxTableAdded(Element element, String id) {
        if (listener != null) {
            listener.onTaxTableAdded(element, id);
        }
    }

    private void notifyTransactionAdded(Element element, String id) {
        if (listener != null) {
            listener.onTransactionAdded(element, id);
        }
    }

    private void notifyTransactionRemoved(Element element, String id) {
        if (listener != null) {
            listener.onTransactionRemoved(element, id);
        }
    }

    private void notifyVendorAdded(Element element, String id) {
        if (listener != null) {
            listener.onVendorAdded(element, id);
        }
    }
}
