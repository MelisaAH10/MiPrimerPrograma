package CLASE2;

import java.util.Scanner;
public class VerificarEdad {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su año de nacimiento
        System.out.println("Por favor, ingresa tu año de nacimiento:");
        int añoNacimiento = scanner.nextInt();

        // Declarar una constante con el año actual
        final int ANIOACTUAL = 2024;

        // Calcular la edad actual del usuario
        int calculoEdad = ANIOACTUAL - añoNacimiento;

        // Determinar si el usuario es mayor de edad y mostrar un mensaje apropiado
        if (calculoEdad >= 17) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor de edad.");
        }
    }
}
