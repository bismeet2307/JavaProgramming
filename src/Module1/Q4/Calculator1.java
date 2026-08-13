class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Calculator {
    // overloading
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Calculator1 {
    public static void main(String[] args) {

        // Overloading
        Calculator c = new Calculator();

        System.out.println("Addition of 2 integers: " + c.add(10, 20));
        System.out.println("Addition of 3 integers: " + c.add(10, 20, 30));
        System.out.println("Addition of 2 doubles: " + c.add(10.5, 20.5));

        // Overriding
        Animal a = new Dog();
        a.sound();
    }
}