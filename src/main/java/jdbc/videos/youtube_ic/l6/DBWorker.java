package jdbc.videos.youtube_ic.l6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBWorker {
    private final String HOST = "jdbc:mysql://localhost:3306/test_db";

    private Connection connection;

    public DBWorker(){
        try {
            connection = DriverManager.getConnection(HOST);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
