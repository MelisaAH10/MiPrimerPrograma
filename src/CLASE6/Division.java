package CLASE6;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa el primer número entero:");
        int num1 = scanner.nextInt();

        System.out.println("Por favor, ingresa el segundo número entero:");
        int num2 = scanner.nextInt();

        try {
            int resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }

        scanner.close();
    }
}
