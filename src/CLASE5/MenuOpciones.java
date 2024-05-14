package CLASE5;

import java.util.Scanner;

public class MenuOpciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menú de opciones:");
        System.out.println("1: Guardar");
        System.out.println("2: Cargar");
        System.out.println("3: Salir");
        System.out.println("Por favor, ingresa un número del 1 al 3 para seleccionar una opción:");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado la opción 'Guardar'.");
                break;
            case 2:
                System.out.println("Has seleccionado la opción 'Cargar'.");
                break;
            case 3:
                System.out.println("Has seleccionado la opción 'Salir'.");
                break;
            default:
                System.out.println("Has ingresado una opción inválida. Por favor, ingresa un número del 1 al 3.");
                break;
        }

        scanner.close();
    }
}
