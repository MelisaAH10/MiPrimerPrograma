package CLASE6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Resta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Por favor, ingresa el primer número:");
            double num1 = scanner.nextDouble();

            System.out.println("Por favor, ingresa el segundo número:");
            double num2 = scanner.nextDouble();

            double resultado = num1 - num2;
            System.out.println("El resultado de la resta es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar números.");
        }

        scanner.close();
    }
}
