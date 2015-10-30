package viajenda.excepciones.fecha;

public class FormatoFechaFinException extends FechaException{

    public FormatoFechaFinException() {
    }

    @Override
    public String toString() {
	return "El formato de la fecha de fin no es válido.";
    }
}
