package jdbc.videos.dasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.mariadb.jdbc.Driver");
        try(Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/new_example")){
            System.out.println(connection);
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate("insert  into customers values ('17', 'Manukyan', 'Khoren', 'Sisian 25', 'Erevan', '5555', 'Yerevan')");
            System.out.println(result);
        } catch(Exception e) {
            System.out.println("We can not load driver");
        }



    }
}
