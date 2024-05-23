package CLASE14;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca una cadena
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        try {
            // Intentar convertir la cadena a un número decimal
            double numero = Double.valueOf(cadena);

            // Si no se lanza una excepción, la cadena representa un número válido
            System.out.println("La cadena representa un número válido: " + numero);
        } catch (NumberFormatException e) {
            // Si se lanza una NumberFormatException, la cadena no representa un número válido
            System.out.println("La cadena no representa un número válido.");
        }
    }
}
