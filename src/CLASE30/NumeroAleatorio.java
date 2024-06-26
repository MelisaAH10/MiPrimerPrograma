package CLASE30;

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio;
        int numeroUsuario;

        for (int i = 0; i < 25; i++) {
            numeroAleatorio = numeroAleatorio(13, 35);
            do {
                System.out.println("Adivina el número entre 13 y 35:");
                numeroUsuario = scanner.nextInt();
                if (numeroUsuario > numeroAleatorio) {
                    System.out.println("El número ingresado es mayor que el número aleatorio.");
                } else if (numeroUsuario < numeroAleatorio) {
                    System.out.println("El número ingresado es menor que el número aleatorio.");
                }
            } while (numeroUsuario != numeroAleatorio);
            System.out.println("¡Has adivinado correctamente el número!");
        }
        scanner.close();
    }

    public static int numeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
