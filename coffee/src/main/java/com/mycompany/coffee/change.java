/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coffee;

import java.text.NumberFormat;


public class change {
    

        int notes[][] = new int[5][2];
        int coins[][] = new int[6][2];
        
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
       public  change(){
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
        
       } // end constructor
       public void denChange(int amount){
           
      int x= amount;
        for (int i = 0; i < 5; i++) {
            notes[i][0] = x / notes[i][1];           //integer division, number of notes of specific denomination
            x %= notes[i][1];                      //reminder

        } // end for 1
        for (int i = 0; i < 6; i++) {
            coins[i][0] = x / coins[i][1];           //integer division, number of coins of specific denomination
            x %= coins[i][1];                      //reminder

        } // end for 2
       } // end denchange

    public int[][] getNotes() {
        return notes;
    }

    public int[][] getCoins() {
        return coins;
    }
       
public String currency(int cents)
{

return  formatter.format((double) cents/100);
}
}
        