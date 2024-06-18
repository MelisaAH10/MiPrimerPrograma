package CLASE26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = leerValores();
        int sum = calcularSuma(numbers);
        double average = calcularPromedio(numbers);
        mostrarResultados(numbers, sum, average);
    }


    public static ArrayList<Integer> leerValores() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number;


        do {
            System.out.println("Ingrese un número entero (-99 para terminar):");
            number = scanner.nextInt();
            if (number != -99) {
                numbers.add(number);
            }
        } while (number != -99);


        return numbers;
    }


    public static int calcularSuma(ArrayList<Integer> numbers) {
        int sum = 0;
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        return sum;
    }


    public static double calcularPromedio(ArrayList<Integer> numbers) {
        return (double) calcularSuma(numbers) / numbers.size();
    }


    public static void mostrarResultados(ArrayList<Integer> numbers, int sum, double average) {
        System.out.println("Los números ingresados son:");
        for (int number : numbers) {
            System.out.println(number);
        }


        System.out.println("La suma de los números es: " + sum);
        System.out.println("El promedio de los números es: " + average);


        int count = 0;
        for (int number : numbers) {
            if (number > average) {
                count++;
            }
        }
        System.out.println("El número de valores mayores que el promedio es: " + count);
    }
}
