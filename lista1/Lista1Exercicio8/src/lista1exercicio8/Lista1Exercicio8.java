/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1exercicio8;

/**
 *
 * @author Daniel
 */
public class Lista1Exercicio8 {

    public static void main(String[] args) {
        // Inverter número inteiro
        
        int entrada = 394;
        int saida;
        float a, b, c;
        
        a = entrada % 10;
        b = (entrada % 100) / 10;
        c = (entrada % 1000) /100;
        
        int ia = (int) a;
        int ib = (int) b;
        int ic = (int) c;
        
        String sa = Integer.toString (ia);
        String sb = Integer.toString (ib);
        String sc = Integer.toString (ic);
        
        String inverte = sa + sb + sc;
        
        saida = Integer.parseInt(inverte);
        
        System.out.println("Entrada: "+ entrada);
        System.out.println("Saída: "+ saida);
        
    }
    
}
