// static and non static methods
class Demo {

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Non-static method
    void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }
}

public class Static {
    public static void main(String[] args) {

        // Static method can be called using class name
        Demo.staticMethod();

        // Non-static method requires an object
        Demo obj = new Demo();

        obj.nonStaticMethod();
    }
}