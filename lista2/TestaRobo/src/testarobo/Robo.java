/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarobo;

/**
 *
 * @author Daniel
 */
public class Robo {
    
        private String nome;
	private String dataFabricacao; 
	private int bateria = 5;
           
        
	public boolean testarBateria() {  
            if (this.bateria == 0)
                return true;
            else
		return false;
	} 
        
	public float somar(float n1, float n2) {
                float soma = n1 + n2;
                this.bateria -= 1;
                return soma;
	}
	 
	public float subtrair(float n1, float n2) {
                float sub = n1 - n2;
                this.bateria -= 1;
                return sub;
	}
	 
	public float multiplicar(float n1, float n2) {
                float mult = n1 * n2;
                this.bateria -= 1;
                return mult;
	}
	 
	public float dividir(float n1, float n2) {
                float divi = n1 / n2;
                this.bateria -= 1;
                return divi;
	}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
        
        
   
}
