package CLASE28;

import java.util.Scanner;

public class ImprimirNYEV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombre = obtenerNombre(scan);
        Integer edad = obtenerEdad(scan);
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años");
    }
    public static String obtenerNombre(Scanner scanner) {
        return scanner.nextLine();
    }

    public static Integer obtenerEdad(Scanner scanner) {
        return scanner.nextInt();
    }
}
