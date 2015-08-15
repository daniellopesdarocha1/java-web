/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1exercicio10;

/**
 *
 * @author Daniel
 */
public class Lista1Exercicio10 {

    public static void main(String[] args) {
        // Somatório dos 10 primeiros números
        
        int i;
        int n = 10;
        int soma = 0;
        
        for (i=0; i<n; i++)
            soma += i;
        
        System.out.println("Somatótio: "+ soma);
    }
    
}
