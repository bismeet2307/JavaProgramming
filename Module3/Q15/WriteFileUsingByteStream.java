package Module3.Q15;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileUsingByteStream {

    public static void main(String[] args) {

        String text = "Java I/O Streams Example";

        try {

            FileOutputStream output =
                    new FileOutputStream("output.txt");

            output.write(text.getBytes());

            output.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
