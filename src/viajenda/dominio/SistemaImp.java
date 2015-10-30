package viajenda.dominio;

import viajenda.excepciones.usuario.UsuarioException;
import viajenda.excepciones.usuario.IdentificacionInvalidaException;
import viajenda.excepciones.usuario.UsuarioExistenteException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import viajenda.noticiaciones.email.EnvioMail;
import viajenda.notificaciones.movil.EnvioMensajeTexto;

public class SistemaImp implements ISistema, Serializable {

    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<String> listaCiudades;
    private ArrayList<String> listaTipoEventos;
    private Usuario usuarioIdentificado; //Guarda el usuario actualmente identifiacdo en el sistema.
    private boolean modoDesarrollador;
    private boolean mostrarCartelInicio;
    private String proxy;
    private int puerto;
    public static SistemaImp objeto= null;
    
    private SistemaImp() {
	this.listaUsuarios = new ArrayList<Usuario>();
        this.listaCiudades = new ArrayList<String>();
        this.listaTipoEventos = new ArrayList<String>();
	this.usuarioIdentificado = null;
	this.modoDesarrollador = false;
	this.mostrarCartelInicio = true;
        this.proxy = "";
        this.puerto = 0;
        pruebas();
    }

    @Override
    public void altaUsuario(String nombreUsuario, String clave, Email email, String nombre, String apellido) throws UsuarioException {
	/* ¿Ya existe nombre usuario? */
	if (existeNombreUsuario(nombreUsuario)) {
	    throw new UsuarioExistenteException(nombreUsuario);
	}

	Usuario nuevoUsuario = new Usuario(nombreUsuario, clave, nombre, apellido, email);
	this.listaUsuarios.add(nuevoUsuario);
    }

    @Override
    public void identificacionUsuario(String nombreUsuario, String clave) throws UsuarioException {
	boolean entro = false;
	Iterator<Usuario> it = this.listaUsuarios.iterator();

	while (it.hasNext()) {
	    Usuario usuario = it.next();
	    if (usuario.getNombreUsuario().equals(nombreUsuario)) {
		if (usuario.igualContraseña(clave)) {
		    this.usuarioIdentificado = usuario;
		    entro = true;
		} else {
		    throw new IdentificacionInvalidaException();
		}
	    }
	}

	if (!entro) {
	    throw new IdentificacionInvalidaException();
	}
    }

    @Override
    public void logoutUsuario() {
	this.usuarioIdentificado = null;
    }

    @Override
    public boolean hayUsuarioIdentificado() {
	return this.usuarioIdentificado != null;
    }

    @Override
    public void bajaUsuario() {
	if (this.hayUsuarioIdentificado()) {
	    this.listaUsuarios.remove(this.usuarioIdentificado);
	    this.logoutUsuario();
	}
    }

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }
    
    @Override
    public ArrayList<Usuario> getListaUsuarios() {
	return this.listaUsuarios;
    }

    @Override
    public boolean existeUsuario(String nombreUsuario) {
	return this.listaUsuarios.contains(new Usuario(nombreUsuario));
    }

    @Override
    public Usuario getUsuarioIdentificado() {
	return this.usuarioIdentificado;
    }

    @Override
    public ArrayList<Usuario> listadoBuscarUsuarios(String cadena) {
	ArrayList<Usuario> retorno = new ArrayList<Usuario>();
	Usuario identificado = this.getUsuarioIdentificado();
	Iterator<Usuario> it = this.listaUsuarios.iterator();
	while (it.hasNext()) {
	    Usuario usuario = it.next();
	    if (!usuario.equals(identificado) && !identificado.getListaAmigos().contains(usuario)) {
		if ((usuario.getNombre() +" "+ usuario.getApellido()).toLowerCase().startsWith(cadena.toLowerCase())) {
		    retorno.add(usuario);
		}
	    }
	}
	return retorno;
    }

    @Override
    public ArrayList<Usuario> obtenerGrupoDeViaje(Viaje viaje) {
	ArrayList<Usuario> retorno = new ArrayList<Usuario>();
	retorno.add(this.getUsuarioIdentificado());

	Iterator<Usuario> it = this.getListaUsuarios().iterator();
	while (it.hasNext()) {
	    Usuario usuarioAux = it.next();
	    if (!usuarioAux.equals(this.getUsuarioIdentificado())) {
		if (usuarioAux.getListaViajes().contains(viaje)) {
		    retorno.add(usuarioAux);
		}
	    }
	}
	return retorno;
    }

    @Override
    public void setModoDesarrollador(boolean modoDesarrollador) {
	this.modoDesarrollador = modoDesarrollador;
    }

    @Override
    public boolean esModoDesarrollador() {
	return this.modoDesarrollador;
    }

    public boolean isMostrarCartelInicio() {
	return mostrarCartelInicio;
    }

    public void setMostrarCartelInicio(boolean mostrarCartelInicio) {
	this.mostrarCartelInicio = mostrarCartelInicio;
    }
    
    @Override
    public void identificar(Usuario usuario) {
	this.usuarioIdentificado = usuario;
    }

    @Override
    public void notificarNovedad(String novedad, String novedadEmail, String titulo, Viaje viaje) {
	Iterator<Usuario> iterador = this.getListaUsuarios().iterator();
	while (iterador.hasNext()) {
	    Usuario usuario = iterador.next();
	    if (usuario.existeNombreViaje(viaje.getNombre()) && usuario.isNotificarCelular()) {
		EnvioMensajeTexto envio = new EnvioMensajeTexto(this.proxy, this.puerto);
		envio.mandarMensaje(novedad, usuario.getCelular());
	    }
            if (usuario.existeNombreViaje(viaje.getNombre()) && usuario.isNotificarEmail()) {
		EnvioMail.mandarEmail(usuario.getEmail().toString(), titulo, novedadEmail);
	    }
	}
    }
    public Iterator<String> listadoDestino(){
        return listaCiudades.iterator();
    }
    
    public Iterator<String> listadoTiposEventos(){
        return listaTipoEventos.iterator();
    }

    /* MÉTODOS PRIVADOS */
    private boolean existeNombreUsuario(String nombreUsuario) {
	return this.listaUsuarios.contains(new Usuario(nombreUsuario));
    }
    
    
    public static SistemaImp getInstance()
    {
        if(objeto==null)
        {
            objeto=new SistemaImp();
        }
        return objeto;
    }
    
    public void pruebas()
    {
        listaCiudades.add("Montevideo");
         listaCiudades.add("BsAS");
          listaCiudades.add("Paris");
          listaTipoEventos.add("solo");
          listaTipoEventos.add("vacaciones");   
    }
    
    
    
    
}
