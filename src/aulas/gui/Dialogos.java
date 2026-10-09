package aulas.gui;

import javax.swing.JOptionPane;

public class Dialogos {
    public static void main(String[] args) {
        String st1 = JOptionPane.showInputDialog("Informe um número inteiro:");
        System.out.println(st1);
        int n1 = Integer.parseInt(st1);
        
        String st2 = JOptionPane.showInputDialog("Informe um número decimal:");
        System.out.println(st2);
        double n2 = Double.parseDouble(st2);
        
        double resultado = n1 / n2;
        String mensagem = "A divisão de " + n1 + " por " + n2 + " é " + resultado + ".";
        System.out.println(mensagem);
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
