package CLASE11;

public class Ejercicio04 {
    public static void main(String[] args) {
        // Crear un array con cinco elementos enteros
        int[] numeros = {5, 10, 3, 20, 15};

        // Recorrer la mitad del array
        for (int i = 0; i < numeros.length / 2; i++) {
            // Intercambiar el elemento en la posición i con el elemento en la posición opuesta
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }

        // Imprimir el array invertido
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
