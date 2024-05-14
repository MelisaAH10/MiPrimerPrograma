package CLASE4;

import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa un número entre 0 y 100:");
        int numero = scanner.nextInt();

        if (numero < 0 || numero > 100) {
            System.out.println("El número ingresado está fuera del rango válido.");
        } else if (numero >= 90) {
            System.out.println("A");
        } else if (numero >= 80) {
            System.out.println("B");
        } else if (numero >= 70) {
            System.out.println("C");
        } else if (numero >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        // Cerrar el scanner para evitar fugas de memoria
        scanner.close();
    }
}
