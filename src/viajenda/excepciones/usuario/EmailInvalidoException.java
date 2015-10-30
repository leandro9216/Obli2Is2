package viajenda.excepciones.usuario;

public class EmailInvalidoException extends UsuarioException{

    public EmailInvalidoException() {
    }

    @Override
    public String toString() {
	return "E-mail inválido.";
    }
}
