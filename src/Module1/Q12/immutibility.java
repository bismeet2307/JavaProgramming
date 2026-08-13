// immutibility of string class
public class immutibility {
    public static void main(String[] args) {

        String str = "Hello";

        System.out.println("Original string: " + str);

        str.concat(" World");

        // Original string is unchanged
        System.out.println("After concat without assignment: " + str);

        // A new String object is created
        str = str.concat(" World");

        System.out.println("After assigning result: " + str);
    }
}