/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coffeee;

/**
 *
 * @author rusty
 */
public class product {
     public String name;
    public double price;
    
     public double  subtotal;

    public product() {
       
        name = "";
        price = 0;
        subtotal=0;

    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

  
    public void setPrice(int cents) {
        this.price = cents;
    }

    

    //calculate the sale's price
    public void salePrice(double quantity) {
        subtotal =  (quantity * price) / 100;
        setSubtotal(subtotal);

    }

    public void reset() {
        name = "";
        price = 0;
       
    }// end of class product

    
}
