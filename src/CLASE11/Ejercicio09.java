package CLASE11;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        // Crear un array con cincuenta elementos de tipo carácter
        char[] frase = {'a', 'p', 'r', 'e', 'n', 'd', 'i', 'e', 'n', 'd', 'o', ' ', 'j', 'a', 'v', 'a'};

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un carácter objetivo
        System.out.print("Ingrese un carácter objetivo: ");
        char objetivo = scanner.next().charAt(0);

        // Inicializar contador con 0
        int contador = 0;

        // Recorrer el array y contar las ocurrencias del carácter objetivo
        for (char caracter : frase) {
            if (caracter == objetivo) {
                contador++;
            }
        }

        // Imprimir el resultado
        if (contador > 0) {
            System.out.println("El carácter \"" + objetivo + "\" aparece " + contador + " veces.");
        } else {
            System.out.println("El carácter \"" + objetivo + "\" no aparece en la frase.");
        }
    }
}
