package aulas.classe.referencia;

public class NumeroInteiroPositivo {
    private int valor;
    
    // o construtor vazio está implícito (é criado pelo compilador java), criando e inicializando as variáveis de instancia (0 para tipos primitivos e null para tipos referência)
    
    public void setValor(int v){
        if(v >= 0){
            valor = v;
        } else{
            throw new IllegalArgumentException("v não pode ser < 0");
        }
    }
    
    public int getValor(){
        return valor;
    }
}
