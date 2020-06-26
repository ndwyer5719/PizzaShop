package com.company;
/*
Project: Lab 9
Purpose Details: Pizza ordering application
Course: IST 242
Author: Natalie Dwyer
Date Developed: 6/14/20
Last Date Changed:
Rev: 2
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    //Class Level Variables - Protect the data
    private int customerId;
    private String customerName;
    private String customerPhoneNumber;
    private int custOrder;

    //Constructor Method
    public Customer(int _customerId, int _custOrder) {
        this. customerId = _customerId;  //Increments the ID count
        this.custOrder = _custOrder;
    }


    //Setters and Getters
    public int getCustomerId() { return customerId; }
    public void setCustomerId(int _customerId) {this.customerId = _customerId;}

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String _customerName) {this.customerName = _customerName;}

    public String getCustomerPhoneNumber() { return customerPhoneNumber; }
    public void setCustomerPhoneNumber(String _customerPhoneNumber) {this.customerPhoneNumber = _customerPhoneNumber;}

    public int getcustOrder() {return custOrder;}
    public void setcustOrder(int _custOrder) { this.custOrder = _custOrder;}

    public static void printCustomer(ArrayList<Customer> cList){
        for (Customer cust: cList){
            System.out.println("Customer Id:" + cust.getCustomerId());
            System.out.println("Customer Name:" + cust.getCustomerName());
            System.out.println("Customer Phone:" + cust.getCustomerPhoneNumber());
            System.out.println("Customer Order: " + cust.getcustOrder());
        }
    }

}
