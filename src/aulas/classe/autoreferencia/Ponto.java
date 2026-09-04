package aulas.classe.autoreferencia;

public class Ponto {
    private double x;
    private double y;
    
    public void setX(double x){ // x sombrea o atributo (variável de instância) x
        this.x = x;
    }
    
    public double getX(){
        return x; // this.x está implícito
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public double getY(){
        return this.y;
    }
}
