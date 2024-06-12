package CLASE24;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }

    public void imprimirLibrosDisponibles() {
        for (Libro libro : this.libros) {
            System.out.println(libro.getTitulo());
        }
    }
}
