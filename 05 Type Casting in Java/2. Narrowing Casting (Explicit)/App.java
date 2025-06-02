// Narrowing Casting (Explicit)

/*Also called manual type casting, it is used to convert a larger data type into a smaller one. */

public class App {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble; // manual cast: double to int
        System.out.println(myInt); // Output: 9

        // Example: Type Casting in Expressions
        int a = 5;
        int b = 2;
        double result = (double) a / b;
        System.out.println(result); // Output: 2.5

    }
}
