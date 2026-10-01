package aulas.classe.modificadores.estatico;

import aulas.classe.metodos.sobrecarga.Ponto;

public class Main {
    public static void main(String[] args) {
        Ponto origem = new Ponto();
        Ponto pontoA = new Ponto('x', 6.0);
        Ponto pontoB = new Ponto('y', 75.0);
        Ponto pontoC = new Ponto(6.0, 75.0);
        
        System.out.println("( " + origem.getX() + ", " + origem.getY() + " )");
        System.out.println("( " + pontoA.getX() + ", " + pontoA.getY() + " )");
        System.out.println("( " + pontoB.getX() + ", " + pontoB.getY() + " )");
        System.out.println("( " + pontoC.getX() + ", " + pontoC.getY() + " )");
        
        System.out.println(CalculadoraDePontos.getDistancia(pontoA, pontoB));
        System.out.println(CalculadoraDePontos.getDistancia(origem, pontoA));
        System.out.println(CalculadoraDePontos.getDistancia(pontoA, pontoB));
        System.out.println(CalculadoraDePontos.getMemoriaDeCalculo());
        
        System.out.println(CalculadoraDePontos.getDistanciaDaOrigem(pontoA));
    }
}