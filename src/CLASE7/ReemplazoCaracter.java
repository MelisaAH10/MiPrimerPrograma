package CLASE7;

import java.util.Scanner;

public class ReemplazoCaracter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa una frase:");
        String frase = scanner.nextLine();

        System.out.println("Por favor, ingresa el carácter a reemplazar:");
        char caracter1 = scanner.nextLine().charAt(0);

        System.out.println("Por favor, ingresa el carácter por el cual reemplazar:");
        char caracter2 = scanner.nextLine().charAt(0);

        String fraseModificada = frase.replace(caracter1, caracter2);
        System.out.println("La frase resultante es: " + fraseModificada);

        scanner.close();
    }
}
