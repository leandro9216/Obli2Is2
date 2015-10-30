package viajenda.dominio;

import viajenda.excepciones.comentario.ContenidoVacioException;
import viajenda.excepciones.comentario.ComentarioException;
import java.io.Serializable;

public final class Comentario implements Serializable{

    private String fecha;
    private String contenido;
    private String autor;

    public Comentario() {
    }

    public Comentario(String fecha, String contenido, String autor) throws ComentarioException {
        this.setAutor(autor);
        this.setContenido(contenido);
        this.setFecha(fecha);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) throws ComentarioException {
        if (contenido.isEmpty()) {
            throw new ContenidoVacioException();
        }
        this.contenido = contenido;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
