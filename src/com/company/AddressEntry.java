package com.company;

public class AddressEntry {
    String firstName;
    String lastName;
    String street;
    String city;
    String state;
    int zip;
    String phone;
    String email;

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

    String to_String(){
        String outp;
        outp = firstName + " " + lastName + " " + street + ", " +
                city + " " + state + " " + zip + " " + phone + " " + email;
        return outp;
    }

    String getFirstName(){ return firstName; }
    void setFirstName(String x){ firstName = x; }
    String getLastName(){ return lastName; }
    void setLastName(String x){ lastName = x; }
    String getStreet(){ return street; }
    void setStreet(String x){ street = x; }
    String getCity(){ return city; }
    void setCity(String x){ city = x; }
    int getZip(){ return zip; }
    void setZip(int x){ zip = x; }
    String getPhone(){ return phone; }
    void setPhone(String x){ phone = x; }
    String getEmail(){ return email; }
    void setEmail(String x){ email = x; }
}
