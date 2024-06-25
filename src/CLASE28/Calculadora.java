package CLASE28;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double num2 = scanner.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + suma(num1, num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + resta(num1, num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + multiplicacion(num1, num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Resultado: " + division(num1, num2));
                        } else {
                            System.out.println("Error: División por cero no está permitida.");
                        }
                        break;
                }
            }
        } while (opcion != 5);
    }

    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }
}
