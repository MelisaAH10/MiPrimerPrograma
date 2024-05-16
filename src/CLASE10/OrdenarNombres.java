package CLASE10;

import java.util.Scanner;

public class OrdenarNombres {
    public static void main(String[] args) {
        // Crear un array con cuatro elementos de tipo String
        String[] nombres = new String[4];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese el nombre " + (i + 1) + ":");
            nombres[i] = scanner.nextLine();
        }
        scanner.close();

        // Ordenar los nombres en orden alfabético
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (nombres[i].compareTo(nombres[j]) > 0) {
                    String temp = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = temp;
                }
            }
        }

        // Imprimir los nombres ordenados
        System.out.println("Los nombres ordenados alfabéticamente son:");
        for (int i = 0; i < 4; i++) {
            System.out.println(nombres[i]);
        }
    }
}
