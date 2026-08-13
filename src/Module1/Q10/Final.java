// final kyword 
class Parent {

    // Final variable
    final int NUMBER = 100;

    // Final method
    final void display() {
        System.out.println("This is a final method.");
    }
}

// We can inherit from Parent
class Child extends Parent {

    void show() {
        System.out.println("Child class method.");
    }

    // This would cause an error because display() is final:
    // void display() {
    // }
}

// Final class cannot be inherited
final class FinalClass {

    void message() {
        System.out.println("This is a final class.");
    }
}

public class Final {
    public static void main(String[] args) {

        Child c = new Child();

        System.out.println("Final variable: " + c.NUMBER);

        c.display();
        c.show();

        FinalClass f = new FinalClass();
        f.message();

        // NUMBER cannot be changed:
        // c.NUMBER = 200;

        // A final class cannot be extended.
    }
}