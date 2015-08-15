/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1exercicio7;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Lista1Exercicio7 {


    public static void main(String[] args) {
        // Calculo do desconto sobre o salário
        
        double bruto, desconto, liquido;
        String nome;
        
        nome = JOptionPane.showInputDialog("Informe o nome do funcionário: ");
        bruto = Integer.parseInt(JOptionPane.showInputDialog("Informe o salário bruto: "));
        
        
        desconto = bruto * 0.11;
        liquido = bruto - desconto;
        
        JOptionPane.showMessageDialog(null, "Funcionário: " +nome+ 
                "\nSalário bruto: " +bruto+ "\nDesconto: " +desconto+"\nSalário liquido: " +liquido);
        
    }
    
}
