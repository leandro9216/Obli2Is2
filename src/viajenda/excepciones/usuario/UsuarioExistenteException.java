package viajenda.excepciones.usuario;

import viajenda.excepciones.usuario.UsuarioException;

public class UsuarioExistenteException extends UsuarioException {
    private String nombreUsuario;
 
    public UsuarioExistenteException(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }
 
    @Override
    public String toString(){
        return "El nombre de usuario " + this.nombreUsuario + " ya fue tomado.";
    }
}