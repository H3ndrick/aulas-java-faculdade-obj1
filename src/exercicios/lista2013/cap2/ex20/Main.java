package exercicios.lista2013.cap2.ex20;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("1984", 320, "Ficção distópica", "George Orwell");
        System.out.println();
        System.out.println(livro1.getPaginasLidas());
        
        livro1.lerPaginas(100);
        
        System.out.println(livro1.getPaginasLidas());
        
        livro1.lerPaginas(400);
        
        System.out.println(livro1.getPaginasLidas());
    }
}
