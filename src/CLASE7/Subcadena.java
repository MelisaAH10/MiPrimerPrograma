package CLASE7;

import java.util.Scanner;

public class Subcadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa una frase:");
        String frase = scanner.nextLine();

        System.out.println("Por favor, ingresa el índice inicial:");
        int inicio = scanner.nextInt();

        System.out.println("Por favor, ingresa el índice final:");
        int fin = scanner.nextInt();

        if (inicio < 0 || fin > frase.length() || inicio > fin) {
            System.out.println("Los índices ingresados no son válidos.");
        } else {
            String subcadena = frase.substring(inicio, fin);
            System.out.println("La subcadena resultante es: " + subcadena);
        }

        scanner.close();
    }
}