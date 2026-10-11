package module4;

// 25. Write a program to demonstrate the use of ArrayList for storing and iterating over elements.

import java.util.*;

public class Q25 {
    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        System.out.println("Elements in ArrayList:");

        for (String language : languages) {
            System.out.println(language);
        }
    }
}