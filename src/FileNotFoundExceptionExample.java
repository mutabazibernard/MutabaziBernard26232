import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        // The name of the file that we are trying to open
        String fileName = "missing_file.txt";

        // We use a try-catch block to handle any FileNotFoundException that may occur
        try {
            // Attempt to open the file using FileInputStream
            FileInputStream fileInputStream = new FileInputStream(fileName);

            // If the file is found, we can read from it (not shown here)
            // For demonstration, we will just print a message
            System.out.println("File opened successfully!");

            // Close the FileInputStream
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            // Handle the FileNotFoundException
            // This block will be executed if the file does not exist
            System.err.println("FileNotFoundException occurred: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions that may occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}