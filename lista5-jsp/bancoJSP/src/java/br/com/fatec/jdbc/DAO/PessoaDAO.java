/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.jdbc.DAO;

import br.com.fatec.jdbc.ConnectionFactory;
import br.com.fatec.jdbc.modelo.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class PessoaDAO {
   private Connection c;
    
    public PessoaDAO() throws SQLException, ClassNotFoundException{
        this.c = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Pessoa pessoa) throws SQLException{
        String sql = "insert into pessoa" + " (nome, idade, sexo, dataNasc)" + " values (?,?,?,?)";
    
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);

        // seta os valores
        stmt.setString(1,pessoa.getNome());
        stmt.setInt(2,pessoa.getIdade());
        stmt.setString(3,pessoa.getSexo());
        stmt.setDate(4,pessoa.getDataNasc());
        // executa
        stmt.execute();
        stmt.close();
    }
    
    public List<Pessoa> getlista() throws SQLException{
         // pessoa: array armazena a lista de registros

        List<Pessoa> pessoa = new ArrayList<Pessoa>();
        
        PreparedStatement stmt = this.c.prepareStatement("select * from pessoa");
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto pessoa
            Pessoa pessoas = new Pessoa();

            pessoas.setIdPessoa(rs.getInt("idPessoa"));
            pessoas.setNome(rs.getString("nome"));
            pessoas.setIdade(rs.getInt("idade"));
            pessoas.setSexo(rs.getString("sexo"));
            pessoas.setDataNasc(rs.getDate("dataNasc"));

            // adiciona o contato à lista de pessoa
            pessoa.add(pessoas);
        }
        
        rs.close();
        stmt.close();
        return pessoa;
        
    } 
}
