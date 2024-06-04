package CLASE20;

import java.util.Scanner;

public class Ejercicio03 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int nota = solicitarNota();
        String calificacion = obtenerNota(nota);
        System.out.println("La calificación es: " + calificacion);
    }

    public static int solicitarNota() {
        int nota;
        do {
            System.out.println("Por favor, ingrese una nota entre 0 y 100:");
            while (!scanner.hasNextInt()) {
                System.out.println("Eso no es un número. Intente de nuevo:");
                scanner.next();
            }
            nota = scanner.nextInt();
        } while (nota < 0 || nota > 100);
        return nota;
    }

    public static String obtenerNota(int nota) {
        return switch (nota) {
            case 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 -> "A";
            case 80, 81, 82, 83, 84, 85, 86, 87, 88, 89 -> "B";
            case 70, 71, 72, 73, 74, 75, 76, 77, 78, 79 -> "C";
            case 60, 61, 62, 63, 64, 65, 66, 67, 68, 69 -> "D";
            default -> "F";
        };
    }
}
