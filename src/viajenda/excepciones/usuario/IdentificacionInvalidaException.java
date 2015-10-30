package viajenda.excepciones.usuario;

public class IdentificacionInvalidaException extends UsuarioException{
    public IdentificacionInvalidaException(){
    }
 
    @Override
    public String toString(){
        return "Usuario o contraseña inválidos.";
    }
}
