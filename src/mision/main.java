package mision;

public class main {

		public static void main(String[] args) {

        // 1. Instancia el guerrero legendario usando la clase heroe
        heroe miHeroe = new heroe("Arturo de Java", 5, 80);

        // 2. Otorga un arma devastadora usando la clase poder
        poder miPoder = new poder("Llama del Dragón", 50);

        // 3. Invoca el método entrenar() del héroe
        miHeroe.entrenar();

        // 4. Desata la furia llamando al método activar() del poder
        String ataqueEpico = miPoder.activar();

        // 5. Imprime en la consola los stats finales todo corecto 
        System.out.println("--- ESTADÍSTICAS DEL HÉROE ---");
        System.out.println("Nombre: " + miHeroe.nombre);
        System.out.println("Nivel: " + miHeroe.nivel);
        System.out.println("Fuerza Bruta (Luego de entrenar): " + miHeroe.poder);
        System.out.println("---------------------------------");
        
        // Imprime el mensaje del ataque 
        System.out.println(ataqueEpico);
    }
}