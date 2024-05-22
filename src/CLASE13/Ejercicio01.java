package CLASE13;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio01 {
    public static void main(String[] args) {
        // Declarar e inicializar el array
        int[] numeros = new int[10];
        Random rand = new Random();

        // Llenar el array con números aleatorios entre 1 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100) + 1;
            System.out.println("Número generado: " + numeros[i]);
        }

        // Imprimir el array inicial
        System.out.println("Array inicial: " + Arrays.toString(numeros));

        // Ordenar el array en forma ascendente
        Arrays.sort(numeros);

        // Invertir el array para obtener un orden descendente
        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }

        // Imprimir el array ordenado
        System.out.println("Array ordenado en forma descendente: " + Arrays.toString(numeros));
    }
}
