package CLASE10;

import java.util.Scanner;

public class MaximoArray {
    public static void main(String[] args) {
        // Crear un array con cinco elementos enteros
        int[] numeros = new int[5];
        int maximo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el elemento 1:");
        numeros[0] = scanner.nextInt();
        maximo = numeros[0]; // Inicializar el máximo con el primer elemento

        for (int i = 1; i < 5; i++) {
            System.out.println("Ingrese el elemento " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
            if (numeros[i] > maximo) {
                maximo = numeros[i]; // Actualizar el máximo si el elemento actual es mayor
            }
        }
        scanner.close();

        // Imprimir el resultado
        System.out.println("El máximo de los elementos del array es: " + maximo);
    }
}