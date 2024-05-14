package CLASE4;

import java.util.Scanner;

public class VerificacionContraseña {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contraseñaPredefinida = "password123";

        System.out.println("Por favor, ingresa una contraseña:");
        String contraseñaIngresada = scanner.nextLine();

        if (contraseñaIngresada.equals(contraseñaPredefinida)) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Acceso denegado.");
        }

        scanner.close();
    }
}
