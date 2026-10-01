package exercicios.exercicio6.ex30;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano){
        this.setAno(ano);
        this.setMes(mes);
        this.setDia(dia);
    }
    
    public void duplicaData(Data data){
        if(data == null){
            throw new IllegalArgumentException("data não pode ser null");
        }
        
        this.setAno(data.getAno());
        this.setMes(data.getMes());
        this.setDia(data.getDia());
    }
    
    private boolean isAnoBissexto(int ano){
        if(ano % 400 == 0){
            return true;
        }
        
        if(ano % 100 == 0){
            return false;
        }
        
        return ano % 4 == 0;
    }
    
    private int getDiasNoMes(int mes, int ano){
        if(mes == 2){
            if(this.isAnoBissexto(ano)){
                return 29;
            }
            
            return 28;
        }
        
        if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            return 30;
        }
        
        return 31;
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
    
    private void setAno(int ano){
        if(ano > 0){
            this.ano = ano;
        } else{
            throw new IllegalArgumentException("ano deve ser maior do que 0");
        }
    }
    
    private void setMes(int mes){
        if(mes > 0 && mes < 13){
            this.mes = mes;
        } else{
            throw new IllegalArgumentException("mes deve estar entre 1 e 12");
        }
    }
    
    private void setDia(int dia){
        int maxDias = this.getDiasNoMes(getMes(), getAno());
        
        if(dia > 0 && dia <= maxDias){
            this.dia = dia;
        } else{
            throw new IllegalArgumentException("dia deve estar entre 1 e " + maxDias);
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
