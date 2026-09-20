package Module3.Q17;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileUsingCharacterStream {

    public static void main(String[] args) {

        String text = "This file was created using FileWriter.";

        try {

            FileWriter writer =
                    new FileWriter("example.txt");

            writer.write(text);

            writer.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}