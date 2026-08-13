// singleton class
class Singleton {

    // Single object
    private static Singleton instance;

    // Private constructor
    private Singleton() {
        System.out.println("Singleton object created.");
    }

    // Method to get the object
    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    void display() {
        System.out.println("This is the Singleton object.");
    }
}

public class Singleton1 {
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        obj1.display();

        if (obj1 == obj2) {
            System.out.println("Both references point to the same object.");
        } else {
            System.out.println("Different objects.");
        }
    }
}