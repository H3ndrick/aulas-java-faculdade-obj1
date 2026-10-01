package aulas.associacao.composicao;

public class Carro {
    private String modelo;
    private int ano;
    private Roda rodaDD;
    private Roda rodaDE;
    private Roda rodaTD;
    private Roda rodaTE;

    public Carro(int ano, String modelo) {
        setAno(ano);
        setModelo(modelo);
        rodaDD = new Roda(false); // associação por composição
        rodaDE = new Roda(false);
//        rodaTD = new Roda(false);
        setRodaTD();
//        rodaTE = new Roda(false);
        setRodaTE(new Roda(false));
    }
    
    public void tracionarTraseira(){
        getRodaTE().setGirando(true);
        getRodaTD().setGirando(true);
    }
    
    public void tracionarDianteira(){
        rodaDD.setGirando(true);
        rodaDE.setGirando(true);
    }
    
    public void tracionar4Por4(){
        getRodaTE().setGirando(true);
        getRodaTD().setGirando(true);
        rodaDD.setGirando(true);
        rodaDE.setGirando(true);
    }
    
    public void parar(){
        getRodaTE().setGirando(false);
        getRodaTD().setGirando(false);
        rodaDD.setGirando(false);
        rodaDE.setGirando(false);
    }
    
    public void trocarTodasRodas(){
        rodaDD = new Roda(false);
        rodaDE = new Roda(false);
        setRodaTD();
        setRodaTE(new Roda(false));
    }
    
    public void mostrarInfo() {
        System.out.println("Tração:");
        System.out.println( rodaDE.isGirando() + " , " + rodaDD.isGirando() + "\n" + rodaTE.isGirando() + " , " + rodaTD.isGirando() );
    }

    public String getModelo() {
        return modelo;
    }

    private void setModelo(String modelo) {
        if(modelo != null){
            this.modelo = modelo;
        } else{
            throw new IllegalArgumentException("modelo inválido");
        }
    }

    public int getAno() {
        return ano;
    }

    private void setAno(int ano) {
        if(ano > 0){
            this.ano = ano;
        } else{
            throw new IllegalArgumentException("modelo inválido");
        }
    }
    
    private Roda getRodaTD() {
        return rodaTD;
    }

    private void setRodaTD() {
        this.rodaTD = new Roda(false);
    }

    private Roda getRodaTE() {
        return rodaTE;
    }

    private void setRodaTE(Roda rodaTE) {
        if(rodaTE != null){
            this.rodaTE = rodaTE;
        } else{
            throw new IllegalArgumentException("roda TE inválida.");
        }
    }
}