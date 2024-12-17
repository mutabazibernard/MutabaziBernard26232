public class NullPointerExceptionExample {
    public static void main(String[] args) {
        // Declare a String variable and initialize it to null
        String str = null; // This will be our null reference

        try {
            // Attempt to access the length of the null reference
            int length = str.length(); // This will throw NullPointerException
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            // Handle the NullPointerException
            // This block will be executed if there is an attempt to access a method on a null reference
            System.err.println("NullPointerException occurred: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions that may occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
