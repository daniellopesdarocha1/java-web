/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.jdbc.testes;

import br.com.fatec.jdbc.DAO.ContatoDAO;
import br.com.fatec.jdbc.DAO.PessoaDAO;
import br.com.fatec.jdbc.modelo.Pessoa;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class TestaAdicionaPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Pessoa p1 = new Pessoa();
        p1.setNome("Fulano");
        p1.setIdade(24);
        p1.setSexo("m");
        p1.setDataNasc(null);
        PessoaDAO dao = new PessoaDAO();
        dao.adiciona(p1);
    }
    
}
