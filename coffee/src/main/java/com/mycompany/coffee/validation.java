
package com.mycompany.coffee;

import java.util.Scanner;

public class validation {
Scanner sc = new Scanner(System.in);

/*
validate input (integer)
input para;
s1 displayed string
s2 error msg
min minimum value of input integer
max maximum value of input integer
Ouptut: return integer

*/
public int getInput(String s1, String s2, int min,int max) {
    int input;
    boolean flag;
    
    do{
        System.out.print(s1);
        while(!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println(s2);
            System.out.print(s1);
            
        }
        input = sc.nextInt();
        flag = input < min || input > max;
        if (flag)
            System.out.println("*** Valid number range is from" + min + "to " + max);
    } while (flag);
    return input;
    
    } // end of getInput()

}

