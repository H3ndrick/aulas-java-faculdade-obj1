package exercicios.exercicio7.ex4;

public class Contador {
    private int contagem;
    
    public Contador() {
        this.setContagem(0);
    }
    
    public Contador(int inicio) {
        this.setContagem(inicio);
    }
    
    private void setContagem(int contagem) {
        if(contagem < 0){
            throw new IllegalArgumentException("contagem deve ser maior ou igual 0");
        }
        
        this.contagem = contagem;
    }
    
    public int getContagem() {
        return this.contagem;
    }
    
    public void zerarContador() {
        this.setContagem(0);
    }
    
    public void incrementarContador() {
        this.contagem++;
    }
    
    public void imprimirContador() {
        System.out.println("Valor do contador atual: " + this.getContagem());
    }
}
