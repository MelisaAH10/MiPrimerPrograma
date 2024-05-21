package CLASE12;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Inicializar contraseña con una cadena vacía
        String contrasena = "";

        while (!contrasena.equals("secreto")) {
            // Pedir al usuario que ingrese la contraseña
            System.out.print("Ingrese la contraseña: ");
            contrasena = scanner.nextLine();
            if (!contrasena.equals("secreto")) {
                // Imprimir un mensaje de error
                System.out.println("¡Contraseña incorrecta!");
            }
        }

        // Imprimir un mensaje de éxito
        System.out.println("¡Password correcta!");
    }
}
