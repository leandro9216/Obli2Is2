package viajenda.excepciones.usuario;

public class NombreUsuarioVacioException extends UsuarioException{
    public NombreUsuarioVacioException(){
    }
 
    @Override
    public String toString(){
        return "El nombre de usuario no puede estar vacío.";
    }
}
