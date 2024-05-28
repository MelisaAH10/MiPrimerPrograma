package CLASE16;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[4];

        for (int i = 0; i < 4; i++) {
            do {
                System.out.print("Ingrese el número " + (i + 1) + " (entre 1 y 20): ");
                numeros[i] = scanner.nextInt();
            } while (numeros[i] < 1 || numeros[i] > 20);
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(numeros[i]); // Imprime el número
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
