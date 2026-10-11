package module4;

import java.util.*;

// 2. Key features of Collection Framework:
// Dynamic size, type safety, sorting, searching and easy data manipulation.
// It provides interfaces like List, Set and Queue.

public class Q12 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(30);
        numbers.add(10);
        numbers.add(20);

        System.out.println("Original List: " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        numbers.remove(Integer.valueOf(10));
        System.out.println("After removal: " + numbers);

        System.out.println("Size: " + numbers.size());
    }
}