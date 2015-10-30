/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;


import viajenda.dominio.Evento;
import viajenda.dominio.Viaje;
import viajenda.excepciones.comentario.ContenidoVacioException;
import viajenda.excepciones.evento.EventoException;
import viajenda.excepciones.evento.EventoExistenteException;
import viajenda.excepciones.fecha.FechaEventoFueraViajeException;
import viajenda.excepciones.fecha.FechaException;
import viajenda.excepciones.fecha.FechaVaciaException;
import viajenda.excepciones.fecha.FormatoFechaInicioException;
import viajenda.excepciones.viaje.LargoNombreViajeInvalidoException;
import viajenda.excepciones.viaje.NombreViajeVacioException;
import viajenda.excepciones.viaje.ViajeException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pablo
 */
public class ViajeTest {

    private Viaje instance;

    public ViajeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws ViajeException {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaFin = null;
        try {
            fechaFin = formatter.parse(Integer.parseInt("23") + "/"
                    + Integer.parseInt("11") + "/" + Integer.parseInt("2014"));
        } catch (ParseException ex) {
        }
        instance = new Viaje("Vacaciones", "Madrid",
                Calendar.getInstance().getTime(), fechaFin, "Descripcion");
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of agregarComentario method, of class Viaje.
     */
    @Test
    public void testAgregarComentarioError() throws Exception {
        try {
            instance.agregarComentario("fecha1", "autor", "");
            assert (false);
        } catch (ContenidoVacioException e) {
            assert (true);
        }
    }

    /**
     * Test of existeEvento method, of class Viaje.
     */
    @Test
    public void testExisteEventoTrue() {
        boolean expResult = true;

        instance.agregarEventos(new Evento("Evento1"));
        instance.agregarEventos(new Evento("Evento2"));
        instance.agregarEventos(new Evento("Evento3"));

        boolean result = instance.existeEvento(new Evento("Evento2"));
        assertEquals(expResult, result);
    }

    /**
     * Test of existeEvento method, of class Viaje.
     */
    @Test
    public void testExisteEventoFalse() {
        boolean expResult = false;

        instance.agregarEventos(new Evento("Evento1"));
        instance.agregarEventos(new Evento("Evento3"));

        boolean result = instance.existeEvento(new Evento("Evento2"));
        assertEquals(expResult, result);
    }

    /**
     * Test of altaEvento method, of class Viaje.
     */
    @Test
    public void testAltaEventoOK1() throws Exception {
        instance.altaEvento("Visita al parque", "12", "12", "2012", "Parque",
                "descripcion", "Familiar");
        assert (instance.existeEvento(new Evento("Visita al parque")));
    }

    /**
     * Test of altaEvento method, of class Viaje.
     */
    @Test
    public void testAltaEventoOK2() throws Exception {
        instance.altaEvento("Visita al parque", "12", "12", "2012", "Parque",
                "descripcion", "Familiar");
        instance.altaEvento("Visita al parque2", "12", "12", "2012", "Parque",
                "descripcion", "Familiar");
        assert (instance.existeEvento(new Evento("Visita al parque")) && 
                instance.existeEvento(new Evento("Visita al parque2")));
    }

    /**
     * Test of altaEvento method, of class Viaje.
     */
    @Test
    public void testAltaEventoOK3Bordes() throws Exception {
        instance.altaEvento("Park", "23", "11", "2014", "Parque",
                "descripcion", "Familiar");
        assert (instance.existeEvento(new Evento("Park")));
    }

    /**
     * Test of altaEvento method, of class Viaje.
     */
    @Test
    public void testAltaEventoErrorNombreExistente() throws Exception {
        try {
            instance.altaEvento("Parque Acuatico", "01", "01", "2014", "Aquopolis",
                    "Descripcion", "Familiar");
            instance.altaEvento("Parque Acuatico", "02", "02", "2013", "Aquopolis",
                    "Descripcion", "Familiar");
            assert (false);
        } catch (EventoExistenteException e) {
            assert (true);
        }
    }

    /**
     * Test of altaEvento method, of class Viaje.
     */
    @Test
    public void testAltaEventoErrorDiaVacio() throws Exception {
        try {
            instance.altaEvento("Parque Acuatico", "", "01", "2014", "Aquopolis",
                    "Descripcion", "Familiar");
            assert (false);
        } catch (FechaVaciaException e) {
            assert (true);
        }
    }

    /**
     * Test of altaEvento method, of class Viaje.
     */
    @Test
    public void testAltaEventoErrorMesVacio() throws Exception {
        try {
            instance.altaEvento("Parque Acuatico", "02", "", "2013", "Aquopolis",
                    "Descripcion", "Familiar");
            assert (false);
        } catch (FechaVaciaException e) {
            assert (true);
        }
    }

    /**
     * Test of altaEvento method, of class Viaje.
     */
    @Test
    public void testAltaEventoErrorAñoVacio() throws Exception {
        try {
            instance.altaEvento("Parque Acuatico", "02", "02", "", "Aquopolis",
                    "Descripcion", "Familiar");
            assert (false);
        } catch (FechaVaciaException e) {
            assert (true);
        }
    }

    /**
     * Test of altaEvento method, of class Viaje.
     */
    @Test
    public void testAltaEventoErrorFormatoFecha1() throws Exception {
        try {
            instance.altaEvento("Parque Acuatico", "02A", "02", "2013", "Aquopolis",
                    "Descripcion", "Familiar");
            assert (false);
        } catch (FormatoFechaInicioException e) {
            assert (true);
        }
    }

    /**
     * Test of altaEvento method, of class Viaje.
     */
    @Test
    public void testAltaEventoErrorFormatoFecha2() throws Exception {
        try {
            instance.altaEvento("Parque Acuatico", "02d", "13", "2013", "Aquopolis",
                    "Descripcion", "Familiar");
            assert (false);
        } catch (FormatoFechaInicioException e) {
            assert (true);
        }
    }

    /**
     * Test of altaEvento method, of class Viaje.
     */
    @Test
    public void testAltaEventoErrorFormatoFecha3() throws Exception {
        try {
            instance.altaEvento("Parque Acuatico", "DD", "MM", "AAAA", "Aquopolis",
                    "Descripcion", "Familiar");
            assert (false);
        } catch (FormatoFechaInicioException e) {
            assert (true);
        }
    }

    /**
     * Test of altaEvento method, of class Viaje.
     */
    @Test
    public void testAltaEventoErrorFueraDeFecha1() throws Exception {
        try {
            instance.altaEvento("Parque Acuatico", "02", "02", "2011", "Aquopolis",
                    "Descripcion", "Familiar");
            assert (false);
        } catch (FechaEventoFueraViajeException e) {
            assert (true);
        }
    }

    /**
     * Test of altaEvento method, of class Viaje.
     */
    @Test
    public void testAltaEventoErrorFueraDeFecha2() throws Exception {
        try {
            instance.altaEvento("Parque Acuatico", "24", "11", "2014", "Aquopolis",
                    "Descripcion", "Familiar");
            assert (false);
        } catch (FechaEventoFueraViajeException e) {
            assert (true);
        }
    }

    /**
     * Test of existeNombreEvento method, of class Viaje.
     */
    @Test
    public void testExisteNombreEventoTrue() throws EventoException, FechaException {
        boolean expResult = true;
        instance.altaEvento("Park", "23", "11", "2014", "Parque",
                "descripcion", "Familiar");
        boolean result = instance.existeNombreEvento("Park");
        assertEquals(expResult, result);
    }

    /**
     * Test of existeNombreEvento method, of class Viaje.
     */
    @Test
    public void testExisteNombreEventoFalse() throws EventoException, FechaException {
        boolean expResult = false;
        instance.altaEvento("Park", "23", "11", "2014", "Parque",
                "descripcion", "Familiar");
        boolean result = instance.existeNombreEvento("Park ");
        assertEquals(expResult, result);
    }

    /**
     * Test of bajaEvento method, of class Viaje.
     */
    @Test
    public void testBajaEvento() throws EventoException, FechaException {
        Evento aux = new Evento("Evento");
        instance.agregarEventos(aux);
        instance.bajaEvento(aux);
        assert (!instance.getListaEventos().contains(aux));
    }

    /**
     * Test of agregarEventos method, of class Viaje.
     */
    @Test
    public void testAgregarEventos() {
        Evento evento1 = new Evento("Evento1");
        Evento evento2 = new Evento("Evento2");
        Evento evento3 = new Evento("Evento3");

        ArrayList<Evento> expResult = new ArrayList<Evento>();
        expResult.add(evento1);
        expResult.add(evento2);
        expResult.add(evento3);

        instance.agregarEventos(evento1);
        instance.agregarEventos(evento2);
        instance.agregarEventos(evento3);

        ArrayList result = instance.getListaEventos();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescripcion method, of class Viaje.
     */
    @Test
    public void testGetDescripcion() {
        String expResult = "Descripcion";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescripcion method, of class Viaje.
     */
    @Test
    public void testSetDescripcion() {
        String descripcion = "Nueva descripcion";
        instance.setDescripcion(descripcion);
        assertEquals(descripcion, instance.getDescripcion());
    }

    /**
     * Test of getDestino method, of class Viaje.
     */
    @Test
    public void testGetDestino() {
        String expResult = "Madrid";
        String result = instance.getDestino();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDestino method, of class Viaje.
     */
    @Test
    public void testSetDestino() {
        String destino = "Miami";
        instance.setDestino(destino);
        assertEquals(destino, instance.getDestino());
    }

    /**
     * Test of getFechaFin method, of class Viaje.
     */
    @Test
    public void testGetFechaFin() {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date expResult = null;
        try {
            expResult = formatter.parse(Integer.parseInt("23") + "/" + Integer.parseInt("11")
                    + "/" + Integer.parseInt("2014"));
        } catch (ParseException ex) {
        }

        Date result = instance.getFechaFin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFechaFin method, of class Viaje.
     */
    @Test
    public void testSetFechaFin() {
        Date fechaFin = Calendar.getInstance().getTime();
        instance.setFechaFin(fechaFin);
        assertEquals(fechaFin, instance.getFechaFin());
    }

    /**
     * Test of getFechaInicio method, of class Viaje.
     */
    @Test
    public void testGetFechaInicio() {
        Date expResult = Calendar.getInstance().getTime();
        Date result = instance.getFechaInicio();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFechaInicio method, of class Viaje.
     */
    @Test
    public void testSetFechaInicio() {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaInicio = null;
        try {
            fechaInicio = formatter.parse(Integer.parseInt("23") + "/" + Integer.parseInt("11")
                    + "/" + Integer.parseInt("2014"));
        } catch (ParseException ex) {
        }
        instance.setFechaInicio(fechaInicio);
        assertEquals(fechaInicio, instance.getFechaInicio());
    }

    /**
     * Test of getNombre method, of class Viaje.
     */
    @Test
    public void testGetNombre() {
        String expResult = "Vacaciones";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Viaje.
     */
    @Test
    public void testSetNombre() throws Exception {
        String nombre = "Negocio";
        instance.setNombre(nombre);
        assertEquals(nombre, instance.getNombre());
    }

    /**
     * Test of setNombre method, of class Viaje.
     */
    @Test
    public void testSetNombreErrorVacio() throws Exception {
        try {
            String nombre = "";
            instance.setNombre(nombre);
            assert (false);
        } catch (NombreViajeVacioException e) {
            assert (true);
        }
    }

    /**
     * Test of setNombre method, of class Viaje.
     */
    @Test
    public void testSetNombreErrorMuyCorto1() throws Exception {
        try {
            String nombre = "V";
            instance.setNombre(nombre);
            assert (false);
        } catch (LargoNombreViajeInvalidoException e) {
            assert (true);
        }
    }

    /**
     * Test of setNombre method, of class Viaje.
     */
    @Test
    public void testSetNombreErrorMuyCorto2() throws Exception {
        try {
            String nombre = "vje";
            instance.setNombre(nombre);
            assert (false);
        } catch (LargoNombreViajeInvalidoException e) {
            assert (true);
        }
    }

    /**
     * Test of setNombre method, of class Viaje.
     */
    @Test
    public void testSetNombreErrorMuyLargo1() throws Exception {
        try {
            String nombre = "Nombre de viaje muy largo para validar";
            instance.setNombre(nombre);
            assert (false);
        } catch (LargoNombreViajeInvalidoException e) {
            assert (true);
        }
    }

    /**
     * Test of setNombre method, of class Viaje.
     */
    @Test
    public void testSetNombreErrorMuyLargo2() throws Exception {
        try {
            String nombre = "Nombre de 21 caracter";
            instance.setNombre(nombre);
            assert (false);
        } catch (LargoNombreViajeInvalidoException e) {
            assert (true);
        }
    }

    /**
     * Test of equals method, of class Viaje.
     */
    @Test
    public void testEqualsOK() throws ViajeException {
        Object obj = new Viaje("Vacaciones", "Miami", Calendar.getInstance().getTime(),
                Calendar.getInstance().getTime(), "Descripcion");
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    @Test
    public void testEqualsError1() throws ViajeException {
        Object obj = new Viaje("VACACIONES", "Madrid", Calendar.getInstance().getTime(),
                Calendar.getInstance().getTime(), "Descripcion");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    @Test
    public void testEqualsError2() throws ViajeException {
        Object obj = new Viaje("Negocio","BsAs", Calendar.getInstance().getTime(),
                Calendar.getInstance().getTime(), "Descripcion");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Viaje.
     */
    @Test
    public void testToStringError() {
        String expResult = "Vacaciones";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
