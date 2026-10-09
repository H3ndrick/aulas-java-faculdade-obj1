package aulas.heranca.janela;

import java.awt.HeadlessException;
import javax.swing.JFrame;

public class Janela extends JFrame {
    public Janela(){
        super("Titulo da janela A");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }
}
