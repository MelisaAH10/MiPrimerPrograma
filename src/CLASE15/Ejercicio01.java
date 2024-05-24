package CLASE15;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese la longitud de la contraseña: ");
        int longitud = scanner.nextInt();

        char[] contraseña = new char[longitud];

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneDigito = false;

        for (int i = 0; i < longitud; i++) {
            do {
                char caracterAleatorio = (char) (random.nextInt(94) + 33);
                contraseña[i] = caracterAleatorio;

                if (Character.isUpperCase(caracterAleatorio)) {
                    tieneMayuscula = true;
                } else if (Character.isLowerCase(caracterAleatorio)) {
                    tieneMinuscula = true;
                } else if (Character.isDigit(caracterAleatorio)) {
                    tieneDigito = true;
                }
            } while (!(tieneMayuscula && tieneMinuscula && tieneDigito));
        }

        String contraseñaString = new String(contraseña);

        System.out.println("La contraseña generada es: " + contraseñaString);
    }
}
