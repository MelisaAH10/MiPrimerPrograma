package CLASE20;

public class Ejercicio05 {
    public static void main(String[] args) {
        int numeroAleatorio = numeroAleatorio();
        System.out.println("El número aleatorio es: " + numeroAleatorio);
    }

    public static int numeroAleatorio() {
        return (int) (Math.floor(Math.random() * 355) + 1);
    }
}
