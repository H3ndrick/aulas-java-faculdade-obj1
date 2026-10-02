package aulas.heranca.vivo;

public class SerVivo {
    private boolean movel;
    
    public SerVivo(boolean movel){
        setMovel(movel);
    }
    
    public boolean isMovel(){
        return movel;
    }
    
    protected void setMovel(boolean movel){
        this.movel = movel;
    }

    @Override
    public String toString() {
        if(isMovel()){
            return "Este é um ser vivo que se move";
        }
        
        return "Este é um ser vivo que não se move";
    }
}
