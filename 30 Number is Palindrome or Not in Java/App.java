//Number is Palindrome or Not in Java

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number : ");

        int n = in.nextInt();

        int temp = n;
        int reverse = 0, rem;
        while (n != 0) {
            rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10;
        }

        if (temp == reverse) {
            System.out.println(reverse + " Number is Palindrome");
        } else {
            System.out.println(reverse + " Number is Not a Palindrome");
        }
    }
}
