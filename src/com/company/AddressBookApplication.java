package com.company;

public class AddressBookApplication {

    AddressBook addressbook = new AddressBook();

    public static void main(String[] args) {
        Menu.prompt_FirstName();
        Menu.prompt_LastName();
        Menu.prompt_Street();
        Menu.prompt_City();
        Menu.prompt_State();
        Menu.prompt_Zip();
        Menu.prompt_Telephone();
        Menu.prompt_Email();
    }
}