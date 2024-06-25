package CLASE28;

import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        int numero = solicitarNumero();
        if (esPar(numero)){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

    }
    public static int solicitarNumero() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
