package exercicios.exercicio8.ex10;

public class ConversaoDeUnidadesDeArea {
    
    private ConversaoDeUnidadesDeArea() {}
    
    public static double metrosQuadradosParaPesQuadrados(double metrosQuadrados){
        return metrosQuadrados * 10.76;
    }
    
    public static double pesQuadradosParaCmQuadrados(double pesQuadrados){
        return pesQuadrados * 929.0;
    }
    
    public static double milhasQuadradasParaAcres(double milhasQuadradas){
        return milhasQuadradas * 640.0;
    }
    
    public static double acresParaPesQuadrados(double acres){
        return acres * 43560.0;
    }
}
