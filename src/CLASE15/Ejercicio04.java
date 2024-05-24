package CLASE15;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            int contador = 2;
            boolean esPrimo = true;

            while (contador < numero) {
                if (numero % contador == 0) {
                    esPrimo = false;
                    break;
                }
                contador++;
            }

            if (esPrimo) {
                System.out.println(numero + " es un número primo.");
                break;
            } else {
                System.out.println(numero + " no es un número primo. Intente de nuevo.");
            }
        } while (numero != 0);
    }
}
