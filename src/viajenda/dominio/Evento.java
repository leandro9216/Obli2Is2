package viajenda.dominio;

import viajenda.excepciones.evento.EventoException;
import viajenda.excepciones.evento.LargoNombreEventoInvalidoException;
import viajenda.excepciones.evento.NombreEventoVacioException;
import java.io.Serializable;
import java.util.Date;
import viajenda.utill.Utilidades;

public final class Evento implements Serializable{
    private String nombre;
    private String tipoEvento;
    private Date fecha;
    private String lugar;
    private String descripcion;

    
    public Evento(String nombre) {
	this.nombre = nombre;
    }
	
    public Evento(String nombre, String tipoEvento, Date fecha, String lugar, String descripcion) throws EventoException{
	this.setNombre(nombre);
	this.setTipoEvento(tipoEvento);
	this.setFecha(fecha);
	this.setDescripcion(descripcion);
	this.setLugar(lugar);
    }

    public String getDescripcion() {
	return descripcion;
    }

    public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
    }

    public Date getFecha() {
	return fecha;
    }

    public void setFecha(Date fecha) {
	this.fecha = fecha;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) throws EventoException{
        if (nombre.isEmpty()) {
            throw new NombreEventoVacioException();
        }
        if (!Utilidades.largoValido(nombre, 4, 20)) {
            throw new LargoNombreEventoInvalidoException(4, 20);
        }
	this.nombre = nombre;
    }

    public String getTipoEvento() {
	return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
	this.tipoEvento = tipoEvento;
    }
    
     public String getLugar() {
	return lugar;
    }

    public void setLugar(String lugar) {
	this.lugar = lugar;
    }

    @Override
    public boolean equals(Object obj) {
	return this.getNombre().equals(((Evento) obj).getNombre());
    }

    @Override
    public String toString() {
	return nombre;
    }

}
