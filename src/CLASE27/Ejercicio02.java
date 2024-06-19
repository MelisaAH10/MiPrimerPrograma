package CLASE27;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Mostrar catálogo");
            System.out.println("4. Salir");

            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Ingrese el título del libro:");
                    String titulo = scanner.nextLine();
                    System.out.println("Ingrese el autor del libro:");
                    String autor = scanner.nextLine();
                    System.out.println("Ingrese el ISBN del libro:");
                    String isbn = scanner.nextLine();
                    libreria.agregarLibro(new Libro(titulo, autor, isbn));
                    break;
                case "2":
                    System.out.println("Ingrese el ISBN del libro a eliminar:");
                    isbn = scanner.nextLine();
                    libreria.eliminarLibro(isbn);
                    break;
                case "3":
                    libreria.mostrarCatalogo();
                    break;
            }
        } while (!opcion.equals("4"));
    }
}
