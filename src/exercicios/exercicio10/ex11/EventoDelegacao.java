package exercicios.exercicio10.ex11;

import exercicios.exercicio10.ex7.DataHora;

public class EventoDelegacao {
    private String evento;
    private DataHora dataHora;
    
    public EventoDelegacao(String evento, DataHora dataHora){
        setEvento(evento);
        setDataHora(dataHora);
    }
    
    public void exibirEvento(){
        System.out.println("Evento: " + getEvento());
        System.out.print("Data e hora: ");
        getDataHora().exibirDataHora();
        System.out.println();
    }
    
    public String getEvento() {
        return evento;
    }

    private void setEvento(String evento) {
        if(evento == null || evento.isBlank()){
            throw new IllegalArgumentException("evento não pode ser vazio");
        }
        
        this.evento = evento;
    }

    public DataHora getDataHora() {
        return dataHora;
    }

    private void setDataHora(DataHora dataHora) {
        if(dataHora == null){
            throw new IllegalArgumentException("dataHora não pode ser null");
        }
        
        this.dataHora = dataHora;
    }
    
    
}
