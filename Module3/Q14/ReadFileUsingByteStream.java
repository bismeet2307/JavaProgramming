package Module3.Q14;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingByteStream {

    public static void main(String[] args) {

        try {

            FileInputStream input =
                    new FileInputStream("input.txt");

            int data;

            while ((data = input.read()) != -1) {
                System.out.print((char) data);
            }

            input.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}