package exercicios.exercicio10.ex19;

public class LivroBiblioteca extends Livro{
    private String codigoCatalogacao;
    private boolean disponivel;
    
    public LivroBiblioteca(String titulo, int paginas, String generoLiterario, String autor, String codigoCatalogacao){
        super(titulo, paginas, generoLiterario, autor);
        
        setCodigoCatalogacao(codigoCatalogacao);
        setDisponivel(true);
    }
    
    public void emprestar(){
        if(!isDisponivel()){
            throw new IllegalStateException("Livro já está emprestado");
        }
        
        setDisponivel(false);
    }
    
    public void devolver(){
        setDisponivel(true);
    }

    public String getCodigoCatalogacao() {
        return codigoCatalogacao;
    }

    private void setCodigoCatalogacao(String codigoCatalogacao) {
        if (codigoCatalogacao == null || codigoCatalogacao.isBlank()){
            throw new IllegalArgumentException("codigoCatalogacao não pode ser vazio");
        }
        
        this.codigoCatalogacao = codigoCatalogacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    private void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
