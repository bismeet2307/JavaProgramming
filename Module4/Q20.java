package module4;

import java.util.*;

// 10. Arrays have a fixed size while collections can grow dynamically.
// Collections provide built-in methods for adding, removing and searching.
// They support generics and different data structures.

public class Q20 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        System.out.println("Array elements:");
        for (int n : arr) {
            System.out.println(n);
        }

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("ArrayList: " + list);

        list.remove(Integer.valueOf(20));

        System.out.println("After removal: " + list);
        System.out.println("Size: " + list.size());
    }
}