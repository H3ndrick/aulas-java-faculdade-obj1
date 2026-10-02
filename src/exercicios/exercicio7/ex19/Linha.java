package exercicios.exercicio7.ex19;

public class Linha {
    private Ponto2D ponto1;
    private Ponto2D ponto2;
    private double comprimento;
    
    public Linha(){
        this.setPonto1(new Ponto2D());
        this.setPonto2(new Ponto2D());
        this.calcularComprimento();
    }
    
    public Linha(Ponto2D ponto){
        if(ponto1 == null || ponto2 == null){
            throw new IllegalArgumentException("O ponto não pode ser null");
        }
        
        this.setPonto1(new Ponto2D());
        this.setPonto2(ponto);
        this.calcularComprimento();
    }
    
    public Linha(Ponto2D ponto1, Ponto2D ponto2){
        if(ponto1 == null || ponto2 == null){
            throw new IllegalArgumentException("Os pontos não podem ser null");
        }
        
        this.setPonto1(ponto1);
        this.setPonto2(ponto2);
        this.calcularComprimento();
    }
    
    public Linha(double x1, double y1, double x2, double y2){
        Ponto2D ponto1 = new Ponto2D(x1, y1);
        Ponto2D ponto2 = new Ponto2D(x2, y2);
        this.setPonto1(ponto1);
        this.setPonto2(ponto2);
        this.calcularComprimento();
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
