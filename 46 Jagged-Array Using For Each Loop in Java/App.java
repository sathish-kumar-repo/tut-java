//Jagged-Array Using For Each Loop in Java

public class App {
    public static void main(String args[]) {

        // Jagged Array using En hanced For Loop in Java Programming
        int a[][] = {
                { 10, 20, 30, 40 },
                { 10, 20, 30 },
                { 10, 20, 30, 50 }
        };

        for (int k[] : a) {
            for (int l : k) {
                System.out.print(" " + l);
            }
            System.out.println("");
        }
    }
}
