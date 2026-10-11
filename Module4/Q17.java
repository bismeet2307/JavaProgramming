package module4;

import java.util.*;

// 7. Collection stores individual elements.
// Map stores data in key-value pairs.
// Collection allows different types of implementations.
// Map does not allow duplicate keys.

public class Q17 {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();

        names.add("Java");
        names.add("Python");
        names.add("C++");

        System.out.println("Collection: " + names);

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        System.out.println("Map: " + map);

        System.out.println("Value at key 2: " + map.get(2));
    }
}