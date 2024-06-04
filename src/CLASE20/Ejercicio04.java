package CLASE20;

public class Ejercicio04 {

    /*En este código, el método imprimirArray se sobrecarga para aceptar
    diferentes tipos de parámetros: un arreglo de enteros, un arreglo de Strings,
    un arreglo bidimensional de enteros y un arreglo bidimensional de Strings.
    Cada versión del método imprime el arreglo correspondiente en la consola.*/

    public static void imprimirArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void imprimirArray(String[] array) {
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void imprimirArray(int[][] array) {
        for (int[] i : array) {
            imprimirArray(i);
        }
    }

    public static void imprimirArray(String[][] array) {
        for (String[] s : array) {
            imprimirArray(s);
        }
    }
}
