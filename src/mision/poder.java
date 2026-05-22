package mision;

public class poder {

	   
	    public String nombre;
	    public int danio; 

	    // El constructor en minúsculas
	    public poder(String nombre, int danio) {
	        this.nombre = nombre;
	        this.danio = danio;
	    }

	    // Encantamiento que retorna el mensaje épico
	    public String activar() {
	        return "¡El cielo se quiebra al liberar la " + this.nombre + " causando " + this.danio + " de daño!";
	    }
	}
	
