package viajenda.dominio;

import java.io.Serializable;

public class Email implements Serializable{
    private String direccion;
    
    public Email(){
    }
    
    public Email(String email){
	this.direccion = email;
    }

    public String getDireccion() {
	return direccion;
    }

    public void setDireccion(String direccion) {
	this.direccion = direccion;
    }

    @Override
    public boolean equals(Object obj) {
	return this.getDireccion().equals(((Email)obj).getDireccion());
    }

    @Override
    public String toString() {
	return direccion;
    }
    
    
}
