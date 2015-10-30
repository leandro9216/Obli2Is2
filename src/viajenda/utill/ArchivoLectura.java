package viajenda.utill;

import java.io.*;

/**
 * La clase ArchivoLectura se encarga de leer de un archivo de texto especificado.
 * 
 * @see ArchivoGrabacion
 * 
 * @author Universidad ORT Uruguay
 */
public class ArchivoLectura {

    private String linea;
    private BufferedReader in;

    /**
     * Abre la comunicación con un archivo de texto.
     * 
     * @param	ubicacion
     *		Ubicación del archivo de texto.
     */
    public ArchivoLectura(String ubicacion) {
        try {
            linea = "";
            in = new BufferedReader(new FileReader(ubicacion));
        } catch (FileNotFoundException e) {
        }
    }

    /**
     * Lee una nueva línea.
     * 
     * @return true si hay más lineas disponibles, de lo contrario false. 
     */
    public boolean hayMasLineas() {
        try {
            linea = in.readLine();
        } catch (IOException e) {
            linea = null;
        }

        return (linea != null);
    }

    /**
     * @return La última línea leida.
     */
    public String getLinea() {
        return linea;
    }

    /**
     * Cierra la comunicación con el archivo.
     * 
     * @return true si se pudo cerrar, de lo contrario false.
     */
    public boolean cerrar() {
        boolean ok = true;

        try {
            in.close();
        } catch (Exception e) {
            ok = false;
        }

        return ok;
    }
}
