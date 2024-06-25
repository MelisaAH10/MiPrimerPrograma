package CLASE29;

public class GeneradorNumeros {
    public static int numeroAleatorio() {
        int numero = 1 + (int)(Math.random() * 355);
        System.out.println(numero); // print the number to the console
        return numero;
    }
}
