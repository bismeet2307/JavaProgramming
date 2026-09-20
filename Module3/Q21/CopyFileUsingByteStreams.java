package Module3.Q21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileUsingByteStreams {

    public static void main(String[] args) {

        String source = "input.txt";
        String destination = "copy.txt";

        try {

            FileInputStream input =
                    new FileInputStream(source);

            FileOutputStream output =
                    new FileOutputStream(destination);

            int data;

            while ((data = input.read()) != -1) {
                output.write(data);
            }

            input.close();
            output.close();

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}