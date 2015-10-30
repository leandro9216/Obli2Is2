package viajenda.excepciones.fecha;

public class FechaVaciaException extends FechaException{
    public FechaVaciaException(){
    }
 
    @Override
    public String toString(){
        return "La fecha no puede estar vacía.";
    }
}
