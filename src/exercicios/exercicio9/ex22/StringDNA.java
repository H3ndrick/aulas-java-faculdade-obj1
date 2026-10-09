package exercicios.exercicio9.ex22;

import java.lang.Math;

public class StringDNA {
    private String stringDNA;
    
    public StringDNA(String string){
        setStringDNA(string);
    }
    
    private void setStringDNA(String string){
        if (string == null) {
            throw new IllegalArgumentException("A string não pode ser null.");
        }
        
        stringDNA = "";
        
        for (int i = 0; i < string.length(); i++) {
            char letra = string.charAt(i);
            
            if (letra == 'A' || letra == 'C' || letra == 'G' || letra == 'T'){
                stringDNA += letra;
            }
        }
    }
    
    public char charAt(int index){
        return stringDNA.charAt(index);
    }
    
    private int contarLetra(char letra){
        int count = 0;
        
        for (int i = 0; i < stringDNA.length(); i++) {
            if (charAt(i) == letra){
                count += 1;
            }
        }
        
        return count;
    }
    
    public int quantosA(){
        return contarLetra('A');
    }
    
    public int quantosC(){
        return contarLetra('C');
    }
    
    public int quantosG(){
        return contarLetra('G');
    }
    
    public int quantosT(){
        return contarLetra('T');
    }
    
    public int length(){
        return stringDNA.length();
    }
    
    public StringDNA reversoComplementar(){
        StringBuilder reversoComplementar = new StringBuilder();
        
        for (int i = 0; i < length(); i++) {
            char letraAtual = charAt(i);
            
            switch (letraAtual) {
                case 'A':
                    reversoComplementar.append('T');
                    break;
                case 'T':
                    reversoComplementar.append('A');
                    break;
                case 'C':
                    reversoComplementar.append('G');
                    break;
                case 'G':
                    reversoComplementar.append('C');
                    break;
                default:
                    throw new IllegalStateException("Caractere inválido na string encapsulada: " + letraAtual);
            }
        }
        
        return new StringDNA(reversoComplementar.reverse().toString());
    }
    
    public int compara(StringDNA string){
        if(string == null){
            throw new IllegalArgumentException("A string não pode ser null");
        }
        
        int tamMenorString = Math.min(length(), string.length());
        int count = 0;
        
        for (int i = 0; i < tamMenorString; i++) {
            char a = charAt(i);
            char b = string.charAt(i);
            
            if(a == b){
                count += 3;
                continue;
            }
            
            if((a == 'A' && b == 'T') || (a == 'T' && b == 'A') || (a == 'C' && b == 'G') || (a == 'G' && b == 'C')){
                count += 1;
            }
        }
        
        return count;
    }
    
    @Override
    public String toString(){
        return stringDNA;
    }
}
