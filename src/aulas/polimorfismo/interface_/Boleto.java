package aulas.polimorfismo.interface_;

public class Boleto implements Pagavel {
    
    private String beneficiario;
    private double valor;
    private boolean vencido; // juros de 10% para vencidos com multa
    
    public Boleto(String beneficiario, double valor, boolean vencido){
        setBeneficiario(beneficiario);
        setValor(valor);
        setVencido(vencido);
    }
    
    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        if(beneficiario != null){
            this.beneficiario = beneficiario;
        } else{
            throw new IllegalArgumentException("beneficiario inválido");
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor >= 0){
            this.valor = valor;
        } else{
            throw new IllegalArgumentException("valor inválido");
        }
        
        this.valor = valor;
    }

    public boolean isVencido() {
        return vencido;
    }

    public void setVencido(boolean vencido) {
        this.vencido = vencido;
    }

    @Override
    public String getDescricao() {
        return getBeneficiario();
    }

    @Override
    public double getValorAPagar() {
        if(isVencido()){
            return getValor() * 1.10; // multa de 10% de juros
        }
        
        return getValor();
    }

    @Override
    public String toString() {
        return "( " + getBeneficiario() + ", " + getValor() + ", " + isVencido() + " )";
    }
}
