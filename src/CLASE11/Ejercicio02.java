package CLASE11;

public class Ejercicio02 {
    public static void main(String[] args) {
        // Crear un array con cinco elementos enteros
        int[] numeros = {5, 10, 3, 20, 15};

        // Inicializar min con el primer elemento del array
        int min = numeros[0];

        // Recorrer el array y encontrar el valor mínimo
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        // Imprimir el valor mínimo
        System.out.println("El valor mínimo en el array es: " + min);
    }
}
