//Number is prime or not in Java

import java.util.Scanner;

public class App {
    // Write a program to check the given number is prime or not.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter The Number : ");
        int n = in.nextInt();

        int f = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                f++;
            }
        }

        if (f == 2) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }
    }
}
