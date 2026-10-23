package aulas.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class JanelaB extends JFrame implements ActionListener, KeyListener {
    
    private JMenuBar jMenuBarPrincipal;
    
    private JMenu jMenu1;
    private JMenu jMenu2;
    
    private JMenuItem jMenuItemJanelaA;
    private JMenuItem jMenuItemJanelaB;
    
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
        jMenuItemJanelaA.addActionListener(this);
        jMenu1.add(jMenuItemJanelaA);
        
        jMenuItemJanelaB = new JMenuItem("Janela B");
        jMenuItemJanelaB.addActionListener(this);
        jMenu1.add(jMenuItemJanelaB);
        
        addKeyListener(this);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println(ae.getActionCommand());
        if(ae.getActionCommand().equals("Janela A")){
            
            JanelaA janA = new JanelaA();
            
        }
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        System.out.println(ke.getKeyCode());
    }
    
}
