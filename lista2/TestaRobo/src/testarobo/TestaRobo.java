/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarobo;
import javax.swing.JOptionPane;
/**
 * @author Daniel
 */
public class TestaRobo {

    public static void main(String[] args) {
        
        int op;
        float n1, n2;
        
        Robo r = new Robo();
        r.setNome("RoboDlr");
        r.setDataFabricacao("23/08/2015");
         
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Nível da Bateria: " + r.getBateria()
                    + "\nEscolha uma opção: "
                + "\n1 - Somar \n2 - Subtrair \n3 - Multiplicar \n4 - Dividir \n5 - Informações \n6 - Sair"));
            switch (op){
                case 1:
                    n1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o 1º número: "));
                    n2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o 2º número: "));
                    
                    JOptionPane.showMessageDialog(null, "Soma: " + r.somar(n1, n2));
                    
                    if(r.testarBateria()){
                        JOptionPane.showMessageDialog(null, "Bateria esgotada, desligando...");
                        op = 0;
                    }
                    break;
                case 2:
                    n1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o 1º número: "));
                    n2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o 2º número: "));
                    
                    JOptionPane.showMessageDialog(null, "Subtração: " + r.subtrair(n1, n2));
                    
                    if(r.testarBateria()){
                        JOptionPane.showMessageDialog(null, "Bateria esgotada, desligando...");
                        op = 0;
                    }
                    break;
                case 3:
                    n1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o 1º número: "));
                    n2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o 2º número: "));
                    
                    JOptionPane.showMessageDialog(null, "Multiplicar: " + r.multiplicar(n1, n2));
                    
                    if(r.testarBateria()){
                        JOptionPane.showMessageDialog(null, "Bateria esgotada, desligando...");
                        op = 0;
                    }
                    break;
                case 4:
                    n1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o 1º número: "));
                    n2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o 2º número: "));
                    
                    JOptionPane.showMessageDialog(null, "Divisão: " + r.dividir(n1, n2));
                    
                    if(r.testarBateria()){
                        JOptionPane.showMessageDialog(null, "Bateria esgotada, desligando...");
                        op = 0;
                    }
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Nome do Robô: " + r.getNome() + ""
                            + "\nData de Fabricação: " + r.getDataFabricacao() + "\nNível da Bateria: " + r.getBateria());
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Desligando...");
                    op = 0;
                    break;
                default: 
                    JOptionPane.showMessageDialog(null, "Valor inválido, \ntente novamente.");
            }
        } while (op != 0);
    }
    
}
