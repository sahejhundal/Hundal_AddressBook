/**
 * @author Sahej Hundal
 * AddressBook class which handles all the functions for the application
 * and has the vector that holds all the contacts.
 */

package com.company;

import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import java.util.Collections;

/**
 * Our class that holds the vector of all contacts and the backend functions to add, remove, find, and load
 */
public class AddressBook {
    String filename="database.txt";
    Vector<AddressEntry> addressEntryList = new Vector<>(); /** The vector to hold our contacts */
    void load(String x){
        /**
         * This method allows user to import contacts from an external file.
         * The format text to import contacts is:
         * FIRST_NAME|LAST_NAME|STREET|CITY|STATE|ZIP|PHONE|EMAIL
         * where each variable is separated by a '|'
         */
        filename=x;
        File file = new File("src/com/company/"+filename);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            int counter=0;
            while ((st = br.readLine()) != null){
                String[] ast = st.split("\\|");
                AddressEntry temp = new AddressEntry(ast[0],ast[1],ast[2],ast[3],ast[4],Integer.parseInt(ast[5]),ast[6],ast[7]);
                addressEntryList.add(temp);
                counter=counter+1;
            }
            System.out.println("Loaded " + counter + " entries from file.");
            /**
             * This is to handle exception where a user might have entered a wrong filename.
             */
        } catch(IOException e){
            System.out.println("File not found! Error: " + e);
        }
    }
    void list(){
        /**
         * list() method sorts the whole contacts vector according to last names
         * and prints all of the contacts
         */
        Collections.sort(addressEntryList);
        for(int i=0; i<addressEntryList.size(); i++){
            System.out.println((i+1) + ") " + addressEntryList.get(i).to_String() + "\n");
        }
    }
    void add(AddressEntry x){
        /**
         * Simply adding a AddressEntry entity to our vector
         */
        addressEntryList.add(x);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/com/company/"+filename, true));
            String st = x.getFirstName() + "|" + x.getLastName() + "|" + x.getStreet() + "|" +
                    x.getCity() + "|" + x.getState() + "|" + x.getZip() + "|" +
                    x.getPhone() + "|" + x.getEmail() + "\n";
            writer.append(st);
            writer.close();
        } catch(IOException e){
            System.out.println("Default database file not found! Error: " + e);
        }
    }
    void delete(AddressEntry y){
        /**
         * Deletes entity that is sent by our user from Menu.delete()
         */
        for(int i=0; i<addressEntryList.size(); i++){
            if(addressEntryList.get(i) == y){
                addressEntryList.remove(i);
            }
        }
    }
    Vector<AddressEntry> find(String x){
        /**
         * Finds contacts that have some letters or all of lastname from passed in String x
         */
        Vector<AddressEntry> tempList = new Vector<>();
        for(int i=0; i<addressEntryList.size(); i++) {
            if (addressEntryList.get(i).lastName.contains(x)) {
                tempList.add(addressEntryList.get(i));
            }
        }
        return tempList;
    }
}
