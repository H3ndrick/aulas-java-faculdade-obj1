package aulas.classe.basico;

public class Main {
    public static void main(String[] args) {
        Pessoa joao = null;
        System.out.println(joao);
        
        // criação de um objeto da classe Pessoa
        // a variável joao aponta para o objeto da classe Pessoa criado
        joao = new Pessoa('m', 1.65);
        System.out.println(joao);
        
        // variáveis de instância
        System.out.println(joao.sexo);
        System.out.println(joao.altura);
        System.out.println(joao.pesoIdeal);
        
        System.out.println("####");
        
        joao.sexo = 'm';
        joao.altura = 1.73;
        System.out.println(joao.pesoIdeal);
        joao.calcularPesoIdeal();
        System.out.println(joao.pesoIdeal);
        
        Pessoa maria = new Pessoa('f', 1.60);
        maria.calcularPesoIdeal();
        System.out.println(maria.pesoIdeal);
        
        System.out.println("####");
        
        // quebra de integridade do objeto da classe Pessoa
        joao.altura = -1000.51;
        System.out.println(joao.altura);
    }
}
