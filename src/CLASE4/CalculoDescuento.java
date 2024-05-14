package CLASE4;

import java.util.Scanner;

public class CalculoDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa el precio de un producto:");
        double precio = scanner.nextDouble();

        if (precio >= 100) {
            double descuento = precio * 0.10;
            double nuevoPrecio = precio - descuento;
            System.out.println("El nuevo precio con descuento es: $" + nuevoPrecio);
        } else {
            System.out.println("El precio sin descuento es: $" + precio);
        }

        scanner.close();
    }
}