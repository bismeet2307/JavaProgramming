// overriding and super
class Parent {

    void display() {
        System.out.println("This is the Parent class method.");
    }
}

class Child extends Parent {

    @Override
    void display() {

        System.out.println("This is the Child class method.");

        // Call parent class method
        super.display();
    }
}

public class OverridingSuper {
    public static void main(String[] args) {

        Child c = new Child();

        c.display();
    }
}