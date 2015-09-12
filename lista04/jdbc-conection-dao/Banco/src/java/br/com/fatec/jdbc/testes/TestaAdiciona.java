/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.jdbc.testes;

import br.com.fatec.jdbc.DAO.ContatoDAO;
import br.com.fatec.jdbc.modelo.Contato;

/**
 *
 * @author Daniel
 */
public class TestaAdiciona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Contato c = new Contato();
        ContatoDAO dao = new ContatoDAO();
        c.setNome("Gomes da Silva");
        c.setEmail("gomes.hotmail.com");
        c.setEndereco("Rua dos Bobos 0");
        dao.adiciona(c);
        System.out.println("Contato inserido com sucesso");

    }

}