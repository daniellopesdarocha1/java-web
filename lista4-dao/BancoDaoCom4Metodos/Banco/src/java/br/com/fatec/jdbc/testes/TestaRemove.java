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
public class TestaRemove {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        // TODO code application logic here
        
        Contato c1 = new Contato();
        //long codigo = 4;
        //Long.valueOf() resolve o problema de ter que usar uma variavel para atribuir tipo Long
        c1.setId(Long.valueOf(4));
        
        ContatoDAO dao;
        dao = new ContatoDAO();
        dao.remove(c1);
        
        System.out.println("Removido com sucesso!");
        
    }
    
}
