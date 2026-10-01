package exercicios.exercicio6.ex27;

public class Retangulo {
    private Ponto2D ponto1;
    private Ponto2D ponto2;
    private double largura;
    private double altura;
    private double area;
    private double perimetro;
    
    public Retangulo(double x1, double y1, double x2, double y2){
        Ponto2D ponto1 = new Ponto2D(x1, y1);
        Ponto2D ponto2 = new Ponto2D(x2, y2);
        
        validarPontos(ponto1, ponto2);
        setPonto1(ponto1);
        setPonto2(ponto2);
        calcularLargura();
        calcularAltura();
        calcularArea();
        calcularPerimetro();
    }
    
    private void validarPontos(Ponto2D ponto1, Ponto2D ponto2){
        if(ponto1.getEixoX() == ponto2.getEixoX()  || ponto1.getEixoY() == ponto2.getEixoY()){
            throw new IllegalArgumentException("O retangulo precisa ter altura e largura maiores que 0");
        }
    }
    
    private void setPonto1(Ponto2D ponto){
        ponto1 = ponto;
    }
    
    public Ponto2D getPonto1(){
        return ponto1;
    }
    
    private void setPonto2(Ponto2D ponto){
        ponto2 = ponto;
    }
    
    public Ponto2D getPonto2(){
        return ponto2;
    }
    
    private void calcularLargura(){
        largura = Math.abs(ponto2.getEixoX() - ponto1.getEixoX());
    }
    
    public double getLargura(){
        return largura;
    }
    
    private void calcularAltura(){
        altura = Math.abs(ponto2.getEixoY() - ponto1.getEixoY());
    }
    
    public double getAltura(){
        return altura;
    }
    
    private void calcularArea(){
        area = getLargura() * getAltura();
    }
    
    public double getArea(){
        return area;
    }
    
    private void calcularPerimetro(){
        perimetro = 2 * (getAltura() + getLargura());
    }
    
    public double getPerimetro(){
        return perimetro;
    }
}
