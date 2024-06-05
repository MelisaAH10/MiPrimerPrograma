package CLASE21;

import java.util.Scanner;

public class Ejercicio01 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int posicion = solicitarPosicion();
        int valor = fibonacci(posicion);
        imprimirValor(posicion, valor);
    }

    public static int solicitarPosicion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese la posición en la serie de Fibonacci:");
        return scanner.nextInt();
    }

    public static void imprimirValor(int posicion, int valor) {
        System.out.println("El valor en la posición " + posicion + " de la serie de Fibonacci es: " + valor);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
