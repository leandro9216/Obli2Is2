/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import viajenda.dominio.Comentario;
import viajenda.excepciones.comentario.ComentarioException;
import viajenda.excepciones.comentario.ContenidoVacioException;
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
public class ComentarioTest {

    private Comentario instance;

    public ComentarioTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws ComentarioException {
        instance = new Comentario("10/12/2013", "contenido", "autor");
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getFecha method, of class Comentario.
     */
    @Test
    public void testGetFecha() {
        String expResult = "10/12/2013";
        String result = instance.getFecha();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFecha method, of class Comentario.
     */
    @Test
    public void testSetFecha() {
        String descripcion = "fecha";
        instance.setFecha(descripcion);
        assertEquals(descripcion, instance.getFecha());
    }

    /**
     * Test of getContenido method, of class Comentario.
     */
    @Test
    public void testGetContenido() {
        String expResult = "contenido";
        String result = instance.getContenido();
        assertEquals(expResult, result);
    }

    /**
     * Test of setContenido method, of class Comentario.
     */
    @Test
    public void testSetContenido() throws Exception {
        String contenido = "contenido";
        instance.setContenido(contenido);
        assertEquals(contenido, instance.getContenido());
    }

    /**
     * Test of setContenido method, of class Comentario.
     */
    @Test
    public void testSetContenidoErrorVacio() throws Exception {
        try {
            String contenido = "";
            instance.setContenido(contenido);
            assert(false);
        } catch (ContenidoVacioException e) {
            assert (true);
        }
    }

    /**
     * Test of getAutor method, of class Comentario.
     */
    @Test
    public void testGetAutor() {
        String expResult = "autor";
        String result = instance.getAutor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAutor method, of class Comentario.
     */
    @Test
    public void testSetAutor() {
        String autor = "autor";
        instance.setAutor(autor);
        assertEquals(autor, instance.getAutor());
    }
}
