package CLASE11;

import java.util.Random;

public class Ejercicio06 {
    public static void main(String[] args) {
        // Crear un array con diez elementos enteros
        int[] numeros = new int[10];

        // Crear un objeto Random para generar números aleatorios
        Random random = new Random();

        // Inicializar cada elemento del array con un número aleatorio menor a 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }

        System.out.println("Elementos del array:");
        // Imprimir todos los elementos del array en una única línea
        for (int numero: numeros) {
            System.out.print(numero + " ");
        }
        /*int index = 0;
        for (int numero : numeros) {
            System.out.print(numero);
            if (index < numeros.length - 1) {
                System.out.print(", ");
            }
            index++;
        }*/
        System.out.println();

        // Contar los elementos pares
        int count = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                count++;
            }
        }

        // Imprimir el total de elementos pares
        System.out.println("Total de elementos pares: " + count);
    }
}
