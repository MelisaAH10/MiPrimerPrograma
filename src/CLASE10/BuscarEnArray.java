package CLASE10;

import java.util.Scanner;

public class BuscarEnArray {
    public static void main(String[] args) {
        // Crear un array con tres elementos enteros
        int[] numeros = {5, 10, 15};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();
        scanner.close();

        // Comprobar si el número está en el array
        if (numero == numeros[0] || numero == numeros[1] || numero == numeros[2]) {
            System.out.println("El número " + numero + " está presente en el array.");
        } else {
            System.out.println("El número " + numero + " no está presente en el array.");
        }
    }
}
