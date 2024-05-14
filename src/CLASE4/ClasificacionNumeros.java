package CLASE4;

import java.util.Scanner;

public class ClasificacionNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa un número:");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // Cerrar el scanner para evitar fugas de memoria
        scanner.close();
    }
}