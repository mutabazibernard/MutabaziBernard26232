public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        // Two integers for division
        int numerator = 10;
        int denominator = 0; // Setting denominator to zero to trigger the exception

        try {
            // Attempt to perform division
            int result = numerator / denominator; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the ArithmeticException
            // This block will be executed if there is an arithmetic error (e.g., division by zero)
            System.err.println("ArithmeticException occurred: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions that may occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}