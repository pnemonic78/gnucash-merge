/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge;

import com.github.gnucash.example.ObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 * Merge gnucash files.
 *
 * @author Moshe Waisberg
 */
public class Merger {
    public static void main(String[] args) throws Exception {
        System.out.println("gnucash merge.");
        JAXBContext context = JAXBContext.newInstance(ObjectFactory.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        System.out.println(unmarshaller);
    }
}
