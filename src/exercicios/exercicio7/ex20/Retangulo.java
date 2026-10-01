package exercicios.exercicio7.ex20;

public class Retangulo {
    private Ponto2D ponto1;
    private Ponto2D ponto2;
    private double largura;
    private double altura;
    private double area;
    private double perimetro;
    
    public Retangulo(){
        setPonto1(new Ponto2D(0, 0));
        setPonto2(new Ponto2D(0, 0));
        calcularLargura();
        calcularAltura();
        calcularArea();
        calcularPerimetro();
    }
    
    public Retangulo(Ponto2D ponto){
        setPonto1(new Ponto2D(0, 0));
        setPonto2(ponto);
        calcularLargura();
        calcularAltura();
        calcularArea();
        calcularPerimetro();
    }
    
    public Retangulo(Ponto2D ponto1, Ponto2D ponto2){
        setPonto1(ponto1);
        setPonto2(ponto2);
        calcularLargura();
        calcularAltura();
        calcularArea();
        calcularPerimetro();
    }
    
    public Retangulo(double x1, double y1, double x2, double y2){
        Ponto2D ponto1 = new Ponto2D(x1, y1);
        Ponto2D ponto2 = new Ponto2D(x2, y2);
        
        setPonto1(ponto1);
        setPonto2(ponto2);
        calcularLargura();
        calcularAltura();
        calcularArea();
        calcularPerimetro();
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