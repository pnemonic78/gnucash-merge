/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge.v2;

import com.github.gnucash.merge.DOMMerger;

import org.gnucash.xml.cd.CountData;
import org.gnucash.xml.slot.Slots;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.List;

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
        mergeAccounts(primary, secondary);
        mergeBudgets(primary, secondary);
        mergeCommodities(primary, secondary);
        mergeBillTerms(primary, secondary);
        mergeCustomers(primary, secondary);
        mergeEmployees(primary, secondary);
        mergeEntries(primary, secondary);
        mergeInvoices(primary, secondary);
        mergeJobs(primary, secondary);
        mergeOrders(primary, secondary);
        mergeTaxTables(primary, secondary);
        mergeVendors(primary, secondary);
        mergePrices(primary, secondary);
        mergeSchedules(primary, secondary);
        mergeSlots(primary, secondary);
        mergeTemplateTransactions(primary, secondary);
        mergeTransactions(primary, secondary);

        updateCounters(primary);

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

    @Override
    public Element mergeAccounts(Element primary, Element secondary) {
//        String id;
//
//        List<Account> primaryItems = primary.getAccount();
//        Map<String, Account> primaryItemsById = new HashMap<>();
//        for (Account item : primaryItems) {
//            id = item.getId().getValue();
//            primaryItemsById.put(id, item);
//        }
//
//        List<Account> secondaryItems = secondary.getAccount();
//        for (Account item : secondaryItems) {
//            id = item.getId().getValue();
//
//            // What was added?
//            if (primaryItemsById.containsKey(id)) {
//                Account primaryItem = primaryItemsById.get(id);
//                primary.setSlots(mergeSlots(primaryItem.getSlots(), item.getSlots()));
//                primaryItem.setLots(mergeLots(primaryItem.getLots(), item.getLots()));
//            } else {
//                primaryItems.add(item);
//                System.out.println("Account added: " + id);
//            }
//        }

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
}
