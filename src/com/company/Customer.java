package com.company;

public class Customer {

    private String name;
    private String phone;
    private int birthyr;

    public Customer(String name, String phone, int birthyr) {
        this.name = name;
        this.phone = phone;
        this.birthyr = birthyr;
    }

    public String toString(){
        return name + " " + phone + " " + birthyr;
    }

    public String getName(){
        return name;
    }

    public String getPhone(){
        return phone;
    }

    public int getBirthyr(){
        return birthyr;
    }


}
