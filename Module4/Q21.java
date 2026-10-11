package module4;

import java.util.*;

// 11. Iterate over a List using:
// 1. Simple for loop
// 2. Enhanced for loop
// 3. While loop with Iterator

public class Q21 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        System.out.println("Simple for loop:");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("Enhanced for loop:");

        for (int n : numbers) {
            System.out.println(n);
        }

        System.out.println("While loop with Iterator:");

        Iterator<Integer> itr = numbers.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}