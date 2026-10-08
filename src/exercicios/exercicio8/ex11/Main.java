package exercicios.exercicio8.ex11;

public class Main {
    public static void main(String[] args) {
        double areaCampoMetrosQuadrados = 8250;
        double areaCampoPesQuadrados = ConversaoDeUnidadesDeArea.metrosQuadradosParaPesQuadrados(areaCampoMetrosQuadrados);
        double areaCampoAcres = ConversaoDeUnidadesDeArea.pesQuadradosParaAcres(areaCampoPesQuadrados);
        double areaCampoCmQuadrados = ConversaoDeUnidadesDeArea.pesQuadradosParaCmQuadrados(areaCampoPesQuadrados);
        
        System.out.println("Área do campo de futebol em metros²: " + areaCampoMetrosQuadrados);
        System.out.println("Área do campo de futebol em pés²: " + areaCampoPesQuadrados);
        System.out.println("Área do campo de futebol em acres: " + areaCampoAcres);
        System.out.println("Área do campo de futebol em centímetros²: " + areaCampoCmQuadrados);
    }
}
