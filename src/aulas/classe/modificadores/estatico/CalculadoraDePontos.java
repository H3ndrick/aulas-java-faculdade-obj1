package aulas.classe.modificadores.estatico;

import aulas.classe.metodos.sobrecarga.Ponto;

public class CalculadoraDePontos {
    private static double memoriaDeCalculo;
    
    private CalculadoraDePontos() {}
    
    public static double getDistancia(Ponto a, Ponto b){
        double resultado = 0.0;
        
        resultado += Math.pow(a.getX() - b.getX(), 2.0);
        resultado += Math.pow(a.getY() - b.getY(), 2.0);
        resultado = Math.sqrt(resultado);
        
        setMemoriaDeCalculo(resultado);
        
        return resultado;
    }
    
    public static double getDistanciaDaOrigem(Ponto a){
//        return getDistancia(new Ponto(), a);
//        Ponto origem = new Ponto(0.0, 0.0);
        Ponto origem = new Ponto();
        
        return getDistancia(origem, a);
    }
    
    public static double getMemoriaDeCalculo(){
        return memoriaDeCalculo;
    }
    
    public static void setMemoriaDeCalculo(double memoriaDeCalculo){
        CalculadoraDePontos.memoriaDeCalculo = memoriaDeCalculo;
    }
}
