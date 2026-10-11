package module4;

// 26. What is the role of the Vector class, and how does it differ from ArrayList?

import java.util.*;

public class Q26 {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        vector.add(10);
        vector.add(20);
        vector.add(30);

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println("Vector: " + vector);
        System.out.println("ArrayList: " + arrayList);

        // Vector is synchronized and thread-safe.
        // ArrayList is not synchronized.
        // ArrayList is generally faster when synchronization is not required.
    }
}