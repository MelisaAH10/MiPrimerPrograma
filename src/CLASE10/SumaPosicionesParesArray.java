package CLASE10;

public class SumaPosicionesParesArray {
    public static void main(String[] args) {
        // Crear un array con cinco elementos enteros
        int[] numeros = {5, 10, 15, 20, 25};

        // Sumar los elementos en las posiciones pares
        int suma = numeros[0] + numeros[2] + numeros[4];

        // Imprimir el resultado
        System.out.println("La suma de los elementos en las posiciones pares del array es: " + suma);
    }
}
