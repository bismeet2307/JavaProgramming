// access modifiers

class Demo {

    private int privateNumber = 10;
    int defaultNumber = 20;
    protected int protectedNumber = 30;
    public int publicNumber = 40;

    void display() {

        // All can be accessed inside the same class
        System.out.println("Private: " + privateNumber);
        System.out.println("Default: " + defaultNumber);
        System.out.println("Protected: " + protectedNumber);
        System.out.println("Public: " + publicNumber);
    }
}

public class Modifiers {
    public static void main(String[] args) {

        Demo d = new Demo();

        d.display();

        
        System.out.println("Public from main: " + d.publicNumber);

        
    }
}