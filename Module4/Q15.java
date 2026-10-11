package module4;

import java.util.*;

// 5. Comparable is used for natural sorting using compareTo().
// Comparator is used for custom sorting using compare().
// Comparable is in java.lang, while Comparator is in java.util.

public class Q15 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        Collections.sort(numbers);
        System.out.println("Comparable sorting: " + numbers);

        numbers.sort(new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b.compareTo(a);
            }
        });

        System.out.println("Comparator sorting: " + numbers);
    }
}