package aulas.math;

public class Exemplo2 {
    public static void main(String[] args) {
        
        // tudo o que se encontra no pacote java.lang é importado de maneira implícita
        // a constante E e o método pow são static (estáticos, da classe, não demanda de objeto)
        System.out.println(Math.E);
        System.out.println(Math.pow(2.0, 3.0));
    }
}
