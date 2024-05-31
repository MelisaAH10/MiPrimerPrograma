package CLASE19;

import java.util.Scanner;

public class Ejercicio03 {
    // Declara el objeto Scanner como una variable estática
    private static Scanner pepe = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre = obtenerNombre();
        imprimeNombre(nombre);
        int edad = obtenerEdad();
        imprimeNombreYEdad(nombre, edad);
    }

    public static String obtenerNombre() {
        System.out.println("Por favor ingrese un nombre:");
        return pepe.nextLine();
    }

    public static int obtenerEdad() {
        System.out.println("Por favor ingrese una edad:");
        return pepe.nextInt();
    }

    public static void imprimeNombre(String nombre) {
        System.out.println("Mi nombre es " + nombre);
    }

    public static void imprimeNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años");
    }
}
