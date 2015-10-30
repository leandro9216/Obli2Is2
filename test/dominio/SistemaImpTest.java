/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import viajenda.dominio.Email;
import viajenda.dominio.Usuario;
import viajenda.dominio.SistemaImp;
import viajenda.dominio.ISistema;
import viajenda.excepciones.usuario.IdentificacionInvalidaException;
import viajenda.excepciones.usuario.UsuarioException;
import viajenda.excepciones.usuario.UsuarioExistenteException;
import java.util.ArrayList;
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
public class SistemaImpTest {

    private ISistema instance;

    public SistemaImpTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        instance = SistemaImp.getInstance();

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of altaUsuario method, of class SistemaImp.
     */
    @Test
    public void testAltaUsuarioOK1() throws Exception {
        instance.altaUsuario("Pepe", "pepe4000", new Email("pepeda@gmail.com"),
                "Jose", "Damonte");
    }

    /**
     * Test of altaUsuario method, of class SistemaImp.
     */
    @Test
    public void testAltaUsuarioOK2() throws Exception {
        instance.altaUsuario("El Juancho", "juancho123", new Email("juancho@gmail.com"),
                "Juan", "Damonte");
    }

    /**
     * Test of altaUsuario method, of class SistemaImp.
     */
    @Test
    public void testAltaUsuarioErrorExisteUsuario() throws Exception {
        try {
            instance.altaUsuario("Pepe", "pepe4000", new Email("pepeda@gmail.com"),
                    "Jose", "Damonte");
            instance.altaUsuario("Pepe", "juan123", new Email("juancho@gmail.com"),
                    "Juan", "Damonte");
            assert (false);
        } catch (UsuarioExistenteException e) {
            assert (true);
        }
    }

    /**
     * Test of identificacionUsuario method, of class SistemaImp.
     */
    @Test
    public void testIdentificacionUsuarioOK() throws Exception {
        instance.altaUsuario("Pepe", "pepe4000", new Email("pepeda@gmail.com"),
                "Jose", "Damonte");
        instance.identificacionUsuario("Pepe", "pepe4000");
        assert (instance.getUsuarioIdentificado().toString().equals("Jose Damonte"));
    }

    /**
     * Test of identificacionUsuario method, of class SistemaImp.
     */
    @Test
    public void testIdentificacionUsuarioErrorInvalida1() throws Exception {
        try {
            instance.altaUsuario("Pepe", "pepe4000", new Email("pepeda@gmail.com"),
                    "Jose", "Damonte");
            instance.identificacionUsuario("Pepe ", "pepe4000");
            assert (false);
        } catch (IdentificacionInvalidaException e) {
            assert (true);
        }
    }

    /**
     * Test of identificacionUsuario method, of class SistemaImp.
     */
    @Test
    public void testIdentificacionUsuarioErrorInvalida2() throws Exception {
        try {
            instance.altaUsuario("Pepe", "pepe4000", new Email("pepeda@gmail.com"),
                    "Jose", "Damonte");
            instance.identificacionUsuario("Pepe", "pepe400");
            assert (false);
        } catch (IdentificacionInvalidaException e) {
            assert (true);
        }
    }

    /**
     * Test of identificacionUsuario method, of class SistemaImp.
     */
    @Test
    public void testIdentificacionUsuarioErrorInvalida3() throws Exception {
        try {
            instance.altaUsuario("Pepe", "pepe4000", new Email("pepeda@gmail.com"),
                    "Jose", "Damonte");
            instance.identificacionUsuario("", "pepe4000");
            assert (false);
        } catch (IdentificacionInvalidaException e) {
            assert (true);
        }
    }

    /**
     * Test of identificacionUsuario method, of class SistemaImp.
     */
    @Test
    public void testIdentificacionUsuarioErrorInvalida4() throws Exception {
        try {
            instance.altaUsuario("Pepe", "pepe4000", new Email("pepeda@gmail.com"),
                    "Jose", "Damonte");
            instance.identificacionUsuario("Pepe", "Pepe4000");
            assert (false);
        } catch (IdentificacionInvalidaException e) {
            assert (true);
        }
    }

    /**
     * Test of identificacionUsuario method, of class SistemaImp.
     */
    @Test
    public void testIdentificacionUsuarioErrorInvalida5() throws Exception {
        try {
            instance.altaUsuario("Pepe", "pepe4000", new Email("pepeda@gmail.com"),
                    "Jose", "Damonte");
            instance.identificacionUsuario("pepe", "pepe4000");
            assert (false);
        } catch (IdentificacionInvalidaException e) {
            assert (true);
        }
    }

