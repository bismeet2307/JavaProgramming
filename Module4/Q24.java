package module4;

// 24. What is the difference between ArrayList and LinkedList in terms of performance and usage?

import java.util.*;

public class Q24 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // ArrayList provides faster random access using indexes.
        // LinkedList is better for frequent insertion and deletion.
        // ArrayList uses a dynamic array internally.
        // LinkedList uses nodes connected to each other.
    }
}