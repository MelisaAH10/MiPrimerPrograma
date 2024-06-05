package CLASE21;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Por favor, introduzca un número:");
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            if (esPrimo(numero)) {
                System.out.println(numero + " es un número primo.");
                break;
            } else {
                System.out.println(numero + " no es un número primo.");
            }
        } while (true);
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

    /*public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        } else if (numero == 2) {
            return true;
        } else if (numero % 2 == 0) {
            return false;
        } else {
            return esPrimoRecursivo(numero, numero / 2);
        }
    }

    public static boolean esPrimoRecursivo(int numero, int divisor) {
        if (divisor == 1) {
            return true;
        } else if (numero % divisor == 0) {
            return false;
        } else {
            return esPrimoRecursivo(numero, divisor - 1);
        }
    }*/
}
