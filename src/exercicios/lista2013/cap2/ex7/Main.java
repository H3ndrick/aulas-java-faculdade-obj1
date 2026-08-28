package exercicios.lista2013.cap2.ex7;

public class Main {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        
        System.out.println(lampada1.getEstado());
        
        lampada1.apertarInterruptor();
        
        System.out.println(lampada1.getEstado());
        
        lampada1.apertarInterruptor();
        
        System.out.println(lampada1.getEstado());
    }
}
