package module4;

// 3. How do bounded type parameters work in generics? Write a generic class that accepts only subclasses of Number.

class NumberBox<T extends Number> {
    private T value;

    NumberBox(T value) {
        this.value = value;
    }

    double getDoubleValue() {
        return value.doubleValue();
    }
}

public class Q3 {
    public static void main(String[] args) {
        NumberBox<Integer> n1 = new NumberBox<>(10);
        System.out.println(n1.getDoubleValue());

        NumberBox<Double> n2 = new NumberBox<>(20.5);
        System.out.println(n2.getDoubleValue());

        // NumberBox<String> n3 = new NumberBox<>("Hello");
        // This gives a compile-time error because String is not a subclass of Number.
    }
}