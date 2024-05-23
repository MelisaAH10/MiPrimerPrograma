package CLASE14;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca una cadena
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        // Verificar si todos los caracteres son letras
        boolean soloLetras = true;
        /*for (char c : cadena.toCharArray()) {
            if (!Character.isLetter(c)) {
                soloLetras = false;
                break;
            }
        }*/
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (!Character.isLetter(c)) {
                soloLetras = false;
                break;
            }
        }

        // Mostrar un mensaje al usuario
        if (soloLetras) {
            System.out.println("La cadena contiene solo letras.");
        } else {
            System.out.println("La cadena no contiene solo letras.");
        }
    }
}
