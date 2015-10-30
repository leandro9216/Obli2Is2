package viajenda.excepciones.evento;

public class EventoExistenteException extends EventoException {
 
    public EventoExistenteException(){
    }
 
    @Override
    public String toString(){
        return "El nombre del evento ya existe.";
    }
}