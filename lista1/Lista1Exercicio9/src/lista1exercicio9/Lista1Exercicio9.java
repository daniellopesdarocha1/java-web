/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1exercicio9;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Lista1Exercicio9 {

    public static void main(String[] args) {
        // Média com situação aprovado/reprovado
        double n1, n2, media;
        String nome;
        String situacao;
        
        nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a primeira nota: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a segunda nota: "));
        
        media = (n1 + n2) / 2;
        
        if (media >= 6){
            situacao = "Aprovado";
        }else{
            situacao = "Reprovado";
        }
        
        JOptionPane.showMessageDialog(null, "Aluno: " +nome + "\nMédiai: " +media+ "\nSituação: " +situacao);
    }
    
}