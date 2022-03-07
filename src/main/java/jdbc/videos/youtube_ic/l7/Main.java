package jdbc.videos.youtube_ic.l7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Calendar;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/my_db_test";
    private static final String INSERT_NEW = "insert info dish values(?,?,?,?,?,?)";

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(URL);
            preparedStatement = connection.prepareStatement(INSERT_NEW);
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Inserted title");
            preparedStatement.setString(3, "Inserted desc");
            preparedStatement.setFloat(4, 0.2F);
            preparedStatement.setBoolean(5, true);
            preparedStatement.setDate(6, new Date(Calendar.getInstance().getTimeInMillis()));
//            preparedStatement.setBlob(7, new FileInputStream("smile.png"));
            preparedStatement.execute();

        } catch (SQLException /*| FileNotFoundException*/ e) {
            e.printStackTrace();
        }
    }
}
