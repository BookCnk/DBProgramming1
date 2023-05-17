package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Logger;

public class Lab9 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1"; // jdbc:mysql://hostname:port/dbname
        String username = "root";
        String password = "b1o2o3k4";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, username, password);
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO student (studentID, firstName, lastName, email, deptID)" + "VALUES ('651305', 'Chanakarn', 'Kruehong', 'chanakarn.krue@kmutt.ac.th', 'IT')";
            statement.executeUpdate(sql);
        } catch (ClassNotFoundException ex){
            Logger.getLogger(Lab8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex){
            Logger.getLogger(Lab8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
