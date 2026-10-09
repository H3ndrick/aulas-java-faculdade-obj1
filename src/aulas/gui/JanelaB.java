package aulas.gui;

import javax.swing.*;

public class JanelaB extends JFrame {
    
    private JMenuBar jMenuBarPrincipal;
    
    private JMenu jMenu1;
    private JMenu jMenu2;
    
    private JMenuItem jMenuItemJanelaA;
    
    private boolean atalhoJanelaA;
    
    public JanelaB(){
        super("Título da Janela B");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(960, 540);
        setResizable(false);
        
        setLayout(null);
        
        jMenuBarPrincipal = new JMenuBar();
        jMenuBarPrincipal.setBounds(0, 0, 960, 25);
        add(jMenuBarPrincipal);
        
        jMenu1 = new JMenu("Menu 1");
        jMenuBarPrincipal.add(jMenu1);
        
        jMenu2 = new JMenu("Menu 2");
        jMenuBarPrincipal.add(jMenu2);
        
        jMenuItemJanelaA = new JMenuItem("Janela A");
        jMenu1.add(jMenuItemJanelaA);
        
        setVisible(true);
    }
}
