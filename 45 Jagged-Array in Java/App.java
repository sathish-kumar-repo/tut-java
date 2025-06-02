//Jagged-Array in Java

public class App {
    public static void main(String args[]) {
        // Jagged Array using For Loop in Java Programming
        int a[][] = {
                { 10, 20, 30, 40 }, // 4
                { 10, 20, 30 }, // 3
                { 10, 20, 30, 50 }// 4
        };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println("");
        }
    }
}
