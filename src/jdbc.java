import javax.swing.*;
import java.sql.*;
public class jdbc {
    public static void main(String[] args) throws SQLException {
        Connection connection =  DriverManager.getConnection("jdbc:sqlite:database.db");
        Statement statement = connection.createStatement();
        //statement.executeUpdate("INSERT INTO `user` (`username`) VALUES  ('Alyssa')");

        PreparedStatement preparedStatement = connection.prepareStatement("insert into user (username) values (?)");
        preparedStatement.setString(1,"jean-michel");
        preparedStatement.executeUpdate();
        ResultSet result = statement.executeQuery("SELECT * FROM user");
        while (result.next()) {
            int id = result.getInt("id");
            String username = result.getString("username");
            System.out.println(id + " "+ username);
        }

    }
}
