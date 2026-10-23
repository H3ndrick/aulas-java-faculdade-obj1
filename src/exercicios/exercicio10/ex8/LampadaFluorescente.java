package exercicios.exercicio10.ex8;

public class LampadaFluorescente extends Lampada {
    private double comprimento;
    
    public LampadaFluorescente(double comprimento){
        super();
        setComprimento(comprimento);
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        if (comprimento <= 0) {
            throw new IllegalArgumentException("comprimento deve ser positivo");
        }
        
        this.comprimento = comprimento;
    }
}
