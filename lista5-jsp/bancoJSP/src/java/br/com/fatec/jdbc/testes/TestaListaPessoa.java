/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.jdbc.testes;

import br.com.fatec.jdbc.DAO.PessoaDAO;
import br.com.fatec.jdbc.modelo.Pessoa;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class TestaListaPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        PessoaDAO dao = new PessoaDAO();

        List<Pessoa> pessoa = dao.getlista() ;

        for (Pessoa pessoas : pessoa) {
            System.out.println("IdPessoa: " + pessoas.getIdPessoa());
            System.out.println("Nome: " + pessoas.getNome());
            System.out.println("Idade: " + pessoas.getIdade());
            System.out.println("Sexo: " + pessoas.getSexo());
            System.out.println("Data de Nascimento: " + pessoas.getDataNasc());
        }   
    }
    
}
