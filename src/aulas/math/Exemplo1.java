package aulas.math;

//import java.lang.Math; // importa a classe específica Math no pacote java.lang (disponível no JDK Java)
import java.lang.*; // importa todas as classses do pacote java.lang
import aulas.classe.basico.Pessoa;

public class Exemplo1 {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.pow(2.0, 3.0));
        System.out.println(Math.pow(25, 1.0/2.0));
        System.out.println(Math.pow(25, 0.5));
        System.out.println(Math.sqrt(25.0));
        
        //Pessoa joao; // precisa do import de Pessoa
        aulas.classe.basico.Pessoa joao; // não precisa do import de Pessoa (import qualificado)
        aulas.basico.Pessoa mario; // não precisa do import de Pessoa (import qualificado)
    }
}
