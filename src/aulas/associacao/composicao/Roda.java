package aulas.associacao.composicao;

public class Roda {
    
    private boolean girando;

    public Roda(boolean girando) {
        setGirando(girando);
    }
    
    public boolean isGirando() {
        return girando;
    }

    public void setGirando(boolean girando) {
        this.girando = girando;
    }
    
}