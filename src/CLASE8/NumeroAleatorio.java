package CLASE8;

public class NumeroAleatorio {
    public static void main(String[] args) {
        double numeroAleatorio = Math.random() * 355 + 1;
        int numeroRedondeado = (int) Math.floor(numeroAleatorio);

        System.out.println("El número aleatorio generado es: " + numeroRedondeado);
    }
}
