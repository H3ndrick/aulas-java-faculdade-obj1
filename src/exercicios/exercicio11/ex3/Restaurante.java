package exercicios.exercicio11.ex3;

import exercicios.exercicio11.ex2.Mesa;

public class Restaurante {
    private String nome;
    private String endereco;
    private String cnpj;
    private String telefone;
    private Mesa[] mesas;
    
    public Restaurante(String nome, String endereco, String cnpj, String telefone){
        setNome(nome);
        setEndereco(endereco);
        setCnpj(cnpj);
        setTelefone(telefone);
        mesas = new Mesa[10];
    }
    
    public void acomodarPessoas(int numeroMesa, int numeroPessoas){
        if(numeroMesa < 1 || numeroMesa > mesas.length){
            throw new IllegalArgumentException("numeroMesa deve estar entre 1 e 10");
        }
        
        if(mesas[numeroMesa -1] != null){
            throw new IllegalArgumentException("Mesa " + numeroMesa +  " já está ocupada");
        }
        
        mesas[numeroMesa - 1] = new Mesa(numeroMesa, numeroPessoas);
    }
    
    public void adicionarPedido(int numeroMesa, double valorPedido){
        getMesa(numeroMesa).adicionarPedido(valorPedido);
    }
    
    public void fecharConta(int numeroMesa){
        System.out.println("Restaurante: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("Telefone: " + getTelefone());
        getMesa(numeroMesa).fecharConta();
        
        mesas[numeroMesa - 1] = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("nome não pode ser vazio");
        }
        
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(endereco == null || endereco.isBlank()){
            throw new IllegalArgumentException("endereco não pode ser vazio");
        }
        
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if(cnpj == null || cnpj.isBlank()){
            throw new IllegalArgumentException("cnpj não pode ser vazio");
        }
        
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if(telefone == null || telefone.isBlank()){
            throw new IllegalArgumentException("telefone não pode ser vazio");
        }
        
        this.telefone = telefone;
    }

    private Mesa getMesa(int numeroMesa) {
        if (numeroMesa < 1 || numeroMesa > mesas.length) {
            throw new IllegalArgumentException("numeroMesa deve estar entre 1 e 10");
        }
        
        Mesa mesa = mesas[numeroMesa - 1];
        
        if (mesa == null) {
            throw new IllegalArgumentException("mesa " + numeroMesa + " não está ocupada");
        }
        
        return mesa;
    }
}
