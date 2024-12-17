public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        // Example of an invalid number string
        String invalidNumber = "abc123"; // This string cannot be converted to a number

        try {
            // Attempt to convert the invalid number string to an integer
            int number = Integer.parseInt(invalidNumber); // This will throw NumberFormatException
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            // Handle the NumberFormatException
            // This block will be executed if the string cannot be parsed as an integer
            System.err.println("NumberFormatException occurred: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions that may occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
