package CLASE11;

public class Ejercicio03 {
    public static void main(String[] args) {
        // Crear un array con cinco elementos enteros
        int[] numeros = {5, 10, 3, 20, 15};

        // Recorrer el array en orden inverso e imprimir cada elemento
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
