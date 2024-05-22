package CLASE13;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamano = scanner.nextInt();

        // Crear un arreglo con el tamaño especificado
        int[] arreglo = new int[tamano];

        // Inicializar el último índice ingresado
        int ultimoIndice = -1;

        // Continuar pidiendo al usuario nuevos números e índices para rellenar el arreglo
        while (ultimoIndice < tamano - 1) {
            // Solicitar al usuario un número con el que quiera rellenar el arreglo
            System.out.print("Ingrese el número con el que desea rellenar el arreglo: ");
            int numero = scanner.nextInt();

            // Solicitar al usuario el índice hasta el cual quiere rellenar el arreglo con el número anterior
            int indice;
            do {
                System.out.print("Ingrese el índice hasta el cual quiere rellenar el arreglo: ");
                indice = scanner.nextInt();
            } while (indice <= ultimoIndice || indice >= tamano);  // Validar el índice

            // Rellenar el arreglo con el número proporcionado hasta el índice ingresado
            Arrays.fill(arreglo, ultimoIndice + 1, indice, numero);

            // Actualizar el último índice ingresado
            ultimoIndice = indice;
        }

        // Imprimir el arreglo resultante
        System.out.println("Arreglo resultante: " + Arrays.toString(arreglo));
    }
}
