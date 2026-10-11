package module4;

// 10. Implement a generic class MinMaxFinder<T extends Comparable<T>> that provides methods findMin() and findMax() to find the minimum and maximum elements in a list.

import java.util.*;

class MinMaxFinder<T extends Comparable<T>> {

    private List<T> list;

    MinMaxFinder(List<T> list) {
        this.list = list;
    }

    T findMin() {
        T min = list.get(0);

        for (T item : list) {
            if (item.compareTo(min) < 0) {
                min = item;
            }
        }

        return min;
    }

    T findMax() {
        T max = list.get(0);

        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }

        return max;
    }
}

public class Q10 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(50, 20, 80, 10, 40);

        MinMaxFinder<Integer> intFinder = new MinMaxFinder<>(numbers);

        System.out.println("Integer list: " + numbers);
        System.out.println("Minimum: " + intFinder.findMin());
        System.out.println("Maximum: " + intFinder.findMax());

        List<String> names = Arrays.asList(
            "Mango", "Apple", "Banana", "Orange"
        );

        MinMaxFinder<String> stringFinder = new MinMaxFinder<>(names);

        System.out.println("String list: " + names);
        System.out.println("Minimum: " + stringFinder.findMin());
        System.out.println("Maximum: " + stringFinder.findMax());
    }
}