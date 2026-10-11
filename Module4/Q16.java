package module4;

import java.util.*;

// 6. Collection is the main interface for List, Set and Queue.
// List allows duplicates and maintains order.
// Set does not allow duplicate elements.
// Queue is used for processing elements, usually in FIFO order.
// Map stores key-value pairs and is separate from Collection.

public class Q16 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Apple");
        list.add("Banana");

        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Apple");
        set.add("Banana");

        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");

        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Queue: " + queue);
        System.out.println("Map: " + map);
    }
}