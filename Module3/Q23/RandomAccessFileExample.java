package Module3.Q23;

import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFileExample {

    public static void main(String[] args) {

        try {

            RandomAccessFile file =
                    new RandomAccessFile("random.txt", "rw");

            // Write data at the beginning
            file.write("Hello World".getBytes());

            // Move to position 6
            file.seek(6);

            // Overwrite "World"
            file.write("Java".getBytes());

            // Move to beginning
            file.seek(0);

            byte[] data = new byte[10];

            int bytesRead = file.read(data);

            System.out.println(
                    "File content: "
                    + new String(data, 0, bytesRead));

            file.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}