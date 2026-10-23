package exercicios.exercicio11.ex2;

public class Main {
    public static void main(String[] args) {
        Mesa mesa = new Mesa(5, 3);
        mesa.adicionarPedido(50.0);
        mesa.adicionarPedido(30.0);
        mesa.fecharConta();
    }
}
