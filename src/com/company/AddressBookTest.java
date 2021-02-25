package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Vector;

import static org.junit.Assert.*;

/**
 * Unit Testing class for AddressBook class
 */
public class AddressBookTest {

    @org.junit.Test
    public void load() {
        AddressBook ab = new AddressBook();
        ab.load("entries.txt");
        AddressEntry first = new AddressEntry("Sahej","Hundal","1 A St","Fremont","CA",94538,"123-456-7890","a@a.com");
        AddressEntry last = new AddressEntry("Michael","B","3 C St","Random Town","CA",90000,"123-456-7890","a@a.com");
        /**
         * Check how many entities were read from the file, content of first and last contact
         */
        assertEquals(ab.addressEntryList.size(), 7);
        assertEquals(ab.addressEntryList.get(0).to_String(),first.to_String());
        assertEquals(ab.addressEntryList.get(6).to_String(),last.to_String());
    }

    @org.junit.Test
    public void list() {
        AddressBook ab = new AddressBook();
        AddressEntry a = new AddressEntry("Mark","Zuckerberg","1 FB Ct","Facebook","CA",10000,"123-456-7890","");
        AddressEntry b = new AddressEntry("Elon","Musk","1 A Ct","Tesla","CA",10000,"123-456-7890","");
        AddressEntry c = new AddressEntry("Jeff","Bezos","1 FB Ct","Amazon","CA",10000,"123-456-7890","");
        ab.add(a);
        ab.add(b);
        ab.add(c);
        /*** Now, according to the order that the AddressEntry objects have been added.
         * The list should not be sorted according to last names.*/
        ab.list();
        assertEquals(ab.addressEntryList.get(0).to_String(),c.to_String());
        assertEquals(ab.addressEntryList.get(1).to_String(),b.to_String());
        assertEquals(ab.addressEntryList.get(2).to_String(),a.to_String());
    }

    @org.junit.Test
    public void add() {
        AddressBook ab = new AddressBook();
        AddressEntry a = new AddressEntry("Mark","Zuckerberg","1 FB Ct","Facebook","CA",10000,"123-456-7890","");
        AddressEntry b = new AddressEntry("Elon","Musk","1 A Ct","Tesla","CA",10000,"123-456-7890","");
        ab.add(a);
        ab.add(b);
        /**
         * Check if our local objects were added to the vector
         */
        assertEquals(ab.addressEntryList.get(0),a);
        assertEquals(ab.addressEntryList.get(1),b);
    }

    @org.junit.Test
    public void delete() {
        AddressBook ab = new AddressBook();
        AddressEntry a = new AddressEntry("Mark","Zuckerberg","1 FB Ct","Facebook","CA",10000,"123-456-7890","");
        AddressEntry b = new AddressEntry("Elon","Musk","1 A Ct","Tesla","CA",10000,"123-456-7890","");
        AddressEntry c = new AddressEntry("Jeff","Bezos","1 FB Ct","Amazon","CA",10000,"123-456-7890","");
        ab.add(a);
        ab.add(b);
        ab.add(c);
        /**
         * Delete objects one by one and check the last one left
         */
        assertEquals(ab.addressEntryList.size(),3);
        ab.delete(c);
        assertEquals(ab.addressEntryList.size(),2);
        ab.delete(b);
        assertEquals(ab.addressEntryList.size(),1);
        assertEquals(ab.addressEntryList.get(0),a);
    }

    @org.junit.Test
    public void find() {
        AddressBook ab = new AddressBook();
        AddressEntry a = new AddressEntry("Sahej","Hundal","1 A St","Fremont","CA",94538,"123-456-7890","a@a.com");
        AddressEntry b = new AddressEntry("Sam","Hundal","1 B St","Fremont","CA",94538,"123-456-7890","a@a.com");
        AddressEntry c = new AddressEntry("Michael","B","3 C St","Random Town","CA",90000,"123-456-7890","a@a.com");
        ab.add(a);
        ab.add(b);
        ab.add(c);
        /**
         * Check how many results show up from the search, and compare each of them
         */
        Vector<AddressEntry> tempList = ab.find("Hundal");
        assertEquals(tempList.size(),2);
        assertEquals(tempList.get(0),a);
        assertEquals(tempList.get(1),b);
    }
}