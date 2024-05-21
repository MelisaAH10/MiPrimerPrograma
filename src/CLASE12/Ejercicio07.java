package CLASE12;

import java.util.*;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Inicializar suma con 0
        int suma = 0;

        // Inicializar la variable de control del bucle
        String continuar = "";

        do {
            try {
                // Pedir al usuario que ingrese un número entero positivo
                System.out.print("Ingrese un número entero positivo: ");
                int numero = scanner.nextInt();

                // Asegurarse de que el número sea positivo
                if (numero < 0) {
                    System.out.println("El número ingresado no es positivo. Inténtalo de nuevo.");
                    continue;
                }

                // Agregar el número a suma
                suma += numero;
            } catch (Exception e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero positivo.");
                scanner.next(); // descartar la entrada incorrecta
                continue;
            }

            // Preguntar al usuario si desea continuar
            System.out.print("¿Desea ingresar otro número? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));

        // Imprimir la suma acumulada
        System.out.println("La suma acumulada de los números ingresados es " + suma + ".");
    }
}
