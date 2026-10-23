package aulas.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JanelaA extends JFrame implements ActionListener{
    private JLabel jLabelID;
    private JTextField jTextFieldID;
    
    private JButton jButtonExcluir;
    private JButton jButtonSalvar;
    
    public JanelaA(){
        
        super("Título da Janela A");
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(960, 540);
        setResizable(false);
        
        setLayout(null);
        
        jLabelID = new JLabel("ID (número): ");
        jLabelID.setBounds(50, 50, 100, 25); // (eixo x, eixo y, h, w)
        add(jLabelID);
        
        jTextFieldID = new JTextField(25);
        jTextFieldID.setBounds(150, 50, 100, 25);
        add(jTextFieldID);
        
        jButtonExcluir = new JButton("Excluir");
        jButtonExcluir.setBounds(650, 450, 100, 25);
        jButtonExcluir.addActionListener(this);
        add(jButtonExcluir);
        
        jButtonSalvar = new JButton("Salvar");
        jButtonSalvar.setBounds(775, 450, 100, 25);
        jButtonSalvar.addActionListener(this);
        add(jButtonSalvar);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println(ae.getActionCommand());
        if(ae.getActionCommand().equals("Excluir")){
            jTextFieldID.setText("");
        } else{
            if(ae.getActionCommand().equals("Salvar")){
                String id = jTextFieldID.getText();
                System.out.println("ID informado: " + id);
                jTextFieldID.setText("");
            }
        }
    }
}
