package CLASE12;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Inicializar numero con un valor que no sea cero
        int numero = -1;

        while (numero != 0) {
            // Pedir al usuario que ingrese un número
            System.out.print("Ingrese un número entero (0 para salir): ");
            numero = scanner.nextInt();

            // Si el número no es cero, imprimir su tabla de multiplicar
            if (numero != 0) {
                int i = 1;
                while (i <= 12) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                    i++;
                }
            }
        }
    }
}
