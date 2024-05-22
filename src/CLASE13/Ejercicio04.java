package CLASE13;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        // Declarar y mostrar un arreglo de enteros junto con sus índices
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Arreglo original: " + Arrays.toString(numeros));

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        int indiceInicial, indiceFinal;
        do {
            // Solicitar al usuario el índice inicial
            System.out.print("Ingrese el índice inicial: ");
            indiceInicial = scanner.nextInt();

            // Solicitar al usuario el índice final
            System.out.print("Ingrese el índice final: ");
            indiceFinal = scanner.nextInt();

            // Validar que el índice inicial es menor que el índice final y que ambos índices están dentro del rango válido del arreglo original
            if (indiceInicial < 0 || indiceFinal >= numeros.length || indiceInicial >= indiceFinal) {
                System.out.println("Índices inválidos. Por favor, intente de nuevo.");
            }
        } while (indiceInicial < 0 || indiceFinal >= numeros.length || indiceInicial >= indiceFinal);

        // Copiar la parte del arreglo original comprendida entre los dos índices (inclusive) en un nuevo arreglo
        int[] nuevoArreglo = Arrays.copyOfRange(numeros, indiceInicial, indiceFinal + 1);

        // Imprimir el nuevo arreglo
        System.out.println("Nuevo arreglo: " + Arrays.toString(nuevoArreglo));
    }
}
