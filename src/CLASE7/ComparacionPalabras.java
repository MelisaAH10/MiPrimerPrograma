package CLASE7;

import java.util.Scanner;

public class ComparacionPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa la primera palabra:");
        String palabra1 = scanner.nextLine();

        System.out.println("Por favor, ingresa la segunda palabra:");
        String palabra2 = scanner.nextLine();

        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales.");
        } else {
            System.out.println("Las palabras son diferentes.");
        }

        scanner.close();
    }
}
