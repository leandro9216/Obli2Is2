/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import viajenda.dominio.ReporteLog;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
public class ReporteLogTest {
    
    private ReporteLog instance;
    
    public ReporteLogTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new ReporteLog("accion","23/11/2014");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAccion method, of class ReporteLog.
     */
    @Test
    public void testGetAccion() {
        String expResult = "accion";
        String result = instance.getAccion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAccion method, of class ReporteLog.
     */
    @Test
    public void testSetAccion() {
        String accion = "accion  .";
        instance.setAccion(accion);
        assertEquals(accion, instance.getAccion());
    }

    /**
     * Test of getFecha method, of class ReporteLog.
     */
    @Test
    public void testGetFecha() {
        String result = "23/11/2014";
        String expResult = instance.getFecha();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFecha method, of class ReporteLog.
     */
    @Test
    public void testSetFecha() {
        instance.setFecha("23/11/2014");
        assertEquals("23/11/2014", instance.getFecha());
    }
}
