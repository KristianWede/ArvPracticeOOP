package com.company;

public class VIPCustomer extends Customer{

    private int discount = 10;

    public VIPCustomer(String name, String phone, int birthyr) {
        super(name, phone, birthyr);
    }


    public String toString(){
        return getName() + " " + getPhone() + " " + getBirthyr() + " " + discount + "%";
    }
}
