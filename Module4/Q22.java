package module4;

import java.util.*;

// 12. Generic method to print elements of any Collection.
// The method works with List, Set and Queue.

public class Q22 {

    public static <T> void printCollection(Collection<T> collection) {
        for (T item : collection) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30);

        Set<String> names = new LinkedHashSet<>();
        names.add("Java");
        names.add("Python");
        names.add("C++");

        Queue<Double> values = new LinkedList<>();
        values.add(10.5);
        values.add(20.5);
        values.add(30.5);

        System.out.println("List Elements:");
        printCollection(numbers);

        System.out.println("Set Elements:");
        printCollection(names);

        System.out.println("Queue Elements:");
        printCollection(values);
    }
}