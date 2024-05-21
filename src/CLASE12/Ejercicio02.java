package CLASE12;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        // Generar un número aleatorio entre 1 y 20
        int numeroAleatorio = (int) (Math.random() * 20) + 1;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Inicializar adivinanza con un valor que no corresponda a ninguna posible respuesta
        int adivinanza = 0;

        do {
            // Pedir al usuario que adivine el número
            System.out.print("Adivina el número (entre 1 y 20): ");
            adivinanza = scanner.nextInt();

            // Indicar si el número es mayor o menor
            if (adivinanza < numeroAleatorio) {
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else if (adivinanza > numeroAleatorio) {
                System.out.println("El número es menor. Intenta de nuevo.");
            }
        } while (adivinanza != numeroAleatorio);

        // Felicitar al usuario por adivinar el número
        System.out.println("¡Felicidades! Has adivinado el número.");
    }
}
