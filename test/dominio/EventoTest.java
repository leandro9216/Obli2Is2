/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import viajenda.dominio.Evento;
import viajenda.excepciones.evento.EventoException;
import viajenda.excepciones.evento.LargoNombreEventoInvalidoException;
import viajenda.excepciones.evento.NombreEventoVacioException;
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
public class EventoTest {

    private Evento instance;

    public EventoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws EventoException {
        instance = new Evento("Parque de agua", "Familiar",
                Calendar.getInstance().getTime(), "Acuamania", "De vacaciones");
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getDescripcion method, of class Evento.
     */
    @Test
    public void testGetDescripcion() {
        String expResult = "De vacaciones";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescripcion method, of class Evento.
     */
    @Test
    public void testSetDescripcion() {
        String descripcion = "Vamos de paseo";
        instance.setDescripcion(descripcion);
        assertEquals(descripcion, instance.getDescripcion());
    }

    /**
     * Test of getFecha method, of class Evento.
     */
    @Test
    public void testGetFecha() {
        Date expResult = Calendar.getInstance().getTime();
        Date result = instance.getFecha();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFecha method, of class Evento.
     */
    @Test
    public void testSetFecha() {
        Date fecha = Calendar.getInstance().getTime();;
        instance.setFecha(fecha);
        assertEquals(fecha, instance.getFecha());
    }

    /**
     * Test of getNombre method, of class Evento.
     */
    @Test
    public void testGetNombre() {
        String expResult = "Parque de agua";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Evento.
     */
    @Test
    public void testSetNombre() throws EventoException {
        String nombre = "Nuevo nombre";
        instance.setNombre(nombre);
        assertEquals(nombre, instance.getNombre());
    }

    /**
     * Test of setNombre method, of class Evento.
     */
    @Test
    public void testSetNombreErrorVacio() throws EventoException {
        try {
            String nombre = "";
            instance.setNombre(nombre);
            assert(false);
        } catch (NombreEventoVacioException e) {
            assert(true);
        }
    }
    
     /**
     * Test of setNombre method, of class Evento.
     */
    @Test
    public void testSetNombreErrorMuyCorto1() throws EventoException {
        try {
            String nombre = "E";
            instance.setNombre(nombre);
            assert(false);
        } catch (LargoNombreEventoInvalidoException e) {
            assert(true);
        }
    }  
    
    /**
     * Test of setNombre method, of class Evento.
     */
    @Test
    public void testSetNombreErrorMuyCorto2() throws EventoException {
        try {
            String nombre = "Evn";
            instance.setNombre(nombre);
            assert(false);
        } catch (LargoNombreEventoInvalidoException e) {
            assert(true);
        }
    }    

    /**
     * Test of setNombre method, of class Evento.
     */
    @Test
    public void testSetNombreErrorMuyLargo1() throws EventoException {
        try {
            String nombre = "Evento con un nombre de evento muy largo";
            instance.setNombre(nombre);
            assert(false);
        } catch (LargoNombreEventoInvalidoException e) {
            assert(true);
        }
    }   
    
    /**
     * Test of setNombre method, of class Evento.
     */
    @Test
    public void testSetNombreErrorMuyLargo2() throws EventoException {
        try {
            String nombre = "Evento con 21 caracte";
            instance.setNombre(nombre);
            assert(false);
        } catch (LargoNombreEventoInvalidoException e) {
            assert(true);
        }
    }    

    /**
     * Test of getTipoEvento method, of class Evento.
     */
    @Test
    public void testGetTipoEvento() {
        String expResult = "Familiar";
        String result = instance.getTipoEvento();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTipoEvento method, of class Evento.
     */
    @Test
    public void testSetTipoEvento() {
        String tipoEvento = "Laboral";
        instance.setTipoEvento(tipoEvento);
        assertEquals(tipoEvento, instance.getTipoEvento());
    }

    /**
     * Test of getLugar method, of class Evento.
     */
    @Test
    public void testGetLugar() {
        String expResult = "Acuamania";
        String result = instance.getLugar();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLugar method, of class Evento.
     */
    @Test
    public void testSetLugar() {
        String lugar = "Nuevo lugar";
        instance.setLugar(lugar);
        assertEquals(lugar, instance.getLugar());
    }

    /**
     * Test of equals method, of class Evento.
     */
    @Test
    public void testEquals() throws EventoException {
        Object obj = new Evento("Parque de agua", "Familiar",
                Calendar.getInstance().getTime(), "Acuamania", "De vacaciones");
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Evento.
     */
    @Test
    public void testEqualsError1() throws EventoException {
        Object obj = new Evento("Parque de agua.", "Familiar",
                Calendar.getInstance().getTime(), "Acuamania", "De vacaciones");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    public void testEqualsError2() throws EventoException {
        Object obj = new Evento("Parque acuático","Familiar",
                Calendar.getInstance().getTime(), "Acuamania", "De vacaciones");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Evento.
     */
    @Test
    public void testToString() {
        String expResult = "Parque de agua";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
