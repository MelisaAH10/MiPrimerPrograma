package CLASE4;

import java.util.Scanner;

public class CategoriaEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa tu edad:");
        int edad = scanner.nextInt();

        if (edad < 0) {
            System.out.println("Has ingresado una edad inválida.");
        } else if (edad < 18) {
            System.out.println("Eres menor de edad.");
        } else if (edad <= 64) {
            System.out.println("Eres adulto.");
        } else {
            System.out.println("Eres un adulto mayor.");
        }

        scanner.close();
    }
}