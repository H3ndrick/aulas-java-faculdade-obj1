package aulas.classe.metodos.sobrecarga;

public class Ponto {
    private double x, y;
    private boolean xPositivo, yPositivo;
    
    public Ponto(char coordenada, double valor){
        if(coordenada == 'x') {
            setX(valor);
            setY();
        } else if(coordenada == 'y') {
            setX();
            setY(valor);
        } else {
            throw new IllegalArgumentException("coordenada inválida");
        }
    }
    
    public Ponto(){
        // setX(0.0);
        // setY(0.0);
        this(0.0, 0.0);
    }
    
    public Ponto(double x, double y){
        this.setX(x);
        this.setY(y);
    }
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
        
        if (this.x >= 0) {
            this.setxPositivo(true);
        } else {
            this.setxPositivo(false);
        }
    }
    
    public void setX(){
        setX(0.0);
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
        
        if (this.y >= 0) {
            this.setyPositivo(true);
        } else {
            this.setyPositivo(false);
        }
    }
    
    public void setY(){
        setY(0.0);
    }
    public boolean isxPositivo() {
        return xPositivo;
    }

    private void setxPositivo(boolean xPositivo) {
        this.xPositivo = xPositivo;
    }

    public boolean isyPositivo() {
        return yPositivo;
    }

    private void setyPositivo(boolean yPositivo) {
        this.yPositivo = yPositivo;
    }
}
