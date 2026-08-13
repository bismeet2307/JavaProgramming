// String builder

public class StringBuilder1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Original: " + sb);

        // Append
        sb.append(" Guys");
        System.out.println("After append: " + sb);

        // Insert
        sb.insert(5, " Bro");
        System.out.println("After insert: " + sb);

        // Replace
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        // Delete
        sb.delete(2, 7);
        System.out.println("After delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}