package exercicios.exercicio6.ex28;

public class Lampada {
   private boolean estado;
   private int watts;
   private Contador contadorAcenderLampada;
   
   public Lampada(int watts){
       this.setEstado(false);
       this.setWatts(watts);
       this.contadorAcenderLampada = new Contador();
   }
   
   public void apertarInterruptor(){
       if(this.isAcesa()){
           this.desligarLampada();
       } else{
           this.ligarLampada();
       }
   }
   
   private void ligarLampada(){
       this.setEstado(true);
       this.contadorAcenderLampada.incrementarContador();
   }
   
   private void desligarLampada(){
       this.setEstado(false);
   }
   
   public boolean isEconomica(){
       if(this.getWatts() < 40){
           return true;
       }
       
       return false;
   }
   
   private void setEstado(boolean estado){
       this.estado = estado;
   }
   
   public boolean isAcesa(){
       return this.estado;
   }
   
   private void setWatts(int watts){
        if(watts > 0){
            this.watts = watts;
        } else{
            throw new IllegalArgumentException("watts deve ser maior do que 0");
        }
       
   }
   
   public int getWatts(){
       return this.watts;
   }
   
   public int getVezesAcesa(){
       return this.contadorAcenderLampada.getContagem();
   }
}
