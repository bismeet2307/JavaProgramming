package module4;

// 28. Create a List of strings and perform the following operations:
// a. Add elements to the list.
// b. Remove an element by value and index.
// c. Replace an element at a specific index.
// d. Print the list after each operation.

import java.util.*;

public class Q28 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        // Add elements
        names.add("Java");
        names.add("Python");
        names.add("C++");
        names.add("JavaScript");

        System.out.println("After adding: " + names);

        // Remove element by value
        names.remove("Python");

        System.out.println("After removing Python: " + names);

        // Remove element by index
        names.remove(1);

        System.out.println("After removing index 1: " + names);

        // Replace element at index
        names.set(0, "C");

        System.out.println("After replacing index 0: " + names);
    }
}