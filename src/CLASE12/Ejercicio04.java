package CLASE12;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Asegurarse de que el número sea positivo
        numero = Math.abs(numero);

        // Inicializar contador con 0
        int contador = 0;

        // Calcular la cantidad de dígitos del número
        do {
            numero /= 10;
            contador++;
        } while (numero != 0);

        // Imprimir la cantidad de dígitos
        System.out.println("El número tiene " + contador + " dígitos.");
    }
}
