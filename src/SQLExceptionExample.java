import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExceptionExample {
    public static void main(String[] args) {
        // Database URL for a non-existent database
        String url = "jdbc:sqlite:non_existent_database.db"; // SQLite example

        // Attempt to establish a connection to the database
        try {
            // Attempt to connect to the non-existent database
            Connection connection = DriverManager.getConnection(url);

            // Create a statement to execute SQL commands
            Statement statement = connection.createStatement();

            // Attempt to execute an invalid SQL query (optional, but demonstrates SQLException)
            String invalidSQL = "SELECT * FROM non_existent_table"; // This table does not exist
            statement.executeQuery(invalidSQL);

            // Close the statement and connection
            statement.close();
            connection.close();
        } catch (SQLException e) {
            // Handle the SQLException
            // This block will be executed if there is a database error
            System.err.println("SQLException occurred: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions that may occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}