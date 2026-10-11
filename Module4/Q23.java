package module4;

// 23. What is the List interface, and how does it differ from the Set interface?

import java.util.*;

public class Q23 {
    public static void main(String[] args) {

        // List allows duplicate elements and maintains insertion order
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java");

        // Set does not allow duplicate elements
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("Java");

        System.out.println("List: " + list);
        System.out.println("Set: " + set);
    }
}