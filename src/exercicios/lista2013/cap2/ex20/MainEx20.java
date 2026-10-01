package exercicios.lista2013.cap2.ex20;

public class MainEx20 {
    public static void main(String[] args) {
        LivroEx20 livro1 = new LivroEx20("1984", 320, "Ficcao distopica", "George Orwell");
        System.out.println();
        System.out.println(livro1.getPaginasLidas());
        
        livro1.lerPaginas(100);
        
        System.out.println(livro1.getPaginasLidas());
        
        livro1.lerPaginas(120);
        
        System.out.println(livro1.getPaginasLidas());
        
        System.out.println(livro1.getAutor());
        System.out.println(livro1.getGeneroLiterario());
        System.out.println(livro1.getPaginas());
        System.out.println(livro1.getTitulo());
    }
}
