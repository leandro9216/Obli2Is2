package viajenda.notificaciones.movil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

public class EnvioMensajeTexto {
    String proxy = "";
    int puerto;

    public EnvioMensajeTexto(String proxy, int puerto) {
        this.proxy = proxy;
        this.puerto = puerto;
    }
    
    public void mandarMensaje(String mensaje, String numero) {
        if(numero.startsWith("0")){
	    numero = numero.substring(1);
	}
	String data = "Codigo=00598&Numero="+numero+"&Mensaje="+mensaje;
	try {

	    // Mando el request.
	    URL url = new URL("http://menwes.com/index.php?seccion=smsenviado");
            URLConnection conn;
            if(proxy.equals("")){
                conn = url.openConnection();
            }else{
                conn = url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxy, puerto)));
            }
	    conn.setDoOutput(true);
	    OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream());

	    //Paso los paramteros
	    writer.write(data);
	    writer.flush();

	    // Obtengo la respuesta
	    StringBuffer answer = new StringBuffer();
	    BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	    String line;
	    while ((line = reader.readLine()) != null) {
		answer.append(line);
	    }
	    writer.close();
	    reader.close();

	} catch (MalformedURLException ex) {
	    ex.printStackTrace();
	} catch (IOException ex) {
	    ex.printStackTrace();
	}
    }
}
