package exercicios.lista2013.cap2.ex24;


public class MainEx24 {
    public static void main(String[] args) {
        DataEx24 data1 = new DataEx24(13, 7, 2026);
        DataEx24 data2 = new DataEx24(18, 9, 2010);
        
        data1.exibirDataFormatada();
        
        data2.exibirDataFormatada();
        
        data2.duplicaData(data1);
        
        data2.exibirDataFormatada();
    }
}
