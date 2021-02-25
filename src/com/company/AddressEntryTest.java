package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit Testing class for AddressEntry class
 */
public class AddressEntryTest {

    @Test
    public void compareTo() {
        AddressEntry a = new AddressEntry("Sahej","Hundal","1 A St","Fremont","CA",94538,"123-456-7890","a@a.com");
        AddressEntry b = new AddressEntry("Michael","B","3 C St","Random Town","CA",90000,"123-456-7890","a@a.com");
        AddressEntry c = new AddressEntry("Mark","Zuckerberg","1 FB Ct","Facebook","CA",10000,"123-456-7890","");
        /**
         * Test algorithm for sorting using last name
         */
        assertEquals(a.compareTo(b),6); /** H is 6 letters ahead of B */
        assertEquals(a.compareTo(c),-18); /** H is 18 letters behind Z */
    }

    @Test
    public void to_String() {
        AddressEntry a = new AddressEntry("Sahej","Hundal","1 A St","Fremont","CA",94538,"123-456-7890","a@a.com");
        AddressEntry b = new AddressEntry("Michael","B","3 C St","Random Town","CA",90000,"123-456-7890","a@a.com");
        String x = "Sahej Hundal\n1 A St\nFremont CA 94538\n123-456-7890\na@a.com";
        String y = "Michael B\n3 C St\nRandom Town CA 90000\n123-456-7890\na@a.com";
        /**
         * Check if to_String generates the correct output string
         */
        assertEquals(a.to_String(),x);
        assertEquals(b.to_String(),y);
    }

    /**
     * Verify each set/get function
     */
    @Test
    public void getFirstName() {
        AddressEntry a = new AddressEntry("Sahej","Hundal","1 A St","Fremont","CA",94538,"123-456-7890","a@a.com");
        assertEquals(a.getFirstName(),"Sahej");
    }

    @Test
    public void setFirstName() {
        AddressEntry a = new AddressEntry("Sahej","Hundal","1 A St","Fremont","CA",94538,"123-456-7890","a@a.com");
        a.setFirstName("Test");
        assertEquals(a.getFirstName(),"Test");
    }

    @Test
    public void getLastName() {
        AddressEntry a = new AddressEntry("Sahej","Hundal","1 A St","Fremont","CA",94538,"123-456-7890","a@a.com");
        assertEquals(a.getLastName(),"Hundal");
    }

    @Test
    public void setLastName() {
        AddressEntry a = new AddressEntry("Sahej","Hundal","1 A St","Fremont","CA",94538,"123-456-7890","a@a.com");
        a.setLastName("Test");
        assertEquals(a.getLastName(),"Test");
    }

    @Test
    public void getStreet() {
        AddressEntry a = new AddressEntry("Sahej","Hundal","1 A St","Fremont","CA",94538,"123-456-7890","a@a.com");
        assertEquals(a.getStreet(),"1 A St");
    }

    @Test
    public void setStreet() {
        AddressEntry a = new AddressEntry("Sahej","Hundal","1 A St","Fremont","CA",94538,"123-456-7890","a@a.com");
        a.setStreet("Test");
        assertEquals(a.getStreet(),"Test");
    }

    @Test
    public void getCity() {
        AddressEntry a = new AddressEntry("Sahej","Hundal","1 A St","Fremont","CA",94538,"123-456-7890","a@a.com");
        assertEquals(a.getCity(),"Fremont");
    }

    @Test
    public void setCity() {
        AddressEntry a = new AddressEntry("Sahej","Hundal","1 A St","Fremont","CA",94538,"123-456-7890","a@a.com");
        a.setCity("Test");
        assertEquals(a.getCity(),"Test");
    }

    @Test
    public void getZip() {
        AddressEntry a = new AddressEntry("Sahej","Hundal","1 A St","Fremont","CA",94538,"123-456-7890","a@a.com");
        assertEquals(a.getState(),"CA");
    }

    @Test
    public void setZip() {
        AddressEntry a = new AddressEntry("Sahej","Hundal","1 A St","Fremont","CA",94538,"123-456-7890","a@a.com");
        a.setZip(11111);
        assertEquals(a.getZip(),11111);
    }

    @Test
    public void getPhone() {
        AddressEntry a = new AddressEntry("Sahej","Hundal","1 A St","Fremont","CA",94538,"123-456-7890","a@a.com");
        assertEquals(a.getPhone(),"123-456-7890");
    }

    @Test
    public void setPhone() {
        AddressEntry a = new AddressEntry("Sahej","Hundal","1 A St","Fremont","CA",94538,"123-456-7890","a@a.com");
        a.setPhone("Test");
        assertEquals(a.getPhone(),"Test");
    }

    @Test
    public void getEmail() {
        AddressEntry a = new AddressEntry("Sahej","Hundal","1 A St","Fremont","CA",94538,"123-456-7890","a@a.com");
        assertEquals(a.getEmail(),"a@a.com");
    }

    @Test
    public void setEmail() {
        AddressEntry a = new AddressEntry("Sahej","Hundal","1 A St","Fremont","CA",94538,"123-456-7890","a@a.com");
        a.setEmail("Test");
        assertEquals(a.getEmail(),"Test");
    }
}