package aulas.variavel.composta;

public class MultiD {
    public static void main(String[] args) {
        int[][] matriz = new int[3][4];
        
        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[0].length; c++){
                System.out.print(matriz[l][c] + " \t ");
            }
            System.out.print("\n");
        }
        
        matriz[2][1] = 1351;
        System.out.println(matriz[2][1]);
        
        matriz[2][1] += 20;
        System.out.println(matriz[2][1]);
        
        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[0].length; c++){
                System.out.print(matriz[l][c] + " \t ");
            }
            System.out.print("\n");
        }
        
        System.out.println("###########");
        
        Ponto[][][] matrizPontos = new Ponto[4][6][3];
        
        matrizPontos[3][0][0] = new Ponto(9.25, 10);
        matrizPontos[2][5][1] = new Ponto(0.25, 10);
        
        for(int l = 0; l < matrizPontos.length; l++){
            for(int c = 0; c < matrizPontos[0].length; c++){
                for (int k = 0; k < matrizPontos[0][0].length; k++) {
                    if(matrizPontos[l][c][k] != null){
                        System.out.println(matrizPontos[l][c][k]);
                    }
                }
            }
        }
    }
}
