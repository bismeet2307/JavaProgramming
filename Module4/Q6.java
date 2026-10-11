package module4;

// 6. Write a generic class Pair<K, V> that holds two values of any types, K and V. Include methods to get and set the values.

class Pair<K, V> {
    private K key;
    private V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    K getKey() {
        return key;
    }

    V getValue() {
        return value;
    }

    void setKey(K key) {
        this.key = key;
    }

    void setValue(V value) {
        this.value = value;
    }
}

public class Q6 {
    public static void main(String[] args) {

        Pair<Integer, String> pair = new Pair<>(1, "Java");

        System.out.println("Key: " + pair.getKey());
        System.out.println("Value: " + pair.getValue());

        pair.setKey(2);
        pair.setValue("Generics");

        System.out.println("Updated Key: " + pair.getKey());
        System.out.println("Updated Value: " + pair.getValue());
    }
}
