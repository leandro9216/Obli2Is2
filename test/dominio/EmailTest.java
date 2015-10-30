/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import viajenda.dominio.Email;
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
public class EmailTest {

    private Email instance;

    public EmailTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Email("juanperez@gmail.com");
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getDireccion method, of class Email.
     */
    @Test
    public void testGetDireccion() {
        String expResult = "juanperez@gmail.com";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDireccion method, of class Email.
     */
    @Test
    public void testSetDireccion() {
        String direccion = "juancarlos2012@gmail.com";
        instance.setDireccion(direccion);
        assertEquals(direccion, instance.getDireccion());
    }

    /**
     * Test of equals method, of class Email.
     */
    @Test
    public void testEqualsOK() {
        Object obj = new Email("juanperez@gmail.com");;
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Email.
     */
    @Test
    public void testEqualsError1() {
        Object obj = new Email("juancarlos2012@gmail.com");;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Email.
     */
    @Test
    public void testEqualsError2() {
        Object obj = new Email("juanperez@hotmail.com");;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
}
