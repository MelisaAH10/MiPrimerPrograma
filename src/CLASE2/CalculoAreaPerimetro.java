package CLASE2;

import java.util.Scanner;

public class CalculoAreaPerimetro {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el valor de la base y de la altura de un rectángulo
        System.out.println("Por favor, ingresa el valor de la base del rectángulo:");
        double baseRectangulo = scanner.nextDouble();

        System.out.println("Por favor, ingresa el valor de la altura del rectángulo:");
        double alturaRectangulo = scanner.nextDouble();

        // Calcular y almacenar el perímetro del rectángulo
        double perimetro = 2 * baseRectangulo + 2 * alturaRectangulo;

        // Mostrar el resultado del perímetro por consola
        System.out.println("El perímetro del rectángulo es: " + perimetro);

        // Calcular y almacenar el área del rectángulo
        double area = baseRectangulo * alturaRectangulo;

        // Mostrar el resultado del área por consola
        System.out.println("El área del rectángulo es: " + area);
    }
}
