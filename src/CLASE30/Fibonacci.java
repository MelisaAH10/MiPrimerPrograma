package CLASE30;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int posicion;

        for (int i = 0; i < 15; i++) {
            System.out.println("Ingresa la posición de un número en la serie de Fibonacci:");
            posicion = scanner.nextInt();
                    System.out.println("El valor en la posición " + posicion + " es: " + fibonacci(posicion));
        }
        scanner.close();
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
