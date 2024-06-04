package CLASE20;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, elija una figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Triángulo");
        System.out.println("3. Paralelogramo");
        int figura = scanner.nextInt();

        System.out.println("Por favor, elija qué calcular:");
        System.out.println("1. Área");
        System.out.println("2. Perímetro");
        int calculo = scanner.nextInt();

        switch (figura) {
            case 1:
                System.out.println("Por favor, ingrese el radio del círculo:");
                double radio = scanner.nextDouble();
                if (calculo == 1) {
                    double areaCirculo = Math.PI * Math.pow(radio, 2);
                    System.out.println("El área del círculo es: " + areaCirculo);
                } else {
                    double perimetroCirculo = 2 * Math.PI * radio;
                    System.out.println("El perímetro del círculo es: " + perimetroCirculo);
                }
                break;
            case 2:
                System.out.println("Por favor, ingrese las longitudes de los lados del triángulo:");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                if (calculo == 1) {
                    System.out.println("Por favor, ingrese la altura del triángulo:");
                    double alturaTriangulo = scanner.nextDouble();
                    double areaTriangulo = (b * alturaTriangulo) / 2;
                    System.out.println("El área del triángulo es: " + areaTriangulo);
                } else {
                    double perimetroTriangulo = a + b + c;
                    System.out.println("El perímetro del triángulo es: " + perimetroTriangulo);
                }
                break;
            case 3:
                System.out.println("Por favor, ingrese las longitudes de los lados adyacentes del paralelogramo:");
                double base = scanner.nextDouble();
                double altura = scanner.nextDouble();
                if (calculo == 1) {
                    double areaParalelogramo = base * altura;
                    System.out.println("El área del paralelogramo es: " + areaParalelogramo);
                } else {
                    double perimetroParalelogramo = 2 * (base + altura);
                    System.out.println("El perímetro del paralelogramo es: " + perimetroParalelogramo);
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}
