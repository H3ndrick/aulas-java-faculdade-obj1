package exercicios.lista2013.cap2.ex20;

public class Livro {
    private String titulo;
    private int paginas;
    private String generoLiterario;
    private String autor;
    private int paginasLidas;
    
    
    public Livro(String titulo, int paginas, String generoLiterario, String autor){
        this.setTitulo(titulo);
        this.setPaginas(paginas);
        this.setGeneroLiterario(generoLiterario);
        this.setAutor(autor);
        this.setPaginasLidas(0);
    }
    
    public void lerPaginas(int qntPaginas){
        int totalPaginasLidas = this.getPaginasLidas() + qntPaginas;
        
        if(totalPaginasLidas > this.getPaginas()){
            totalPaginasLidas = this.getPaginas();
        }
        
        this.setPaginasLidas(totalPaginasLidas);
    }
    
    public String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    private void setPaginas(int paginas) {
        if(paginas > 0){
            this.paginas = paginas;
        } else{
            throw new IllegalArgumentException("paginas deve ser maior do que 0");
        }
    }

    public String getGeneroLiterario() {
        return generoLiterario;
    }

    private void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    public String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }
    
    private void setPaginasLidas(int paginasLidas){
        this.paginasLidas = paginasLidas;
    }
    
    public int getPaginasLidas(){
        return this.paginasLidas;
    }
}
