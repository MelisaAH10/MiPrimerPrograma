package CLASE11;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int size=0;
        do {
            // Pedir al usuario que ingrese el tamaño del array
            System.out.print("Ingrese el número de palabras que desea ingresar: ");
            size = scanner.nextInt();
            scanner.nextLine();  // Consumir la línea restante del enter

            if (size <= 1) {
                System.out.println("El tamaño del array debe ser mayor a 1.");
            }
        } while (size <= 1);

        // Crear un array con el tamaño especificado por el usuario
        String[] palabras = new String[size];

        // Pedir al usuario que ingrese las palabras
        for (int i = 0; i < size; i++) {
            System.out.print("Ingrese la palabra " + (i + 1) + ": ");
            palabras[i] = scanner.nextLine();
        }

        // Inicializar resultado con una cadena vacía
        String resultado = "";

        // Recorrer el array y concatenar los elementos
        for (String palabra : palabras) {
            resultado += palabra + " ";
        }

        // Imprimir el resultado
        System.out.println(resultado.trim());
    }
}
