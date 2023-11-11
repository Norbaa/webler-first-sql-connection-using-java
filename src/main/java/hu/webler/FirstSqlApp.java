package hu.webler;

import hu.webler.config.DatabaseConnection;

import java.sql.Connection;

public class FirstSqlApp {
    public static void main(String[] args) {
        Connection connection = DatabaseConnection.getConnection();
        DatabaseConnection.createDatabaseAndTable(connection);
    }
}
