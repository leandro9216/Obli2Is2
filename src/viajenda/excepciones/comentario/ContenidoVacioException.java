package viajenda.excepciones.comentario;

public class ContenidoVacioException extends ComentarioException {
 
    public ContenidoVacioException(){
    }
 
    @Override
    public String toString(){
        return "El comentario no puede estar vacío.";
    }
}