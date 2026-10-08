package exercicios.exercicio8.ex14;

public class Main {
    public static void main(String[] args) {
        double segundos = ConversaoDeUnidadesDeTempo.minutosParaSegundos(1);
        double minutos = ConversaoDeUnidadesDeTempo.horasParaMinutos(1);
        double horas = ConversaoDeUnidadesDeTempo.diasParaHoras(1);
        double semanasDias = ConversaoDeUnidadesDeTempo.semanasParaDias(1);
        double mesesDias = ConversaoDeUnidadesDeTempo.mesesParaDias(1);
        double anosDias = ConversaoDeUnidadesDeTempo.anosParaDias(1);
        
        System.out.println("1 minuto para segundos: " + segundos);
        System.out.println("1 hora para minutos: " + minutos);
        System.out.println("1 dia para horas: " + horas);
        System.out.println("1 semana para dias: " + semanasDias);
        System.out.println("1 mês para dias: " + mesesDias);
        System.out.println("1 ano para dias: " + anosDias);
    }
}
