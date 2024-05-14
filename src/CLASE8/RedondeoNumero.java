package CLASE8;

import java.util.Scanner;

public class RedondeoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa un número decimal:");
        double numero = scanner.nextDouble();

        long numeroRedondeado = Math.round(numero);
        System.out.println("El número redondeado es: " + numeroRedondeado);

        scanner.close();
    }
}
