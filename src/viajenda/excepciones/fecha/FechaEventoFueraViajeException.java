package viajenda.excepciones.fecha;

public class FechaEventoFueraViajeException extends FechaException{
    public FechaEventoFueraViajeException(){
    }
 
    @Override
    public String toString(){
        return "La fecha del evento no se encuentra dentro del viaje.";
    }
}
