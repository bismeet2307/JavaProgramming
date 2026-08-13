// immutability of string class
public class ImmutableString {
    public static void main(String[] args) {

        String str = "Hello";

        System.out.println("Original string: " + str);

        str.concat(" World");

        System.out.println("After concat without assignment: " + str);

        str = str.concat(" World");

        System.out.println("After assigning the result: " + str);
    }
}