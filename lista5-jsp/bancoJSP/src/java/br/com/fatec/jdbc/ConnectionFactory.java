package br.com.fatec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3306/testebd";
            String usuario = "daniel";
            String senha = "leinad";
            return DriverManager.getConnection(url,usuario,senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
