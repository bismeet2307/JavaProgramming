package module4;

// 27. How is the Stack class implemented, and how does it relate to the List interface?

import java.util.*;

public class Q27 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Removed element: " + stack.pop());

        System.out.println("Stack after pop: " + stack);

        // Stack extends Vector, and Vector implements List.
        // Stack follows LIFO (Last In First Out).
    }
}