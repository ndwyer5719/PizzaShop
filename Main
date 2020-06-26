package com.company;

/*
Project: Lab 9
Purpose Details: Pizza ordering application
Course: IST 242
Author: Natalie Dwyer
Date Developed: 6/14/20
Last Date Changed:
Rev: 1
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    int cCount = 1;
    public static void main(String[] args) {

        Main main = new Main();

        final char EXIT_CODE = 'E';
        final char CUST_CODE = 'C';
        final char MENU_CODE = 'M';
        final char ORDE_CODE = 'O';
        final char TRAN_CODE = 'T';
        final char CUST_PRNT = 'P';
        final char HELP_CODE = '?';
        char userAction;
        final String PROMPT_ACTION = "Add 'C'ustomer, 'P'rint Customer, List 'M'enu, Add 'O'rder, List 'T'ransaction or 'E'xit: ";
        ArrayList<Customer> cList = new ArrayList<>();
        ArrayList<Menu> mList = new ArrayList<>();
        ArrayList<Order> oList = new ArrayList<>();
        ArrayList<Transaction> tList = new ArrayList<>();

        Order order1 = new Order(1);
        Transaction trans1 = new Transaction(1, order1, PaymentType.cash);
        Transaction trans2 = new Transaction(2, order1, PaymentType.credit);

        Menu menu1 = new Menu(1, "Plain", 8.00);
        Menu menu2 = new Menu(2, "Meat", 10.00);
        Menu menu3 = new Menu(3, "Extra", 11.00);
        Menu menu4 = new Menu(4, "Veg", 9.00);

        mList.add(menu1);
        mList.add(menu2);
        mList.add(menu3);
        mList.add(menu4);

        oList.add(order1);
        tList.add(trans1);
        tList.add(trans2);

        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            switch(userAction) {
                case CUST_CODE : cList.add(main.addCustomer());
                    break;
                case CUST_PRNT : Customer.printCustomer(cList);
                    break;
                case MENU_CODE : Menu.listMenu(mList);
                    break;
                case ORDE_CODE : oList.add(main.addOrders(mList, cList));
                    break;
                case TRAN_CODE : Transaction.listTransactions(tList);
                    break;
            }

            userAction = getAction(PROMPT_ACTION);
        }
    }

    public static char getAction(String prompt) {
        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }

    public Customer addCustomer(){
        Customer cust = new Customer(cCount++, cCount++);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please Enter your Name: ");
        cust.setCustomerName(scnr.nextLine());
        System.out.println("Please Enter your Phone: ");
        cust.setCustomerPhoneNumber(scnr.nextLine());
        return cust;
    }
    boolean isOnMenu ;
    public Order addOrders(ArrayList<Menu> mlist, ArrayList<Customer> clist) {
        Order order = new Order(cCount++);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your customer ID:  ");

        do {
            System.out.println("Enter menu ID: ");
            int answer = sc.nextInt();
            for (Menu menuItem : mlist) {
                if (answer == menuItem.getmenuId()) {
                    order.setmenuItem(menuItem);
                    menuItems.add(menuItem);
                    isOnMenu = true;
                    break;
                }
            }
            if (!isOnMenu) {
                System.out.println("Item is not on the menu.");
            }
        }while (isOnMenu==false);


        //do while
        //for each customer in the mList
        // if there is a match call setter and break
        return order;

    }
}
