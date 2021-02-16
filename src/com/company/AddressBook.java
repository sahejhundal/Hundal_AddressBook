package com.company;

public class AddressBook {
    AddressEntry[] addressEntryList = new AddressEntry[50];
    void list(){
        for(int i=0; i<addressEntryList.length; i++){
            System.out.println(addressEntryList[i].to_String());
        }
    }
    void add(AddressEntry x){

    }
}
