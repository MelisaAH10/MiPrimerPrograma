package CLASE19;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner pepe = new Scanner(System.in);
        String nombre = obtenerNombre(pepe);
        imprimeNombre(nombre);
        int edad = obtenerEdad(pepe);
        imprimeNombreYEdad(nombre, edad);
    }

    public static String obtenerNombre(Scanner scanner) {
        System.out.println("Por favor ingrese un nombre:");
        return scanner.nextLine();
    }

    public static int obtenerEdad(Scanner scanner) {
        System.out.println("Por favor ingrese una edad:");
        return scanner.nextInt();
    }

    public static void imprimeNombre(String nombre) {
        System.out.println("Mi nombre es " + nombre);
    }

    public static void imprimeNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años");
    }
}
