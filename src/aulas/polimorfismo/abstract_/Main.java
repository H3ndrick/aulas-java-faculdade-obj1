package aulas.polimorfismo.abstract_;

public class Main {
    public static void main(String[] args) {
        
        Empregado emp1 = new Assalariado("João", "555.555.555-55", 1000.0);
        System.out.println(emp1);
        System.out.println(emp1.proventoSemanal());
        
        Assalariado sal1 = (Assalariado) emp1;
        System.out.println(sal1.getSalario());
        System.out.println(sal1.proventoSemanal());
        
        System.out.println("###");
        
        Comissionado com1 = new Comissionado("Maria", "777.777.777-77");
        com1.setVendas(100.0);
        com1.setTaxa(10.0);
        
        Horista hor1 = new Horista("Carlos", "888.888.888-88");
        hor1.setHorasTrabalhadas(45);
        hor1.setValorHora(1); // 47.50
        
        AssalariadoComissionado asscom1 = new AssalariadoComissionado("Henrique", "111.111.111-11", 400.0);
        asscom1.setVendas(100.0);
        asscom1.setTaxa(5.0);
        
        System.out.println(sal1);
        System.out.println(com1);
        System.out.println(hor1);
        System.out.println(asscom1);
        
        System.out.println("###");
        
        Empregado[] empregados = new Empregado[50];
        
        empregados[0] = sal1;
        empregados[15] = com1;
        empregados[16] = hor1;
        empregados[41] = asscom1;
        
        //realizar o pagamento semanal
        for(int i = 0; i < empregados.length; i++){
            if(empregados[i] != null){
                
                if(empregados[i] instanceof AssalariadoComissionado){
                    AssalariadoComissionado aux1 = (AssalariadoComissionado) empregados[i];
                    aux1.setSalario(aux1.getSalario() * 1.1);
                }
                
                // operação de pagar
                System.out.println(empregados[i] + " recebeu " + empregados[i].proventoSemanal());
                
                if(empregados[i] instanceof Horista){
                    Horista aux2 = (Horista) empregados[i];
                    aux2.setHorasTrabalhadas(0.0);
                }
                
                if(empregados[i] instanceof Comissionado || empregados[i] instanceof AssalariadoComissionado){
                    Comissionado aux3 = (Comissionado) empregados[i];
                    aux3.setVendas(0);
                }
            }
        }
        
        System.out.println("###");
        
        System.out.println(sal1);
        System.out.println(com1);
        System.out.println(hor1);
        System.out.println(asscom1);
        
        System.out.println("###");
        
    }
}
