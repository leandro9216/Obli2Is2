package viajenda.utill;

import viajenda.dominio.Email;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.regex.Pattern;

/**
 * La clase Utilidades contiene métodos de utilidad para el sistema.
 *
* @author Universidad ORT Uruguay
 */
public class Utilidades {

    private static Scanner in = new Scanner(System.in);

    public static boolean esNumero(String texto) {
	boolean retorno;

	try {
	    Integer.parseInt(texto);
	    retorno = true;
	} catch (NumberFormatException e) {
	    retorno = false;
	}

	return retorno;
    }

    public static boolean esLetra(String texto) {
	return texto.length() == 1 && texto.toUpperCase().charAt(0) >= 65 && texto.toUpperCase().charAt(0) <= 90;
    }

    /** 
     * Genera un número al azar entre dos rangos (inclusive).
     */
    public static int rand(int min, int max) {
	return min + (int) (Math.random() * ((max - min) + 1));
    }

    public static String md5(String password) {
	String hashword = null;
	try {
	    MessageDigest md5 = MessageDigest.getInstance("MD5");
	    md5.update(password.getBytes());
	    BigInteger hash = new BigInteger(1, md5.digest());
	    hashword = hash.toString(16);
	} catch (NoSuchAlgorithmException nsae) {
	    // ignore
	}
	
	return hashword;
    }
    
    public static boolean largoValido(String cadena, int largoMinimo, int largoMaximo) {
        return cadena.length() >= largoMinimo && cadena.length() <= largoMaximo;
    }

    public static boolean emailValido(Email email) {
        Pattern p = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        return p.matcher(email.getDireccion()).find();
    }

    public static boolean esAlfanumerico(String cadena) {
        Pattern p1 = Pattern.compile(".*[a-zA-Z]+.*");
        Pattern p2 = Pattern.compile(".*[0-9]+.*");
        return p1.matcher(cadena).find() && p2.matcher(cadena).find();
    }

    public static boolean formatoFechaValido(String dia, String mes, String año) {
        boolean retorno = false;

        if (Utilidades.esNumero(dia) && Utilidades.esNumero(mes) && Utilidades.esNumero(año)) {
            int diaNumero = Integer.parseInt(dia);
            int mesNumero = Integer.parseInt(mes);
            int añoNumero = Integer.parseInt(año);
            if (diaNumero > 0 && diaNumero < 32 && mesNumero > 0 && mesNumero < 13
                    && añoNumero > 1900 && añoNumero < 2100) {
                retorno = true;
            }
        }
        return retorno;
    }
}
