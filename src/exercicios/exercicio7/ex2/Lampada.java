package exercicios.exercicio7.ex2;

public class Lampada {
   private boolean estado;
   
   public Lampada(boolean estado){
       this.setEstado(estado);
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
   }
   
   private void desligarLampada(){
       this.setEstado(false);
   }
   
   private void setEstado(boolean estado){
       this.estado = estado;
   }
   
   public boolean isAcesa(){
       return this.estado;
   }
}
