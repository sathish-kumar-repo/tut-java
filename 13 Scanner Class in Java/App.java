//Scanner Class in Java

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // a2+b2+2ab
        Scanner in = new Scanner(System.in);

        int a, b, c;

        System.out.println("Enter 2 Nos : ");
        a = in.nextInt();
        b = in.nextInt();
        c = (a * a) + (b * b) + (2 * a * b);

        System.out.println("Result : " + c);

        // ! --------------------------------
        float a1, b1, c1;

        System.out.println("Enter 2 Nos : ");
        a1 = in.nextFloat();
        b1 = in.nextFloat();
        c1 = (a1 * a1) + (b1 * b1) + (2 * a1 * b1);

        System.out.println("Result : " + c1);
    }
}

/*
 * in.nextInt();
 * in.nextFloat();
 * in.nextDouble();
 * in.next(); => word
 * in.nextLine(); => Line
 */

// javap java.util.Scanner => Check more info from Java Package