/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge.v2;

/**
 * Count Data element name.
 *
 * @author Moshe Waisberg
 */
public enum BookCountDataType {

    COMMODITY("commodity"),
    ACCOUNT("account"),
    TRANSACTION("transaction"),
    SCHED_XACTION("schedxaction"),
    BUDGET("budget"),
    PRICE("price"),

    BILLTERM("gnc:GncBillTerm"),
    CUSTOMER("gnc:GncCustomer"),
    EMPLOYEE("gnc:GncEmployee"),
    ENTRY("gnc:GncEntry"),
    INVOICE("gnc:GncInvoice"),
    JOB("gnc:GncJob"),
    ORDER("gnc:GncOrder"),
    TAX_TABLE("gnc:GncTaxTable"),
    VENDOR("gnc:GncVendor");

    private final String name;

    BookCountDataType(String type) {
        this.name = type;
    }

    public String getName() {
        return name;
    }

    public static BookCountDataType find(String type) {
        for (BookCountDataType value : values()) {
            if (type.equals(value.getName())) {
                return value;
            }
        }
        return null;
    }
}
