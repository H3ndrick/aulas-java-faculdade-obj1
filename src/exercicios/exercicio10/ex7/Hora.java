package exercicios.exercicio10.ex7;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Hora(int hora, int minuto, int segundo){
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }
    
    public boolean eIgual(Hora hora){
        if(hora == null){
            throw new IllegalArgumentException("hora não pode ser null");
        }
        
        return (getHora() == hora.getHora() && getMinuto() == hora.getMinuto()&& getSegundo() == hora.getSegundo());
    }
    
    public void exibirHoraFormatada(){
        System.out.print(formatarValor(hora) + ":" + formatarValor(minuto) + ":" + formatarValor(segundo));
    }
    
    private String formatarValor(int valor){
        if(valor < 10){
            return "0" + valor;
        }
        
        return "" + valor;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora < 0 || hora > 23){
            throw new IllegalArgumentException("hora deve estar entre 0 e 23");
        }
        
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if(minuto < 0 || minuto > 59){
            throw new IllegalArgumentException("minuto deve estar entre 0 e 59");
        }
        
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if(segundo < 0 || segundo > 59){
            throw new IllegalArgumentException("segundo deve estar entre 0 e 59");
        }
        
        this.segundo = segundo;
    }
    
    
}
