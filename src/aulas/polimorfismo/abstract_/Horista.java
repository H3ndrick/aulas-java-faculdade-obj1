package aulas.polimorfismo.abstract_;


public class Horista extends Empregado{
    private double horasTrabalhadas;
    private double valorHora; 
    
    public Horista(String nome, String cpf){
        super(nome, cpf);
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        if(horasTrabalhadas > 0){
           this.horasTrabalhadas = horasTrabalhadas; 
        } else{
            throw new IllegalArgumentException("Horas trabalhadas não pode ser menor que 0");
        }
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if(valorHora > 0){
           this.valorHora = valorHora; 
        } else{
            throw new IllegalArgumentException("Valor hora não pode ser menor que 0");
        }
    }
    
    @Override
    public double proventoSemanal(){
        if(getHorasTrabalhadas() > 40){
            return (getValorHora()* 40) + ((getHorasTrabalhadas() - 40) * (getValorHora() * 1.5));
        } else{
            return getHorasTrabalhadas() * getValorHora();
        }
    }
}