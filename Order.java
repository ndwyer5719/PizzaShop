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
//The order will prompt for the customer for their id and allow them to select many menu id items.

public class Order {
    //Class Level Variables - Protect the data
    private int orderId;
    private Customer cust;
    private ArrayList<Menu> menuItem;


    //Constructor Method
    public Order(int _orderId){
        this.orderId = _orderId;
    }

    //Setters and Getters
    public int getorderId() { return orderId; }
    public void setorderId(int _orderId) {this.orderId = _orderId;}

    public void setCustomer(Customer _cust) {cust= _cust;}
    public Customer getCustomer() {return cust;}

    public ArrayList<Menu> getmenuItem() {return menuItem;}
    public void setmenuItem(Menu menu) {menuItem.add(menu);}

}
