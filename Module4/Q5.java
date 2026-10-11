package module4;

// 5. How do raw types differ from parameterized types in generics, and why should raw types be avoided?

import java.util.List;
import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) {

        // Raw type
        List list = new ArrayList();

        list.add("Java");
        list.add(100);

        System.out.println("Raw List: " + list);

        // Parameterized type
        List<String> names = new ArrayList<>();

        names.add("Java");
        names.add("Python");

        System.out.println("Parameterized List: " + names);
    }
}