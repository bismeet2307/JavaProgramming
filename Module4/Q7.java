package module4;

// 7. Create a user-defined generic class Box<T> with methods addItem(T item) and getItem(). Demonstrate its usage with String and Integer types.

class Box<T> {
    private T item;

    void addItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}

public class Q7 {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        stringBox.addItem("Hello");

        System.out.println("String: " + stringBox.getItem());

        Box<Integer> integerBox = new Box<>();
        integerBox.addItem(100);

        System.out.println("Integer: " + integerBox.getItem());
    }
}