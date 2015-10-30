package viajenda.excepciones.fecha;

public class FechaFinAnteriorInicioException extends FechaException{
    public FechaFinAnteriorInicioException(){
    }
 
    @Override
    public String toString(){
        return "Tu viaje termina antes de comenzar.";
    }
}
