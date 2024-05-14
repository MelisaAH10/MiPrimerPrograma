package CLASE8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CNumeroAleatorioYPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //TODO: FORMA 1
        System.out.println("Por favor, ingresa un número entre 1 y 30:");
        int numeroLimite = scanner.nextInt();

        int numeroAleatorio = (int)(Math.random() * numeroLimite) + 1;
        double raizCuadrada = Math.sqrt(numeroAleatorio);

        if (esPrimo(numeroAleatorio)) {
            System.out.println("El número aleatorio generado es primo.");
        } else {
            System.out.println("El número aleatorio generado no es primo.");
        }

        System.out.println("El número aleatorio generado es: " + numeroAleatorio);
        System.out.println("La raíz cuadrada del número aleatorio es: " + raizCuadrada);

        //TODO: FORMA 2
        /*try {
            System.out.println("Por favor, ingresa un número entre 1 y 30:");
            int numeroLimite = scanner.nextInt();

            int numeroAleatorio = (int)(Math.random() * numeroLimite) + 1;
            double raizCuadrada = Math.sqrt(numeroAleatorio);

            boolean esPrimo = true;
            if (numeroAleatorio <= 1) {
                esPrimo = false;
            } else {
                for (int i = 2; i < numeroAleatorio; i++) {
                    if (numeroAleatorio % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            if (esPrimo) {
                System.out.println("El número aleatorio generado es primo.");
            } else {
                System.out.println("El número aleatorio generado no es primo.");
            }

            System.out.println("El número aleatorio generado es: " + numeroAleatorio);
            System.out.println("La raíz cuadrada del número aleatorio es: " + raizCuadrada);
        } catch (
                InputMismatchException e) {
            System.out.println("No has ingresado un número válido. Por favor, intenta de nuevo con un número entre 1 y 30.");
        }*/

        scanner.close();
    }

    //TODO: FUNCION PARA SABER SI UN NUMERO ES PRIMO
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
