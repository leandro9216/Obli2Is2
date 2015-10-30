package viajenda.excepciones.usuario;

public class NombreVacioException extends UsuarioException{
    public NombreVacioException(){
    }
 
    @Override
    public String toString(){
        return "El nombre no puede estar vacío.";
    }
}
