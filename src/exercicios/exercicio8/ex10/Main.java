package exercicios.exercicio8.ex10;

public class Main {
    public static void main(String[] args) {
        double metros = 2.5;
        double acres = 5.0;
        
        double pes = ConversaoDeUnidadesDeArea.metrosQuadradosParaPesQuadrados(metros);
        double pesDeAcres = ConversaoDeUnidadesDeArea.acresParaPesQuadrados(acres);
        
        System.out.println(metros + " m² equivalem a " + pes + " pés quadrados.");
        System.out.println(acres + " acres equivalem a " + pesDeAcres + " pés quadrados.");
        
        System.out.println("#########");
        
        System.out.println("1 metro quadrado = " + ConversaoDeUnidadesDeArea.metrosQuadradosParaPesQuadrados(1) + " pés quadrados");
        System.out.println("1 pé quadrado = " + ConversaoDeUnidadesDeArea.pesQuadradosParaCmQuadrados(1) + " centímetros quadrados");
        System.out.println("1 milha quadrada = " + ConversaoDeUnidadesDeArea.milhasQuadradasParaAcres(1) + " acres");
        System.out.println("1 acre = " + ConversaoDeUnidadesDeArea.acresParaPesQuadrados(1) + " pés quadrados");
    }
}
