package exercicios.exercicio11.ex1;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano){
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }
    
    public void mostrarData(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }
    
    public boolean vemAntes(Data data){
        if(ano != data.ano){
            return ano < data.ano;
        }
        
        if(mes != data.mes){
            return mes < data.mes;
        }
        
        return dia <= data.dia;
    }
    
    public boolean eBissexto(){
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public int getMes() {
        return mes;
    }

    private void setMes(int mes) {
        if(mes > 12 || mes < 1){
            throw new IllegalArgumentException("o valor de mês precisa estar entre 1 e 12");
        }
        
        this.mes = mes;
    }
    
    public int getDia() {
        return dia;
    }

    private void setDia(int dia) {
        if (dia < 1 || dia > diasNoMes()){
            throw new IllegalArgumentException("dia inválido para mes: " + mes + " e ano: " + ano);
        }
        
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    private void setAno(int ano) {
        if(ano < 0){
            throw new IllegalArgumentException("ano não pode ser negativo");
        }
        
        this.ano = ano;
    }
    
    private int diasNoMes(){
        switch (mes){
            case 2:
                return eBissexto() ? 29 : 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }
}
