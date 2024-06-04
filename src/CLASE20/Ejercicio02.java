package CLASE20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {
    // Declara el objeto Scanner como una variable estática
    private static Scanner pepe = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion = 0;
        do {
            try {
                System.out.println("\n1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = pepe.nextInt();

                if (opcion >= 1 && opcion <= 4) {
                    System.out.print("Ingrese el primer número: ");
                    double num1 = pepe.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2 = pepe.nextDouble();

                    switch (opcion) {
                        case 1:
                            System.out.println("La suma es: " + (num1 + num2));
                            break;
                        case 2:
                            System.out.println("La resta es: " + (num1 - num2));
                            break;
                        case 3:
                            System.out.println("El producto es: " + (num1 * num2));
                            break;
                        case 4:
                            if (num2 != 0) {
                                System.out.println("El cociente es: " + (num1 / num2));
                            } else {
                                System.out.println("Error: División por cero");
                            }
                            break;
                    }
                } else if (opcion != 5) {
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, intente de nuevo.");
                pepe.next(); // descarta la entrada inválida
            }
        } while (opcion != 5);
    }
}
