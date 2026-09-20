package Module3.Q16;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingCharacterStream {

    public static void main(String[] args) {

        try {

            FileReader reader =
                    new FileReader("input.txt");

            int data;

            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}