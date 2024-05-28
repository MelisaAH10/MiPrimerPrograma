package CLASE16;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números primos que desea obtener: ");
        int cantidad = scanner.nextInt();

        int contador = 0, numero = 2;

        while (contador < cantidad) {
            boolean esPrimo = true;

            for (int i = 2; i * i <= numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println("Primo " + (contador + 1) + ": " + numero);
                contador++;
            }

            numero++;
        }
    }
}
