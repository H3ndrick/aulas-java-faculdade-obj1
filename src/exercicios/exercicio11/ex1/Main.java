package exercicios.exercicio11.ex1;

public class Main {
    public static void main(String[] args) {
        Data d1 = new Data(29, 2, 2024);
        Data d2 = new Data(1, 1, 2020);
        Data d3 = new Data(10, 3, 2024);
        Data d4 = new Data(5, 4, 2024);
        Data d5 = new Data(15, 8, 2024);

        d1.mostrarData();
        d5.mostrarData();

        System.out.println("2024 é bissexto: " + d1.eBissexto()); // true
        System.out.println("2020 é bissexto: " + d2.eBissexto()); // true
        System.out.println("2023 é bissexto: " + new Data(1, 1, 2023).eBissexto()); // false
        System.out.println("1900 é bissexto: " + new Data(1, 1, 1900).eBissexto()); // false
        System.out.println("2000 é bissexto: " + new Data(1, 1, 2000).eBissexto()); // true

        System.out.println("01/01/2020 vemAntes 29/02/2024? " + d2.vemAntes(d1)); // true
        System.out.println("29/02/2024 vemAntes 01/01/2020? " + d1.vemAntes(d2)); // false
        System.out.println("10/03/2024 vemAntes 05/04/2024? " + d3.vemAntes(d4)); // true
        System.out.println("05/04/2024 vemAntes 10/03/2024? " + d4.vemAntes(d3)); // false
        System.out.println("10/03/2024 vemAntes 10/03/2024? " + d3.vemAntes(d3)); // true
    }
}
