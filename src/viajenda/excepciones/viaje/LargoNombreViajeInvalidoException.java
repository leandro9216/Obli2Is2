package viajenda.excepciones.viaje;

public class LargoNombreViajeInvalidoException extends ViajeException{
     private int minimo;
     private int maximo;
 
    public LargoNombreViajeInvalidoException(int minimo, int maximo){
        this.minimo = minimo;
	this.maximo = maximo;
    }
 
    @Override
    public String toString(){
        return "El nombre del viaje debe tener entre "+ minimo+" y "+maximo+" caracteres.";
    }
}