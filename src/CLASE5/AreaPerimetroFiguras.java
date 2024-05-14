package CLASE5;

import java.util.Scanner;

public class AreaPerimetroFiguras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menú de opciones:");
        System.out.println("1: Círculo");
        System.out.println("2: Rectángulo");
        System.out.println("Por favor, ingresa un número del 1 al 2 para seleccionar una figura:");

        int opcion = scanner.nextInt();
        double area, perimetro;

        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado la opción 'Círculo'. Por favor, ingresa el radio:");
                double radio = scanner.nextDouble();
                System.out.println("Deseas calcular el área (1) o el perímetro (2)?");
                int opcionCirculo = scanner.nextInt();
                switch (opcionCirculo) {
                    case 1:
                        area = Math.PI * Math.pow(radio, 2);
                        System.out.println("El área del círculo es: " + area);
                        break;
                    case 2:
                        perimetro = 2 * Math.PI * radio;
                        System.out.println("El perímetro del círculo es: " + perimetro);
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
                break;
            case 2:
                System.out.println("Has seleccionado la opción 'Rectángulo'. Por favor, ingresa la base y la altura:");
                double base = scanner.nextDouble();
                double altura = scanner.nextDouble();
                System.out.println("Deseas calcular el área (1) o el perímetro (2)?");
                int opcionRectangulo = scanner.nextInt();
                switch (opcionRectangulo) {
                    case 1:
                        area = base * altura;
                        System.out.println("El área del rectángulo es: " + area);
                        break;
                    case 2:
                        perimetro = 2 * (base + altura);
                        System.out.println("El perímetro del rectángulo es: " + perimetro);
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
                break;
            default:
                System.out.println("Has ingresado una opción inválida. Por favor, ingresa un número del 1 al 2.");
                break;
        }

        scanner.close();
    }
}