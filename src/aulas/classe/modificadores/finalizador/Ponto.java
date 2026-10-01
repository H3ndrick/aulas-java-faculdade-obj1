package aulas.classe.modificadores.finalizador;

public class Ponto {
    
    // não utilizado por não se ter o controle de quando será executado
    public void finalize(){
        System.out.println("Objeto Coletado pelo Coletor de Lixo da JVM");
    }
}
