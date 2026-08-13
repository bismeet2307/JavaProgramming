// this and super
class Parent {
    int number = 100;

    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    int number = 200;

    void display() {

        // this refers to current class
        System.out.println("Child number: " + this.number);

        // super refers to parent class
        System.out.println("Parent number: " + super.number);

        super.display();
    }
}

public class Keywords{
    public static void main(String[] args) {

        Child c = new Child();

        c.display();
    }
}