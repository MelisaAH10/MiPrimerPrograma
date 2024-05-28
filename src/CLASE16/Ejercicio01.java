package CLASE16;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        long factorial = 1;
        int i = 1;

        do {
            factorial *= i;
            i++;
        } while (i <= numero);

        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}
