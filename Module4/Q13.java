package module4;

import java.util.*;

// 3. Collection is an interface used to represent a group of objects.
// Collections is a utility class that provides static methods
// for sorting, reversing, searching and other operations.

public class Q13 {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        System.out.println("Collection: " + numbers);

        List<Integer> list = new ArrayList<>(numbers);

        Collections.sort(list);
        System.out.println("Sorted: " + list);

        Collections.reverse(list);
        System.out.println("Reversed: " + list);
    }
}