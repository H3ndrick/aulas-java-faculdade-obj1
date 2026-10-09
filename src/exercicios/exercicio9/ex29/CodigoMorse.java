package exercicios.exercicio9.ex29;

public class CodigoMorse {
    private static final String SIMBOLOS_VALIDOS = "abcdefghijklmnopqrstuvwxyz.,";
    private static final String[] CODIGOS = {
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
        ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
        "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
        ".-.-.-", "--..--"
    };
    
    private CodigoMorse(){}
    
    public static String codificar(String texto){
        if (texto == null){
            throw new IllegalArgumentException("texto não pode ser null");
        }
        
        String res = "";
        
        for (int i = 0; i < texto.length(); i++) {
            char letraAtual = Character.toLowerCase(texto.charAt(i));
            
            int posicao = SIMBOLOS_VALIDOS.indexOf(letraAtual);
            
            if(posicao != -1){
                res += CODIGOS[posicao] + " ";
            }
        }
        
        return res;
    }
    
    public static String decodificar(String morse){
        if (morse == null){
            throw new IllegalArgumentException("morse não pode ser null");
        }
        
        String res = "";
        
        String[] partesMorse = morse.split(" ");
        
        for (int i = 0; i < partesMorse.length; i++) {
            if (partesMorse[i].isEmpty()){
                continue;
            }
            
            char letraAtual = '?';
            
            for (int j = 0; j < CODIGOS.length; j++) {
                if(CODIGOS[j].equals(partesMorse[i])){
                    letraAtual = SIMBOLOS_VALIDOS.charAt(j);
                    break;
                }
            }
            
            res += letraAtual;
        }
        
        return res;
    }
    
}
