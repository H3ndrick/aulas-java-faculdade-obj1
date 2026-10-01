package aulas.associacao;

import aulas.associacao.agregacao.Empresa;
import aulas.associacao.agregacao.Pessoa;
import aulas.associacao.composicao.Carro;
import aulas.associacao.composicao.Roda;

public class Main {
    public static void main(String[] args) {
        Carro maverick = new Carro(1975, "Maverick GT Fase I");
        maverick.mostrarInfo();
        maverick.tracionarTraseira();
        maverick.mostrarInfo();
        maverick.parar();
        maverick.mostrarInfo();
        
        int a = maverick.getAno();
        String m  = maverick.getModelo();
//        Roda r = maverick.getRodaDD();
//        maverick.setRodaDD(null);
        
        a = -13;
        m = m.toLowerCase();
//        r.setGirando(true);
        
        System.out.println(maverick.getAno());
        System.out.println(maverick.getModelo());
        maverick.mostrarInfo();
    }
}
