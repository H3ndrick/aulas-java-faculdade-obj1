package aulas.classe.autoreferencia;

public class Main {
    public static void main(String[] args) {
        Ponto pontoA = new Ponto();
        System.out.println("( " + pontoA.getX() + ", " + pontoA.getY() + " )");
        pontoA.setX(3.5);
        pontoA.setY(5.25);
        System.out.println("( " + pontoA.getX() + ", " + pontoA.getY() + " )");
    }
}
