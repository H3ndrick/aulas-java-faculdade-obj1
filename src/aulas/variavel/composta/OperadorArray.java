package aulas.variavel.composta;

public class OperadorArray {
    private OperadorArray() {}
    
    public static void imprimirVetor(int[] vetor){
        System.out.println("Índice \t Valor");
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(i + " \t " + vetor[i] + "\n"); 
        }
        
        System.out.println("\n");
    }
    
    public static boolean compararVetor(int[] vetorA, int[] vetorB){
        if(vetorA.length != vetorB.length){
            return false;
        }
        
        for (int i = 0; i < vetorA.length; i++) {
            if(vetorA[i] != vetorB[i]){
                return false;
            }
        }
        
        return true;
    }
}
