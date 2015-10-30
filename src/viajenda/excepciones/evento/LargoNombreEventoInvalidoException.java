package viajenda.excepciones.evento;

public class LargoNombreEventoInvalidoException extends EventoException{
     private int minimo;
     private int maximo;
 
    public LargoNombreEventoInvalidoException(int minimo, int maximo){
        this.minimo = minimo;
	this.maximo = maximo;
    }
 
    @Override
    public String toString(){
        return "El nombre del evento debe tener entre "+ minimo+" y "+maximo+" caracteres.";
    }
}