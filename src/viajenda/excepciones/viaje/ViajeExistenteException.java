package viajenda.excepciones.viaje;

public class ViajeExistenteException extends ViajeException {
 
    public ViajeExistenteException(){
    }
 
    @Override
    public String toString(){
        return "El nombre del viaje ya existe.";
    }
}