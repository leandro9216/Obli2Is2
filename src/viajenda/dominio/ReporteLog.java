package viajenda.dominio;

import java.io.Serializable;

public class ReporteLog implements Serializable{
    private String accion;
    private String fecha;

    public ReporteLog(String accion, String fecha) {
        this.accion = accion;
        this.fecha = fecha;
    }

    public ReporteLog(){}
    
    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
