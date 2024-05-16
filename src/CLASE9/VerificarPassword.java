package CLASE9;

import java.util.Scanner;

public class VerificarPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        boolean validPassword;

        /*do {
            validPassword = true;

            System.out.println("Ingrese su contraseña:");
            password = scanner.nextLine();

            if (password.length() < 8) {
                System.out.println("Contraseña no segura. Debe tener al menos 8 caracteres.");
                validPassword = false;
            }
            if (!password.matches(".*[A-Z].*")) {
                System.out.println("Contraseña no segura. Debe tener al menos una letra mayúscula.");
                validPassword = false;
            }
            if (!password.matches(".*[a-z].*")) {
                System.out.println("Contraseña no segura. Debe tener al menos una letra minúscula.");
                validPassword = false;
            }
            if (!password.matches(".*[0-9].*")) {
                System.out.println("Contraseña no segura. Debe tener al menos un número.");
                validPassword = false;
            }
            if (!password.matches(".*[!@#$%^&*.].*")) {
                System.out.println("Contraseña no segura. Debe tener al menos un carácter especial (!, @, #, $, %, ^, &, *, .).");
                validPassword = false;
            }
        } while (!validPassword);

        System.out.println("¡Contraseña segura! Cumple con todos los criterios.");*/

        //TODO: Otra forma de hacerlo

        do {
            validPassword = true;
            StringBuilder errorMessage = new StringBuilder("Contraseña no segura. Debe tener al menos");

            System.out.println("Ingrese su contraseña:");
            password = scanner.nextLine();

            if (password.length() < 8) {
                errorMessage.append(" 8 caracteres,");
                validPassword = false;
            }
            if (!password.matches(".*[A-Z].*")) {
                errorMessage.append(" una letra mayúscula,");
                validPassword = false;
            }
            if (!password.matches(".*[a-z].*")) {
                errorMessage.append(" una letra minúscula,");
                validPassword = false;
            }
            if (!password.matches(".*[0-9].*")) {
                errorMessage.append(" un número,");
                validPassword = false;
            }
            if (!password.matches(".*[!@#$%^&*()_+={}|;:',.<>?].*")) {
                errorMessage.append(" un carácter especial (!, @, #, $, %, ^, &, *, ., etc.),");
                validPassword = false;
            }

            if (!validPassword) {
                // Eliminar la última coma y agregar un punto al final
                errorMessage.setLength(errorMessage.length() - 1);
                errorMessage.append(".");
                System.out.println(errorMessage.toString());
            }
        } while (!validPassword);

        System.out.println("¡Contraseña segura! Cumple con todos los criterios.");

        scanner.close();
    }
}
