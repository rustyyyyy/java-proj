/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coffee;

import java.util.Scanner;

/**
 *
 * @author rusty
 */
public class coffeeVictorialshop {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\n\nWelcome !!\n");

        int cH;
        String pname = "";

        System.out.println("Enter Appropriate choice  \n");

        do {

            System.out.println("------------------------------------------");
            System.out.println("------------------------------------------");

            System.out.println("1: Coffee (cappuccino, Latte, Espresso)|>  $3.75");
            System.out.println("2: Drink 500ml-------------------------|>  $4.50");
            System.out.println("3: Roll (Fish, Lamb, Chicken, Beef)----|>  $9.95");
            System.out.println("4: Toasted (egg and Cheese)------------|>  $5.95");
            System.out.println("5: Muffin------------------------------|>  $4.99");
            System.out.println("6: Done ");

            System.out.println("------------------------------------------");

            System.out.printf("Enter the item you want to order:" + " ");

            cH = sc.nextInt();

            switch (cH) {
                 
                case 1:
                    pname = "coffee";
                    addProduct(pname);
                    break;

                case 2:
                    pname = "anydrink";
                    addProduct(pname);
                    break;

                case 3:
                    pname = "Roll";
                     addProduct(pname);
                    break;

                case 4:
                    pname = "Toasted";
                     addProduct(pname);
                    break;

                case 5:
                    pname = "Muffin";
                    addProduct(pname);
                    break;

                case 6:
//                  System.out.println(" Sucessfully Exited!! ");
                  pname = "none";
                  addProduct(pname);
                  break;

                default:
                    System.out.println("Enter appropriata option ");
                    
            }
            
            
            
        } while (cH != 6) ;

    }
    public static void addProduct(String pname){
        product p = new product(pname);
    }

}
