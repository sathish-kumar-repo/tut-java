//Factor of the given number in Java

import java.util.Scanner;

public class App {
    // Write a program to find the factor of the given number.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter The Number : ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
