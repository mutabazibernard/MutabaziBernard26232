import java.io.*;

public class EOFExceptionExample {
    public static void main(String[] args) {
        // Create a temporary file to simulate reading from a file
        File tempFile = new File("tempFile.txt");

        // Write some data to the temporary file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("Hello, World!");
            writer.newLine();
            writer.write("This is a test file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Attempt to read beyond the file's content to trigger EOFException
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(tempFile))) {
            // Read the first line
            String line1 = dataInputStream.readUTF(); // This will work
            System.out.println("Read line: " + line1);

            // Read the second line
            String line2 = dataInputStream.readUTF(); // This will work
            System.out.println("Read line: " + line2);

            // Attempt to read beyond the end of the file
            String line3 = dataInputStream.readUTF(); // This will trigger EOFException
            System.out.println("Read line: " + line3);
        } catch (EOFException e) {
            // Handle the EOFException
            System.err.println("EOFException occurred: Reached the end of the file unexpectedly.");
        } catch (IOException e) {
            // Handle any other IOException that may occur
            System.err.println("IOException occurred: " + e.getMessage());
        } finally {
            // Clean up: delete the temporary file
            if (tempFile.delete()) {
                System.out.println("Temporary file deleted successfully.");
            } else {
                System.err.println("Failed to delete the temporary file.");
            }
        }
    }
}
