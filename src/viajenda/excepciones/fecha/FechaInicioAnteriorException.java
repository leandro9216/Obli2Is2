package viajenda.excepciones.fecha;

public class FechaInicioAnteriorException extends FechaException{
    public FechaInicioAnteriorException(){
    }
 
    @Override
    public String toString(){
        return "Su viaje no puede iniciar antes de la fecha actual.";
    }
}
