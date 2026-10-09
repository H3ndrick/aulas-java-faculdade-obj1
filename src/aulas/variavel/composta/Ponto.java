package aulas.variavel.composta;

public class Ponto {
    private double x;
    private double y;
    
    public Ponto(double x, double y){
        setX(x);
        setY(y);
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }

    @Override
    public String toString() {
        return "Ponto{" + "x=" + x + ", y=" + y + '}';
    }
}
