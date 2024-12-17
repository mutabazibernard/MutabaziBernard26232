public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        // Name of the class we are trying to load
        String className = "com.example.NonExistentClass"; // This class does not exist

        try {
            // Attempt to load the class using Class.forName()
            Class<?> clazz = Class.forName(className);
            System.out.println("Class loaded: " + clazz.getName());
        } catch (ClassNotFoundException e) {
            // Handle the ClassNotFoundException
            // This block will be executed if the class cannot be found
            System.err.println("ClassNotFoundException occurred: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions that may occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}