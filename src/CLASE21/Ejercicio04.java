package CLASE21;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {
    private static Scanner scanner = new Scanner(System.in);
    private static Ejercicio04 oracion1 = new Ejercicio04();

    private static String oracion = "";

    public static void crearOracion() {
        System.out.println("Ingrese una oración:");
        oracion = scanner.nextLine();
    }

    public static void borrarOracion() {
        oracion = "";
    }

    public static int contarCaracteres() {
        return oracion.length();
    }

    public static int contarPalabras() {
        return oracion.split(" ").length;
    }

    public static void mostrarPalabrasOrdenadas() {
        String[] palabras = oracion.split(" ");
        Arrays.sort(palabras);
        System.out.println(Arrays.toString(palabras));
    }

    public static void mostrarPalabraPorPosicion(int posicion) {
        String[] palabras = oracion.split(" ");
        if (posicion < 1 || posicion > palabras.length) {
            System.out.println("Número inválido. Intente nuevamente");
        } else {
            System.out.println(palabras[posicion - 1]);
        }
    }

    public static void buscarPalabra(String palabra) {
        String[] palabras = oracion.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals(palabra)) {
                System.out.println("La palabra '" + palabra + "' se encuentra en la posición " + (i + 1));
                return;
            }
        }
        System.out.println("La palabra '" + palabra + "' no se encuentra en la oración");
    }

    public static void modificarPalabra(String palabraAntigua, String palabraNueva) {
        if (!oracion.contains(palabraAntigua)) {
            System.out.println("La palabra '" + palabraAntigua + "' no se encuentra en la oración");
        } else {
            oracion = oracion.replace(palabraAntigua, palabraNueva);
            System.out.println("La oración modificada es: " + oracion);
        }
    }

    public static void agregarContenido(String contenido) {
        oracion += " " + contenido;
    }

    public static boolean estaVacia() {
        return oracion.isEmpty();
    }

    public static void mostrarMenu() {
        System.out.println("\n1. " + (estaVacia() ? "Crear oración" : "Borrar oración"));
        System.out.println("2. Cantidad de caracteres de la oración");
        System.out.println("3. Cantidad de palabras de la oración");
        System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
        System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
        System.out.println("6. Buscar palabra dentro de la oración");
        System.out.println("7. Modificar palabra dentro de la oración");
        System.out.println("8. Agregar contenido a la oración");
        System.out.println("9. Salir");
    }

    public static void ejecutarOpcion(int opcion) {

        switch (opcion) {
            case 1:
                if (estaVacia()) {
                    crearOracion();
                } else {
                    borrarOracion();
                }
                break;
            case 2:
                System.out.println("La oración tiene " + contarCaracteres() + " caracteres");
                break;
            case 3:
                System.out.println("La oración tiene " + contarPalabras() + " palabras");
                break;
            case 4:
                mostrarPalabrasOrdenadas();
                break;
            case 5:
                System.out.println("Ingrese un número:");
                mostrarPalabraPorPosicion(scanner.nextInt());
                break;
            case 6:
                System.out.println("Ingrese una palabra:");
                buscarPalabra(scanner.next());
                break;
            case 7:
                System.out.println("Ingrese la palabra que quiere cambiar:");
                String palabraAntigua = scanner.next();
                System.out.println("Ingrese la nueva palabra:");
                String palabraNueva = scanner.next();
                modificarPalabra(palabraAntigua, palabraNueva);
                break;
            case 8:
                System.out.println("Ingrese el contenido que quiere agregar:");
                agregarContenido(scanner.nextLine());
                break;
            case 9:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción inválida. Intente nuevamente");
                break;
        }
    }

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = elegirOpcion();
            scanner.nextLine();
            ejecutarOpcion(opcion);
        } while (opcion != 9);
    }

    private static int elegirOpcion() {
        System.out.println("Ingrese una opción:");
        return scanner.nextInt();
    }
}
