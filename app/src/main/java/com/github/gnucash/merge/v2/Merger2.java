/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge.v2;

import com.github.gnucash.merge.GncMerger;

import org.w3c.dom.Document;

/**
 * Merge version 2.0.0 gnucash files.
 *
 * @author Moshe Waisberg
 */
public class Merger2 implements GncMerger {
    @Override
    public Document merge(Document primary, Document secondary) {
        return primary;
    }
}
