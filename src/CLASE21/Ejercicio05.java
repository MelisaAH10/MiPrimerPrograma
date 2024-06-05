package CLASE21;

import java.util.Scanner;

public class Ejercicio05 {
    private static final String[] palabras = {"casa", "perro", "gato", "elefante", "jirafa"};
    private String palabraSeleccionada;
    private String pista;
    private int intentos;

    public Ejercicio05() {
        int indice = (int) (Math.random() * palabras.length);
        palabraSeleccionada = palabras[indice];
        pista = "_ ".repeat(palabraSeleccionada.length());
        intentos = 10;
    }

    public void obtenerPista() {
        System.out.println("Pista: " + pista);
    }

    public void comprobarLetra(char letra) {
        StringBuilder nuevaPista = new StringBuilder(pista);
        for (int i = 0; i < palabraSeleccionada.length(); i++) {
            if (palabraSeleccionada.charAt(i) == letra) {
                nuevaPista.setCharAt(i * 2, letra);
            }
        }
        pista = nuevaPista.toString();
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        while (intentos > 0 && pista.contains("_")) {
            obtenerPista();
            System.out.println("Ingrese una letra:");
            char letra = scanner.next().charAt(0);
            comprobarLetra(letra);
            intentos--;
        }

        if (!pista.contains("_")) {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSeleccionada);
        } else {
            System.out.println("Lo siento, no has adivinado la palabra. La palabra era: " + palabraSeleccionada);
        }
    }

    public static void main(String[] args) {
        Ejercicio05 juego = new Ejercicio05();
        juego.jugar();
    }
}
