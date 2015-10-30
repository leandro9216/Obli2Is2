package viajenda.excepciones.evento;

public class NombreEventoVacioException extends EventoException{
    public NombreEventoVacioException(){
    }
 
    @Override
    public String toString(){
        return "El nombre del evento no puede estar vacío.";
    }
}
