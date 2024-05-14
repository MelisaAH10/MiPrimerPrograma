package CLASE3;

import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.println("Por favor, ingresa un número:");
        int numero = scanner.nextInt();

        // Determinar si el número es par o impar utilizando el operador ternario
        String resultado = (numero % 2 == 0) ? "El número es par." : "El número es impar.";

        // Mostrar el resultado en la consola
        System.out.println(resultado);

    }
}
