import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {
        // The name of the file that we are trying to read
        String fileName = "non_existent_file.txt";

        // We use a try-catch block to handle any IOException that may occur
        try {
            // Attempt to open the file and create a BufferedReader
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            // Read lines from the file until the end
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the BufferedReader
            reader.close();
        } catch (IOException e) {
            // Handle the IOException
            // This block will be executed if the file does not exist or cannot be read
            System.err.println("An IOException occurred: " + e.getMessage());
        }
    }
}