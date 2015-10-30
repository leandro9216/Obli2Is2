package viajenda.excepciones.evento;

public class ViajeNoSeleccionadoException extends EventoException{
    public ViajeNoSeleccionadoException(){
    }
 
    @Override
    public String toString(){
        return "Debe seleccionar un viaje.";
    }
}
