package CLASE8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Por favor, ingresa un número positivo:");
            double numero = scanner.nextDouble();

            if (numero < 0) {
                System.out.println("El número ingresado es negativo. Por favor, ingresa un número positivo.");
            } else {
                double raizCuadrada = Math.sqrt(numero);
                System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
            }
        } catch (InputMismatchException e) {
            System.out.println("No has ingresado un número válido. Por favor, intenta de nuevo con un número positivo.");
        }

        scanner.close();

    }
}
