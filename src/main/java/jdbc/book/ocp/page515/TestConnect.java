package jdbc.book.ocp.page515;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnect {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306");

        Statement statement = connection.createStatement();
        int result = statement.executeUpdate("insert  into new_example.customers VALUES ('17', 'Manukyan', 'Khoren', 'Sisian 25', 'Erevan', '5555', 'Yerevan')");
        System.out.println(result);

    }
}
