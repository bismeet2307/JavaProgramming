package module4;

import java.util.*;

// 9. Iterable allows objects to be traversed using an Iterator.
// It provides the iterator() method.
// Collection extends Iterable.
// It also supports enhanced for loops.

public class Q19 {
    public static void main(String[] args) {
        Iterable<String> languages = Arrays.asList(
            "Java", "Python", "C++"
        );

        for (String language : languages) {
            System.out.println(language);
        }

        Iterator<String> itr = languages.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}