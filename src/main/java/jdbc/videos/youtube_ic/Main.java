package jdbc.videos.youtube_ic;

import java.sql.*;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/my_db_test";
    public Connection aaa;

    public static void main(String[] args) {
//        Connection connection;


        try (Connection connection = DriverManager.getConnection(URL);
             Statement statement = connection.createStatement()) {
//            System.out.println(statement);
//            statement.execute("insert into animal(animal_name, animal_desc) values ('name','desc')");
//            statement.execute("insert into animal(animal_name, animal_desc) values ('Khoren','desc5')");

//            int result = statement.executeUpdate("update animal set animal_name = 'New Animal' where animal_name = 'name'");
            ResultSet result = statement.executeQuery("select * from animal");
            System.out.println(result);
            if (!connection.isClosed()) {
                System.out.println("connection established");
            }
        } catch (SQLException e) {
            System.out.println("Can't find driver");
        }
//        Driver driver = new FabricMySQLDriver();
    }
}
