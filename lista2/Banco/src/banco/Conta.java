/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Daniel
 */
public class Conta {
    private Long idConta;
    private String titular;
    private double saldo;
    
    public boolean saca (double v){
        if (v <= this.saldo){
            this.saldo -= v;
            return true;
        }else{
            return false;
        }
    }
    
    public void deposita (double v){
        this.saldo += v;
    }
    
    public boolean transfere (double v, Conta destino){
        if (saca(v)){
            destino.deposita(v);
            return true;
        }else{
            return false;
        }
    }

    public Long getIdConta() {
        return idConta;
    }

    public void setIdConta(Long idConta) {
        this.idConta = idConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
