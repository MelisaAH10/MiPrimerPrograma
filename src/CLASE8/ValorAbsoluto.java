package CLASE8;

import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa un número entero:");
        int numero = scanner.nextInt();

        int valorAbsoluto = Math.abs(numero);
        System.out.println("El valor absoluto del número ingresado es: " + valorAbsoluto);

        scanner.close();
    }
}
