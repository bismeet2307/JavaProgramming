package module4;

import java.util.*;

// 8. List maintains insertion order and allows duplicates.
// Set does not allow duplicates.
// Queue usually follows FIFO (First In First Out).

public class Q18 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);

        Set<Integer> set = new LinkedHashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Queue: " + queue);

        System.out.println("Removed from Queue: " + queue.poll());
        System.out.println("Queue after removal: " + queue);
    }
}