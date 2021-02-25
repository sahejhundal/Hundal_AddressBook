package com.company;

/**
 * Object of a single contact with all of the variables
 */
public class AddressEntry implements Comparable<AddressEntry>{
    /**
     * Our variables for a single AddressEntry
     */
    String firstName;
    String lastName;
    String street;
    String city;
    String state;
    int zip;
    String phone;
    String email;

    /**
     * Default constructor
     */
    AddressEntry(){
        firstName="NONE";
        lastName="NONE";
        street="NONE";
        city="NONE";
        state="NONE";
        zip=0;
        phone="NONE";
        email="NONE";
    }

    /**
     * Parameterized constructor that allows fast creation of an instance of this class
     */

    AddressEntry(String firstNam, String lastNam, String stree,
                 String cit, String stat, int zi, String phon,
                 String emai){
        firstName=firstNam;
        lastName=lastNam;
        street=stree;
        city=cit;
        state=stat;
        zip=zi;
        phone=phon;
        email=emai;
    }

    /**
     * Our sorting algorithm that allows to sort using AddressEntry.lastName
     * @param other is a object taken for reference to compare lastnames.
     * @return integer difference between the letters of lastnames.
     */
    public int compareTo(AddressEntry other){
        return this.getLastName().compareTo(other.getLastName());
    }

    /**
     * Converts a contact info into string format
     */
    String to_String(){
        String outp;
        outp = firstName + " " + lastName + "\n" + street + "\n" +
                city + " " + state + " " + zip + "\n" + phone + "\n" + email;
        return outp;
    }

    /**
     * Our set/get functions for each variable in the class object
     */
    String getFirstName(){ return firstName; }
    void setFirstName(String x){ firstName = x; }
    String getLastName(){ return lastName; }
    void setLastName(String x){ lastName = x; }
    String getStreet(){ return street; }
    void setStreet(String x){ street = x; }
    String getCity(){ return city; }
    void setCity(String x){ city = x; }
    String getState(){ return state; }
    void setState(String x){ state = x; }
    int getZip(){ return zip; }
    void setZip(int x){ zip = x; }
    String getPhone(){ return phone; }
    void setPhone(String x){ phone = x; }
    String getEmail(){ return email; }
    void setEmail(String x){ email = x; }
}
