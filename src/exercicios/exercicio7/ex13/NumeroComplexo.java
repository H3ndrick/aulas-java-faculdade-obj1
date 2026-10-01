package exercicios.exercicio7.ex13;

public class NumeroComplexo {
    private double real;
    private double imaginario;
    
    public NumeroComplexo(double real, double imaginario){
        inicializaNumero(real, imaginario);
    }
    
    public NumeroComplexo(double real){
        inicializaNumero(real, 0);
    }
    
    public NumeroComplexo(){
        inicializaNumero(0, 0);
    }
    
    private void inicializaNumero(double real, double imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }
    
    public void imprimeNumero(){
        if(imaginario >= 0) {
            System.out.println(real + " + " + imaginario + "i");
        } else {
            
            System.out.println(real + " - " + Math.abs(imaginario) + "i");
        }
    }
    
    public boolean eIgual(NumeroComplexo numComplexo){
        if(numComplexo == null){
            throw new IllegalArgumentException("O número complexo não pode ser null");
        }
        
        return (getParteReal() == numComplexo.getParteReal() && getParteImaginaria() == numComplexo.getParteImaginaria());
    }
    
    public void soma(NumeroComplexo numComplexo){
        if(numComplexo == null){
            throw new IllegalArgumentException("O número complexo não pode ser null");
        }
        
        this.real += numComplexo.getParteReal();
        this.imaginario += numComplexo.getParteImaginaria();
    }
    
    public void subTrai(NumeroComplexo numComplexo){
        if(numComplexo == null){
            throw new IllegalArgumentException("O número complexo não pode ser null");
        }
        
        this.real -= numComplexo.getParteReal();
        this.imaginario -= numComplexo.getParteImaginaria();
    }
    
    public void multiplica(NumeroComplexo numComplexo){
        if(numComplexo == null){
            throw new IllegalArgumentException("O número complexo não pode ser null");
        }
        
        double c = numComplexo.getParteReal();
        double d = numComplexo.getParteImaginaria();
        
        double a = this.getParteReal();
        double b = this.getParteImaginaria();
        
        double valorReal = (a * c) - (b * d);
        double valorImaginario = (a * d) + (b * c);
        
        this.real = valorReal;
        this.imaginario = valorImaginario;
    }
    
    public void divide(NumeroComplexo numComplexo){
        if(numComplexo == null){
            throw new IllegalArgumentException("O número complexo não pode ser null");
        }
        
        double c = numComplexo.getParteReal();
        double d = numComplexo.getParteImaginaria();

        if(c == 0 && d == 0){
            throw new IllegalArgumentException("Não é possível dividir por zero");
        }

        double a = this.getParteReal();
        double b = this.getParteImaginaria();
        double denominador = c * c + d * d;

        double valorReal = (a * c + b * d) / denominador;
        double valorImaginario = (b * c - a * d) / denominador;

        this.real = valorReal;
        this.imaginario = valorImaginario;
    }
    
    public double getParteReal(){
        return real;
    }
    
    public double getParteImaginaria(){
        return imaginario;
    }
}
