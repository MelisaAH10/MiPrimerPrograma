package CLASE7;

import java.util.Scanner;

public class EliminarEspacios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa una frase con espacios en blanco al principio y al final:");
        String frase = scanner.nextLine();

        String fraseSinEspacios = frase.trim();
        System.out.println("La frase sin espacios en blanco al principio y al final es: '" + fraseSinEspacios + "'");

        scanner.close();
    }
}
