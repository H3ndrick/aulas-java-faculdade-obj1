package exercicios.exercicio6.ex26;

public class Ponto2D {
    private double eixoX;
    private double eixoY;
    
    public Ponto2D(double x, double y){
        this.setEixoX(x);
        this.setEixoY(y);
    }
    
    private void setEixoX(double x){
        this.eixoX = x;
    }
    
    public double getEixoX(){
        return this.eixoX;
    }
    
    private void setEixoY(double y){
        this.eixoY = y;
    }
    
    public double getEixoY(){
        return this.eixoY;
    }
}
