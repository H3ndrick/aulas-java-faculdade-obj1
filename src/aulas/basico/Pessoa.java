package aulas.basico;

public class Pessoa {
    //atributos / características / ??
    char sexo;
    double altura;
    double pesoIdeal;
    
    // o construtor padrão da classe Pessoa. Se não houver, o compilador cria automáticamente
    // cria e inicializa as variáveis de instância com o valor padrão (o valor padrão para tipo primitivo é 0)
    /*Pessoa(){
        
    }*/
    
    Pessoa(char sexo, double altura){
        this.sexo = sexo;
        this.altura = altura;
        this.calcularPesoIdeal();
    }
    
    //operações / ações / verbos
    void calcularPesoIdeal(){
        if (sexo == 'm'){
            this.pesoIdeal = (altura * 72.7) - 58.0;
        }else{
            this.pesoIdeal = (altura * 62.1) - 44.7;
        }
    }
}
