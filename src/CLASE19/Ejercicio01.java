package CLASE19;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner pepe = new Scanner(System.in);
        System.out.println("Por favor ingrese un nombre:");
        String nombre = pepe.nextLine();
        imprimeNombre(nombre);
        System.out.println("Por favor ingrese una edad:");
        int edad = pepe.nextInt();
        imprimeNombreYEdad(nombre, edad);
    }

    public static void imprimeNombre(String nombre) {
        System.out.println("Mi nombre es " + nombre);
    }

    public static void imprimeNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años");
    }
}
