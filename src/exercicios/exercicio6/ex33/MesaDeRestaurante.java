package exercicios.exercicio6.ex33;

public class MesaDeRestaurante {
    public static final int KG_REFEICAO = 1;
    public static final int KG_SOBREMESA = 2;
    public static final int REFRIGERANTE_600 = 3;
    public static final int REFRIGERANTE_LATA = 4;
    public static final int AGUA_500 = 5;
    public static final int AGUA_COPO = 6;
    public static final int SUCO_LARANJA = 7;
    public static final int OUTROS = 8;

    private static final double PRECO_KG_REFEICAO = 50.0;
    private static final double PRECO_KG_SOBREMESA = 60.0;
    private static final double PRECO_REFRIGERANTE_600 = 9.0;
    private static final double PRECO_REFRIGERANTE_LATA = 6.0;
    private static final double PRECO_AGUA_500 = 4.0;
    private static final double PRECO_AGUA_COPO = 2.0;
    private static final double PRECO_SUCO_LARANJA = 8.0;

    private double kgRefeicao;
    private double kgSobremesa;
    private int refrigerante600;
    private int refrigeranteLata;
    private int agua500;
    private int aguaCopo;
    private int sucoLaranja;
    private double outros;

    public void adicionaAoPedido(int item, double quantidade){
        if(!(quantidade > 0)){
            throw new IllegalArgumentException("A quantidade deve ser maior que 0");
        }

        switch(item){
            case KG_REFEICAO: 
                this.kgRefeicao += quantidade; 
                break;
            case KG_SOBREMESA: 
                this.kgSobremesa += quantidade; 
                break;
            case REFRIGERANTE_600: 
                this.refrigerante600 += (int) quantidade; 
                break;
            case REFRIGERANTE_LATA: 
                this.refrigeranteLata += (int) quantidade; 
                break;
            case AGUA_500: 
                this.agua500 += (int) quantidade; 
                break;
            case AGUA_COPO: 
                this.aguaCopo += (int) quantidade; 
                break;
            case SUCO_LARANJA: 
                this.sucoLaranja += (int) quantidade; 
                break;
            case OUTROS: 
                this.outros += quantidade; 
                break;
            default: 
                throw new IllegalArgumentException("Item inválido: " + item);
        }
    }

    public void zeraPedidos(){
        this.kgRefeicao = 0;
        this.kgSobremesa = 0;
        this.refrigerante600 = 0;
        this.refrigeranteLata = 0;
        this.agua500 = 0;
        this.aguaCopo = 0;
        this.sucoLaranja = 0;
        this.outros = 0;
    }

    public double calculaTotal(){
        return this.kgRefeicao * PRECO_KG_REFEICAO + this.kgSobremesa * PRECO_KG_SOBREMESA + this.refrigerante600 * PRECO_REFRIGERANTE_600 + this.refrigeranteLata * PRECO_REFRIGERANTE_LATA + this.agua500 * PRECO_AGUA_500 + this.aguaCopo * PRECO_AGUA_COPO + this.sucoLaranja * PRECO_SUCO_LARANJA + this.outros;
    }
}