public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        // Declare and initialize an array with 3 elements
        int[] numbers = {1, 2, 3}; // Valid indices are 0, 1, and 2

        try {
            // Attempt to access an invalid index (e.g., index 3, which is out of bounds)
            int invalidAccess = numbers[3]; // This will throw ArrayIndexOutOfBoundsException
            System.out.println("Accessed value: " + invalidAccess);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the ArrayIndexOutOfBoundsException
            // This block will be executed if an invalid array index is accessed
            System.err.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions that may occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
