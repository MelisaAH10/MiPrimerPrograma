package CLASE2;

import java.util.Scanner;

public class OperacionesBasicas {
    public static void main(String[] args) {
        // Declarar dos variables y asignarles un valor
        int num1 = 10;
        int num2 = 5;

        // Realizar las 5 operaciones básicas y mostrar los resultados
        System.out.println("La suma de las 2 variables es: " + (num1 + num2));
        System.out.println("La resta de las 2 variables es: " + (num1 - num2));
        System.out.println("La multiplicación de las 2 variables es: " + (num1 * num2));
        System.out.println("La división de las 2 variables es: " + (num1 / num2));
        System.out.println("El módulo de las 2 variables es: " + (num1 % num2));

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números
        System.out.println("Por favor, ingresa el primer número:");
        int userNum1 = scanner.nextInt();

        System.out.println("Por favor, ingresa el segundo número:");
        int userNum2 = scanner.nextInt();

        // Realizar la suma de los números y mostrar el resultado
        System.out.println("La suma de los números ingresados es: " + (userNum1 + userNum2));
    }
}
