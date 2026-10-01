package exercicios.lista2013.cap2.ex23;

public class ContadorEx23 {
    private int contagem;
    
    public ContadorEx23(){
        this.setContagem(0);
    }
    
    private void setContagem(int contagem){
        if(contagem >= 0){
            this.contagem = contagem;
        } else{
            throw new IllegalArgumentException("contagem deve ser maior ou igual 0");
        }
    }
    
    private int getContagem(){
        return this.contagem;
    }
    
    public void zerarContador(){
        this.setContagem(0);
    }
    
    public void incrementarContador(){
        this.contagem++;
    }
    
    public void imprimirContador(){
        System.out.println("Valor do contador atual: " + this.getContagem());
    }
}
