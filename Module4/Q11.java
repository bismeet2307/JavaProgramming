package module4;


import java.util.*;

// 1. The java.util package provides utility classes and interfaces.
// It includes collections, Scanner, Random, Date, etc.
// It is useful for storing data, taking input and performing operations.

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        ArrayList<String> names = new ArrayList<>();
        names.add(name);

        System.out.println("Names: " + names);

        sc.close();
    }
}