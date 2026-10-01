package exercicios.lista2013.cap2.ex7;

public class MainEx7 {
    public static void main(String[] args) {
        LampadaEx7 lampada1 = new LampadaEx7();
        
        System.out.println(lampada1.getEstado());
        
        lampada1.apertarInterruptor();
        
        System.out.println(lampada1.getEstado());
        
        lampada1.apertarInterruptor();
        
        System.out.println(lampada1.getEstado());
    }
}
