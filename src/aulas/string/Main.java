package aulas.string;

public class Main {
    public static void main(String[] args) {
        String str1 = "IFSP";
        String str2 = new String("IFSP");
        String str3 = "IFSP";
        
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        
        System.out.println("=========");
        
        String str4 = "ifsp";
        
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4));
        
        System.out.println("========");
        
        String str5 = str3.toLowerCase();
        System.out.println(str3);
        System.out.println(str5);
        
        System.out.println("=======");
        
        String str6 = "";
        String str7 = "              ";
        
        System.out.println(str6.isEmpty());
        System.out.println(str7.isEmpty());
        System.out.println(str7.isBlank());
        
        str7 = "   a    ";
        System.out.println("|" + str7 + "|");
        str7 = str7.trim();
        System.out.println("|" + str7 + "|");
    }
}
