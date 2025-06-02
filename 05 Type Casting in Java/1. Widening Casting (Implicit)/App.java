// Widening Casting (Implicit)

/*Also known as automatic type casting, this happens when you convert a smaller data type to a larger one. */

public class App {
    public static void main(String[] args) {
        int num = 100;
        long bigNum = num; // int to long
        float floatNum = bigNum; // long to float
        System.out.println(floatNum); // Output: 100.0

    }
}
