/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.jdbc.testes;

import br.com.fatec.jdbc.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class TestaConexao {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        try ( // TODO code application logic here
                Connection con = new ConnectionFactory().getConnection()) {
            System.out.println("conectado");
        }
        System.out.println("conexão fechada");
    }
    
}
        