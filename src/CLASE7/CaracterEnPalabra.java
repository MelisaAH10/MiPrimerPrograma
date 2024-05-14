package CLASE7;

import java.util.Scanner;

public class CaracterEnPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa una palabra:");
        String palabra = scanner.nextLine();

        System.out.println("Por favor, ingresa un carácter:");
        String caracter = scanner.nextLine();

        if (caracter.length() != 1) {
            System.out.println("Error: Debes ingresar un solo carácter.");
        } else {
            int indice = palabra.indexOf(caracter);

            if (indice != -1) {
                System.out.println("El carácter '" + caracter + "' se encuentra en la palabra.");
            } else {
                System.out.println("El carácter '" + caracter + "' no se encuentra en la palabra.");
            }
        }

        scanner.close();
    }
}
