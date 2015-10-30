package viajenda.excepciones.usuario;

public class LargoApellidoInvalidoException extends UsuarioException{
     private int minimo;
     private int maximo;
 
    public LargoApellidoInvalidoException(int minimo, int maximo){
        this.minimo = minimo;
	this.maximo = maximo;
    }
 
    @Override
    public String toString(){
        return "El apellido debe tener entre "+ minimo+" y "+maximo+" caracteres.";
    }
}