package CLASE13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Generar un arreglo de enteros y llenarlo con valores aleatorios
        int[] numeros = new int[10];
        Random rand = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100) + 1;
        }

        // Ordenar el arreglo
        Arrays.sort(numeros);

        // Imprimir el arreglo generado
        System.out.println("Array generado: " + Arrays.toString(numeros));

        // Solicitar al usuario el valor que desea buscar
        System.out.print("Ingrese el valor que desea buscar: ");
        int valorBuscado = scanner.nextInt();

        // Realizar la búsqueda binaria
        int indice = Arrays.binarySearch(numeros, valorBuscado);

        // Imprimir el resultado
        if (indice >= 0) {
            System.out.println("El valor buscado está en el índice: " + indice);
        } else {
            System.out.println("El valor buscado no se encuentra en el arreglo.");
        }
    }
}
