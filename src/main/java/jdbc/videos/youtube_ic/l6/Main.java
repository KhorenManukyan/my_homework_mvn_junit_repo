package jdbc.videos.youtube_ic.l6;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main{
    public static void main(String[] args) {
        DBWorker worker = new DBWorker();

        String query = "select * from users where id = 2";
        String query1 = "select * from users where id = 1";
        try {
            Statement statement = worker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                User  user = new User();
                user.setId(resultSet.getInt(1));
                user.setUsername(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));
//                System.out.println(id);
                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            Statement statement = worker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query1);
            while (resultSet.next()){
                User  user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
//                System.out.println(id);
                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
