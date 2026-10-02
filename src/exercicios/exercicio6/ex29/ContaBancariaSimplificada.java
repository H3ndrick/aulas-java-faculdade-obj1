package exercicios.exercicio6.ex29;

public class ContaBancariaSimplificada {
    private String nomeDoCorrentista;
    private double saldo;
    private boolean contaEspecial;
    
    public ContaBancariaSimplificada(String nome, double deposito, boolean especial){
        this.setNomeDoCorrentista(nome);

        if(!(deposito >= 0)){
            throw new IllegalArgumentException("O depósito inicial não pode ser negativo");
        }

        if(deposito > 0){
            this.realizarDeposito(deposito);
        }

        this.setContaEspecial(especial);
    }
    
    public ContaBancariaSimplificada(String nome){
        this.setNomeDoCorrentista(nome);
        this.setSaldo(0);
        this.setContaEspecial(false);
    }
    
    public boolean realizarDeposito(double valor){
        if(!(valor > 0)){
            throw new IllegalArgumentException("O valor de depósito deve ser maior que 0");
        }
        
        this.setSaldo(this.getSaldo() + valor);
        return true;
    }
    
    public boolean realizarSaque(double valor){
        if(!(valor > 0)){
            throw new IllegalArgumentException("O valor de saque deve ser maior que 0");
        }
        
        if(!this.isContaEspecial()){
            if(valor <= this.getSaldo()){
                this.setSaldo(this.getSaldo() - valor);
                return true;
            }
            return false;
        } 
        
        this.setSaldo(this.getSaldo() - valor);
        return true;
    }
    
    public void mostraDados(){
        System.out.println("O nome do correntista é " + this.getNomeDoCorrentista());
        System.out.println("O saldo é: R$" + this.getSaldo());
        
        if(this.isContaEspecial()){
            System.out.println("A conta é especial");
        } else{
            System.out.println("A conta é comum"); 
        }
    }
    
    private void setNomeDoCorrentista(String nome){
        this.nomeDoCorrentista = nome;
    }
    
    public String getNomeDoCorrentista(){
        return this.nomeDoCorrentista;
    }
    
    private void setSaldo(double valor){
        this.saldo = valor;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    private void setContaEspecial(boolean isEspecial){
        this.contaEspecial = isEspecial;
    }
    
    public boolean isContaEspecial(){
        return this.contaEspecial;
    }
}