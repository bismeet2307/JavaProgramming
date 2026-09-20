package Module3.Q20;

import java.io.File;
import java.util.Scanner;

public class ListFilesInDirectory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String path = scanner.nextLine();

        File directory = new File(path);

        if (!directory.exists()) {

            System.out.println("Directory does not exist.");

        } else if (!directory.isDirectory()) {

            System.out.println("The given path is not a directory.");

        } else {

            File[] files = directory.listFiles();

            if (files != null) {

                System.out.println("Files and folders:");

                for (File file : files) {
                    System.out.println(file.getName());
                }

            } else {

                System.out.println("Unable to read directory.");
            }
        }

        scanner.close();
    }
}