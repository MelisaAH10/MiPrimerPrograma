package CLASE11;

public class Ejercicio05 {
    public static void main(String[] args) {
        // Crear un array con cinco elementos enteros
        int[] numeros = {5, 10, 3, 20, 15};

        // Inicializar suma con 0
        int suma = 0;

        // Recorrer el array y calcular la suma acumulada
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
            numeros[i] = suma;
        }

        // Imprimir el array con las sumas acumuladas
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
