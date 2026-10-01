package aulas.associacao.agregacao;

public class Empresa {
    
    private String nome;

    public Empresa(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
     
        if( ( nome != null ) && ( nome.isEmpty() == false ) && ( nome.isBlank() == false ) ) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("nome inválido");
        }
            
    }

}