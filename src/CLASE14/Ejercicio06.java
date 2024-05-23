package CLASE14;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Pedir al usuario que introduzca un número
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            // Convertir el número en una cadena
            String cadena = String.valueOf(numero);

            // Contar los dígitos en la cadena
            int contador = 0;
            for (char c : cadena.toCharArray()) {
                if (Character.isDigit(c)) {
                    contador++;
                }
            }

            // Mostrar el recuento al usuario
            System.out.println("El número contiene " + contador + " dígitos.");
        } catch (Exception e) {
            // Si se lanza una excepción, el usuario no ingresó un número válido
            System.out.println("No ingresó un número válido.");
        }
    }
}
