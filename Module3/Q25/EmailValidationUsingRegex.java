package Module3.Q25;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidationUsingRegex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter email address: ");
        String email = scanner.nextLine();

        String regex =
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {

            System.out.println("Valid email address.");

        } else {

            System.out.println("Invalid email address.");
        }

        scanner.close();
    }
}