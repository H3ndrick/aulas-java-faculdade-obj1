package exercicios.exercicio10.ex19;

public class LivroLivraria extends Livro{
    private double preco;
    private String isbn;
    private int estoque;
    
    public LivroLivraria(String titulo, int paginas, String generoLiterario, String autor, double preco, String isbn, int estoque){
        super(titulo, paginas, generoLiterario, autor);
        
        setPreco(preco);
        setIsbn(isbn);
        setEstoque(estoque);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0){
            throw new IllegalArgumentException("preco não pode ser negativo");
        }
        
        this.preco = preco;
    }

    public String getIsbn() {
        return isbn;
    }

    private void setIsbn(String isbn) {
        if (isbn == null || isbn.isBlank()){
            throw new IllegalArgumentException("isbn não pode ser vazio");
        }
        
        this.isbn = isbn;
    }

    public int getEstoque() {
        return estoque;
    }

    private void setEstoque(int estoque) {
        if (estoque < 0){
            throw new IllegalArgumentException("estoque não pode ser negativo");
        }
        
        this.estoque = estoque;
    }
    
    public void vender(int quantidade){
        if(quantidade <= 0){
            throw new IllegalArgumentException("quantidade deve ser maior que 0");
        }
        
        if(quantidade > getEstoque()){
            throw new IllegalStateException("Estoque insuficiente");
        }
        
        setEstoque(getEstoque() - quantidade);
    }
    
    public void reporEstoque(int quantidade){
        if(quantidade <= 0){
            throw new IllegalArgumentException("quantidade deve ser maior que 0");
        }
        
        setEstoque(getEstoque() + quantidade);
    }
}
