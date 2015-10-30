package viajenda.principal;

import viajenda.dominio.SistemaImp;
import viajenda.interfaz.ventana.VentanaDeveloper;
import viajenda.interfaz.ventana.VentanaInicio;
import viajenda.interfaz.ventana.VentanaLogin;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import javax.swing.UIManager;

/** 
 * La clase Inicio es la clase principal del sistema. 
 * Se encarga de manejar el ingreso e impresión de datos.
 *
 */
public class Inicio {

    private static SistemaImp sistema;

    public static void main(String[] args) {
	/* Vista estilo Windows. */
	try {
	    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	} catch (Exception e) {
	}

	/* Ventana de introducción al programa. */
	VentanaInicio inicio = new VentanaInicio();
	inicio.setLocationRelativeTo(null); // Centrar ventana.
	inicio.setVisible(true);

	/* Esperar dos segundos. */
	try {
	    Thread.sleep(2000);
	} catch (InterruptedException ex) {
	}

	inicio.setVisible(false); // Sacar la ventana de introducción.

	/** Iniciar el menú del juego. */
	levantarSistema();
	if (sistema.isMostrarCartelInicio()) {
	    VentanaDeveloper ventana = new VentanaDeveloper(sistema);
	    ventana.setLocationRelativeTo(null); // Centrar ventana.
	    ventana.setVisible(true);
	} else {
	    VentanaLogin ventana = new VentanaLogin(sistema);
	    ventana.setLocationRelativeTo(null); // Centrar ventana.
	    ventana.setVisible(true);
	}
    }

    public static void levantarSistema() {
	try {
	    ObjectInputStream lecturaSistema = null;

	    lecturaSistema = new ObjectInputStream(new BufferedInputStream(new FileInputStream(
		    "sistema.txt")));
	    sistema = (SistemaImp) lecturaSistema.readObject();

	    lecturaSistema.close();
	} catch (Exception e) {
	    sistema = SistemaImp.getInstance();
	}
    }
}
