package CLASE8;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa la base:");
        int base = scanner.nextInt();

        System.out.println("Por favor, ingresa el exponente:");
        int exponente = scanner.nextInt();

        double resultado = Math.pow(base, exponente);
        System.out.println("El resultado de elevar " + base + " al exponente " + exponente + " es: " + resultado);

        scanner.close();
    }
}
