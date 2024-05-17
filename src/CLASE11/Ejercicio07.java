package CLASE11;

public class Ejercicio07 {
    public static void main(String[] args) {
        // Crear un array con veinte elementos float
        float[] numeros = {1.2f, 2.3f, 3.4f, 4.5f, 5.6f, 6.7f, 7.8f, 8.9f, 9.0f, 10.1f, 11.2f, 12.3f, 13.4f, 14.5f, 15.6f, 16.7f, 17.8f, 18.9f, 19.0f, 20.1f};

        // Inicializar suma con 0.0
        float suma = 0.0f;

        // Recorrer el array y calcular la suma
        for (float numero : numeros) {
            suma += numero;
        }

        // Calcular el promedio
        float promedio = suma / numeros.length;

        // Imprimir la suma y el promedio
        System.out.println("La suma de los elementos es: " + suma);
        System.out.println("El promedio de los elementos es: " + promedio);
    }
}
