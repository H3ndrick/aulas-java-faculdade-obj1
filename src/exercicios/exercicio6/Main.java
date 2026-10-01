package exercicios.exercicio6;

import exercicios.exercicio6.ex28.Contador;
import exercicios.exercicio6.ex28.Lampada;
import exercicios.exercicio6.ex34.NumeroComplexo;

public class Main {
    public static void main(String[] args) {
//        Lampada l1 = new Lampada(300);
//        
//        System.out.println(l1.isAcesa());
//        System.out.println(l1.getWatts());
//        System.out.println(l1.getVezesAcesa());
//        
//        l1.apertarInterruptor(); // acendeu
//        l1.apertarInterruptor(); // apagou
//        l1.apertarInterruptor(); // acendeu
//        l1.apertarInterruptor(); // apagou
//        l1.apertarInterruptor(); // acendeu
//        l1.apertarInterruptor(); // apagou
//        l1.apertarInterruptor(); // acendeu
//        l1.apertarInterruptor(); // apagou
//        l1.apertarInterruptor(); // acendeu
//        
//        System.out.println(l1.isAcesa());
//        System.out.println(l1.getWatts());
//        System.out.println(l1.getVezesAcesa());
        NumeroComplexo soma = new NumeroComplexo(3, 2);
        soma.soma(new NumeroComplexo(1, -1));
        soma.imprimeNumero(); // 4.0 + 1.0i

        NumeroComplexo subtracao = new NumeroComplexo(3, 2);
        subtracao.subTrai(new NumeroComplexo(1, 4));
        subtracao.imprimeNumero(); // 2.0 - 2.0i

        NumeroComplexo multiplicacao = new NumeroComplexo(3, 2);
        multiplicacao.multiplica(new NumeroComplexo(1, -1));
        multiplicacao.imprimeNumero(); // 5.0 - 1.0i

        NumeroComplexo divisao = new NumeroComplexo(4, 2);
        divisao.divide(new NumeroComplexo(1, 1));
        divisao.imprimeNumero(); // 3.0 - 1.0i

        NumeroComplexo a = new NumeroComplexo(3, 2);
        NumeroComplexo b = new NumeroComplexo(3, 2);
        System.out.println(a.eIgual(b)); // true
        
        NumeroComplexo a2 = new NumeroComplexo(3, 2);
        NumeroComplexo b2 = new NumeroComplexo(3, 1);
        System.out.println(a2.eIgual(b2)); // false
        
    }
}
