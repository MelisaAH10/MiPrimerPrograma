package CLASE20;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese el tamaño del array:");
        int tamano = scanner.nextInt();
        System.out.println("Por favor, ingrese el número mínimo:");
        int min = scanner.nextInt();
        System.out.println("Por favor, ingrese el número máximo:");
        int max = scanner.nextInt();

        int[] array = generarArrayAleatorio(tamano, min, max);
        imprimirArray(array);
    }

    public static int[] generarArrayAleatorio(int tamano, int min, int max) {
        int[] array = new int[tamano];
        for (int i = 0; i < array.length; i++) {
            array[i] = numeroAleatorio(min, max);
        }
        return array;
    }

    public static int numeroAleatorio(int min, int max) {
        return (int) (Math.floor(Math.random() * (max - min + 1)) + min);
    }

    public static void imprimirArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
