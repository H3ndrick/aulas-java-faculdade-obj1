package exercicios.exercicio11.ex3;

public class Main {
    public static void main(String[] args) {
        Restaurante r = new Restaurante("Cantina", "Rua A, 123", "12.345.678/0001-90", "11999999999");
        r.acomodarPessoas(1, 3);
        r.adicionarPedido(1, 50.0);
        r.fecharConta(1);

        r.acomodarPessoas(1, 2);
        r.adicionarPedido(1, 20.0);
        
        r.acomodarPessoas(3, 2);
        r.adicionarPedido(3, 300);
        
        r.fecharConta(1);
        r.fecharConta(3);
    }
}
