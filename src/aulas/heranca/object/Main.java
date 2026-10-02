package aulas.heranca.object;

public class Main {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(2.5, 5.75);
        System.out.println(p1);
        p1.setNome("Ponto A");
        System.out.println(p1);
        
        System.out.println(p1.toString());
        Object aux = p1;
        System.out.println(aux.toString());
    }
}
