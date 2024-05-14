package CLASE7;

import java.util.Scanner;

public class LongitudCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa una cadena de texto:");
        String cadena = scanner.nextLine();

        int longitud = cadena.length();
        System.out.println("La longitud de la cadena ingresada es: " + longitud);

        scanner.close();
    }
}
