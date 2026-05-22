package mision;

public class heroe {

	public static void main(String[] args) {
		
	}
		// TODO Auto-generated method stub
		  // 1. Atributos de la criatura (¡Con la palabra 'public' para que el main pueda leerlos!)
	    public String nombre;
	    public int nivel;
	    public int poder; 

	    // 2. El Constructor (El ritual que crea al héroe con sus datos iniciales)
	    public heroe(String nombre, int nivel, int poder) {
	        this.nombre = nombre;
	        this.nivel = nivel;
	        this.poder = poder;
	    }

	    // 3. Método entrenar() (Aumenta la fuerza bruta en 10 puntos)
	    public void entrenar() {
	        this.poder = this.poder + 10; 
	    }
	}
