package CLASE20;

import java.util.Scanner;

public class Ejercicio07 {
    public class GeneradorDeNumeros {
        public static void main(String[] args) {
            int numeroAleatorio = numeroAleatorio(1, 20);
            adivinarNumero(numeroAleatorio);
        }

        public static int numeroAleatorio(int min, int max) {
            return (int) (Math.floor(Math.random() * (max - min + 1)) + min);
        }

        public static void adivinarNumero(int numeroAleatorio) {
            Scanner scanner = new Scanner(System.in);
            int numeroUsuario;
            do {
                System.out.println("Por favor, adivine el número entre 1 y 20:");
                while (!scanner.hasNextInt()) {
                    System.out.println("Eso no es un número. Intente de nuevo:");
                    scanner.next();
                }
                numeroUsuario = scanner.nextInt();
                if (numeroUsuario > numeroAleatorio) {
                    System.out.println("El número ingresado es mayor que el número aleatorio. Intente de nuevo.");
                } else if (numeroUsuario < numeroAleatorio) {
                    System.out.println("El número ingresado es menor que el número aleatorio. Intente de nuevo.");
                }
            } while (numeroUsuario != numeroAleatorio);
            System.out.println("¡Felicidades! Has adivinado el número.");
        }
    }
}
