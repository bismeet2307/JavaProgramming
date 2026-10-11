package module4;

// 1. What is the purpose of generics in Java, and how do they improve type safety and code reusability?

class GenericExample<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class Q1 {
    public static void main(String[] args) {
        GenericExample<String> s = new GenericExample<>();
        s.setValue("Hello");
        System.out.println(s.getValue());

        GenericExample<Integer> i = new GenericExample<>();
        i.setValue(100);
        System.out.println(i.getValue());
    }
}