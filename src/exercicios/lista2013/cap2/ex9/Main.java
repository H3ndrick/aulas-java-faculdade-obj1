package exercicios.lista2013.cap2.ex9;

public class Main {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada(100);
        
        System.out.println(lampada1.getEstado());
        
        lampada1.apertarInterruptor();
        
        System.out.println(lampada1.getEstado());
        
        lampada1.apertarInterruptor();
        
        System.out.println(lampada1.getEstado());
        
        System.out.println("=============");
        
        System.out.println(lampada1.isEconomica());
    }
}
