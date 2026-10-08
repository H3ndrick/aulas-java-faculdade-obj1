package exercicios.exercicio8.ex15;

public class Main {
    public static void main(String[] args) {
        // dias, horas, minutos e segundos - 624 dias
        int dias = 624;
        double horas = ConversaoDeUnidadesDeTempo.diasParaHoras(dias);
        double minutos = ConversaoDeUnidadesDeTempo.horasParaMinutos(horas);
        double segundos = ConversaoDeUnidadesDeTempo.minutosParaSegundos(minutos);
        
        System.out.println("Gestação de um elefante em:");
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }
}
