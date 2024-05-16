package CLASE10;

public class SumaPosicionesParesArray {
    public static void main(String[] args) {
        // Crear un array con cinco elementos enteros
        int[] numeros = {5, 10, 15, 20, 25};
        int suma = 0;

        // Sumar los elementos en las posiciones pares
        //suma = numeros[0] + numeros[2] + numeros[4];
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                suma += numeros[i];
            }
        }

        // Imprimir el resultado
        System.out.println("La suma de los elementos en las posiciones pares del array es: " + suma);
    }
}
