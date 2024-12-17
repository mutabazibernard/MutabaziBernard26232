public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        // Example of an invalid argument
        int age = -5; // Age cannot be negative

        try {
            // Attempt to validate the age, which will trigger an IllegalArgumentException
            validateAge(age);
        } catch (IllegalArgumentException e) {
            // Handle the IllegalArgumentException
            // This block will be executed if an invalid argument is passed
            System.err.println("IllegalArgumentException occurred: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions that may occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    // Method to validate age
    public static void validateAge(int age) {
        if (age < 0) {
            // Throw IllegalArgumentException if age is negative
            throw new IllegalArgumentException("Age cannot be negative: " + age);
        }
        // If age is valid, print a success message
        System.out.println("Valid age: " + age);
    }
}
