package exercicios.lista2013.cap2.ex9;

public class LampadaEx9 {
   private boolean estado;
   private int watts;
   
   public LampadaEx9(int watts){
       this.setEstado(false);
       this.setWatts(watts);
   }
   
   public void apertarInterruptor(){
       if(this.getEstado()){
           this.desligarLampada();
       } else{
           this.ligarLampada();
       }
   }
   
   private void ligarLampada(){
       this.setEstado(true);
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
   
   public boolean getEstado(){
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
}
