package aulas.variavel.composta;

import java.util.Arrays;

public class UniD {
    public static void main(String[] args) {
        // int[] c = new int[5];
        final int TAM = 5;
        int[] c = new int[TAM];
        
        c[0] = -2;
        c[1] = 50;
        c[2] = 1962;
        c[3] = 1;
        c[4] = 21;
        
        int[] v = {-1, 51, 1963, 2, 23};
        
        System.out.println(c[0]);
        System.out.println(c[0] + 1);
        System.out.println(c[0] - 1);
        System.out.println(c[0] == 1);
        System.out.println(c.length);
        
        System.out.println("Índice \t Valor");
        for (int i = 0; i < c.length; i++) {
            System.out.println(i + " \t " + c[i] + "\n"); // obtenção do valor/consulta
            c[i] += -1; // alteração
        }
        System.out.println("\n");
        
        System.out.println("Índice \t Valor");
        for (int i = 0; i < c.length; i++) {
            System.out.println(i + " \t " + c[i] + "\n"); // obtenção do valor/consulta
            c[i] += +1; // alteração
        }
        
        System.out.println("\n");
        
//        System.out.println(c[5]); //ArrayIndexOutOfBoundsException
        
        OperadorArray.imprimirVetor(c);

        System.out.println("###############");
        
        System.out.println("Valor \n");
        for(int a : c) { // não é possível alterar os valores do vetor c
            System.out.println(a + " \n");
            a += 5;
        }
        
        System.out.println("\n");
        System.out.println("###############");
        
        System.out.println("Índice \t Valor");
        for (int i = 0; i < c.length; i++) {
            System.out.println(i + " \t " + c[i] + "\n"); // obtenção do valor/consulta
            c[i] += +1; // alteração
        }
        
        System.out.println("\n");
        
        System.out.println("\n");
        System.out.println("###############");
        
        OperadorArray.imprimirVetor(c);
        
        System.out.println(OperadorArray.compararVetor(c, v));
        
        v[4] = 22;
        
        System.out.println(OperadorArray.compararVetor(c, v));
        
        System.out.println("\n");
        System.out.println("###############");
        OperadorArray.imprimirVetor(v);
        Arrays.sort(v);
        
        System.out.println("###############");
        OperadorArray.imprimirVetor(v);
        
        System.out.println("###############");
        System.out.println(Arrays.binarySearch(v, 1984));
        System.out.println(Arrays.binarySearch(v, 1963));
        Arrays.fill(v, -1);
        OperadorArray.imprimirVetor(v);
        
        System.out.println("###############");
        
        int[] vetorInteiros = new int[3]; // é inicializado com 0
        
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.println(vetorInteiros[i]);
        }
        
        System.out.println("###############");
        Ponto[] vetorPontos = new Ponto[3]; // é inicializado com null
        
        for (int i = 0; i < vetorPontos.length; i++) {
            System.out.println(vetorPontos[i]);
        }
        
        vetorPontos[1] = new Ponto(5.25, 1.75);
        System.out.println(vetorPontos[1]);
        vetorPontos[1].setX(2.0);
        vetorPontos[1].setY(10.50);
        System.out.println(vetorPontos[1]);
        
        System.out.println(vetorPontos[0]);
        // vetorPontos[0].setX(2.0); // NullPointerException
        
        System.out.println("###############");
        
        Object[] vetorObjects = new Object[3];
        vetorObjects[0] = "IFSP";
        vetorObjects[1] = new Ponto(5.25, 1.75);
        
        for (int i = 0; i < vetorObjects.length; i++) {
            System.out.println(vetorObjects[i]);
        }
        
        System.out.println(vetorObjects[0].getClass());
        System.out.println(vetorObjects[1].getClass());
        
        System.out.println(vetorObjects[0] instanceof String);
        System.out.println(vetorObjects[1] instanceof String);
        
        System.out.println(vetorObjects[0] instanceof Ponto);
        System.out.println(vetorObjects[1] instanceof Ponto);
    }
}
