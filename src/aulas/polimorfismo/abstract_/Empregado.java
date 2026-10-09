package aulas.polimorfismo.abstract_;

public abstract class Empregado {
    private String nome;
    private String cpf;

    public Empregado(String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null){
            this.nome = nome;
        } else{
            throw new IllegalArgumentException("nome não pode ser nulo");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(nome != null){
            this.cpf = cpf;
        } else{
            throw new IllegalArgumentException("CPF não pode ser nulo");
        }
    }
    
    public abstract double proventoSemanal();
    
    public int compararProventoSemanal(Empregado e){
        if (proventoSemanal() == e.proventoSemanal()){
            return 0;
        }

        if(proventoSemanal() > e.proventoSemanal()){
            return 1;
        }

        return -1;
    }
            
    @Override
    public String toString() {
        return "( " + getNome() + ", " + getCpf() +  ", " + proventoSemanal() + " )";
    }
}
