package aulas.classe.metodos.predicados;

public class Ponto {
    private double x, y;
    private boolean xPositivo, yPositivo;

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
