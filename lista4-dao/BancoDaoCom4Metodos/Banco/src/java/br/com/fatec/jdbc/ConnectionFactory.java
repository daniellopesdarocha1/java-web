/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class ConnectionFactory {
    public Connection getConnection() {
        try {
            String url ="jdbc:mysql://localhost:3306/testebd";
            String usuario = "daniel";
            String senha = "leinad";
            return DriverManager.getConnection(url,usuario,senha);           
        } catch (SQLException e) {
        throw new RuntimeException(e);
        }
    }
}
