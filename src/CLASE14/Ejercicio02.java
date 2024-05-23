package CLASE14;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca una cadena que represente un número entero
        System.out.print("Ingrese una cadena que represente un número entero: ");
        String cadena = scanner.nextLine();

        try {
            // Intentar convertir la cadena en un número entero
            int numero = Integer.parseInt(cadena);

            // Imprimir el número entero
            System.out.println("El número entero es: " + numero);
        } catch (NumberFormatException e) {
            // Si se lanza una NumberFormatException, la cadena no representa un número entero válido
            System.out.println("La cadena no representa un número entero válido.");
        }
    }
}
