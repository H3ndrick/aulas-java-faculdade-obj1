package exercicios.exercicio10.ex7;

public class Main {
    public static void main(String[] args) {
        Data data1 = new Data(22, 10, 2026);
        Hora hora1 = new Hora(22, 7, 30);

        Data data2 = new Data(22, 10, 2026);
        Hora hora2 = new Hora(22, 7, 30);

        DataHora dataHora1 = new DataHora(data1, hora1);
        DataHora dataHora2 = new DataHora(data2, hora2);

        System.out.println(data1.eIgual(data2));
        System.out.println(hora1.eIgual(hora2));
        System.out.println(dataHora1.eIgual(dataHora2));
        dataHora1.exibirDataHora();

        System.out.println();
        
        Data data3 = new Data(25, 12, 2026);
        Hora hora3 = new Hora(8, 15, 45);
        DataHora dataHora3 = new DataHora(data3, hora3);
        
        System.out.println(data1.eIgual(data3));
        System.out.println(hora1.eIgual(hora3));
        System.out.println(dataHora1.eIgual(dataHora3));
        dataHora3.exibirDataHora();
        System.out.println();
    }
}
