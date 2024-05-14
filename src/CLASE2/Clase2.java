package CLASE2;

import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa tu nombre:");
        String nombreUsuario = scanner.nextLine();
        System.out.println("Tu nombre es: " + nombreUsuario);

        System.out.println("Por favor, ingresa tu edad:");
        int edadUsuario = scanner.nextInt();
        System.out.println("Tu edad es: " + edadUsuario);

        System.out.println("Su nombre es " + nombreUsuario + " y su edad es " + edadUsuario);

    }
}
