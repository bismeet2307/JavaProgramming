// abstraction 
interface Shape {

    void draw();
}

class Circle implements Shape {

    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public class abstraction {

    public static void main(String[] args) {

        Circle c = new Circle();

        c.draw();
    }
}