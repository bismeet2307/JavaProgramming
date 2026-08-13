// final class and methods
class Parent {

    // Final method
    final void display() {
        System.out.println("This is a final method.");
    }
}

// Final class cannot be inherited
final class FinalClass {

    void show() {
        System.out.println("This is a final class.");
    }
}

public class Final1 {
    public static void main(String[] args) {

        Parent p = new Parent();

        p.display();

        FinalClass f = new FinalClass();

        f.show();

        /*
        The following would give errors:

        class Child extends FinalClass {
        }

        because FinalClass is final.

        Also:

        class Child extends Parent {
            void display() {
            }
        }

        because display() is final.
        */
    }
}