// character frequency
import java.util.Scanner;

public class CharacterFreq {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean[] counted = new boolean[str.length()];

        System.out.println("Character frequencies:");

        for (int i = 0; i < str.length(); i++) {

            if (counted[i]) {
                continue;
            }

            char current = str.charAt(i);
            int count = 1;

            for (int j = i + 1; j < str.length(); j++) {

                if (current == str.charAt(j)) {
                    count++;
                    counted[j] = true;
                }
            }

            System.out.println(current + " = " + count);
        }

        sc.close();
    }
}