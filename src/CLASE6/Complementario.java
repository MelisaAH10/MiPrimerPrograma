package CLASE6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Complementario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Por favor, ingresa un número entre 0 y 100:");
            int numero = scanner.nextInt();

            if (numero < 0 || numero > 100) {
                System.out.println("El número ingresado está fuera del rango válido.");
            } else if (numero >= 90) {
                System.out.println("A");
            } else if (numero >= 80) {
                System.out.println("B");
            } else if (numero >= 70) {
                System.out.println("C");
            } else if (numero >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número entero.");
        }

        try {
            System.out.println("Por favor, ingresa el precio de un producto:");
            double precio = scanner.nextDouble();

            if (precio >= 100) {
                double descuento = precio * 0.10;
                double nuevoPrecio = precio - descuento;
                System.out.println("El nuevo precio con descuento es: $" + nuevoPrecio);
            } else {
                System.out.println("El precio sin descuento es: $" + precio);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número.");
        }

        scanner.close();
    }
}
