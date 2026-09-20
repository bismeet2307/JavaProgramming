package Module3.Q18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingBufferedReader {

    public static void main(String[] args) {

        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader("input.txt"));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}