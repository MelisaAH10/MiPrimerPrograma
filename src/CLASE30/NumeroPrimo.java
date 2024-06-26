package CLASE30;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Introduce un número:");
            numero = scanner.nextInt();
        } while (!esPrimo(numero));
        System.out.println("El número " + numero + " es primo.");
        scanner.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
