package exercicios.lista2013.cap2.ex24;

public class DataEx24 {
    private int dia;
    private int mes;
    private int ano;
    
    public DataEx24(int dia, int mes, int ano){
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }
    
    public void duplicaData(DataEx24 data){
        this.setDia(data.getDia());
        this.setMes(data.getMes());
        this.setAno(data.getAno());
    }
    
    public void exibirDataFormatada(){
        System.out.println(this.formatarDiaOuMes(dia) + "/" + this.formatarDiaOuMes(mes) + "/" + ano);
    }
    
    private String formatarDiaOuMes(int valor){
        if(valor < 10){
            return "0" + valor;
        }
        
        return "" + valor;
    }
    
    private void setDia(int dia){
        this.dia = dia;
        
        if(dia > 0){
            this.dia = dia;
        } else{
            throw new IllegalArgumentException("dia deve ser maior do que 0");
        }
    }
    
    private void setMes(int mes){
        if(mes > 0){
            this.mes = mes;
        } else{
            throw new IllegalArgumentException("mes deve ser maior do que 0");
        }
    }
    
    private void setAno(int ano){
        if(ano > 0){
            this.ano = ano;
        } else{
            throw new IllegalArgumentException("ano deve ser maior do que 0");
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}
