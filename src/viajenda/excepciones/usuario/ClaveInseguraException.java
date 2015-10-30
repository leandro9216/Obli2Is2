package viajenda.excepciones.usuario;

public class ClaveInseguraException extends UsuarioException{
    public ClaveInseguraException() {
    }

    @Override
    public String toString() {
	return "La contraseña debe ser alfanumérica.";
    }
}
