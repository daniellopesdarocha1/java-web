/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.jdbc.testes;

import br.com.fatec.jdbc.DAO.ContatoDAO;
import br.com.fatec.jdbc.modelo.Contato;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class TestaLista {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        ContatoDAO dao;
        dao = new ContatoDAO();
//Mostrar os contatos usando o método getLista
        List <Contato> contatos = dao.getLista();
//imprime as informações dos contatos:
        for (Contato contato : contatos) {
            System.out.println("Id: " + contato.getId());
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Email: " + contato.getEmail());
            System.out.println("Endereço: " + contato.getEndereco());
            System.out.println("");
        }

    }

}
