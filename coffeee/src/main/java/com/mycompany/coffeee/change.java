/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coffeee;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author rusty
 */
public class change {
    private String change ="";

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public void customerchange(double amount) {

        int notes[][] = new int[5][2];
        int coins[][] = new int[6][2];
        int x;
        amount = amount;

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
        String changes = formatter.format((double) amount / 100);
        
        setChange(changes);
        


    }
}
