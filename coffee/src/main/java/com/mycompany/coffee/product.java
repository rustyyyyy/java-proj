/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coffee;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rusty
 */
public class product {
    public change c = new change();

    ArrayList<product> account = new ArrayList<>();

    private double amount, quantity;
    private double total;
    private double price;
    private double changeamount;

    public static Scanner sc = new Scanner(System.in);

    public static String pname;

    public product(String name) {
        pname = name;

//        change c = new change();
//        c.denchange(amount);
        
        if(pname != "none"){
            productSale();
        }
        
        else{
            totalSale();
        }

    
    }

    public void productSale() {
        System.out.print("Enter the Quantity ordered: ");
        quantity = sc.nextInt();

        setPrice(price);

        salesPrice(quantity);

        System.out.println("Sale price: " + amount);
        
        System.out.printf("Enter amount paid in cents: ");
        int pricePaid = sc.nextInt();
        
        changeamount = pricePaid - (amount*100);
        
        change(changeamount);
        
        System.out.println(c.getChangeamount() / 100);
        
    }
    
    
    public void change(double changeamount){
        
        c.denchange(changeamount);
    }
    
    public void totalSale(){}
    

    public void setPrice(double cents) {

        if (pname == "coffee") {
            price = 3.75;
        } else if (pname == "anydrink") {
            price = 4.50;
        } else if (pname == "Roll") {
            price = 9.95;
        } else if (pname == "Toasted") {
            price = 5.95;
        } else if (pname == "Muffin") {
            price = 4.99;
        }
    }

    public void addToTotal(double amount) {
//        this.account.add(amount);
    }

    public String getName() {
        return pname;
    }

    public double getPrice() {
        return price;
    }

    public double getTotal() {
        return total;
    }

    public double salesPrice(double quantity) {
        amount = quantity * getPrice();
        return amount;
    }

    public void reset() {
        amount = 0;
        price = 0;
        quantity = 0;
    }

}
