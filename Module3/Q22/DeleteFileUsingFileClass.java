package Module3.Q22;

import java.io.File;

public class DeleteFileUsingFileClass {

    public static void main(String[] args) {

        File file = new File("sample.txt");

        if (file.exists()) {

            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("File could not be deleted.");
            }

        } else {

            System.out.println("File does not exist.");
        }
    }
}