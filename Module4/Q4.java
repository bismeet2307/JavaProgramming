package module4;

// 4. What is the difference between ? extends T and ? super T in generics? Provide an example of when to use each.

import java.util.*;

public class Q4 {

    // ? extends Number is used when we want to read values
    static double calculateSum(List<? extends Number> list) {
        double sum = 0;

        for (Number n : list) {
            sum += n.doubleValue();
        }

        return sum;
    }

    // ? super Integer is used when we want to add Integer values
    static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30);

        System.out.println("Sum = " + calculateSum(numbers));

        List<Number> list = new ArrayList<>();
        addNumbers(list);

        System.out.println(list);
    }
}