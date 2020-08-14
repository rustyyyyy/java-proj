 
package com.mycompany.coffee;


public class products {
    
    private String name;
    private int price;
    private int Total;

    public products(String name) {
        this.name = name;
        Total = 0;
        
        
    }

    
    

    public String getName() {
        return name;
    }
    
    

    public int getPrice() {
        return price;
    }
    
    

    public int getTotal() {
        return Total;
    }

    public void setPrice(int cents) {
        this.price = cents;
    }
    
    
    public void addTOTotal(int amount) {
        Total = Total + amount;

    
    }
    // return product name
    
    //calculate the sale's price
    public int salePrice(int quantity) {
        return quantity * price;
        
    }
    
    public void reset(){
       name = "";
     price = 0;
     Total = 0;
    }// end of class product
    
    }

    
    
    
    

