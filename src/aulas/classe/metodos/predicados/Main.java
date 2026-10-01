package aulas.classe.metodos.predicados;

public class Main {
    public static void main(String[] args) {
        Ponto pontoA = new Ponto(10.0, 100.0);
        
        System.out.println(pontoA.getX());
        System.out.println(pontoA.isxPositivo());
        
        System.out.println(pontoA.getY());
        System.out.println(pontoA.isyPositivo());
        
        pontoA.setX(-13.5);
        System.out.println(pontoA.isxPositivo());
        pontoA.setX(3.5);
        System.out.println(pontoA.isxPositivo());
    }
}
