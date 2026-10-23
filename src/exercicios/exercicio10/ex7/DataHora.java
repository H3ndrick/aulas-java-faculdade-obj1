package exercicios.exercicio10.ex7;

public class DataHora {
    private Data data;
    private Hora hora;
    
    public DataHora(Data data, Hora hora){
        setData(data);
        setHora(hora);
    }
    
    public void exibirDataHora(){
        getData().exibirDataFormatada();
        System.out.print(" ");
        getHora().exibirHoraFormatada();
        System.out.println();
    }
    
    public boolean eIgual(DataHora dataHora){
        if(dataHora == null){
            throw new IllegalArgumentException("dataHora não pode ser null");
        }
        
        return this.getData().eIgual(dataHora.getData()) && this.getHora().eIgual(dataHora.getHora());
    }

    public Data getData() {
        return data;
    }

    private void setData(Data data) {
        if(data == null){
            throw new IllegalArgumentException("data não pode ser null");
        }
        
        this.data = data;
    }

    public Hora getHora() {
        return hora;
    }

    private void setHora(Hora hora) {
        if(hora == null){
            throw new IllegalArgumentException("hora não pode ser null");
        }
        
        this.hora = hora;
    }
    
    
}
