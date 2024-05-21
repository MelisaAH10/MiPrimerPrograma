package CLASE12;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Inicializar contadores
        int contadorPares = 0;
        int contadorImpares = 0;

        // Inicializar la variable de control del bucle
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            // Pedir al usuario que ingrese un número
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();

            // Contar si el número es par o impar
            if (numero % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }

            // Preguntar al usuario si desea continuar
            System.out.print("¿Desea continuar ingresando números? (s/n): ");
            continuar = scanner.next();
        }

        // Imprimir la cantidad de números pares e impares
        System.out.println("Has ingresado " + contadorPares + " números pares y " + contadorImpares + " números impares.");
    }
}
