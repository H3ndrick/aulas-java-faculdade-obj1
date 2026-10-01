package exercicios.exercicio6.ex26;

public class Linha2D {
    private Ponto2D ponto1;
    private Ponto2D ponto2;
    private double comprimento;
    
    public Linha2D(double x1, double y1, double x2, double y2){
        Ponto2D ponto1 = new Ponto2D(x1, y1);
        Ponto2D ponto2 = new Ponto2D(x2, y2);
        this.validarPontos(ponto1, ponto2);
        this.setPonto1(ponto1);
        this.setPonto2(ponto2);
        this.calcularComprimento();
    }
    
    private void validarPontos(Ponto2D ponto1, Ponto2D ponto2){
        if(ponto1.getEixoX() == ponto2.getEixoX()  && ponto1.getEixoY() == ponto2.getEixoY()){
            throw new IllegalArgumentException("Os pontos devem ser diferentes");
        }
    }
    
    private void calcularComprimento(){
        double dx = this.ponto2.getEixoX() - this.ponto1.getEixoX();
        double dy = this.ponto2.getEixoY() - this.ponto1.getEixoY();
        this.comprimento = Math.sqrt((dx * dx) + (dy * dy));
    }
    
    public double getComprimento(){
        return comprimento;
    }
    
    public Ponto2D getPonto1(){
        return ponto1;
    }
    
    private void setPonto1(Ponto2D ponto){
        ponto1 = ponto;
    }
    
    public Ponto2D getPonto2(){
        return ponto2;
    }
    
    private void setPonto2(Ponto2D ponto){
        ponto2 = ponto;
    }
}
