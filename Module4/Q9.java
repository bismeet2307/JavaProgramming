package module4;

// 9. Develop a user-defined generic class Stack<T> that provides standard stack operations like push(T item), pop(), and peek(). Demonstrate with integers and strings.

import java.util.*;

class MyStack<T> {
    private ArrayList<T> stack = new ArrayList<>();

    void push(T item) {
        stack.add(item);
    }

    T pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }

        return stack.remove(stack.size() - 1);
    }

    T peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }

        return stack.get(stack.size() - 1);
    }
}

public class Q9 {
    public static void main(String[] args) {

        MyStack<Integer> numbers = new MyStack<>();

        numbers.push(10);
        numbers.push(20);
        numbers.push(30);

        System.out.println("Top: " + numbers.peek());
        System.out.println("Popped: " + numbers.pop());
        System.out.println("Top: " + numbers.peek());

        MyStack<String> names = new MyStack<>();

        names.push("Apple");
        names.push("Banana");
        names.push("Mango");

        System.out.println("Top: " + names.peek());
        System.out.println("Popped: " + names.pop());
        System.out.println("Top: " + names.peek());
    }
}