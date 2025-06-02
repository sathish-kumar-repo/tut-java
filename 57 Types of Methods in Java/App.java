class Methods {
    // No Return W/o args
    public void add() {
        int a = 123;
        int b = 10;
        System.out.println("Addition : " + (a + b));
    }

    // No Return With Args
    public void sub(int x, int y) {
        System.out.println("Subtraction : " + (x - y));
    }

    // Return Without Args
    public int mul() {
        int a = 123;
        int b = 10;
        return a * b;
    }

    // Return With Args
    public float div(int x, int y) {
        return (x / y);
    }

    // Recursion Function
    public int factorial(int n)// 5! =1*2*3*4*5=120
    {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }
    /*
     * factorial(5)
     * factorial(4)
     * factorial(3)
     * factorial(2)
     * factorial(1)
     * 
     * return 1;
     * return 2*1;
     * return 3*2;
     * return 4*6;
     * return 5*24;
     * 
     * 
     */

}

// Type of User Define Methods in Java
public class App {
    public static void main(String args[]) {
        Methods o = new Methods();
        o.add();
        o.sub(123, 10);
        System.out.println("Muli : " + o.mul());
        System.out.println("Division : " + o.div(123, 10));
    }
}