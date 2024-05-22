package CLASE13;

import java.util.Arrays;

public class Ejercicio03 {
    public static void main(String[] args) {
        // Declarar e inicializar dos arreglos de enteros
        int[] arreglo1 = {1, 2, 3, 4, 5};
        int[] arreglo2 = {1, 2, 3, 4, 5};

        // Comparar los arreglos utilizando Arrays.equals()
        boolean sonIguales = Arrays.equals(arreglo1, arreglo2);

        // Imprimir si los arreglos son iguales o no
        if (sonIguales) {
            System.out.println("Los arreglos son iguales.");
        } else {
            System.out.println("Los arreglos no son iguales.");
        }
    }
}
