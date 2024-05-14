package CLASE2;

import java.util.Scanner;

public class ComparadorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //TODO: PARTE 1
        System.out.print("Ingresa un número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa otro número entero: ");
        int num2 = scanner.nextInt();

        // A. Compara si el primer número es mayor al segundo
        boolean esMayor = num1 > num2;
        System.out.println("El número " + num1 + " es mayor a " + num2 + " ? = " + esMayor);

        // B. Verifica si el primer número es distinto al segundo
        boolean esDistinto = num1 != num2;
        System.out.println("El número " + num1 + " es distinto de " + num2 + ": " + esDistinto);

        // C. Verifica si el primer número es divisible por 2
        boolean esDivisiblePor2 = num1 % 2 == 0;
        System.out.println("El número " + num1 + " es divisible por 2: " + esDivisiblePor2);

        //TODO: PARTE 2
        System.out.print("Ingresa otro número entero: ");
        int num3 = scanner.nextInt();

        System.out.print("Ingresa otro número entero: ");
        int num4 = scanner.nextInt();

        // 2A. Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4
        boolean condicion2A = (num1 > num2) && (num3 > num4);
        System.out.println("El número 1 es mayor al número 2 y el número 3 es mayor al número 4: " + condicion2A);

        // 2B. Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4
        boolean condicion2B = (num1 > num2) || (num3 > num4);
        System.out.println("El número 1 es mayor al número 2 o el número 3 es mayor al número 4: " + condicion2B);
    }
}
