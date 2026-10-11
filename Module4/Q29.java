package module4;

// 29. Write a program to compare the performance of ArrayList and LinkedList for:
// a. Adding elements at the beginning.
// b. Removing elements from the middle.
// c. Iterating through the list.

import java.util.*;

public class Q29 {
    public static void main(String[] args) {

        int size = 100000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements at the beginning

        long start = System.nanoTime();

        for (int i = 0; i < size; i++) {
            arrayList.add(0, i);
        }

        long arrayAddTime = System.nanoTime() - start;

        start = System.nanoTime();

        for (int i = 0; i < size; i++) {
            linkedList.addFirst(i);
        }

        long linkedAddTime = System.nanoTime() - start;

        System.out.println("Adding at beginning:");
        System.out.println("ArrayList: " + arrayAddTime + " ns");
        System.out.println("LinkedList: " + linkedAddTime + " ns");


        // Removing elements from the middle

        start = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            arrayList.remove(arrayList.size() / 2);
        }

        long arrayRemoveTime = System.nanoTime() - start;

        start = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            linkedList.remove(linkedList.size() / 2);
        }

        long linkedRemoveTime = System.nanoTime() - start;

        System.out.println("\nRemoving from middle:");
        System.out.println("ArrayList: " + arrayRemoveTime + " ns");
        System.out.println("LinkedList: " + linkedRemoveTime + " ns");


        // Iterating through the list

        start = System.nanoTime();

        for (Integer value : arrayList) {
            int x = value;
        }

        long arrayIterationTime = System.nanoTime() - start;

        start = System.nanoTime();

        for (Integer value : linkedList) {
            int x = value;
        }

        long linkedIterationTime = System.nanoTime() - start;

        System.out.println("\nIterating:");
        System.out.println("ArrayList: " + arrayIterationTime + " ns");
        System.out.println("LinkedList: " + linkedIterationTime + " ns");
    }
}