package CLASE7;

import java.util.Scanner;

public class ConversionCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa una cadena de texto:");
        String cadena = scanner.nextLine();

        String cadenaMayusculas = cadena.toUpperCase();
        String cadenaMinusculas = cadena.toLowerCase();

        System.out.println("La cadena en mayúsculas es: " + cadenaMayusculas);
        System.out.println("La cadena en minúsculas es: " + cadenaMinusculas);

        scanner.close();
    }
}
