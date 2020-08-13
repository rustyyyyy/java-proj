/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coffee;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author rusty
 */
public class change {
    private double changeamount;

    public void denchange(double amount) {

        int notes[][] = new int[5][2];
        int coins[][] = new int[6][2];
        int x;
         

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);

        notes[0][1] = 10000;                      //banknotes in cents in desc order: $100
        notes[1][1] = 5000;                       //$50
        notes[2][1] = 2000;                       //$20
        notes[3][1] = 1000;                       //$10
        notes[4][1] = 500;                        //$5

        coins[0][1] = 200;                        //coins in desc order: $2
        coins[1][1] = 100;                        //$1
        coins[2][1] = 50;                         //50c
        coins[3][1] = 20;                         //20c
        coins[4][1] = 10;                         //10c
        coins[5][1] = 5;                          //5c

//        System.out.print("Enter Abount (in cent)to change:");
//        amount = input.nextInt();
        // Calculate currency denominatios from amount in cents
        x = (int)amount;
        //cents
        for (int i = 0; i < 5; i++) {
            notes[i][0] = x / notes[i][1];           //integer division, number of notes of specific denomination
            x %= notes[i][1];                      //reminder

        }
        for (int i = 0; i < 6; i++) {
            coins[i][0] = x / coins[i][1];           //integer division, number of coins of specific denomination
            x %= coins[i][1];                      //reminder

        }
        amount = amount;
        
        String changes = formatter.format((double) amount / 100);
        System.out.println("The change returned of " + changes + " is:");
        System.out.println("............................................");             //horizontal line
        for (int i = 0; i < 5; i++) {
            if (notes[i][0] > 0) {
                System.out.printf("| Number of %3d dollar notes: %2d |%n", notes[i][1] / 100, notes[i][0]);
            }
        }

        for (int i = 0; i < 6; i++) {
            if (coins[i][0] > 0) {
                if (coins[i][1] < 100) {
                    System.out.printf("| Number of %3d cents  coins: %2d |%n", coins[i][1], coins[i][0]);
                } else {
                    System.out.printf("| Number of %3d dollar coins: %2d |%n", coins[i][1] / 100, coins[i][0]);
                }
            }
        }
        System.out.println(".............................................");             //horizontal line
        
        setChangeamount(amount);
    }

    public void setChangeamount(double changeamount) {
        this.changeamount = changeamount;
    }

    public double getChangeamount() {
        return changeamount;
    }
    
    
}
