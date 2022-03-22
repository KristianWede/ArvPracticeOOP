package com.company;

public class Main {

    public static void main(String[] args) {
	Customer customer = new Customer("Annie","92452315", 2003);
    VIPCustomer vip = new VIPCustomer("Alexander", "9158251", 2005);
        System.out.println(customer);
        System.out.println(vip);
    }
}
