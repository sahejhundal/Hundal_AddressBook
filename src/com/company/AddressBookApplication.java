/**
 *
 * @author Sahej Hundal
 * @version 1.0
 * @since  February 2021
 *
 * purpose: Address Book Application that lets you add, delete, search and import contacts.
 */

package com.company;

import java.util.Scanner;

/**
 * The main function that creates an instance of addressbook
 */
public class AddressBookApplication {
    public static void main(String[] args) {
        AddressBook addressbook = new AddressBook(); /** AddressBook instance so we can call functions from the functions below */
        addressbook.load("database.txt"); /** database.txt is our default file to save/load from. The user can select a different file to import/save to. */
        Menu menu = new Menu();
        while(true) {
            System.out.println("Select from the option below");
            System.out.println("0) Load From File");
            System.out.println("1) Add");
            System.out.println("2) Delete");
            System.out.println("3) Find");
            System.out.println("4) List");
            System.out.println("5) Quit");
            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            if (x == 0) {
                menu.load(addressbook);
            }
            if (x == 1) {
                menu.add(addressbook);
            }
            if (x == 2) {
                menu.delete(addressbook);
            }
            if (x == 3) {
                menu.find(addressbook);
            }
            if (x == 4) {
                addressbook.list();
            }
            if (x == 5) {
                return;
            }
        }
    }
}