package CLASE21;

import java.util.Scanner;


public class Ejercicio02 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {;
        int numero = solicitarNumero();

        int resultado = factorial(numero);

        System.out.println("El factorial de " + numero + " es: " + resultado);
    }

    private static int solicitarNumero() {
        System.out.println("Por favor, ingrese un número:");
        return scanner.nextInt();
    }

    public static int factorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
}
