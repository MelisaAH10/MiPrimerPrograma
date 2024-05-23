package CLASE14;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca una cadena
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        // Contar los espacios en blanco en la cadena
        int contador = 0;
        for (char c : cadena.toCharArray()) {
            if (Character.isWhitespace(c)) {
                contador++;
            }
        }

        // Mostrar el recuento al usuario
        System.out.println("La cadena contiene " + contador + " espacios en blanco.");
    }
}
