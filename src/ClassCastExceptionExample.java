public class ClassCastExceptionExample {
    public static void main(String[] args) {
        // Create an object of type Object
        Object obj = new String("Hello, World!"); // obj is actually a String

        try {
            // Attempt to cast the Object to an Integer, which will fail
            Integer number = (Integer) obj; // This will throw ClassCastException
            System.out.println("Casted number: " + number);
        } catch (ClassCastException e) {
            // Handle the ClassCastException
            // This block will be executed if an invalid cast is attempted
            System.err.println("ClassCastException occurred: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions that may occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}