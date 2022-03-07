package jdbc.homework.airopor_management_system.configuration;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {
    private static DbConnection dbConnection = null;
    private String driverName;
    private String username;
    private String password;
    private String url;
    private Connection connection = null;

    private DbConnection() {
    }

    public static DbConnection getInstance() {
        if (dbConnection == null) {
            dbConnection = new DbConnection();
        }
        return dbConnection;
    }

    public Connection getConnection() {
        readConnectionParams();
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void readConnectionParams() {
        InputStream inputStream = DbConnection.class.getClassLoader()
                .getResourceAsStream("config.properties");
        Properties properties = new Properties();

        if (inputStream != null) {
            try {
                properties.load(inputStream);
                driverName = properties.getProperty("driverName");
                username = properties.getProperty("username");
                password = properties.getProperty("password");
                url = properties.getProperty("url");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
