package aulas.colecao.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import aulas.classe.metodos.sobrecarga.Ponto;

public class Exemplo1 {
    public static void main(String[] args) {
        
        // está implicito <Object>
        ArrayList l1 = new ArrayList();
        
        l1.add("IFSP");
        l1.add(new Ponto('x', 5.25));
        l1.add("Araraquara");
        l1.add(new Ponto(5.50, 9.25));
        l1.add(8.5);
        
        // Double é a classe empacotadora do tipo primitivo double
        ArrayList<Double> l2 = new ArrayList<>();
        double aux = 51.25;
        l2.add(aux);
        l2.add((double) 5);
        l2.add(9.75);
        
        System.out.println(l1);
        System.out.println(l2);
        
        Integer[] vetor = new Integer[5];
        vetor[2] = 8;
        
        System.out.println(vetor);
        
        List<Integer> l3 = Arrays.asList(vetor);
        System.out.println(l3);
        
        List<String> l4 = new ArrayList();
        l4.add("azul");
        l4.add("verde");
        l4.add("branco");
        l4.add("amarelo");
        l4.add("preto");
        
        System.out.println("#####");
        
        System.out.println(l4);
        System.out.println(l4.get(2));
        l4.add(2, "rosa");
        System.out.println(l4);
        System.out.println(l4.get(2));
        
        System.out.println("#####");
        
        for(int indice = 0; indice < l4.size(); indice++){
            System.out.println(l4.get(indice));
        }
        
        System.out.println("#####");
        
        System.out.println(l4.contains("verde"));
        System.out.println(l4.contains("vermelho"));
        System.out.println(l4.indexOf("verde"));
        System.out.println(l4.indexOf("vermelho"));
        System.out.println(l4);
        l4.remove("verde");
        System.out.println(l4);
        l4.remove(2);
        System.out.println(l4);
        l4.clear();
        System.out.println(l4);
        
        System.out.println("#####");
        
//        Integer n1;
//        int n2;
//        n2 = 5;
//        n1 = n2; // boxing
//        int n3;
//        n3 = n1; // unboxing
//        n1 = null;
    }
}
