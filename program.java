import java.util.Scanner;

class MyClass
{
    public static void main(String[] args)
     {
        
        double quantity, price;
        double subtotal,salestax, total ;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the quantity:");
        quantity = keyboard.nextDouble();

        System.out.print("Enter the unit price:");
        price = keyboard.nextDouble();

        // -- total  quantity and price
        //1.69

        // for (int i = 1; i <= quantity; i++) {
        //     subtotal += price;
        //     System.out.printf("Subtotal of "+ i +" :  $%.2f \n", subtotal);

        // }

        subtotal = quantity * price;

        salestax = (subtotal * 6) / 100;
        
            

        total = subtotal + salestax ;

        
        System.out.println();
        
        System.out.println("---------------[Print Receipt] ------------");
        
        System.out.println("- Enter the quantity: "+quantity+".");
        System.out.println("- Enter the unit price: $"+price+".");
        System.out.printf("- Subtotals: $%.2f.\n", subtotal);
        System.out.printf("- Tax: $%.2f. \n", salestax);
        System.out.printf("- Total: $%.2f. \n", total);
        System.out.println("---------------------------------------------");
    
    }
}