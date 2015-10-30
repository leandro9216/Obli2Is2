package viajenda.excepciones.viaje;

public class NombreViajeVacioException extends ViajeException{
    public NombreViajeVacioException(){
    }
 
    @Override
    public String toString(){
        return "El nombre del viaje no puede estar vacío.";
    }
}
