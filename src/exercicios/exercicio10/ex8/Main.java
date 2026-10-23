package exercicios.exercicio10.ex8;

public class Main {
    public static void main(String[] args) {
        LampadaFluorescente fluorescente = new LampadaFluorescente(60.0);
        
        System.out.println(fluorescente.getEstado());
        fluorescente.apertarInterruptor();
        System.out.println(fluorescente.getComprimento());
        System.out.println(fluorescente.getEstado());
    }
}
