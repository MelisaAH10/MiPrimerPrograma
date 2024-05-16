package CLASE10;

import java.util.Scanner;

public class SumaYPromedioArray {
    public static void main(String[] args) {
        // Crear un array con cuatro elementos enteros
        int[] numeros = new int[4];
        int suma = 0;
        double promedio;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese el elemento " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }
        scanner.close();

        // Calcular el promedio
        promedio = (double) suma / 4;

        // Imprimir el resultado
        System.out.println("La suma de los elementos del array es: " + suma);
        System.out.println("El promedio de los elementos del array es: " + promedio);
    }
}
