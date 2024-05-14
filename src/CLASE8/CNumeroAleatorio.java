package CLASE8;

import java.util.Scanner;

public class CNumeroAleatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa el límite inferior:");
        int limiteInferior = scanner.nextInt();

        System.out.println("Por favor, ingresa el límite superior:");
        int limiteSuperior = scanner.nextInt();

        if (limiteInferior >= limiteSuperior) {
            System.out.println("El límite inferior debe ser menor que el límite superior.");
        } else {
            int rango = limiteSuperior - limiteInferior + 1;
            int numeroAleatorio = (int)(Math.random() * rango) + limiteInferior;
            System.out.println("El número aleatorio generado es: " + numeroAleatorio);
        }

        scanner.close();
    }
}
