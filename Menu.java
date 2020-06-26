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

public class Menu {
        // The menu items will use ArrayList collections that will contain an menu item id, item name and a price.
        //The menu items can be selected by the item id and added or removed to the order with a quantity value.

    //Class Level Variables - Protect the data
    private int menuId;
    private String menuItem;
    private double menuPrice;

    //Constructor Method
    public Menu(int _menuId, String _menuItem, double _menuPrice){
        this.menuId = _menuId;
        this.menuItem = _menuItem;
        this.menuPrice = _menuPrice;
    }

    //Setters and Getters
    public int getmenuId() { return menuId; }
    public void setmenuId(int _menuId) {this.menuId = _menuId;}

    public String getmenuItem() { return menuItem; }
    public void setmenuItem(String _menuItem) {this.menuItem = _menuItem;}

    public double getmenuPrice() { return menuPrice;}
    public void setmenuPrice(double _menuPrice) {this.menuPrice = _menuPrice;}



    public static void listMenu(ArrayList<Menu> mList){

        for (Menu menu: mList){
            System.out.println(menu.getmenuItem());
        }
    }
}
