/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1exercicio6;

import javax.swing.JOptionPane;


public class Lista1Exercicio6 {

    public static void main(String[] args) {
        // Calculo da média ponderada
        
        double n1, n2, n3, mediaP;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 1ª nota: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 2ª nota: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 3ª nota: "));
        
        mediaP = (n1*2 + n2*3 + n3*5 )/10;
        
        JOptionPane.showMessageDialog(null, "A média Ponderada Foi: "+ mediaP);
    }
    
}
