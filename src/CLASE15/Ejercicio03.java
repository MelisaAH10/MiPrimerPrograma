package CLASE15;

public class Ejercicio03 {
    public static void main(String[] args) {
        int termino1 = 0, termino2 = 1, contador = 0;

        while (contador < 8) {
            System.out.println("Posición " + contador + ": " + termino1);

            int sumaDeTerminos = termino1 + termino2;
            termino1 = termino2;
            termino2 = sumaDeTerminos;

            contador++;
        }
    }
}
