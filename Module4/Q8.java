package module4;

// 8. Write a generic method swapElements that swaps two elements in an array. Demonstrate its usage with different data types.

import java.util.*;

public class Q8 {

    public static <T> void swapElements(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {

        Integer[] numbers = {10, 20, 30, 40};

        System.out.println("Before swap: " + Arrays.toString(numbers));

        swapElements(numbers, 0, 3);

        System.out.println("After swap: " + Arrays.toString(numbers));

        String[] names = {"Java", "Python", "C++"};

        System.out.println("Before swap: " + Arrays.toString(names));

        swapElements(names, 0, 2);

        System.out.println("After swap: " + Arrays.toString(names));
    }
}