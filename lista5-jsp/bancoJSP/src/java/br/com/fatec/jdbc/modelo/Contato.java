package br.com.fatec.jdbc.modelo;

public class Contato {
    private int id;
    private String nome;
    private String email;
    private String endereco;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setId(int aLong) {
        this.id = aLong;

    }
}