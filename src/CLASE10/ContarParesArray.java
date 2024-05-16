package CLASE10;

public class ContarParesArray {
    public static void main(String[] args) {
        // Crear un array con seis elementos enteros
        int[] numeros = {5, 10, 15, 20, 25, 30};

        // Contar los elementos pares
        int contadorPares = 0;
        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            }
        }

        // Imprimir el resultado
        System.out.println("La cantidad de elementos pares en el array es: " + contadorPares);
    }
}