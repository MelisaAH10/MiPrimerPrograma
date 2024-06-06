package CLASE22;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del array: ");
        int size = scanner.nextInt();

        int[] numeros = new int[size];

        System.out.println("Ingrese los números del array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i]; //Debuger con condiciones
        }

        System.out.println("La suma de los números es: " + suma);
    }
}
