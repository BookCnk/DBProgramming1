package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class Lab11 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1"; // jdbc:mysql://hostname:port/dbname
        String username = "root";
        String password = "b1o2o3k4";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, username, password);
            Statement statement = connection.createStatement();
            String sql = "DELETE FROM student "
                    + "WHERE studentID='651305'";
            statement.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Lab8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Lab8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
