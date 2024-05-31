package CLASE19;

import java.util.Scanner;

public class Ejercicio04 {
    // Declara el objeto Scanner como una variable estática
    private static Scanner pepe = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = pedirNumero();
        imprimirTablaMultiplicar(numero);
    }

    public static int pedirNumero() {
        System.out.println("Por favor ingrese un número:");
        return pepe.nextInt();
    }

    public static void imprimirTablaMultiplicar(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
