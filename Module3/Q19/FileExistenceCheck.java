package Module3.Q19;

import java.io.File;
import java.io.IOException;

public class FileExistenceCheck {

    public static void main(String[] args) {

        File file = new File("sample.txt");

        try {

            if (file.exists()) {

                System.out.println("File already exists.");

            } else {

                if (file.createNewFile()) {
                    System.out.println("File created successfully.");
                } else {
                    System.out.println("File could not be created.");
                }
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}