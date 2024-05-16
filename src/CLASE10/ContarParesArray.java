package CLASE10;

import java.util.Random;

public class ContarParesArray {
    public static void main(String[] args) {
        // Crear un array con seis elementos enteros
        int[] numeros = new int[6];


        // Generar números aleatorios y asignarlos al array
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);  // Genera un número aleatorio entre 0 y 99
        }


        //Muestra los numeros aleatorios
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El número en la posición " + (i+1) + " es: " + numeros[i]);
        }
        // Contar los elementos pares
        int contadorPares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            }
        }


        // Imprimir el resultado
        System.out.println("La cantidad de elementos pares en el array es: " + contadorPares);

    }
}