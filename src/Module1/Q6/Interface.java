// Multiple Inheritance Using Interfaces
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Demo implements Printable, Showable {

    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void show() {
        System.out.println("Showing...");
    }
}

public class Interface {
    public static void main(String[] args) {

        Demo d = new Demo();

        d.print();
        d.show();
    }
}