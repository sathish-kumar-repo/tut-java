//Nested If in Java

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
         * Nested if Statement
         * A company insures its drivers in the following cases:
         * a. If the driver is married.
         * b. If the driver is unmarried, male & above 30 years of age.
         * c. If the driver is unmarried, female & above 25 years of age.
         */
        Scanner in = new Scanner(System.in);

        System.out.println("Enter The Marital Status M/U: ");
        char marital = in.next().charAt(0);

        if (marital == 'u' || marital == 'U') {
            System.out.println("Enter The Gender M/F: ");
            char gender = in.next().charAt(0);

            System.out.println("Enter The Age : ");
            int age = in.nextInt();

            if ((gender == 'M' || gender == 'm') && age >= 30) {
                System.out.println("You are Eligible for Insurance");
            } else if ((gender == 'F' || gender == 'f') && age >= 25) {
                System.out.println("You are Eligible for Insurance");
            } else {
                System.out.println("You are Not Eligible for Insurance");
            }

        } else if (marital == 'm' || marital == 'M') {
            System.out.println("You are Eligible for Insurance");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
