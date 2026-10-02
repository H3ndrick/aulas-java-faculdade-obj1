package aulas.heranca.object;

// ponto "é um" Object
public class Ponto extends Object{
//public class Ponto { // esta implicito extends object {
    private double x, y;
    
    // Ponto "tem um" String - Associação por Composição
    private String nome;
    
    public Ponto(){
        this(0.0, 0); // promoção de 0 para 0.0
    }
    
    public Ponto(double x, double y){
        setX(x);
        setY(y);
    }
    
    public Ponto(double x, double y, String nome){
        setX(x);
        setY(y);
        setNome(nome);
    }
    
    public double getX(){
        return x;
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public double getY(){
        return y;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        String resultado = "";
        
        resultado += super.toString() + "\n";
        
        if(getNome() == null){
            resultado += "( " + getX() + ", " + getY() + ")";
        } else{
            resultado += getNome() + " ( " + getX() + ", " + getY() + " )";
        }
        
        return resultado;
    }
}
