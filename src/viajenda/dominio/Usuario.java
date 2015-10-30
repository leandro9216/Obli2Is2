package viajenda.dominio;

import viajenda.excepciones.usuario.UsuarioException;
import viajenda.excepciones.usuario.EmailInvalidoException;
import viajenda.excepciones.usuario.NombreVacioException;
import viajenda.excepciones.usuario.NombreUsuarioVacioException;
import viajenda.excepciones.usuario.LargoApellidoInvalidoException;
import viajenda.excepciones.usuario.LargoClaveInvalidoException;
import viajenda.excepciones.usuario.ApellidoVacioException;
import viajenda.excepciones.usuario.LargoNombreInvalidoException;
import viajenda.excepciones.usuario.LargoNombreUsuarioInvalidoException;
import viajenda.excepciones.usuario.ClaveInseguraException;
import viajenda.excepciones.fecha.FechaVaciaException;
import viajenda.excepciones.fecha.FechaInicioAnteriorException;
import viajenda.excepciones.fecha.FechaException;
import viajenda.excepciones.fecha.FechaFinAnteriorInicioException;
import viajenda.excepciones.fecha.FormatoFechaInicioException;
import viajenda.excepciones.fecha.FormatoFechaFinException;
import viajenda.excepciones.viaje.ViajeException;
import viajenda.excepciones.viaje.ViajeExistenteException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import viajenda.utill.Utilidades;

public final class Usuario implements Serializable {

    private String nombreUsuario;
    private String nombre;
    private String contraseña;
    private String apellido;
    private Email email;
    private ArrayList<Viaje> listaViajes;
    private ArrayList<Usuario> listaAmigos;
    private boolean notificarEmail;
    private boolean notificarCelular;
    private String celular;

    public Usuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Usuario(String nombreUsuario, String contraseña, String nombre, String apellido, Email email) throws UsuarioException {
        this.setNombreUsuario(nombreUsuario);
        this.setContraseña(contraseña);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEmail(email);
        this.listaViajes = new ArrayList<Viaje>();
        this.listaAmigos = new ArrayList<Usuario>();
        this.notificarEmail = false;
        this.notificarCelular = false;
        this.celular = "";
    }

    public ArrayList<Usuario> listadoAmigosEnComun(Usuario amigo) {
        ArrayList<Usuario> retorno = new ArrayList<Usuario>();

        Iterator<Usuario> it = this.getListaAmigos().iterator();
        while (it.hasNext()) {
            Usuario aux = it.next();
            if (amigo.getListaAmigos().contains(aux)) {
                retorno.add(aux);
            }
        }

        return retorno;
    }

    public ArrayList<Usuario> listadoBuscarAmigos(String cadena) {
        ArrayList<Usuario> retorno = new ArrayList<Usuario>();

        Iterator<Usuario> it = this.getListaAmigos().iterator();
        while (it.hasNext()) {
            Usuario usuario = it.next();
            if ((usuario.getNombre() + " " + usuario.getApellido()).toLowerCase().startsWith(cadena.toLowerCase())) {
                retorno.add(usuario);
            }
        }

        return retorno;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public boolean isNotificarCelular() {
        return notificarCelular;
    }

    public void setNotificarCelular(boolean notificarCelular) {
        this.notificarCelular = notificarCelular;
    }

    public boolean isNotificarEmail() {
        return notificarEmail;
    }

    public void setNotificarEmail(boolean notificarEmail) {
        this.notificarEmail = notificarEmail;
    }

    public ArrayList<Usuario> getListaAmigos() {
        return this.listaAmigos;
    }

    public boolean existeNombreViaje(String nombreViaje) {
        return this.getListaViajes().contains(new Viaje(nombreViaje));
    }

    public ArrayList<Viaje> getListaViajes() {
        return this.listaViajes;
    }

    public void bajaViaje(Viaje viaje) {
        this.listaViajes.remove(viaje);
    }

    public void altaViaje(String nombreViaje, String ciudad, String diaIni, String mesIni, String añoIni,
            String diaFin, String mesFin, String añoFin, String descripcion)
            throws ViajeException, FechaException {

        if (existeNombreViaje(nombreViaje)) {
            throw new ViajeExistenteException();
        }
        /* Validaciones fechas */
        if (diaIni.isEmpty() || diaFin.isEmpty() || mesIni.isEmpty()
                || mesFin.isEmpty() || añoIni.isEmpty() || añoFin.isEmpty()) {
            throw new FechaVaciaException();
        }
        if (!Utilidades.formatoFechaValido(diaIni, mesIni, añoIni)) {
            throw new FormatoFechaInicioException();
        }
        if (!Utilidades.formatoFechaValido(diaFin, mesFin, añoFin)) {
            throw new FormatoFechaFinException();
        }

        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaInicio = null;
        Date fechaFin = null;
        try {
            fechaInicio = formatter.parse(Integer.parseInt(diaIni) + "/" + Integer.parseInt(mesIni) + "/" + Integer.parseInt(añoIni));
            fechaFin = formatter.parse(Integer.parseInt(diaFin) + "/" + Integer.parseInt(mesFin) + "/" + Integer.parseInt(añoFin));
        } catch (ParseException ex) {
        }

        Date today = Calendar.getInstance().getTime();

        if (fechaInicio.before(today)) {
            throw new FechaInicioAnteriorException();
        }
        if (fechaFin.before(fechaInicio)) {
            throw new FechaFinAnteriorInicioException();
        }

        Viaje nuevoViaje = new Viaje(nombreViaje, ciudad, fechaInicio, fechaFin, descripcion);
        this.agregarViajes(nuevoViaje);
    }

    public boolean igualContraseña(String contraseña) {
        return Utilidades.md5(contraseña).equals(this.contraseña);
    }

    public void setContraseña(String clave) throws UsuarioException {
        if (clave.length() < 8) {
            throw new LargoClaveInvalidoException(8);
        }
        if (!Utilidades.esAlfanumerico(clave)) {
            throw new ClaveInseguraException();
        }

        this.contraseña = Utilidades.md5(clave);
    }

    public void agregarViajes(Viaje viaje) {
        this.listaViajes.add(viaje);
    }

    public void agregarAmigo(Usuario usuario) {
        this.listaAmigos.add(usuario);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws UsuarioException {
        if (apellido.isEmpty()) {
            throw new ApellidoVacioException();
        }
        if (!Utilidades.largoValido(apellido, 2, 20)) {
            throw new LargoApellidoInvalidoException(2, 20);
        }
        this.apellido = apellido;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) throws UsuarioException {
        if (Utilidades.emailValido(email)) {
        } else {
            throw new EmailInvalidoException();
        }
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws UsuarioException {
        if (nombre.isEmpty()) {
            throw new NombreVacioException();
        }
        if (!Utilidades.largoValido(nombre, 2, 20)) {
            throw new LargoNombreInvalidoException(2, 20);
        }
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) throws UsuarioException {
        if (nombreUsuario.isEmpty()) {
            throw new NombreUsuarioVacioException();
        }
        if (!Utilidades.largoValido(nombreUsuario, 4, 20)) {
            throw new LargoNombreUsuarioInvalidoException(4, 20);
        }

        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public boolean equals(Object obj) {
        return this.getNombreUsuario().equals(((Usuario) obj).getNombreUsuario());
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
