package exercicios.exercicio6.ex33;

public class RestauranteCaseiro {
    private final MesaDeRestaurante mesa1 = new MesaDeRestaurante();
    private final MesaDeRestaurante mesa2 = new MesaDeRestaurante();
    private final MesaDeRestaurante mesa3 = new MesaDeRestaurante();
    private final MesaDeRestaurante mesa4 = new MesaDeRestaurante();

    private MesaDeRestaurante getMesa(int numero){
        switch(numero){
            case 1: 
                return this.mesa1;
            case 2: 
                return this.mesa2;
            case 3: 
                return this.mesa3;
            case 4: 
                return this.mesa4;
            default: 
                throw new IllegalArgumentException("Mesa inexistente: " + numero);
        }
    }

    public void adicionaAoPedido(int numeroMesa, int item, double quantidade){
        this.getMesa(numeroMesa).adicionaAoPedido(item, quantidade);
    }

    public void zeraPedidos(int numeroMesa){
        this.getMesa(numeroMesa).zeraPedidos();
    }

    public double calculaTotal(int numeroMesa){
        return this.getMesa(numeroMesa).calculaTotal();
    }
}