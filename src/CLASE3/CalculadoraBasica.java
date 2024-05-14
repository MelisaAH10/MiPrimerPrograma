package CLASE3;

import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números
        System.out.println("Por favor, ingresa el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Por favor, ingresa el segundo número:");
        double num2 = scanner.nextDouble();

        // Permitir al usuario elegir qué operación quiere realizar
        System.out.println("Por favor, elige la operación que quieres realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        int operacion = scanner.nextInt();

        // Declarar una variable para almacenar el resultado de la operación
        double resultado = 0;

        // Realizar la operación seleccionada por el usuario
        switch (operacion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = (num2 != 0) ? num1 / num2 : Double.NaN;
                if (Double.isNaN(resultado)) {
                    System.out.println("Error: División por cero.");
                    return;
                }
                break;
            default:
                System.out.println("Operación no válida.");
                return;
        }

        // Mostrar el resultado de la operación en la consola
        System.out.println("El resultado de la operación es: " + resultado);
    }
}
