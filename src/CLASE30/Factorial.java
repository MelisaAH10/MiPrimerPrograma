package CLASE30;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Introduce un número:");
            numero = scanner.nextInt();
            if (numero < 0) {
                System.out.println("El número debe ser no negativo.");
            } else {
                System.out.println("El factorial de " + numero + " es: " + factorial(numero));
            }
        } while (numero < 0);
        scanner.close();
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
