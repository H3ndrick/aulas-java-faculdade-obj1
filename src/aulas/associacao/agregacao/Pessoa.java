package aulas.associacao.agregacao;

public class Pessoa {
    
    private String nome;
    private Empresa localTrabalho;

    public Pessoa(String nome) {
        this(nome, null);
    }
    
    public Pessoa(String nome, Empresa localTrabalho) {
        setNome(nome);
        setLocalTrabalho(localTrabalho);
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

    public Empresa getLocalTrabalho() {
        return localTrabalho;
    }

    public void setLocalTrabalho(Empresa localTrabalho) {
        this.localTrabalho = localTrabalho;
    }
    
    public void mostarInfo() {
        
        if( getLocalTrabalho() != null ) {
            
            System.out.println( getNome() + " trabalha em " + getLocalTrabalho().getNome() );
            
        } else {
            System.out.println( getNome() + " se encontra desempregado(a).");
        }
        
    }

}