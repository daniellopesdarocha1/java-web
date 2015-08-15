/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1exercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Lista1Exercicio5 {

    
    public static void main(String[] args) {
        //Calculo da média com JOptionPane
        double n1, n2, media;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a primeira nota: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a segunda nota: "));
        
        media = (n1 + n2) / 2;
        
        JOptionPane.showMessageDialog(null, "A média foi: "+media);
    }
    
}
