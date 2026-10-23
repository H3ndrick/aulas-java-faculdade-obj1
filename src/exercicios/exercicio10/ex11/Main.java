package exercicios.exercicio10.ex11;

import exercicios.exercicio10.ex7.Data;
import exercicios.exercicio10.ex7.Hora;
import exercicios.exercicio10.ex7.DataHora;

public class Main {
    public static void main(String[] args) {
        Data data = new Data(27, 11, 2026);
        Hora hora = new Hora(8, 0, 0);

        DataHora dataHora = new DataHora(data, hora);

        EventoDelegacao evento = new EventoDelegacao("Prova de Java", dataHora);

        evento.exibirEvento();
    }
}
