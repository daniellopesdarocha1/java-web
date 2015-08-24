/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conta mc = new Conta();
        Conta oc = new Conta();
        
        int op;
        double valor;
        
        do{
            
            op = Integer.parseInt(JOptionPane.showInputDialog("Escolha a operação:\n1 - Saque"
                    + "\n2 - Depósito\n3 - Transferência\n4 - Saldo\n5 - Sair"));
            
            switch(op){
                
                case 1:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor: "));
                    mc.saca(valor);
                    if (mc.saca(valor)){//se retornar true faça
                        JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso.");
                    }else{
                        JOptionPane.showMessageDialog(null, "Saldo insulficiente.");
                    }
                    break;
                
                case 2:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor: "));
                    mc.deposita(valor);
                    JOptionPane.showMessageDialog(null, "Depósito efetuado com sucesso.");                     
                    break;
                
                case 3:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor: "));
                    mc.transfere(valor, oc);
                    if (mc.transfere(valor, oc)){
                        JOptionPane.showMessageDialog(null, "Valor Transferido com sucesso.");
                    }else{
                        JOptionPane.showMessageDialog(null, "Saldo indisponível para transferência.");
                    }
                    break;
     
                case 4:
                    JOptionPane.showMessageDialog(null, "Saldo: " + mc.getSaldo());
                    break;
                    
                case 5:
                    JOptionPane.showMessageDialog(null, "Sistema encerrado.");
                    op = 0;
                    break;
     
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida, tente novamente.");
            }
                
        }while(op != 0);
        
    }
    
}
