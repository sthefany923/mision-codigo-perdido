package mision;

public class poder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	   
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
	
