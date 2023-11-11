package hu.webler.service;

import hu.webler.entity.User;

import java.sql.Connection;
import java.sql.SQLException;

public class UserService {
    public User saveUser(User user, Connection connection) throws SQLException {
        String sql ="INSERT INTO users (username, email, password, first_name, last_name) VALUES (?,?,?,?,?);

    }
}
