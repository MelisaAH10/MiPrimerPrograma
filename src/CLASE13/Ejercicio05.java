package CLASE13;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamano = scanner.nextInt();

        // Solicitar al usuario un número entero con el que quiera rellenar el arreglo
        System.out.print("Ingrese el número con el que desea rellenar el arreglo: ");
        int numero = scanner.nextInt();

        // Crear un arreglo con el tamaño especificado
        int[] arreglo = new int[tamano];

        // Utilizar el método Arrays.fill() para rellenar el arreglo con el número entero proporcionado
        Arrays.fill(arreglo, numero);

        // Imprimir el arreglo resultante
        System.out.println("Arreglo resultante: " + Arrays.toString(arreglo));
    }
}
