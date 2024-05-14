package CLASE5;

import java.util.Scanner;

public class AreaFiguras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menú de opciones:");
        System.out.println("1: Círculo");
        System.out.println("2: Cuadrado");
        System.out.println("3: Triángulo");
        System.out.println("Por favor, ingresa un número del 1 al 3 para seleccionar una figura:");

        int opcion = scanner.nextInt();
        double area;

        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado la opción 'Círculo'. Por favor, ingresa el radio:");
                double radio = scanner.nextDouble();
                area = Math.PI * Math.pow(radio, 2);
                System.out.println("El área del círculo es: " + area);
                break;
            case 2:
                System.out.println("Has seleccionado la opción 'Cuadrado'. Por favor, ingresa el lado:");
                double lado = scanner.nextDouble();
                area = Math.pow(lado, 2);
                System.out.println("El área del cuadrado es: " + area);
                break;
            case 3:
                System.out.println("Has seleccionado la opción 'Triángulo'. Por favor, ingresa la base y la altura:");
                double base = scanner.nextDouble();
                double altura = scanner.nextDouble();
                area = (base * altura) / 2;
                System.out.println("El área del triángulo es: " + area);
                break;
            default:
                System.out.println("Has ingresado una opción inválida. Por favor, ingresa un número del 1 al 3.");
                break;
        }

        scanner.close();
    }
}