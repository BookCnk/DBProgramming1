package org.example;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Lab12 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1"; // jdbc:mysql://hostname:port/dbname
        String username = "root";
        String password = "b1o2o3k4";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, username, password);
            String sql = "INSERT INTO student (studentID, firstName, lastName, email, deptID)" + "VALUES(?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "651305");
            preparedStatement.setString(2, "Chanakarn");
            preparedStatement.setString(3, "Kruehong");
            preparedStatement.setString(4, "chanakarn.krue@kmutt.ac.th");
            preparedStatement.setString(5, "IT");
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Lab8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Lab8.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
