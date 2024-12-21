package com.gfsiproject.gfsi.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection connection = null;

    @SuppressWarnings("CallToPrintStackTrace")
    public static Connection getDBConnection() throws SQLException {
        if (connection != null) {
            return connection;
        } else {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/countrydata?useSSL=false";
            String username = "root";
            String password = "asdasd123123";

            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, username, password);
                System.out.println("Successfully connected to the MySQL database!");
            } catch (ClassNotFoundException | SQLException e) {
                System.err.println("Failed to connect to the MySQL database.");
                e.printStackTrace();
            }
        }
        return connection;
    }
}