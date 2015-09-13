/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.jdbc.testes;

import br.com.fatec.jdbc.DAO.ContatoDAO;
import br.com.fatec.jdbc.modelo.Contato;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class TestaAltera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        // TODO code application logic here
        Contato c = new Contato();
        ContatoDAO dao = new ContatoDAO();
        
        c.setNome("Alterado da Silva");
        c.setEmail("alterado@gmail.com");
        c.setEndereco("Rua Alterado, 123");
        
        c.setId(Long.valueOf(1));
        
        dao.altera(c);
        
        System.out.println("Alterado com sucesso");
        
    }
    
}