package aulas.polimorfismo.abstract_;


public class Comissionado extends Empregado{
    private double vendas;
    private double taxa; // 0.0 a 100.0
    
    public Comissionado(String nome, String cpf){
        super(nome, cpf);
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        if(vendas > 0){
           this.vendas = vendas; 
        } else{
            throw new IllegalArgumentException("Vendas não pode ser menor que 0");
        }
        
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        if(taxa > 0){
           this.taxa = taxa; 
        } else{
            throw new IllegalArgumentException("Taxa não pode ser menor que 0");
        }
    }
    
    @Override
    public double proventoSemanal(){
        return getVendas() * getTaxa() / 100.0;
    }
}