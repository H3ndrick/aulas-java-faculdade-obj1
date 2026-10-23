package aulas.polimorfismo.interface_;

public class Main {
    public static void main(String[] args) {
        Pagavel[] compromissos = new Pagavel[100];
        
        compromissos[5] = new Assalariado("João", "555.555.555-55", 1000.0);
        
        compromissos[95] = new Boleto("CPFL", 1500.00, true);
        
        double caixa = 25000.0;
        
        for(int i = 0; i < compromissos.length; i++){
            if(compromissos[i] != null){
                caixa -= compromissos[i].getValorAPagar();
                System.out.print("Saída " + compromissos[i].getDescricao()+ " " + compromissos[i].getValorAPagar());
                System.out.print(" Saldo " + caixa + "\n");
            }
        }
    }
}
