package exercicios.lista2013.cap2.ex7;

public class LampadaEx7 {
   private boolean estado;
   
   public LampadaEx7(){
       this.setEstado(false);
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
   
   private void setEstado(boolean estado){
       this.estado = estado;
   }
   
   public boolean getEstado(){
       return this.estado;
   }
}
