package viajenda.excepciones.usuario;

public class LargoNombreUsuarioInvalidoException extends UsuarioException{
     private int minimo;
     private int maximo;
 
    public LargoNombreUsuarioInvalidoException(int minimo, int maximo){
        this.minimo = minimo;
	this.maximo = maximo;
    }
 
    @Override
    public String toString(){
        return "El usuario debe tener entre "+ minimo+" y "+maximo+" caracteres.";
    }
}
