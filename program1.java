import java.util.Scanner;

class MyClass {

    static void phoneNumber() {
        int max1 = 77;
        int min1 = 10;
        int range1 = max1 - min1 + 1;

        int num = (int) (Math.random() * range1) + min1;

        int num3 = (int) (Math.random() * 7);

        String tmp = num + "" + num3;
        int random1 = Integer.parseInt(tmp);

        int max = 742;
        int min = 100;
        int range = max - min + 1;

        int randomNum2 = (int) (Math.random() * range) + min;

        int randomNum3 = (int) (Math.random() * 10000);

        String pNumber = random1 + "-" + randomNum2 + "-" + randomNum3;
        System.out.println("- Phone number: " + pNumber);

    }

    static boolean isValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
     }

    public static void main(String[] args) {

        String fname, lname, email, jobtitle;
        int yy = 0, dd = 0, mm = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print(" First name: ");
        fname = keyboard.nextLine();

        System.out.print(" Last Name: ");
        lname = keyboard.nextLine();

        System.out.print(" Job Title: ");
        jobtitle = keyboard.nextLine();

        System.out.print(" Email Address: ");
        email = keyboard.nextLine();

        if(isValid(email) != true){
           
            while(isValid(email) != true){
                System.out.print(" Enter valid Email Address: ");
                email = keyboard.nextLine();
            }
        }

        System.out.println(" Date of Birth: ");

        
        if (yy == 0) {
            System.out.print(" - year: ");
            yy = keyboard.nextInt();

            while (yy <= 1000) {
                System.out.print(" - Enter year correctly : ");
                yy = keyboard.nextInt();

            }
        }

        if (mm == 0) {
            System.out.print(" - Month: ");
            mm = keyboard.nextInt();

            while (mm > 12) {
                System.out.print(" - Enter month correctly : ");
                mm = keyboard.nextInt();

            }

        }

        if (dd == 0) {
            System.out.print(" - Day: ");
            dd = keyboard.nextInt();

            while (dd > 32) {
                System.out.print(" - Enter day correctly : ");
                dd = keyboard.nextInt();

            }
        }




        System.out.println("\n---------------[User details] ------------");

        System.out.println("- First name: " + fname);
        System.out.println("- Last Name: " + lname);
        System.out.println("- Date of Birth: " + dd + "/" + mm + "/" + yy);
        System.out.println("- Email Address: " + email);

        phoneNumber();

        System.out.println("---------------------------------------------");
    }
}