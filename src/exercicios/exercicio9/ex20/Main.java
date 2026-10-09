package exercicios.exercicio9.ex20;

public class Main {
    public static void main(String[] args) {
        StringDNA string1 = new StringDNA("CATGATTAG");
        StringDNA string2 = new StringDNA("JAVA");
        
        System.out.println(string1.toString());
        System.out.println(string2.toString());
        
        System.out.println("######");
        
        System.out.println(string1.quantosA());
        System.out.println(string2.quantosA());
        System.out.println(string2.quantosC());
        
        System.out.println("####");
        
        System.out.println(new StringDNA("CATGATTAG")); // CATGATTAG
        System.out.println(new StringDNA("JAVA"));      // AA
        System.out.println(new StringDNA("JAVA").length()); // 2
    }
}
