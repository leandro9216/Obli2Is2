package viajenda.dominio;

import viajenda.excepciones.fecha.FechaException;
import viajenda.excepciones.usuario.UsuarioException;
import viajenda.excepciones.viaje.ViajeException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * La clase Sistema se encarga de guardar las instancias de clases del sistema.
 *
 */
public interface ISistema {

    public void altaUsuario(String nombreUsuario, String clave, Email email, String nombre, String apellido)
            throws UsuarioException;

    public void identificacionUsuario(String nombreUsuario, String clave) throws UsuarioException;

    public void logoutUsuario();

    public boolean hayUsuarioIdentificado();

    public void bajaUsuario();

    public ArrayList<Usuario> getListaUsuarios();

    public boolean existeUsuario(String nombreUsuario);

    public Usuario getUsuarioIdentificado();

    public ArrayList<Usuario> listadoBuscarUsuarios(String cadena);

    public ArrayList<Usuario> obtenerGrupoDeViaje(Viaje viaje);
            
    public void setModoDesarrollador(boolean modoDesarrollador);

    public boolean esModoDesarrollador();
    
    public boolean isMostrarCartelInicio();
     
    public void setMostrarCartelInicio(boolean mostrar);
    
    public void notificarNovedad(String novedad, String novedadEmail, String titulo, Viaje viaje);
    
    public void identificar(Usuario usuario);
    
     public String getProxy();

    public void setProxy(String proxy);

    public int getPuerto();

    public void setPuerto(int puerto);

    public Iterator<String> listadoDestino();
   
}
