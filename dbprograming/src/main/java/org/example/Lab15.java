package org.example;

import com.sun.tools.javac.Main;

import java.sql.*;
import java.util.logging.Logger;

public class Lab15 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1"; // jdbc:mysql://hostname:port/dbname
        String username = "root";
        String password = "b1o2o3k4";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection connection= DriverManager.getConnection(URL, username, password);
            System.out.println("Database Connected");
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM student";
            ResultSet results = statement.executeQuery(sql);
            ResultSetMetaData resultsMetaData = results.getMetaData();
            while (results.next()) {
                for (int i = 1; i <= resultsMetaData.getColumnCount(); i++) {
                    System.out.println(results.getString(i));
                }
            }
            connection.close();
        } catch (ClassNotFoundException ex){
            Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex){
            Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
