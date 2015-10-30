package viajenda.excepciones.usuario;

public class LargoClaveInvalidoException extends UsuarioException{
    private int minimo;

    public LargoClaveInvalidoException(int minimo) {
	this.minimo = minimo;
    }

    @Override
    public String toString() {
	return "La contraseña debe tener al menos " + minimo +" caracteres.";
    }
}
