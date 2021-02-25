

package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/**
 * The menu class holds all the menu options for the user interface
 */
public class Menu {
    /**
     * Prompt functions to let users input info for each variable
     */
    public static String prompt_FirstName() {
        System.out.println("First Name:");
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        return x;
    }
    public static String prompt_LastName() {
        System.out.println("Last Name:");
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        return x;
    }
    public static String prompt_Street() {
        System.out.println("Street:");
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        return x;
    }
    public static String prompt_City() {
        System.out.println("City:");
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        return x;
    }
    public static String prompt_State() {
        System.out.println("State:");
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        return x;
    }
    public static int prompt_Zip() {
        System.out.println("Zip:");
        Scanner input = new Scanner(System.in);
        try{
            int x = input.nextInt();
            return x;
        } catch(InputMismatchException e){
            System.out.println("Wrong input! ZIP set to 0");
            return 0;
        }
    }
    public static String prompt_Phone() {
        System.out.println("Telephone:");
        Scanner input = new Scanner(System.in);
        String x = input.next();
        return x;
    }
    public static String prompt_Email() {
        System.out.println("Email:");
        Scanner input = new Scanner(System.in);
        String x = input.next();
        return x;
    }

    /**
     * Takes input for file name and passes it to the addressbook.load() function
     * @param ad addressbook instance
     */
    public void load(AddressBook ad){
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        System.out.println("Enter File Name:");
        Scanner input = new Scanner(System.in);
        String x = input.next();
        ad.load(x);
    }

    /**
     * Takes input for all of the variables and passes it to addressbook.add() function
     * @param ad addressbook instance
     */
    public void add(AddressBook ad) {
        String first, last, street, city, state, phone, email;
        int zip;
        first=Menu.prompt_FirstName();
        last=Menu.prompt_LastName();
        street=Menu.prompt_Street();
        city=Menu.prompt_City();
        state=Menu.prompt_State();
        zip=Menu.prompt_Zip();
        phone=Menu.prompt_Phone();
        email=Menu.prompt_Email();
        AddressEntry temp = new AddressEntry(first, last, street, city, state, zip, phone, email);
        ad.add(temp);
    }

    /**
     * Takes input for the user to enter last name of the contact wished
     * to delete and passes it to addressbook.delete() function
     * @param ad addressbook instance
     */
    public void delete(AddressBook ad){
        System.out.println("Enter in all or the begining of the Last Name of the contact you wish to find:");
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        Vector<AddressEntry> tempList = ad.find(x);
        if(tempList.size()==0){
            System.out.println("No results were found for the last name " + x);
            return;
        }
        System.out.println("The following " + tempList.size() + " results were found. Select number of entry you wish to remove");
        for(int i=0; i<tempList.size(); i++){
            System.out.println((i+1) + ") " + tempList.get(i).to_String() + "\n");
        }
        int y = input.nextInt();
        ad.delete(tempList.get(y-1));
        System.out.println("The contact was removed!");
    }
    /**
     * Takes input for the user to enter last name of the contact to be searched
     * @param ad addressbook instance
     */
    public void find(AddressBook ad){
        System.out.println("Enter in all or the begining of the Last Name of the contact you wish to find:");
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        Vector<AddressEntry> tempList = ad.find(x);
        System.out.println("Search results for the last name " + x + ":");
        for(int i=0; i<tempList.size(); i++){
            System.out.println((i+1) + ") " + tempList.get(i).to_String());
        }
    }
}
