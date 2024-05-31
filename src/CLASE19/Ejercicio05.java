package CLASE19;

import java.util.Scanner;

public class Ejercicio05 {
    // Declara el objeto Scanner como una variable estática
    private static Scanner pepe = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = pedirNumeros();
        imprimirTablasMultiplicar(numeros);
    }

    public static int[] pedirNumeros() {
        int[] numeros = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Por favor ingrese el número " + (i + 1) + ":");
            numeros[i] = pepe.nextInt();
        }
        return numeros;
    }

    public static void imprimirTablasMultiplicar(int[] numeros) {
        for (int numero : numeros) {
            System.out.println("\nTabla de multiplicar del número " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }
}
