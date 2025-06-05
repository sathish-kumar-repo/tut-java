//Method With varargs in Java

public class App {
    // Method with varargs (int...)
    static void printNumbers(int... numbers) {
        System.out.println("Number of arguments: " + numbers.length);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        printNumbers(); // no arguments
        printNumbers(10); // one argument
        printNumbers(1, 2, 3, 4, 5); // multiple arguments }
    }
}