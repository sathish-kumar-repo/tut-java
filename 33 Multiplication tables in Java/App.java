
//Multiplication tables in Java
import java.util.Scanner;

//Write a program to print the multiplication tables

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter The Table : ");
        int t = in.nextInt();

        System.out.print("Enter The Limit : ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(t + " x " + i + " = " + (t * i));
        }
    }
}
