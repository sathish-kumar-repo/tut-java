// Static Inner Class in Java

class OuterClass {
    static int x = 10;
    int y = 20;

    static class InnerClass {
        void display() {
            System.out.println("X : " + x);
        }
    }
}

public class App {
    public static void main(String[] args) {
        OuterClass.InnerClass i = new OuterClass.InnerClass();
        i.display();
    }
}