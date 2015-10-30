package viajenda.excepciones.usuario;

public class ApellidoVacioException extends UsuarioException{
    public ApellidoVacioException(){
    }
 
    @Override
    public String toString(){
        return "El apellido no puede estar vacío.";
    }
}
