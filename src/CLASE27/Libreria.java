package CLASE27;

import java.util.HashSet;

public class Libreria {
    private HashSet<Libro> catalogo = new HashSet<>();


    public void agregarLibro(Libro libro) {
        catalogo.add(libro);
    }

    public void eliminarLibro(String isbn) {
        catalogo.removeIf(libro -> libro.getIsbn().equals(isbn));
    }

    public void mostrarCatalogo() {
        for (Libro libro : catalogo) {
            System.out.println(libro);
        }
    }
}
