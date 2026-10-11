package module4;

import java.util.*;

// 4. Iterator is used to traverse elements of a collection.
// It provides hasNext(), next() and remove() methods.

public class Q14 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Java");
        names.add("Python");
        names.add("C++");

        Iterator<String> itr = names.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}