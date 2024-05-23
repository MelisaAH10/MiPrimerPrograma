package CLASE14;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar al usuario que introduzca una cadena que represente un número entero
            System.out.print("Ingrese una cadena que represente un número entero: ");
            String cadenaEntero = scanner.nextLine();

            // Convertir la cadena en un número entero
            int numeroEntero = Integer.valueOf(cadenaEntero);

            // Solicitar al usuario que introduzca una cadena que represente un número decimal
            System.out.print("Ingrese una cadena que represente un número decimal: ");
            String cadenaDecimal = scanner.nextLine();

            // Convertir la cadena en un número decimal
            double numeroDecimal = Double.valueOf(cadenaDecimal);

            // Sumar los valores
            double suma = numeroEntero + numeroDecimal;

            // Imprimir el resultado
            System.out.println("La suma es: " + suma);
        } catch (Exception e) {
            // Si se lanza una excepción, el usuario no ingresó un número válido
            System.out.println("No ingresó un número válido.");
        }

    }
}
