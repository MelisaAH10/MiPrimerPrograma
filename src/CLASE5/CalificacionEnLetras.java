package CLASE5;

import java.util.Scanner;

public class CalificacionEnLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa una calificación numérica del 1 al 5:");
        int calificacion = scanner.nextInt();

        String calificacionEnLetras = switch (calificacion) {
            case 1 -> "Muy deficiente";
            case 2 -> "Deficiente";
            case 3 -> "Suficiente";
            case 4 -> "Notable";
            case 5 -> "Sobresaliente";
            default -> "Has ingresado una calificación inválida. Por favor, ingresa un número del 1 al 5.";
        };

        System.out.println(calificacionEnLetras);

        scanner.close();
    }
}