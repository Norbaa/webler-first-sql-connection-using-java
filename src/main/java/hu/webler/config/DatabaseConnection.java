package hu.webler.config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    private static Connection connection;
    private static final String JDBC_URL = DatabaseConfig.getJdbcUrl();
    private static final String USERNAME = System.getenv("DB_USERNAME_MYSQL");
    private static final String PASSWORD = System.getenv("DB_PASSWORD_MYSQL");


    public static void createDatabaseAndTable(Connection connection) {
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate("CREATE DATABASE IF NOT EXIST webler_first_database_with_java");
            statement.executeUpdate("USE webler_first_database_with_java");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS user (" +
                    "id INI AUTO_INCREMENT PRIMARY KEY," +
                    "username VARCHAR(50) NOT NULL," +
                    "password VARCHAR(50) NOT NULL," +
                    "email VARCHAR(100) NOT NULL," +
                    "first_name VARCHAR(50) NOT NULL," +
                    "last_name VARCHAR(50) NOT NULL)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private DatabaseConnection() {

    }
}
