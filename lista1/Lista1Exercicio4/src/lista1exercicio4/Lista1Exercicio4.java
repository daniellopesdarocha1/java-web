/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1exercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Lista1Exercicio4 {

    public static void main(String[] args) {
        // Calculo idade com JOptionPane
        
        int aa, an, idade;
        
        aa = 2015;
        an = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu ano de nascimento: "));
        idade = aa - an;
        
        JOptionPane.showMessageDialog(null, "Você possui: "+ idade +" anos.");
    }
    
}
