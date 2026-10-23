package exercicios.exercicio11.ex2;

public class Mesa {
    private int numeroMesa;
    private int numeroPessoas;
    private int numeroPedidos;
    private double consumacao;
    
    public Mesa(int numeroMesa, int numeroPessoas){
        setNumeroMesa(numeroMesa);
        setNumeroPessoas(numeroPessoas);
    }
    
    public void adicionarPedido(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("valor do pedido deve ser positivo");
        }
        
        setNumeroPedidos(getNumeroPedidos() + 1);
        setConsumacao(getConsumacao() + valor);
    }
    
    public void fecharConta(){
        System.out.println("===== Conta da Mesa =====");
        System.out.println("Numero da mesa: " + numeroMesa);
        System.out.println("Quantidade de pedidos: " + numeroPedidos);
        System.out.println("Quantidade de pessoas: " + numeroPessoas);
        System.out.printf("Valor por pessoa: %.2f\n", ((consumacao * 1.10) / numeroPessoas));
        System.out.printf("Total da conta: %.2f\n", (consumacao * 1.10));
        
        setNumeroPedidos(0);
        setConsumacao(0);
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        if(numeroMesa < 1){
            throw new IllegalArgumentException("numeroMesa não deve ser menor que 1");
        }
        
        this.numeroMesa = numeroMesa;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        if(numeroPessoas < 1 || numeroPessoas > 4){
            throw new IllegalArgumentException("numeroPessoas deve estar entre 1 e 4");
        }
        
        this.numeroPessoas = numeroPessoas;
    }

    public int getNumeroPedidos() {
        return numeroPedidos;
    }

    public void setNumeroPedidos(int numeroPedidos) {
        if(numeroPedidos < 0){
            throw new IllegalArgumentException("numeroPedidos não deve ser menor que 0");
        }
        
        this.numeroPedidos = numeroPedidos;
    }

    public double getConsumacao() {
        return consumacao;
    }

    public void setConsumacao(double consumacao) {
        if(consumacao < 0){
            throw new IllegalArgumentException("consumacao não deve ser negativa");
        }
        
        this.consumacao = consumacao;
    }
}
