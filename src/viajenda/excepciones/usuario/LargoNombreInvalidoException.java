package viajenda.excepciones.usuario;

public class LargoNombreInvalidoException extends UsuarioException{
     private int minimo;
     private int maximo;
 
    public LargoNombreInvalidoException(int minimo, int maximo){
        this.minimo = minimo;
	this.maximo = maximo;
    }
 
    @Override
    public String toString(){
        return "El nombre debe tener entre "+ minimo+" y "+maximo+" caracteres.";
    }
}