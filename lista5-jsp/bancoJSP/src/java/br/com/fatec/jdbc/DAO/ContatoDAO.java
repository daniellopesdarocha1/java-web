package br.com.fatec.jdbc.DAO;

import br.com.fatec.jdbc.ConnectionFactory;
import br.com.fatec.jdbc.modelo.Contato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {
    private Connection c;
    
    public ContatoDAO() throws SQLException, ClassNotFoundException{
        this.c = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Contato contato) throws SQLException{
        String sql = "insert into contatos" + " (nome, email, endereco)" + " values (?,?,?)";
    
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);

        // seta os valores
        stmt.setString(1,contato.getNome());
        stmt.setString(2,contato.getEmail());
        stmt.setString(3,contato.getEndereco());

        // executa
        stmt.execute();
        stmt.close();
    }
    
    public List<Contato> getlista() throws SQLException{
         // contatos: array armazena a lista de registros

        List<Contato> contatos = new ArrayList<Contato>();
        
        PreparedStatement stmt = this.c.prepareStatement("select * from contatos");
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Contato
            Contato contato = new Contato();

            contato.setId(rs.getInt("id"));
            contato.setNome(rs.getString("nome"));
            contato.setEmail(rs.getString("email"));
            contato.setEndereco(rs.getString("endereco"));

            // adiciona o contato à lista de contatos
            contatos.add(contato);
        }
        
        rs.close();
        stmt.close();
        return contatos;
        
    }
}