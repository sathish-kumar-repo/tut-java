// Singleton Class in Java
class Singleton {

    // Step 1: Create a private static instance
    private static Singleton instance;

    // Step 2: Private constructor prevents instantiation from other classes
    private Singleton() {
        System.out.println("Singleton object created");
    }

    // Step 3: Public static method to get the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // create only if not created already
        }
        return instance;
    }
}

public class App {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2); // Output: true (both refer same object)
    }
}