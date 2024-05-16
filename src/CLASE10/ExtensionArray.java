package CLASE10;

import java.util.Scanner;

public class ExtensionArray {
    public static void main(String[] args) {
        // Crear un array con tres elementos enteros
        int[] numeros = {5, 10, 15};

        // Crear un nuevo array con dos elementos adicionales
        int[] numerosExtendidos = new int[5];

        // Copiar los elementos del array original al nuevo array
        numerosExtendidos[0] = numeros[0];
        numerosExtendidos[1] = numeros[1];
        numerosExtendidos[2] = numeros[2];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número adicional:");
        numerosExtendidos[3] = scanner.nextInt();
        System.out.println("Ingrese el segundo número adicional:");
        numerosExtendidos[4] = scanner.nextInt();
        scanner.close();

        // Imprimir el contenido del nuevo array
        System.out.println("El contenido del nuevo array es: " + numerosExtendidos[0] + ", " + numerosExtendidos[1] + ", " + numerosExtendidos[2] + ", " + numerosExtendidos[3] + ", " + numerosExtendidos[4]);
    }
}
