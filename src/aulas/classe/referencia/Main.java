package aulas.classe.referencia;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int a, b;
        a = 13;
        b = a;
        
        System.out.println(a + " -- " + b);
        
        b = 5;
        
        System.out.println(a + " -- " + b);
        System.out.println("###");
        
        NumeroInteiroPositivo numA, numB;
        
        numA = new NumeroInteiroPositivo();
        numA.setValor(13);
        
        numB = numA; // para tipos referência, pode se ter duas ou mais variáveis apontando para o mesmo objeto.
        
        System.out.println(numA == numB);
        
        System.out.println(numA.getValor() + " -- " + numB.getValor());
        
        numB.setValor(5);
        
        System.out.println(numA.getValor() + " -- " + numB.getValor());
        
        //a referência para o objeto criado na linha 20 é perdida, nenhuma variável aponta (tem acesso) para o mesmo e portanto este será destruido
        numA = new NumeroInteiroPositivo();
        numA.setValor(23);
        
        numB = new NumeroInteiroPositivo();
        numB.setValor(32);
        
        System.out.println(numA.getValor() + " -- " + numB.getValor());
        
        
        Operador op = new Operador();
        
        System.out.println(a + " " + numA.getValor());
        
        op.zerarInt(a); // passagem como valor (cópia)
        op.zerarNumeroInteiroPositivo(numA); // passagem como referência
        
        System.out.println(a + " " + numA.getValor());
    }
}