package exercicios.lista2013.cap2.ex9;

public class MainEx9 {
    public static void main(String[] args) {
        LampadaEx9 lampada1 = new LampadaEx9(100);
        
        System.out.println(lampada1.getEstado());
        
        lampada1.apertarInterruptor();
        
        System.out.println(lampada1.getEstado());
        
        lampada1.apertarInterruptor();
        
        System.out.println(lampada1.getEstado());
        
        System.out.println("=============");
        
        System.out.println(lampada1.isEconomica());
    }
}
