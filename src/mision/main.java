package mision;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      // 1. Instancia el guerrero legendario usando la clase heroe
        heroe miHeroe = new heroe("Arturo de Java", 5, 80);

        // 2. Otorga un arma devastadora usando la clase poder (¡CORREGIDO AQUÍ!)
        poder miPoder = new poder("Llama del Dragón", 50);

        // 3. Invoca el método entrenar() del héroe (Sube su poder de 80 a 90)
        miHeroe.entrenar();

        // 4. Desata la furia llamando al método activar() del poder
        String ataqueEpico = miPoder.activar();

        // 5. Imprime en las runas de la consola los stats finales del héroe y el ataque
        System.out.println("--- ESTADÍSTICAS DEL HÉROE ---");
        System.out.println("Nombre: " + miHeroe.nombre);
        System.out.println("Nivel: " + miHeroe.nivel);
        System.out.println("Fuerza Bruta (Luego de entrenar): " + miHeroe.poder);
        System.out.println("---------------------------------");
        
        // Imprime el mensaje del ataque místico git ayudame
        System.out.println(ataqueEpico);
    }
}