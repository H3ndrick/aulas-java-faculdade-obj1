package exercicios.lista2013.cap2.ex19;

public class Ponto2DEx19 {
    private double eixoX;
    private double eixoY;
    
    public Ponto2DEx19(int x, int y){
        this.setEixoX(x);
        this.setEixoY(y);
    }
    
    private void setEixoX(int x){
        this.eixoX = x;
    }
    
    public double getEixoX(){
        return this.eixoX;
    }
    
    private void setEixoY(int y){
        this.eixoY = y;
    }
    
    public double getEixoY(){
        return this.eixoY;
    }
    
    
}
