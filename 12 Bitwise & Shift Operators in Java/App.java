//Bitwise & Shift Operators in Java

public class App {
    public static void main(String[] args) {
        // Bitwise Operators
        int a = 5; // binary: 0101
        int b = 3; // binary: 0011

        System.out.println("Bitwise AND (5 & 3): " + (a & b)); // 1 (0001)
        System.out.println("Bitwise OR (5 | 3): " + (a | b)); // 7 (0111)
        System.out.println("Bitwise XOR (5 ^ 3): " + (a ^ b)); // 6 (0110)
        System.out.println("Bitwise NOT (~5): " + (~a)); // -6 (two's complement)

        // Shift Operators
        int c = 5; // 0000 0101

        System.out.println("Left shift (5 << 1): " + (c << 1)); // 10 (0000 1010)
        System.out.println("Signed right shift (5 >> 1): " + (c >> 1)); // 2 (0000 0010)

        int d = -10; // negative number example
        System.out.println("Signed right shift (-10 >> 1): " + (d >> 1)); // -5 (fills with sign bit)
        System.out.println("Unsigned right shift (-10 >>> 1): " + (d >>> 1)); // Large positive number (fills with 0)
    }
}
