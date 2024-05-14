package CLASE6;

import java.util.Scanner;

public class ParseInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa una cadena de caracteres que represente un número entero:");
        String cadena = scanner.nextLine();

        try {
            int numero = Integer.parseInt(cadena); // Convertir la cadena en un número entero (int
            System.out.println("El número entero es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena ingresada no puede ser convertida en un número entero.");
        }

        scanner.close();
    }
}
