package module4;

// 2. Explain the syntax for creating a user-defined generic class in Java. Provide an example.

class Box<T> {
    private T value;

    Box(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }

    void setValue(T value) {
        this.value = value;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>("Java");
        System.out.println(b1.getValue());

        Box<Integer> b2 = new Box<>(10);
        System.out.println(b2.getValue());
    }
}