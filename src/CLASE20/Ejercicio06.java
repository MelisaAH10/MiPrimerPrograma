package CLASE20;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese una contraseña:");
        String password = scanner.nextLine();
        if (esSegura(password)) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no es segura.");
        }
    }
    public static boolean esSegura(String password) {
        return tieneLongitudCorrecta(password) && tieneMayuscula(password) && tieneMinuscula(password) && tieneNumero(password) && tieneCaracterEspecial(password);
    }

    public static boolean tieneLongitudCorrecta(String password) {
        return password.length() >= 8;
    }

    public static boolean tieneMayuscula(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean tieneMinuscula(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean tieneNumero(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean tieneCaracterEspecial(String password) {
        String caracteresEspeciales = "!@#$%^&*()-+=[]{}|;:'<>,.?/";
        for (char c : password.toCharArray()) {
            if (caracteresEspeciales.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }
}
