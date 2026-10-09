package aulas.polimorfismo.abstract_;

public class Main {
    public static void main(String[] args) {
        Empregado emp1 = new Assalariado("João", "555.555.555-55", 1000.0);
        System.out.println(emp1);
        System.out.println(emp1.proventoSemanal());
        
        Assalariado sal1 = (Assalariado) emp1;
        System.out.println(sal1.getSalario());
        System.out.println(sal1.proventoSemanal());
    }
}
