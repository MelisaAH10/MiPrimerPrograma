package CLASE30;

import java.util.Arrays;
import java.util.Scanner;

public class Oracion {
    private String oracion;

    public Oracion() {
        this.oracion = "";
    }

    public String getOracion() {
        return oracion;
    }

    public void setOracion(String oracion) {
        this.oracion = oracion;
    }

    public int contarCaracteres() {
        return oracion.length();
    }

    public int contarPalabras() {
        return oracion.split(" ").length;
    }

    public String ordenarPalabras() {
        String[] palabras = oracion.split(" ");
        Arrays.sort(palabras);
        return String.join(" ", palabras);
    }

    public String obtenerPalabra(int posicion) {
        String[] palabras = oracion.split(" ");
        if (posicion < 1 || posicion > palabras.length) {
            return "Número inválido. Intente nuevamente";
        } else {
            return palabras[posicion - 1];
        }
    }

    public String buscarPalabra(String palabra) {
        String[] palabras = oracion.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals(palabra)) {
                return "La palabra '" + palabra + "' se encuentra en la posición " + (i + 1);
            }
        }
        return "La palabra '" + palabra + "' no se encuentra en la oración";
    }

    public String modificarPalabra(String palabraAntigua, String palabraNueva) {
        if (oracion.contains(palabraAntigua)) {
            oracion = oracion.replace(palabraAntigua, palabraNueva);
            return "La oración modificada es: " + oracion;
        } else {
            return "La palabra '" + palabraAntigua + "' no se encuentra en la oración";
        }
    }

    public void agregarContenido(String contenido) {
        oracion += " " + contenido;
    }
}
