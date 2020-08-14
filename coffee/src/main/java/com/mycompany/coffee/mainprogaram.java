
package com.mycompany.coffee;

//import products;
//
//import com.mycompany.validation;




public class mainprogaram {
    




   
   public static void main(String[] args) {
      int opt;
      int quantity;
      int sale;
      int paid;
      int total = 0;
      int notes[][];
      int coins[][];
      String s1;
      String s2;
      
     
      validation in;
      products order[];
      change change;

      // Create and initialise objects
      order = new products[6];                       //each element corresponds to a product, ignore 0 element
      order[1] = new products("Coffee(Cappuccino, Latte, Espresso)|> ");
      order[1].setPrice(375);
      order[2] = new products("Any Drink 500ml....................|> ");
      order[2].setPrice(450);
      order[3] = new products("Roll(Fish, Lamb, Chicken, Beef)....|> ");
      order[3].setPrice(995);
      order[4] = new products("Toasted (Egg and Cheese)...........|> ");
      order[4].setPrice(595);
      order[5] = new products("Muffine(Double Choc.)..............|> ");
      order[5].setPrice(499);

      change = new change();                          //create Change object
      in = new validation();                       //validate input
     //hline = new String(new char[34]).replace("\0", Character.toString(196)); //34 char horizontal line string
     //triple = new String(new char[34]).replace("\0", Character.toString(240)); //34 char triple line string

      do {
         // Print Coffee N Roll menu, prices in dollars and cents
         System.out.printf("%n"+ "......................................................");             //triple horizontal line (break line)
         System.out.printf("%n"+ "......................................................" + "%n");       //horizontal line
         for (int i = 1; i < 6; i++)
            System.out.printf("%4d. %-15s%10s%n", i, order[i].getName(), change.currency(order[i].getPrice()));
         System.out.printf("%4d. Done%n" + "......................................................" + "%n%n", 6); //Done and horizontal line

         do {
            // Get the order number
            s1 = "Enter the item number you want to order: ";
            s2 = "*** Only options 1 to 6 allowed";
            opt = in.getInput(s1, s2, 1, 6);          //description string, error msg, min and max integers
            if (opt == 6)
               break;                                 //exit while loop

            // Get ordered quantity, getInput() handles input errors
            s1 = "Enter quantity ordered: ";
            s2 = "*** Quantity is a positive integer";
            sale = order[opt].salePrice(in.getInput(s1, s2, 1, 200));  //limit quantity to 200
            order[opt].addTOTotal(sale);              // track total sales for this product
            System.out.println("Sale price: " + change.currency(sale));

            // Amount of tendered money
            do {
               s1 = "Enter the amount paid in cents [0-1000000]: ";
               s2 = "*** Amount paid is a positive integer";
               paid = in.getInput(s1, s2, 1, 1000000); //max spend $10,000
               if (paid % 5 != 0)                     // 5 cents piece is AU smallest legal coin
                  System.out.println("*** Money paid must be in multiples of 5 cents");
               if (paid < sale)
                  System.out.println("*** Not enough money paid for the purchase");
            } while (paid % 5 != 0 || paid < sale);
            paid = paid - sale;                       //change in cents
            if (paid > 0)
               System.out.println("The change is: " + change.currency(paid));
            else
               System.out.println("Exact money tendered, no change required");
            System.out.println("");

            // Print to screen formatted change currency denominations
            change.denChange(paid);                   // calculate currency denominations
            notes = change.getNotes();
            coins = change.getCoins();
            System.out.println("The change returned to the customer is:");
            System.out.printf("............................................" + "%n");             //horizontal line
            for (int i = 0; i < 5; i++)
               if (notes[i][0] > 0)
                  System.out.printf("| Number of %3d dollar notes: %2d |%n", notes[i][1]/100, notes[i][0]);

            for (int i = 0; i < 6; i++)
               if (coins[i][0] > 0)
                  if (coins[i][1] < 100)
                     System.out.printf("| Number of %3d cents  coins: %2d |%n", coins[i][1], coins[i][0]);
                  else
                     System.out.printf( "| Number of %3d dollar coins: %2d |%n", coins[i][1]/100, coins[i][0]);
            System.out.printf("............................................." + "%n");             //horizontal line
         } while (opt < 1 || opt > 6);
      } while (opt != 6);

      for (int i = 1; i < 6; i++)
         total += order[i].getTotal();
      System.out.printf("Total %14s Sales: %9s%n", "Daily", change.currency(total));

      for (int i = 1; i < 6; i++)
         System.out.printf("Total %14s Sales: %9s%n", order[i].getName(), change.currency(order[i].getTotal()));
   } // end of main
} // end of class CoffeeNRoll