    /**
     * Test of logoutUsuario method, of class SistemaImp.
     */
    @Test
    public void testLogoutUsuario() throws UsuarioException {
        instance.altaUsuario("Pepe", "pepe4000", new Email("pepeda@gmail.com"),
                "Jose", "Damonte");
        instance.identificacionUsuario("Pepe", "pepe4000");
        instance.logoutUsuario();
        assert (!instance.hayUsuarioIdentificado());
    }

    /**
     * Test of hayUsuarioIdentificado method, of class SistemaImp.
     */
    @Test
    public void testHayUsuarioIdentificadoTrue() throws UsuarioException {
        instance.altaUsuario("Pepe", "pepe4000", new Email("pepeda@gmail.com"),
                "Jose", "Damonte");
        instance.identificacionUsuario("Pepe", "pepe4000");
        assert (instance.hayUsuarioIdentificado());
    }

    /**
     * Test of hayUsuarioIdentificado method, of class SistemaImp.
     */
    @Test
    public void testHayUsuarioIdentificadoFalse() throws UsuarioException {
        instance.altaUsuario("Pepe", "pepe4000", new Email("pepeda@gmail.com"),
                "Jose", "Damonte");
        assert (!instance.hayUsuarioIdentificado());
    }

    /**
     * Test of bajaUsuario method, of class SistemaImp.
     */
    @Test
    public void testBajaUsuario() throws UsuarioException {
        instance.altaUsuario("Pepe", "pepe4000", new Email("pepeda@gmail.com"),
                "Jose", "Damonte");
        instance.identificacionUsuario("Pepe", "pepe4000");
        instance.bajaUsuario();
        assert (instance.getListaUsuarios().isEmpty());
    }

    /**
     * Test of existeUsuario method, of class SistemaImp.
     */
    @Test
    public void testExisteUsuarioTrue() throws UsuarioException {
        instance.altaUsuario("Pepe", "pepe4000", new Email("pepeda@gmail.com"),
                "Jose", "Damonte");
        boolean expResult = true;
        boolean result = instance.existeUsuario("Pepe");
        assertEquals(expResult, result);
    }

    /**
     * Test of existeUsuario method, of class SistemaImp.
     */
    @Test
    public void testExisteUsuarioFalse() throws UsuarioException {
        instance.altaUsuario("Pepe", "pepe4000", new Email("pepeda@gmail.com"),
                "Jose", "Damonte");
        boolean expResult = false;
        boolean result = instance.existeUsuario("pepe");
        assertEquals(expResult, result);
    }

    /**
     * Test of getUsuarioIdentificado method, of class SistemaImp.
     */
    @Test
    public void testGetUsuarioIdentificado() throws UsuarioException {
        instance.altaUsuario("Pepe", "pepe4000", new Email("pepeda@gmail.com"),
                "Jose", "Damonte");
        instance.identificacionUsuario("Pepe", "pepe4000");
        Usuario expResult = new Usuario("Pepe");
        Usuario result = instance.getUsuarioIdentificado();
        assertEquals(expResult, result);
    }

    /**
     * Test of listadoBuscarUsuarios method, of class SistemaImp.
     */
    @Test
    public void testListadoBuscarUsuarios() throws UsuarioException {
        Usuario u2 = new Usuario("Usuario1", "qwerty123", "Juan", "Perez", new Email("j@gmail.com"));
        Usuario u3 = new Usuario("Usuario2", "qwerty123", "Juancho", "Perez", new Email("j@gmail.com"));

        ArrayList<Usuario> expResult = new ArrayList<Usuario>();
        expResult.add(u2);
        expResult.add(u3);
        instance.altaUsuario("Usuario1", "qwerty123", new Email("j@gmail.com"),
                "Juan", "Perez");
        instance.altaUsuario("Usuario2", "qwerty123", new Email("j@gmail.com"),
                "Juancho", "Perez");
        instance.altaUsuario("Usuario", "qwerty123", new Email("peda@gmail.com"),
                "Jorge", "Damonte");
        instance.identificacionUsuario("Usuario", "qwerty123");
        ArrayList result = instance.listadoBuscarUsuarios("juan");
        assertEquals(expResult, result);
    }

    /**
     * Test of setModoDesarrollador method, of class SistemaImp.
     */
    @Test
    public void testSetModoDesarrolladorTrue() {
        boolean modo = true;
        instance.setModoDesarrollador(modo);
        assertEquals(modo, instance.esModoDesarrollador());
    }

    /**
     * Test of setModoDesarrollador method, of class SistemaImp.
     */
    @Test
    public void testSetModoDesarrolladorFalse() {
        boolean modo = false;
        instance.setModoDesarrollador(modo);
        assertEquals(modo, instance.esModoDesarrollador());
    }
}
