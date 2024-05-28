package CLASE16;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la posición en la serie de Fibonacci: ");
        int posicion = scanner.nextInt();

        int termino1 = 0, termino2 = 1, contador = 0;

        while (contador < posicion) {
            int sumaDeTerminos = termino1 + termino2;
            termino1 = termino2;
            termino2 = sumaDeTerminos;
            contador++;
        }

        System.out.println("El valor en la posición " + posicion + " de la serie de Fibonacci es " + termino1);
    }
}
